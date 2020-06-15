package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.logic.recruitment.response.WolfMansionResponse
import com.ort.wolfportal.logic.recruitment.response.WolfMansionResponseDetail
import com.ort.wolfportal.logic.slack.SlackLogic
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import java.util.*


@Component
class UpdateWerewolfMansionRecruitmentLogic(
    val restTemplate: RestTemplate,
    val slackLogic: SlackLogic
) : AbstractUpdateRecruitmentLogic() {

    private val logger = LoggerFactory.getLogger(UpdateWerewolfMansionRecruitmentLogic::class.java)
    private val url = "https://wolfort.net/wolf-mansion/recruiting"

    override fun scraping(): CountryVillageStatusDto {
        return try {
            val response = restTemplate.getForObject(url, WolfMansionResponse::class.java)
            response ?: return CountryVillageStatusDto()
            mappingToCountryRecruitmentDto(response)
        } catch (e: RuntimeException) {
            slackLogic.postToSlackIfNeeded(this::class.simpleName!!, e)
            logger.error(e.message, e)
            CountryVillageStatusDto()
        }
    }

    private fun mappingToCountryRecruitmentDto(response: WolfMansionResponse): CountryVillageStatusDto {
        return CountryVillageStatusDto(
            isSuccess = true,
            recruitVillageList = response.villageList.filter { "募集中" == it.status }.map { convertToVillage(it) },
            progressVillageList = response.villageList.filter { "募集中" != it.status }.map { convertToVillage(it) }
        )
    }

    private fun convertToVillage(v: WolfMansionResponseDetail): CountryVillageDto {
        val itemMap = HashMap<String, String>()
        itemMap[ItemKey.KEY_VILLAGE_NAME] = v.villageName
        itemMap[ItemKey.KEY_VILLAGE_NO] = v.villageNumber
        itemMap[ItemKey.KEY_VILLAGE_STATUS] = v.status
        itemMap[ItemKey.KEY_VILLAGE_PARTICIPATE_NUM] = v.participateNum
        itemMap[ItemKey.KEY_VILLAGE_SPECTATE_NUM] = v.spectateNum
        itemMap[ItemKey.KEY_DAYCHANGE_DATETIME] = v.daychangeDatetime
        itemMap[ItemKey.KEY_DAYCHANGE_INTERVAL] = v.daychangeInterval
        itemMap[ItemKey.KEY_VILLAGE_URL] = v.url
        itemMap[ItemKey.KEY_CHARASET] = v.charaset
        itemMap[ItemKey.KEY_SAY_RESTRICT] = v.restrict
        return CountryVillageDto(itemMap)
    }
}
