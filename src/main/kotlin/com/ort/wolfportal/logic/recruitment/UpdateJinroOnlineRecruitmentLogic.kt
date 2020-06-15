package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.logic.slack.SlackLogic
import com.ort.wolfportal.util.BrowserUtil
import org.jsoup.nodes.Element
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.util.*

@Component
class UpdateJinroOnlineRecruitmentLogic(
    val slackLogic: SlackLogic
) : AbstractUpdateRecruitmentLogic() {

    private val logger = LoggerFactory.getLogger(UpdateJinroOnlineRecruitmentLogic::class.java)
    private val url = "https://zinro.net/m/"

    override fun scraping(): CountryVillageStatusDto {
        try {
            // 募集中
            val recruitmentDoc = BrowserUtil.createConnectionAndConnect(url + "room_list.php").parse()
            val recruitVillageList =
                recruitmentDoc.select("table.tbl tbody tr").mapNotNull { convertToCountryVillage(it) }

            // 進行中
            val progressDoc = BrowserUtil.createConnectionAndConnect(url + "room_list.php?scene=ゲーム中").parse()
            val progressVillageList =
                progressDoc.select("table.tbl tbody tr").mapNotNull { convertToCountryVillage(it) }

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

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private fun convertToCountryVillage(tr: Element): CountryVillageDto? {
        val td = tr.select("td").first()
        val itemMap = HashMap<String, String>()
        val label = td.select("span.label")
        if (label.isEmpty()) {
            return null // 広告欄
        }
        itemMap[ItemKey.KEY_VILLAGE_STATUS] = label.first().text()
        val villageInfos = td.html().split("<br>")
        val villageName = villageInfos[0].replace(".*</span> ".toRegex(), "")
        itemMap[ItemKey.KEY_VILLAGE_NAME] = villageName
        itemMap[ItemKey.KEY_VILLAGE_URL] = "${url}room_in.php?room_name=${villageName}"
        val participateNum =
            villageInfos[1].replace("<i class=\"icon-user\"></i>".toRegex(), "").replace("人.*".toRegex(), "").trim()
        itemMap[ItemKey.KEY_VILLAGE_PARTICIPATE_NUM] = participateNum
        val spectateNum = villageInfos[1].replace(".*<i class=\"icon-eye-open\"></i>".toRegex(), "")
            .replace("<i class=\"icon-time\"></i>.*".toRegex(), "").trim()
        itemMap[ItemKey.KEY_VILLAGE_SPECTATE_NUM] = spectateNum
        if (villageInfos.size >= 3) {
            val description = td.html().split("<br>")[2].replace("[^\\u0000-\\uFFFF]".toRegex(), "").trim()
            itemMap[ItemKey.KEY_SAY_RESTRICT] = description
        }
        return CountryVillageDto(
            itemMap = itemMap
        )
    }
}
