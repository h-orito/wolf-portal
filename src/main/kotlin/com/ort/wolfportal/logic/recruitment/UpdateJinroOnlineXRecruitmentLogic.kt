package com.ort.wolfportal.logic.recruitment

import com.fasterxml.jackson.databind.ObjectMapper
import com.ort.wolfportal.logic.recruitment.response.JinroOnlineXResponse
import com.ort.wolfportal.logic.recruitment.response.JinroOnlineXResponseDetail
import com.ort.wolfportal.logic.slack.SlackLogic
import org.slf4j.LoggerFactory
import org.springframework.http.HttpEntity
import org.springframework.stereotype.Component
import org.springframework.util.LinkedMultiValueMap
import org.springframework.web.client.RestTemplate
import java.util.*

@Component
class UpdateJinroOnlineXRecruitmentLogic(
    val restTemplate: RestTemplate,
    val slackLogic: SlackLogic
) : AbstractUpdateRecruitmentLogic() {

    private val logger = LoggerFactory.getLogger(UpdateJinroOnlineXRecruitmentLogic::class.java)
    private val url = "http://www.werewolfonline.net/command/getvillages"

    override fun scraping(): CountryVillageStatusDto {
        return try {
            val response = requestForJinroOnlineXVillageList()
            mappingToCountryRecruitmentDto(response)
        } catch (e: Exception) {
            slackLogic.postToSlackIfNeeded(this::class.simpleName!!, e)
            logger.error(e.message, e)
            CountryVillageStatusDto()
        }

    }

    private fun requestForJinroOnlineXVillageList(): JinroOnlineXResponse {
        val headers = LinkedMultiValueMap<String, String>()
        headers.add("Origin", "http://www.werewolfonline.net")
        headers.add("Accept-Encoding", "gzip, deflate")
        headers.add("Accept-Language", "ja,en-US;q=0.9,en;q=0.8,zh-CN;q=0.7,zh;q=0.6,fr;q=0.5")
        headers.add(
            "User-Agent",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36"
        )
        headers.add("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
        headers.add("Accept", "application/json, text/javascript, */*; q=0.01")
        headers.add("Referer", "http://www.werewolfonline.net/villagelist")
        headers.add("X-Requested-With", "XMLHttpRequest")
        headers.add("Connection", "keep-alive")
        val request = HttpEntity("status=0&max=20", headers)
        val response = restTemplate.postForObject(url, request, String::class.java)
        val mapper = ObjectMapper()
        return mapper.readValue(response, JinroOnlineXResponse::class.java)
    }

    private fun mappingToCountryRecruitmentDto(response: JinroOnlineXResponse): CountryVillageStatusDto {
        response.villages ?: return CountryVillageStatusDto()
        val recruitVillageList =
            response.villages.filter { "0" == it.status }.map { convertToVillage(it) }

        val progressVillageList =
            response.villages.filter { "0" != it.status }.map { convertToVillage(it) }

        return CountryVillageStatusDto(
            isSuccess = true,
            recruitVillageList = recruitVillageList,
            progressVillageList = progressVillageList
        )
    }

    private fun convertToVillage(v: JinroOnlineXResponseDetail): CountryVillageDto {
        val itemMap = HashMap<String, String>()
        itemMap[ItemKey.KEY_VILLAGE_NAME] = "${v.title} / ${v.village_name}"
        itemMap[ItemKey.KEY_VILLAGE_STATUS] = if ("0" == v.status) "募集中" else "進行中"
        itemMap[ItemKey.KEY_VILLAGE_PARTICIPATE_NUM] = "${v.player_count}/${v.max_player}"
        itemMap[ItemKey.KEY_DAYCHANGE_DATETIME] = v.start_schedule ?: ""
        itemMap[ItemKey.KEY_DAYCHANGE_INTERVAL] = makeIntervalStr(v.game_interval ?: "0")
        itemMap[ItemKey.KEY_VILLAGE_URL] = "http://www.werewolfonline.net/timeline/${v.id}"
        itemMap[ItemKey.KEY_VILLAGE_INFO_URL] = "http://www.werewolfonline.net/game/${v.id}"
        itemMap[ItemKey.KEY_SAY_RESTRICT] = "Web版は有料"
        val iconJoiner = StringJoiner(",")
        if ("1" == v.need_accesscode) iconJoiner.add("鍵")
        if ("1" == v.need_minvaluation && "0" != v.min_valuation) {
            iconJoiner.add("評価" + v.min_valuation + "以上")
        }
        val icons = iconJoiner.toString()
        if (icons.isNotEmpty()) itemMap[ItemKey.KEY_ICON_IMAGES] = icons
        return CountryVillageDto(
            itemMap = itemMap
        )
    }

    private fun makeIntervalStr(intervalStr: String): String {
        val intervalMinutes = Integer.parseInt(intervalStr)
        return if (intervalMinutes >= 60) {
            (intervalMinutes / 60).toString() + "h"
        } else intervalStr + "m"
    }
}
