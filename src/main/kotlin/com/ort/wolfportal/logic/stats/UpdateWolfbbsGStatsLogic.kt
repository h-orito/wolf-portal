package com.ort.wolfportal.logic.stats

import com.ort.dbflute.allcommon.CDef
import com.ort.wolfportal.util.BrowserUtil
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.io.IOException
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.*
import java.util.regex.Pattern

@Component
class UpdateWolfbbsGStatsLogic : AbstractUpdateStatsLogic() {

    private val logger = LoggerFactory.getLogger(UpdateWolfbbsGStatsLogic::class.java)
    private val topPageUrl = "http://ninjinix.x0.com/wolfg/"
    private val vidStart = 1
    private val winVillageMessage = "全ての人狼を退治した……。人狼に怯える日々は去ったのだ！"
    private val participateElesStartStr = "楽天家 ゲルト （master）、死亡。村人だった。"
    private val resultPattern1 = Pattern.compile("(.*)（(.*)）、.*。(.*)だった。") // IDLINKがない場合
    private val resultPattern2 = Pattern.compile("(.*)（.*?\n(.*)）、.*。(.*)だった。") // IDLINKがある場合
    private val wolfCampSkillList = listOf("人狼", "狂人")

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    override fun fetchVillageInfo(vid: Int): VillageStats? {
        try {
            logger.info("WOLFBBS:G vid:${vid} start")
            val village = fetchVillageStatsAndMapping(vid)
            if (village == null) {
                logger.info("WOLFBBS:G vid:${vid} エピローグを迎えていません")
            } else {
                logger.info("WOLFBBS:G vid:${vid} end")
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
            listOf()
        }
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private fun fetchLatestVillageNo(): Int {
        // トップページから取得できなくなった。固定値でok
        return 2087
//        val latestVillageNum = 0
//        val doc = BrowserUtil.createConnectionAndConnectWithSleep(topPageUrl).parse()
//        println("parsed.")
//        val els = doc.select("td a")
//        val regex = "G(.*) .*村"
//        val p = Pattern.compile(regex)
//        for (el in els) {
//            val m = p.matcher(el.text())
//            if (m.find()) {
//                return Integer.parseInt(m.group(1))
//            }
//        }
//        return latestVillageNum
    }

    private fun fetchVillageStatsAndMapping(vid: Int): VillageStats? {
        // プロローグに接続して日付リンク取得
        val dayLinkMap = fetchDayLink(vid)
        if (!dayLinkMap.containsKey("エピローグ")) {
            return null // エピを迎えてない村は無視
        }
        // 各日付に接続して突吊噛情報を取得
        return fetchEachDayAndMapping(dayLinkMap, vid, "${topPageUrl}index.rb?vid=${vid}")
    }

    // linktext, url
    @Throws(IOException::class)
    private fun fetchDayLink(vid: Int): Map<String, String> {
        // 村のプロローグに接続
        val proUrl = String.format("index.rb?vid=%d&meslog=000_ready", vid)
        val villageUrl = topPageUrl + proUrl
        val doc = BrowserUtil.createConnectionAndConnectWithSleep(villageUrl).parse()
        // アンカーからエピローグを探し、URLを取得
        val els = doc.select("a")

        val dayLinkMap = HashMap<String, String>()
        for (el in els) {
            val linkText = el.text()
            val href = el.attr("href")
            if (linkText.endsWith("日目")) {
                dayLinkMap[linkText] = href
            } else if ("エピローグ" == linkText) {
                dayLinkMap[linkText] = href
                break
            }
        }
        return dayLinkMap
    }

    private fun fetchEachDayAndMapping(
        dayLinkMap: Map<String, String>,
        villageNo: Int,
        villageUrl: String
    ): VillageStats {
        val docsMap = dayLinkMap.keys.map {
            val doc = BrowserUtil.createConnectionAndConnectWithSleep(topPageUrl + dayLinkMap[it] + "&mes=all").parse()
            it to doc
        }.toMap()
        val villageName = docsMap.values.first().select("title").text().replace("人狼BBS:G ".toRegex(), "")
        val villageStartDatetime: LocalDateTime = docsMap.entries.first {
            // 何日目か
            val isEpilogue = "エピローグ" == it.key
            val dayStr = if (isEpilogue) dayLinkMap.size.toString() + "d" else it.key.replace("日目".toRegex(), "d")
            "1d" == dayStr
        }.let { extractVillageStartDatetime(it.value) }
        val villageEndDatetime = villageStartDatetime.plusDays((dayLinkMap.size - 1).toLong())
        val isVillageWin = docsMap.entries.first { "エピローグ" == it.key }.let {
            val announceEles = it.value.select("div.announce,div.extra")
            announceEles.any { d -> winVillageMessage == d.text() }
        }
        val winCampName = if (isVillageWin) "村人陣営" else "人狼陣営"

        val playerStatsList = docsMap.entries.first {
            "エピローグ" == it.key
        }.let {
            val announceEles = it.value.select("div.announce,div.extra")
            // アナウンス情報のうち参加者情報が含まれる要素を抽出
            // 配列の1要素が1人分（e.g. 楽天家ゲルト（master）、死亡。村人だった。）
            val participatesStrList = extractParticipatesAnnounceAndSplit(announceEles)

            participatesStrList.map { participatesStr ->
                var characterName = ""
                var userId = ""
                var skillName = ""
                val m1 = resultPattern1.matcher(participatesStr)
                val m2 = resultPattern2.matcher(participatesStr)
                if (m1.find()) { // group 0:全文 1:キャラ名 2:ID 3:役職
                    characterName = m1.group(1).trim()
                    userId = m1.group(2)
                    skillName = m1.group(3)
                } else if (m2.find()) { // group 0:全文 1:キャラ名 2:IDリンク 3:役職
                    // group2が<a href="{IDLINK}>{ID}</a>なので、抽出
                    characterName = m2.group(1).trim()
                    userId = Jsoup.parse(m2.group(2)).select("a")[0].text()
                    skillName = m2.group(3)
                }
                val isVillagerCamp = !wolfCampSkillList.contains(skillName)
                VillagePlayerStats(
                    userId = userId,
                    characterName = characterName,
                    life = convertToLife(docsMap, characterName),
                    winlose = if (isVillageWin && isVillagerCamp || !isVillageWin && !isVillagerCamp) CDef.WinLose.勝利 else CDef.WinLose.敗北,
                    skillName = skillName
                )
            }
        }
        return VillageStats(
            villageName = villageName,
            villageNo = villageNo,
            villageUrl = villageUrl,
            villageStartDatetime = villageStartDatetime,
            villageEndDatetime = villageEndDatetime,
            winCampName = winCampName,
            playerStatsList = playerStatsList
        )
    }

    private fun convertToLife(docsMap: Map<String, Document>, characterName: String): String {
        docsMap.entries.forEach {
            val dayStr = if ("エピローグ" == it.key) docsMap.size.toString() + "d" else it.key.replace("日目".toRegex(), "d")
            val announceEles = it.value.select("div.announce,div.extra")
            // 突然死
            val suddonlyDeathPlayerList = extractMatchPlayerList(announceEles, "(.*) は、突然死した。")
            if (suddonlyDeathPlayerList.any { name -> name == characterName }) return "${dayStr}突然死"
            // 襲撃
            val attackedDeathPlayerList = extractMatchPlayerList(announceEles, "次の日の朝、(.*) が無残な姿で発見された。")
            if (attackedDeathPlayerList.any { name -> name == characterName }) return "${dayStr}襲撃死"
            // 処刑
            val executedDeathPlayerList = extractMatchPlayerList(announceEles, "(.*) は村人達の手により処刑された。")
            if (executedDeathPlayerList.any { name -> name == characterName }) return "${dayStr}処刑死"
        }
        return "生存"
    }

    private fun extractVillageStartDatetime(doc: Document): LocalDateTime {
        val optEle = doc.select("[name~=mes*]").stream().findFirst()
        val epocTime = java.lang.Long.parseLong(optEle.get().attr("name").replace("mes", ""))
        return LocalDateTime.ofEpochSecond(epocTime, 0, ZoneOffset.ofHours(9))
    }

    private fun extractMatchPlayerList(els: Elements, regex: String): List<String> {
        // 参加者情報（返却値）
        val playerList = ArrayList<String>()

        for (el in els) {
            val announceEachLines = el.html().split("<br>".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            for (ann in announceEachLines) {
                val p = Pattern.compile(regex)
                val m = p.matcher(ann)
                if (m.find()) {
                    // group 0:全文 1:キャラ名
                    val characterName = m.group(1).trim()
                    playerList.add(characterName)
                }
            }
        }
        return playerList
    }

    private fun extractParticipatesAnnounceAndSplit(announsEles: Elements): List<String> {
        return announsEles.first {
            it.text().startsWith(participateElesStartStr)
        }.html().split("<br>".toRegex())
    }
}
