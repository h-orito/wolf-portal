package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.util.BrowserUtil
import org.jsoup.nodes.Element
import org.springframework.stereotype.Component
import java.util.*

@Component
class GetsurouScrapingLogic {

    private val iconImgMsgMap = mapOf(
        "key.png" to "鍵",
        "cau15.png" to "R15",
        "cau18.png" to "R18",
        "caugro.png" to "グロ",
        "cauview.png" to "閲注",
        "rp.png" to "RP",
        "random.png" to "ランダム",
        "talk.png" to "雑談"
    )

    fun scraping(url: String): CountryVillageStatusDto {
        val doc = BrowserUtil.createConnectionAndConnect(url).parse()
        val tables = doc.select("table.vindex")

        // 募集中
        val recruitVillageList = tables[0].select("tbody tr").mapNotNull { convertToCountryVillage(url, it) }
        // 進行中
        val progressVillageList = tables[1].select("tbody tr").mapNotNull { convertToCountryVillage(url, it) }

        return CountryVillageStatusDto(
            isSuccess = true,
            recruitVillageList = recruitVillageList,
            progressVillageList = progressVillageList
        )
    }

    private fun convertToCountryVillage(baseUrl: String, tr: Element): CountryVillageDto? {
        val tds = tr.select("td")
        if (tds.size < 5) {
            return null // 募集/進行中の村がない
        }

        val itemMap = HashMap<String, String>()

        val td0 = tds[0]
        val villageAnchor = td0.select("a")[0]
        if (villageAnchor.text().contains("雑談")) {
            return null
        }
        val icons = convertToIcons(td0.select("img"))
        if (icons.isNotEmpty()) {
            itemMap[ItemKey.KEY_ICON_IMAGES] = icons
        }
        itemMap[ItemKey.KEY_VILLAGE_NAME] = villageAnchor.text()
        itemMap[ItemKey.KEY_VILLAGE_URL] = convertPathToUrl(baseUrl, villageAnchor.attr("href"))
        itemMap[ItemKey.KEY_VILLAGE_INFO_URL] = convertPathToUrl(baseUrl, td0.select("a")[1].attr("href"))
        val participateStrList = tds[1].text().split("\\(")
        itemMap[ItemKey.KEY_VILLAGE_PARTICIPATE_NUM] = participateStrList[0]
        if (participateStrList.size > 1) {
            itemMap[ItemKey.KEY_VILLAGE_SPECTATE_NUM] = participateStrList[1].replace("\\)".toRegex(), "")
        }
        itemMap[ItemKey.KEY_VILLAGE_STATUS] = tds[2].text()
        itemMap[ItemKey.KEY_DAYCHANGE_DATETIME] = tds[3].html().split("/")[0]
        itemMap[ItemKey.KEY_DAYCHANGE_INTERVAL] = tds[3].html().split("/")[1]
        itemMap[ItemKey.KEY_ORGANIZE] = tds[4].text()
        itemMap[ItemKey.KEY_SAY_RESTRICT] = tds[5].text()

        return CountryVillageDto(
            itemMap = itemMap
        )
    }

    private fun addIconItemIfNeeded(iconJoiner: StringJoiner, iconMsg: String, imgName: String, src: String) {
        if (src.contains(imgName)) {
            iconJoiner.add(iconMsg)
        }
    }

    private fun convertPathToUrl(url: String, path: String): String {
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
