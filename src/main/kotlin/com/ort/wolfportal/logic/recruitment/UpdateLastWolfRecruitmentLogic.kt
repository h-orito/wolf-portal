package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.logic.recruitment.response.LastWolfResponse
import com.ort.wolfportal.logic.recruitment.response.LastWolfVillageDetail
import com.ort.wolfportal.logic.slack.SlackLogic
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import java.util.*

@Component
class UpdateLastWolfRecruitmentLogic(
    val restTemplate: RestTemplate,
    val slackLogic: SlackLogic
) : AbstractUpdateRecruitmentLogic() {

    private val logger = LoggerFactory.getLogger(UpdateLastWolfRecruitmentLogic::class.java)
    private val url = "https://wolfort.dev/lastwolf/recruiting-village-list"

    override fun scraping(): CountryVillageStatusDto {
        return try {
            val response = restTemplate.getForObject(url, LastWolfResponse::class.java)
            mappingToCountryRecruitmentDto(response)
        } catch (e: RuntimeException) {
            slackLogic.postToSlackIfNeeded(this.javaClass.simpleName, e)
            logger.error(e.message, e)
            CountryVillageStatusDto()
        }
    }

    private fun mappingToCountryRecruitmentDto(response: LastWolfResponse?): CountryVillageStatusDto {
        response ?: return CountryVillageStatusDto()
        val recruitVillageList = ArrayList<CountryVillageDto>()
        recruitVillageList.addAll( //
            response.villageList.filter { "プロローグ" == it.status }.map { convertToVillage(it) }
        )
        val progressVillageList =
            response.villageList.filter { "プロローグ" != it.status }.map { convertToVillage(it) }

        return CountryVillageStatusDto(
            isSuccess = true,
            recruitVillageList = recruitVillageList,
            progressVillageList = progressVillageList
        )
    }

    private fun convertToVillage(v: LastWolfVillageDetail): CountryVillageDto {
        val itemMap = HashMap<String, String>()
        itemMap[ItemKey.KEY_VILLAGE_NAME] = v.name
        itemMap[ItemKey.KEY_VILLAGE_STATUS] = v.status
        itemMap[ItemKey.KEY_VILLAGE_PARTICIPATE_NUM] = createParticipateNumString(v)
        itemMap[ItemKey.KEY_DAYCHANGE_INTERVAL] = "${v.noonSeconds}s/${v.voteSeconds}s/${v.nightSeconds}s"
        itemMap[ItemKey.KEY_VILLAGE_URL] = v.url
        itemMap[ItemKey.KEY_CHARASET] = v.charachipName
        itemMap[ItemKey.KEY_ORGANIZE] = v.organization
        return CountryVillageDto(
            itemMap = itemMap
        )
    }

    private fun createParticipateNumString(v: LastWolfVillageDetail): String {
        return if ("プロローグ" != v.status) v.participantCount.toString()
        else "${v.participantCount}/${v.participantCapacity}"
    }
}
