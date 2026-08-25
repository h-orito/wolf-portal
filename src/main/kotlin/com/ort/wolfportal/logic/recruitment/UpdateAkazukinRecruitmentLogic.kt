package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.logic.recruitment.response.AkazukinResponse
import com.ort.wolfportal.logic.recruitment.response.AkazukinVillageDetail
import com.ort.wolfportal.logic.slack.SlackLogic
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class UpdateAkazukinRecruitmentLogic(
    val restTemplate: RestTemplate,
    val slackLogic: SlackLogic
) : AbstractUpdateRecruitmentLogic() {

    private val logger = LoggerFactory.getLogger(UpdateAkazukinRecruitmentLogic::class.java)
    private val url = "https://garuneko.com/akazukin/villages.json"

    override fun scraping(): CountryVillageStatusDto {
        return try {
            val response = restTemplate.getForObject(url, AkazukinResponse::class.java)
            mappingToCountryRecruitmentDto(response)
        } catch (e: RuntimeException) {
            slackLogic.postToSlackIfNeeded(this.javaClass.simpleName, e)
            logger.error(e.message, e)
            CountryVillageStatusDto()
        }
    }

    private fun mappingToCountryRecruitmentDto(response: AkazukinResponse?): CountryVillageStatusDto {
        response ?: return CountryVillageStatusDto()
        val recruitVillageList = response.villages.filter { it.isPrologue() }.map { convertToVillage(it) }
        val progressVillageList = response.villages.filter { !it.isPrologue() }.map { convertToVillage(it) }
        return CountryVillageStatusDto(
            isSuccess = true,
            recruitVillageList = recruitVillageList,
            progressVillageList = progressVillageList
        )
    }

    private fun convertToVillage(v: AkazukinVillageDetail): CountryVillageDto {
        val itemMap = HashMap<String, String>()
        itemMap[ItemKey.KEY_VILLAGE_NAME] = v.name
        itemMap[ItemKey.KEY_VILLAGE_STATUS] = createStatusString(v)
        itemMap[ItemKey.KEY_VILLAGE_PARTICIPATE_NUM] = createParticipateNumString(v)
        v.spectators?.let { if (it > 0) itemMap[ItemKey.KEY_VILLAGE_SPECTATE_NUM] = "見学${it}" }
        itemMap[ItemKey.KEY_DAYCHANGE_INTERVAL] = v.dayLengthLabel ?: ""
        itemMap[ItemKey.KEY_VILLAGE_URL] = v.url
        itemMap[ItemKey.KEY_ORGANIZE] = createOrganizeString(v)
        v.speech?.preset?.let { itemMap[ItemKey.KEY_SAY_RESTRICT] = it }
        if (v.hasPassword == true) itemMap[ItemKey.KEY_ICON_IMAGES] = "鍵"
        return CountryVillageDto(itemMap = itemMap)
    }

    private fun AkazukinVillageDetail.isPrologue(): Boolean = "prologue" == status

    private fun createStatusString(v: AkazukinVillageDetail): String {
        return when (v.status) {
            "prologue" -> "募集中"
            "in_progress" -> "${v.currentDay ?: ""}日目"
            "epilogue" -> "エピローグ"
            else -> v.status
        }
    }

    private fun createParticipateNumString(v: AkazukinVillageDetail): String {
        return if (v.isPrologue()) "${v.players}/${v.capacity}" else v.players.toString()
    }

    private fun createOrganizeString(v: AkazukinVillageDetail): String {
        val composition = v.compositionPlanned
            ?.entries
            ?.joinToString("") { "${roleShortName(it.key)}${it.value}" }
            ?: ""
        val preset = v.rolePresetLabel ?: ""
        return if (composition.isEmpty()) preset else "$preset $composition".trim()
    }

    private fun roleShortName(key: String): String {
        return when (key) {
            "villager" -> "村"
            "seer" -> "占"
            "medium" -> "霊"
            "hunter" -> "狩"
            "mason" -> "共"
            "wolf" -> "狼"
            "madman" -> "狂"
            "fox" -> "狐"
            else -> key
        }
    }
}
