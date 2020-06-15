package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.logic.recruitment.response.RuruServerResponse
import com.ort.wolfportal.logic.slack.SlackLogic
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import java.util.*

@Component
class UpdateRuruServerRecruitmentLogic(
    val restTemplate: RestTemplate,
    val slackLogic: SlackLogic
) : AbstractUpdateRecruitmentLogic() {

    private val logger = LoggerFactory.getLogger(UpdateRuruServerRecruitmentLogic::class.java)
    private val url = "https://ruru-jinro.net/"
    private val sceneMap = mapOf(
        0 to "事件前日",
        1 to "夜",
        2 to "夜明け",
        3 to "昼",
        4 to "投票中",
        5 to "終了後トーク"
    )

    override fun scraping(): CountryVillageStatusDto {
        return try {
            val villages = restTemplate.getForObject<Array<RuruServerResponse>>(
                "${url}resource/vinfo/en.json",
                Array<RuruServerResponse>::class.java
            )
            villages ?: return CountryVillageStatusDto()

            // 募集中
            val recruitVillageList =
                villages.toList().filter { it.scene == 0 }.map { convertToCountryVillage(it) }
            // 進行中
            val progressVillageList =
                villages.toList().filter { it.scene != 0 }.map { convertToCountryVillage(it) }

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

    private fun convertToCountryVillage(v: RuruServerResponse): CountryVillageDto {
        val itemMap = HashMap<String, String>()
        itemMap[ItemKey.KEY_VILLAGE_URL] = "${url}login.jsp?room_no=${v.no}"
        itemMap[ItemKey.KEY_VILLAGE_NAME] = "No.${v.no} 「${v.name}」村"
        itemMap[ItemKey.KEY_SAY_RESTRICT] = v.pr
        itemMap[ItemKey.KEY_VILLAGE_STATUS] = if (v.scene == 0) sceneMap[0]!! else "${v.day}d${sceneMap[v.scene]}"
        itemMap[ItemKey.KEY_VILLAGE_PARTICIPATE_NUM] = "${v.players}/${v.capacity}"
        itemMap[ItemKey.KEY_DAYCHANGE_INTERVAL] = "${v.time_day}s/${v.time_down}s"
        itemMap[ItemKey.KEY_ORGANIZE] = if (v.scene == 0) v.cast else "${v.players}${v.cast}"

        val iconJoiner = StringJoiner(",")
        if (v.trip) iconJoiner.add("酉必須")
        if (v.exp != null && v.exp != 0) iconJoiner.add("${v.exp}戦以上")
        if (v.rule_hope) iconJoiner.add("希望役職")
        if (v.rule_gm) iconJoiner.add("GM制")
        if (v.rule_family) iconJoiner.add("身内")
        val icons = iconJoiner.toString()
        if (icons.isNotEmpty()) {
            itemMap[ItemKey.KEY_ICON_IMAGES] = icons
        }
        return CountryVillageDto(itemMap)
    }
}
