package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.logic.slack.SlackLogic
import com.ort.wolfportal.util.BrowserUtil
import org.jsoup.nodes.Element
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.util.*

@Component
class UpdateMikazukiRecruitmentLogic(
    val slackLogic: SlackLogic
) : AbstractUpdateRecruitmentLogic() {

    private val logger = LoggerFactory.getLogger(UpdateMikazukiRecruitmentLogic::class.java)
    private val url = "http://www.moonpupa.jp/wolf/sow/sow.cgi"

    private val iconImgMsgMap = mapOf(
        "key.png" to "鍵",
        "ico_real.png" to "ガチ",
        "ico_bgnr.png" to "初歓",
        "ico_tale.png" to "物語",
        "ico_joke.png" to "ネタ",
        "ico_love.png" to "桃",
        "ico_joke.png" to "コアずれ",
        "ico_labo.png" to "試験",
        "ico_ero.png" to "エロ",
        "ico_gro.png" to "グロ",
        "ico_food.png" to "食",
        "ico_fest.png" to "祭",
        "ico_othr.png" to "他",
        "ico_chat.png" to "雑談"
    )

    override fun scraping(): CountryVillageStatusDto {
        return try {
            val doc = BrowserUtil.createConnectionAndConnect(url).parse()
            val tables = doc.select("table.vindex[summary=村の一覧]")

            // 募集中
            val recruitVillageList = tables[0].select("tbody tr").mapNotNull { convertToCountryVillage(it) }
            // 進行中
            val progressVillageList = tables[1].select("tbody tr").mapNotNull { convertToCountryVillage(it) }

            CountryVillageStatusDto(
                isSuccess = true,
                recruitVillageList = recruitVillageList,
                progressVillageList = progressVillageList
            )
        } catch (e: Exception) {
            slackLogic.postToSlackIfNeeded(this.javaClass.simpleName, e)
            logger.error(e.message, e)
            CountryVillageStatusDto()
        }
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private fun convertToCountryVillage(tr: Element): CountryVillageDto? {
        val tds = tr.select("td")
        if (tds.size < 5) return null // 募集/進行中の村がない

        val villageAnchor = tds[1].select("a")[0]
        if (villageAnchor.text().contains("【まったり】遊び場【しましょ】")) {
            return null // 雑談村は除外
        }

        val itemMap = HashMap<String, String>()
        itemMap[ItemKey.KEY_VILLAGE_NO] = tds[0].text()
        itemMap[ItemKey.KEY_VILLAGE_NAME] = villageAnchor.text()
        itemMap[ItemKey.KEY_VILLAGE_URL] = convertPathToUrl(villageAnchor.attr("href"))
        itemMap[ItemKey.KEY_VILLAGE_INFO_URL] = convertPathToUrl(tds[1].select("a")[1].attr("href"))
        val chipAndDaychangeStr = tds[1].select("i.small")[0].html()
        itemMap[ItemKey.KEY_CHARASET] = chipAndDaychangeStr.split("<br>".toRegex())[1].replace("　　人物 ： ", "")
        val daychangeAndIntervalStrList =
            chipAndDaychangeStr.split("<br>".toRegex())[2].replace("　　更新 ： ", "").split(" ".toRegex())
        itemMap[ItemKey.KEY_DAYCHANGE_DATETIME] = daychangeAndIntervalStrList[0]
        if (daychangeAndIntervalStrList.size > 1) {
            itemMap[ItemKey.KEY_DAYCHANGE_INTERVAL] = daychangeAndIntervalStrList[1].replace("毎".toRegex(), "")
        }
        val participateAndStatusStrList = tds[2].text().split(" ")
        val participateStrList = participateAndStatusStrList[0].split("\\+".toRegex())
        itemMap[ItemKey.KEY_VILLAGE_PARTICIPATE_NUM] = participateStrList[0].replace("人".toRegex(), "")
        if (participateStrList.size > 1) {
            itemMap[ItemKey.KEY_VILLAGE_SPECTATE_NUM] = participateStrList[1].replace("人".toRegex(), "")
        }
        var villageStatus = tds[3].text()
        if (participateAndStatusStrList.size > 1) {
            villageStatus += " " + participateAndStatusStrList[1]
        }
        itemMap[ItemKey.KEY_VILLAGE_STATUS] = villageStatus
        itemMap[ItemKey.KEY_SAY_RESTRICT] = tds[4].text()

        val icons = convertToIcons(tds[1].select("img"))
        if (icons.isNotEmpty()) {
            itemMap[ItemKey.KEY_ICON_IMAGES] = icons
        }
        return CountryVillageDto(
            itemMap = itemMap
        )
    }

    private fun addIconItemIfNeeded(iconJoiner: StringJoiner, iconMsg: String, imgName: String, src: String) {
        if (src.contains(imgName)) {
            iconJoiner.add(iconMsg)
        }
    }

    private fun convertPathToUrl(path: String): String {
        return url + path.substring(path.indexOf("?"))
    }

    private fun convertToIcons(imgs: List<Element>): String {
        val iconJoiner = StringJoiner(",")
        imgs.forEach { img ->
            val src = img.attr("src")
            iconImgMsgMap.forEach { (imgSrc, msg) ->
                addIconItemIfNeeded(iconJoiner, msg, imgSrc, src)
            }
        }
        return iconJoiner.toString()
    }
}
