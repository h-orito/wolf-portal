package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.util.BrowserUtil
import org.jsoup.nodes.Element
import org.springframework.stereotype.Component
import java.util.*

@Component
class GijiScrapingLogic {

    private val iconImgMsgMap = mapOf(
        "key.png" to "鍵",
        "cd_love.png" to "桃",
        "cd_sexy.png" to "性",
        "cd_sexylove.png" to "性愛",
        "cd_sexyviolence.png" to "性暴",
        "cd_violence.png" to "暴",
        "cd_teller.png" to "恐怖",
        "cd_gamble.png" to "賭博",
        "cd_crime.png" to "犯罪",
        "cd_drug.png" to "薬物",
        "cd_word.png" to "殺伐",
        "cd_fireplace.png" to "雑談",
        "cd_appare.png" to "あっぱれ",
        "cd_ukkari.png" to "うっかり",
        "cd_child.png" to "全年齢",
        "cd_alert.png" to "注意"
    )

    fun scraping(url: String): CountryVillageStatusDto {
        val doc = BrowserUtil.createConnectionAndConnect(url).parse()
        val tables = doc.select("table.vindex[summary=村の一覧]")

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
        if (tds.size < 6) {
            return null // 募集/進行中の村がない
        }

        val itemMap = HashMap<String, String>()

        itemMap[ItemKey.KEY_VILLAGE_NO] = tds[0].text()
        val td1 = tds[1]
        val villageAnchor = td1.select("a")[0]
        itemMap[ItemKey.KEY_VILLAGE_NAME] = villageAnchor.text()
        itemMap[ItemKey.KEY_VILLAGE_INFO_URL] = convertPathToUrl(baseUrl, villageAnchor.attr("href"))
        itemMap[ItemKey.KEY_VILLAGE_URL] = convertPathToUrl(baseUrl, td1.select("a")[1].attr("href"))

        val icons = convertToIcons(td1.select("img"))
        if (icons.isNotEmpty()) {
            itemMap[ItemKey.KEY_ICON_IMAGES] = icons
        }

        val chipAndDaychangeStr = td1.select("i.small")[0].html()
        itemMap[ItemKey.KEY_CHARASET] = chipAndDaychangeStr.split("<br>".toRegex())[1].replace("　　人物 ： ", "")
        itemMap[ItemKey.KEY_DAYCHANGE_DATETIME] = chipAndDaychangeStr.split("<br>".toRegex())[2].replace("　　更新 ： ", "")
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
