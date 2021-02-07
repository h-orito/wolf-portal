package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.logic.slack.SlackLogic
import com.ort.wolfportal.util.BrowserUtil
import org.jsoup.nodes.Element
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.util.*

@Component
class UpdateJinroLiteRecruitmentLogic(
    val slackLogic: SlackLogic
) : AbstractUpdateRecruitmentLogic() {

    private val logger = LoggerFactory.getLogger(UpdateJinroLiteRecruitmentLogic::class.java)
    private val url = "https://www.jinro-lite.com"

    override fun scraping(): CountryVillageStatusDto {
        return try {
            val recruitVillageList = mutableListOf<CountryVillageDto>()
            val progressVillageList = mutableListOf<CountryVillageDto>()
            // 建てて放置されているので1ページ目のみ
            val doc = BrowserUtil.createConnectionAndConnect("$url/villages?page=1").parse()
            val table = doc.select("table.table-villages")[0]
            val recruitVillages = table.select("tbody tr")
            // 募集中
            recruitVillageList.addAll(
                recruitVillages
                    .filter { "募集中" == it.select("td")[3].text() }
                    .mapNotNull { convertToCountryVillage(it) }
            )
            // 進行中
            progressVillageList.addAll(
                recruitVillages
                    .filter { "進行中" == it.select("td")[3].text() }
                    .mapNotNull { convertToCountryVillage(it) }
            )
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

    private fun convertToCountryVillage(tr: Element): CountryVillageDto {
        val tds = tr.select("td")
        val villageAnchor = tds[0].select("a")[0]
        val itemMap = HashMap<String, String>()
        itemMap[ItemKey.KEY_VILLAGE_NAME] = villageAnchor.text()
        itemMap[ItemKey.KEY_VILLAGE_URL] = convertPathToUrl(villageAnchor.attr("href"))
        itemMap[ItemKey.KEY_VILLAGE_PARTICIPATE_NUM] = tds[1].text().replace("[ 人]".toRegex(), "")
        itemMap[ItemKey.KEY_DAYCHANGE_INTERVAL] = convertToIntervalStr(tds[2].text())
        itemMap[ItemKey.KEY_VILLAGE_STATUS] = tds[3].text()
        itemMap[ItemKey.KEY_DAYCHANGE_DATETIME] = tds[4].text()
        if (tds[0].select("i.fa-key").isNotEmpty()) {
            itemMap[ItemKey.KEY_ICON_IMAGES] = "鍵"
        }
        return CountryVillageDto(
            itemMap = itemMap
        )
    }

    private fun convertToIntervalStr(str: String): String {
        val minute = str.replace("[ 分]".toRegex(), "")
        try {
            val min = Integer.parseInt(minute)
            return if (min > 60) {
                (min / 60).toString() + "h"
            } else min.toString() + "m"
        } catch (e: NumberFormatException) {
        }
        return minute
    }

    private fun convertPathToUrl(attr: String): String = url + attr
}
