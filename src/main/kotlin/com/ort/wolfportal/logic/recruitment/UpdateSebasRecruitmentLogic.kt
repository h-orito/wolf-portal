package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.logic.slack.SlackLogic
import com.ort.wolfportal.util.BrowserUtil
import org.jsoup.nodes.Element
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.util.*

@Component
class UpdateSebasRecruitmentLogic(
    val slackLogic: SlackLogic
) : AbstractUpdateRecruitmentLogic() {

    private val logger = LoggerFactory.getLogger(UpdateSebasRecruitmentLogic::class.java)
    private val url = "http://sebas.chips.jp/sow/sow.cgi"

    private val iconImgMsgMap = mapOf(
        "key.png" to "鍵",
        "caugati.png" to "ガチ",
        "caurp.png" to "RP",
        "cauneta.png" to "ネタ",
        "caur.png" to "R指定"
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
            slackLogic.postToSlackIfNeeded(this::class.simpleName!!, e)
            logger.error(e.message, e)
            CountryVillageStatusDto()
        }
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private fun convertToCountryVillage(tr: Element): CountryVillageDto? {
        val tds = tr.select("td")
        if (tds.size < 6) return null // 募集/進行中の村がない

        val tds0anchorEles = tds[0].select("a")
        val villageAnchor = tds0anchorEles[tds0anchorEles.size - 2]
        if (villageAnchor.text().contains("発言テスト")) {
            return null // 雑談村は除外
        }

        val itemMap = HashMap<String, String>()
        itemMap[ItemKey.KEY_VILLAGE_NAME] = villageAnchor.text()
        itemMap[ItemKey.KEY_VILLAGE_URL] = convertPathToUrl(villageAnchor.attr("href"))
        itemMap[ItemKey.KEY_VILLAGE_INFO_URL] =
            convertPathToUrl(tds0anchorEles[tds0anchorEles.size - 1].attr("href"))
        val participateStrList = tds[1].text().split("\\+")
        itemMap[ItemKey.KEY_VILLAGE_PARTICIPATE_NUM] = participateStrList[0].replace("人".toRegex(), "")
        if (participateStrList.size > 1) {
            itemMap[ItemKey.KEY_VILLAGE_SPECTATE_NUM] = participateStrList[1].replace("[人観\\[\\]]".toRegex(), "")
        }
        itemMap[ItemKey.KEY_VILLAGE_STATUS] = tds[2].text()
        itemMap[ItemKey.KEY_DAYCHANGE_DATETIME] = tds[3].text().split("/")[0]
        itemMap[ItemKey.KEY_DAYCHANGE_INTERVAL] = tds[3].text().split("/")[1]
        itemMap[ItemKey.KEY_ORGANIZE] = tds[4].text()
        itemMap[ItemKey.KEY_SAY_RESTRICT] = tds[5].text()

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
