package com.ort.wolfportal.logic.stats

import com.ort.dbflute.allcommon.CDef
import com.ort.wolfportal.util.BrowserUtil
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

@Component
class UpdateMikazukiStatsLogic : AbstractUpdateStatsLogic() {

    private val logger = LoggerFactory.getLogger(UpdateMikazukiStatsLogic::class.java)
    private val topPageUrl = "http://www.moonpupa.jp/wolf/sow/sow.cgi"
    private val vidStart = 1

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    override fun fetchVillageInfo(vid: Int): VillageStats? {
        try {
            logger.info("三日月国 vid:${vid} start")
            val village = fetchVillageStatsAndMapping(vid)
            if (village == null) {
                logger.info("三日月国 vid:${vid} エピローグを迎えていません")
            } else {
                logger.info("三日月国 vid:${vid} end")
            }
            return village
        } catch (e: Exception) {
            logger.error(e.message, e)
            throw e
        }

    }

    override fun fetchVillageNoList(): List<Int> {
        return try {
            val latestVillageNo = fetchLatestVillageNo()
            return (vidStart..latestVillageNo).toList()
        } catch (e: Exception) {
            logger.error(e.message, e)
            return ArrayList()
        }
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private fun fetchLatestVillageNo(): Int {
        var latestVillageNum = 0
        val doc = BrowserUtil.createConnectionAndConnectWithSleep(topPageUrl).parse()
        val trs = doc.select("table.vindex[summary=村の一覧] tbody tr")
        for (tr in trs) {
            if (tr.select("td").size < 5) {
                continue
            }
            val vid = Integer.parseInt(tr.select("td").get(0).text())
            if (latestVillageNum < vid) {
                latestVillageNum = vid
            }
        }
        return latestVillageNum
    }

    private fun fetchVillageStatsAndMapping(vid: Int): VillageStats? {
        // 廃村一覧にあったら無視
        if (isCancelVillage(vid)) {
            return null
        }
        // プロローグに接続して日付リンク取得
        val dayLinkMap = fetchDayLink(vid)
        if (!dayLinkMap.containsKey("エピローグ")) {
            return null // エピを迎えてない村は無視
        }
        // 勝利陣営
        val winCampName = fetchWinCampName(vid)
        // エピローグに接続して突吊噛情報を取得
        return fetchEachDayAndMapping(dayLinkMap, vid, "$topPageUrl?vid=$vid#newsay", winCampName)
    }

    private fun isCancelVillage(vid: Int): Boolean {
        val doc = BrowserUtil.createConnectionAndConnectWithSleep("$topPageUrl?ua=pc&cmd=oldlog").parse()
        val cancelVidList = doc.select("table.vindex[summary=村の一覧]").get(1).select("tbody tr")
            .map { Integer.parseInt(it.select("td")[0].text()) }
        return cancelVidList.contains(vid)
    }

    // linktext, url
    private fun fetchDayLink(vid: Int): Map<String, String> {
        // 村のプロローグに接続
        val proUrl = "?ua=pc&turn=0&vid=${vid}&mode=all&rowall=on"
        val villageUrl = topPageUrl + proUrl
        val doc = BrowserUtil.createConnectionAndConnectWithSleep(villageUrl).parse()
        // アンカーからエピローグを探し、URLを取得
        val els = doc.select("p.turnnavi a")
        val dayLinkMap = HashMap<String, String>()
        for (el in els) {
            val linkText = el.text()
            val href = el.attr("href")
            val url = href.substring(href.indexOf("?"))
            if (linkText.endsWith("日目")) {
                dayLinkMap[linkText] = url
            } else if ("エピローグ" == linkText) {
                dayLinkMap[linkText] = url
                break
            }
        }
        return dayLinkMap
    }

    private fun fetchEachDayAndMapping(
        dayLinkMap: Map<String, String>,
        villageNo: Int,
        villageUrl: String,
        winCampName: String
    ): VillageStats {
        // エピローグに接続してキャラクター情報を取得
        val epiUrl = topPageUrl + dayLinkMap["エピローグ"]!!.replace("&move=page&pageno=1".toRegex(), "") + "&rowall=on"
        val epiDoc = BrowserUtil.createConnectionAndConnectWithSleep(epiUrl).parse()
        val resultTrs = epiDoc.select("table.vindex[summary=配役一覧]").first().select("tbody tr")
        val playerMap = resultTrs.subList(1, resultTrs.size).map { resultTr ->
            val tds = resultTr.select("td")
            val player = VillagePlayerStats(
                userId = tds[1].text(),
                characterName = tds[0].text(),
                life = if (tds[2].text().isNotEmpty()) replaceLife(tds[2].text()) else null,
                winlose = if (tds[2].text().isNotEmpty()) {
                    if ("勝利" == tds[3].text()) CDef.WinLose.勝利 else CDef.WinLose.敗北
                } else null,
                skillName = if (tds[2].text().isNotEmpty()) tds[4].html().replace(".*：(.*)<i.*".toRegex(), "$1") else "見物人"
            )
            player.characterName to player
        }.toMap()
        // 1日目に接続して開始日時を取得
        var villageStartDatetime: LocalDateTime? = null
        if (dayLinkMap.containsKey("1日目")) {
            val firstDayDoc = BrowserUtil.createConnectionAndConnectWithSleep(topPageUrl + dayLinkMap["1日目"] + "&rowall=on").parse()
            if (firstDayDoc.select(".mes_date").size > 0) {
                villageStartDatetime = extractMessageDatetime(firstDayDoc.select(".mes_date")[0].text())
            }
        }
        return VillageStats(
            villageName = epiDoc.select("h2").text().replace(" RSS \\(.*".toRegex(), ""),
            villageNo = villageNo,
            villageUrl = villageUrl,
            // 終了日時（取れないので第1発言の日時）
            villageEndDatetime = if (epiDoc.select(".mes_date").isNotEmpty()) extractMessageDatetime(epiDoc.select(".mes_date")[0].text()) else null,
            // 勝敗陣営名
            winCampName = winCampName,
            // 開始日時
            villageStartDatetime = villageStartDatetime,
            playerStatsList = playerMap.values.toList()
        )
    }

    private fun fetchWinCampName(vid: Int): String {
        // 進行中の村から探す
        val topDoc = BrowserUtil.createConnectionAndConnectWithSleep(topPageUrl).parse()
        topDoc.select("table.vindex[summary=村の一覧]")[1].select("tbody tr")
            .firstOrNull { Integer.parseInt(it.select("td")[0].text()) == vid }
            ?.let { it.select("td")[2].select("i").text().trim().replace("の勝利".toRegex(), "陣営") }
            ?.let { return it }
        // なければ終了済みの村から探す
        val completeDoc = BrowserUtil.createConnectionAndConnectWithSleep("$topPageUrl?pageno=1&ua=pc&cmd=oldlog&rowall=on").parse()
        return completeDoc.select("table.vindex[summary=村の一覧]")[0].select("tbody tr")
            .firstOrNull { Integer.parseInt(it.select("td")[0].text()) == vid }
            ?.let { it.select("td")[2].select("i").text().trim().replace("の勝利".toRegex(), "陣営") }
            ?: "なし"
    }

    private fun extractMessageDatetime(message: String): LocalDateTime {
        val datetimeStr =
            message.trim { it <= ' ' }.replace(".*(\\d{4}\\/.*)".toRegex(), "$1").replace("\\(.*\\)".toRegex(), "") // uuuu/MM/dd HH:mm:ss
        return LocalDateTime.parse(datetimeStr, DateTimeFormatter.ofPattern("uuuu/MM/dd H:mm:ss"))
    }

    private fun replaceLife(str: String): String {
        return if ("生存者" == str) "生存"
        else str.replace("(.*)\\((.*)\\)".toRegex(), "$2$1")
    }
}
