package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.util.BrowserUtil
import org.jsoup.nodes.Element
import org.springframework.stereotype.Component
import java.util.*
import kotlin.collections.HashMap


@Component
class AbyssScrapingLogic {

    private val iconImgMsgMap = mapOf(
        "neta.gif" to "ネタ",
        "dare.png" to "誰歓",
        "r18.png" to "R18",
        "gachi.gif" to "推理",
        "tobi.png" to "飛入歓",
        "rp.gif" to "RP",
        "key.png" to "鍵",
        "kaeru.gif" to "推理&RP",
        "han.png" to "犯罪",
        "sonota.png" to "注意"
    )

    fun scraping(url: String): CountryVillageStatusDto {
        val doc = BrowserUtil.createConnectionAndConnect(url).parse()
        val tables = doc.select("table.vindex[summary=村の一覧]")

        // 募集中
        val recruitVillageList =
            if (tables.isEmpty()) listOf()
            else tables[0].select("tbody tr").mapNotNull { convertToCountryVillage(url, it) }

        // 進行中
        val progressVillageList =
            if (tables.size < 2) listOf()
            else tables[1].select("tbody tr").mapNotNull { convertToCountryVillage(url, it) }

        return CountryVillageStatusDto(
            isSuccess = true,
            recruitVillageList = recruitVillageList,
            progressVillageList = progressVillageList
        )
    }

    private fun convertToCountryVillage(url: String, tr: Element): CountryVillageDto? {
        val tds = tr.select("td")
        if (tds.size < 6) {
            return null // 募集/進行中の村がない
        }
        val villageAnchor = tds[1].select("a")[0]
        if (villageAnchor.text().contains("雑談")) {
            return null // 雑談村は除外
        }

        val itemMap = HashMap<String, String>()

        itemMap[ItemKey.KEY_VILLAGE_NO] = tds[0].text()
        itemMap[ItemKey.KEY_VILLAGE_NAME] = villageAnchor.text()
        itemMap[ItemKey.KEY_VILLAGE_INFO_URL] = convertPathToUrl(villageAnchor.attr("href"), url)
        itemMap[ItemKey.KEY_VILLAGE_URL] = convertPathToUrl(tds[1].select("a")[1].attr("href"), url)

        val chipAndDaychangeList = tds[1].select("i.small")[0].html().split("<br>".toRegex())
        itemMap[ItemKey.KEY_CHARASET] = convertToCharaset(chipAndDaychangeList.subList(1, chipAndDaychangeList.size - 1))

        val daychangeAndIntercalStrList = chipAndDaychangeList.last().replace("　　更新 ： ", "").split(" ".toRegex())
        itemMap[ItemKey.KEY_DAYCHANGE_DATETIME] = daychangeAndIntercalStrList.first()
        if (daychangeAndIntercalStrList.size > 1) {
            itemMap[ItemKey.KEY_DAYCHANGE_INTERVAL] = daychangeAndIntercalStrList[1].replace("毎".toRegex(), "")
        }

        val participateAndStatusList = tds[2].text().split(" ")
        val participateStrList = participateAndStatusList[0].split("\\+".toRegex())
        itemMap[ItemKey.KEY_VILLAGE_PARTICIPATE_NUM] = participateStrList[0].replace("人".toRegex(), "")
        if (participateStrList.size > 1) {
            itemMap[ItemKey.KEY_VILLAGE_SPECTATE_NUM] = participateStrList[1].replace("人".toRegex(), "")
        }

        var villageStatus = tds[3].text()
        if (participateAndStatusList.size > 1) {
            villageStatus += " " + participateAndStatusList[1]
        }

        itemMap[ItemKey.KEY_VILLAGE_STATUS] = villageStatus
        itemMap[ItemKey.KEY_ORGANIZE] = tds[4].text()
        itemMap[ItemKey.KEY_SAY_RESTRICT] = tds[5].text()

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

    private fun convertPathToUrl(path: String, url: String): String {
        return url + path.substring(path.indexOf("?"))
    }

    private fun convertToCharaset(charachipStrList: List<String>): String {
        return charachipStrList.joinToString(separator = "、") {
            it.replace("　　人物 ： ", "").replace("&nbsp;", "")
        }
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
