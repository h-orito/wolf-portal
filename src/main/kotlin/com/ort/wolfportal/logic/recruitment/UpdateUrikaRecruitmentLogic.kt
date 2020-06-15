package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.logic.slack.SlackLogic
import com.ort.wolfportal.util.BrowserUtil
import org.jsoup.nodes.Element
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.util.*

@Component
class UpdateUrikaRecruitmentLogic(
    val slackLogic: SlackLogic
) : AbstractUpdateRecruitmentLogic() {

    private val logger = LoggerFactory.getLogger(UpdateUrikaRecruitmentLogic::class.java)
    private val url = "http://melon-cirrus.sakura.ne.jp/sow/"

    private val iconImgMsgMap = mapOf(
        "key.png" to "鍵",
        "exclamation.png" to "閲注",
        "c18.png" to "R18",
        "gro.png" to "グロ",
        "erogro.png" to "エログロ",
        "gachi.png" to "ガチ"
    )

    override fun scraping(): CountryVillageStatusDto {
        try {
            val doc = BrowserUtil.createConnectionAndConnect(url).parse()
            val tables = doc.select("table.vindex")

            // 募集中
            val recruitVillageList = tables[2].select("tbody tr").mapNotNull { convertToCountryVillage(it) }
            // 進行中
            val progressVillageList = tables[3].select("tbody tr").mapNotNull { convertToCountryVillage(it) }

            return CountryVillageStatusDto(
                isSuccess = true,
                recruitVillageList = recruitVillageList,
                progressVillageList = progressVillageList
            )
        } catch (e: Exception) {
            slackLogic.postToSlackIfNeeded(this::class.simpleName!!, e)
            logger.error(e.message, e)
            return CountryVillageStatusDto()
        }
    }

    private fun convertToCountryVillage(tr: Element): CountryVillageDto? {
        val tds = tr.select("td")
        if (tds.size < 7) return null // 募集/進行中の村がない

        val villageAnchor = tds.get(0).select("a")[0]
        if (villageAnchor.text().contains("発言お試し村")) {
            return null // 雑談村は除外
        }

        val itemMap = HashMap<String, String>()

        itemMap[ItemKey.KEY_VILLAGE_NAME] = villageAnchor.text()
        itemMap[ItemKey.KEY_VILLAGE_URL] = convertPathToUrl(villageAnchor.attr("href"))
        if (tds[0].select("span").isNotEmpty()) {
            itemMap[ItemKey.KEY_CHARASET] =
                tds[0].select("span")[0].text().replace("《", "").replace("》", "")
        }
        itemMap[ItemKey.KEY_VILLAGE_INFO_URL] = convertPathToUrl(tds[1].select("a")[0].attr("href"))
        val participateStrArr = tds[2].text().split("〈")
        itemMap[ItemKey.KEY_VILLAGE_PARTICIPATE_NUM] = participateStrArr[0]
        if (participateStrArr.size > 1) {
            itemMap[ItemKey.KEY_VILLAGE_SPECTATE_NUM] = participateStrArr[1].replace("〉".toRegex(), "")
        }
        itemMap[ItemKey.KEY_VILLAGE_STATUS] = tds[3].text()
        itemMap[ItemKey.KEY_DAYCHANGE_DATETIME] = tds[4].html().split("<br>")[0]
        itemMap[ItemKey.KEY_DAYCHANGE_INTERVAL] = tds[4].html().split("<br>")[1]
        itemMap[ItemKey.KEY_ORGANIZE] = tds[5].text()
        itemMap[ItemKey.KEY_SAY_RESTRICT] = tds[6].text()

        val icons = convertToIcons(tds[0].select("img"))
        if (icons.isNotEmpty()) {
            itemMap[ItemKey.KEY_ICON_IMAGES] = icons
        }

        return CountryVillageDto(itemMap)
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
