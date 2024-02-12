package com.ort.wolfportal.logic.stats

import com.ort.dbflute.allcommon.CDef
import com.ort.wolfportal.util.BrowserUtil
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.io.IOException
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.regex.Pattern

@Component
class UpdateStarHunterAkatsukiStatsLogic : AbstractUpdateStatsLogic() {

    private val logger = LoggerFactory.getLogger(UpdateStarHunterAkatsukiStatsLogic::class.java)
    private val topPageUrl = "https://dawn-star.sakura.ne.jp/sow.cgi"
    private val vidStart = 1
    private val vidPattern = Pattern.compile(".*vid=(.*)#.*")
    private val thirdCampSkillList = listOf("ハムスター人間", "コウモリ人間", "ピクシー", "鵜の目")

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    override fun fetchVillageInfo(vid: Int): VillageStats? {
        try {
            logger.info("星狩国（暁） vid:${vid} start")
            val village = fetchVillageStatsAndMapping(vid)
            if (village == null) {
                logger.info("星狩国（暁） vid:${vid} エピローグを迎えていません")
            } else {
                logger.info("星狩国（暁） vid:${vid} end")
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
            (vidStart..latestVillageNo).toList()
        } catch (e: Exception) {
            logger.error(e.message, e)
            return listOf()
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
            if (tr.select("td").size < 6) {
                continue
            }
            val villageAnchorUrl = tr.select("td")[0].select("a")[0].attr("href")
            val m = vidPattern.matcher(villageAnchorUrl)
            if (m.find()) {
                val vid = Integer.parseInt(m.group(1))
                if (latestVillageNum < vid) {
                    latestVillageNum = vid
                }
            }
        }
        return latestVillageNum
    }

    private fun fetchVillageStatsAndMapping(vid: Int): VillageStats? {
        // プロローグに接続して日付リンク取得
        val dayLinkMap = fetchDayLink(vid)
        if (!dayLinkMap.containsKey("エピローグ")) {
            return null // エピを迎えてない村は無視
        }
        // エピローグに接続して突吊噛情報を取得
        return fetchEachDayAndMapping(dayLinkMap, vid, "$topPageUrl?vid=$vid#newsay")
    }

    // linktext, url
    @Throws(IOException::class)
    private fun fetchDayLink(vid: Int): Map<String, String> {
        // 村のプロローグに接続
        val proUrl = "?turn=0&vid=${vid}&mode=all&rowall=on"
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

    @Throws(IOException::class)
    private fun fetchEachDayAndMapping(
        dayLinkMap: Map<String, String>,
        villageNo: Int,
        villageUrl: String
    ): VillageStats {
        // エピローグに接続してキャラクター情報を取得
        val epiDoc =
            BrowserUtil.createConnectionAndConnectWithSleep(topPageUrl + dayLinkMap["エピローグ"] + "&rowall=on").parse()
        val resultTrs = epiDoc.select("table.vindex[summary=配役一覧]").first().select("tbody tr")
        val playerMap = resultTrs.map { resultTr ->
            val tds = resultTr.select("td")
            val player = VillagePlayerStats(
                userId = tds[1].text(),
                characterName = tds[0].text(),
                life = if (tds.size > 3) tds[2].text().replace("日".toRegex(), "d") else null,
                winlose = if (tds.size > 3) {
                    if ("勝利" == tds[3].text()) CDef.WinLose.勝利 else CDef.WinLose.敗北
                } else null,
                skillName = if (tds.size > 3) tds[4].text().replace(" \\(.*".toRegex(), "") else "見物人"
            )
            player.characterName to player
        }.toMap()
        // 1日目に接続して開始日時を取得
        var villageStartDatetime: LocalDateTime? = null
        if (dayLinkMap.containsKey("1日目")) {
            val firstDayDoc =
                BrowserUtil.createConnectionAndConnectWithSleep(topPageUrl + dayLinkMap["1日目"] + "&rowall=on").parse()
            if (firstDayDoc.select(".mes_date").size > 0) {
                villageStartDatetime = extractMessageDatetime(firstDayDoc.select(".mes_date")[0].text())
            }
        }
        return VillageStats(
            villageName = epiDoc.select("#header h5").text().replace("エピローグ".toRegex(), ""),
            villageNo = villageNo,
            villageUrl = villageUrl,
            // 終了日時（取れないので第1発言の日時）
            villageEndDatetime = if (epiDoc.select(".mes_date")
                    .isNotEmpty()
            ) extractMessageDatetime(epiDoc.select(".mes_date")[0].text()) else null,
            // 勝敗陣営名
            winCampName = extractWinCampName(playerMap),
            // 開始日時
            villageStartDatetime = villageStartDatetime,
            playerStatsList = playerMap.values.toList()
        )

    }

    private fun extractMessageDatetime(message: String): LocalDateTime {
        val datetimeStr =
            message.trim { it <= ' ' }.replace(".*(\\d{4}\\/.*)".toRegex(), "$1")
                .replace("\\(.*\\)".toRegex(), "") // uuuu/MM/dd HH:mm:ss
        return LocalDateTime.parse(datetimeStr, DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss"))
    }

    private fun extractWinCampName(playerMap: Map<String, VillagePlayerStats>): String {
        val playerStatsList = playerMap.values
        if (playerStatsList.any { it.winlose == CDef.WinLose.勝利 && "村人".contains(it.skillName) }) {
            return "村人陣営"
        }
        if (playerStatsList.any { it.winlose == CDef.WinLose.勝利 && (it.skillName.contains("狼") || "首無騎士" == it.skillName) }) {
            return "人狼陣営"
        }
        if (playerStatsList.any { p -> p.winlose == CDef.WinLose.勝利 && thirdCampSkillList.any { p.skillName.contains(it) } }) {
            return "妖魔陣営"
        }
        return "なし"
    }
}
