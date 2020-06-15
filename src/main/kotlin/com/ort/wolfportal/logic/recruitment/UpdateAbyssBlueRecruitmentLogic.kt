package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.logic.slack.SlackLogic
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class UpdateAbyssBlueRecruitmentLogic(
    val logic: AbyssScrapingLogic,
    val slackLogic: SlackLogic
) : AbstractUpdateRecruitmentLogic() {

    private val url = "http://chaos-circle.jp/abyss/sow.cgi"
    private val logger = LoggerFactory.getLogger(UpdateAbyssBlueRecruitmentLogic::class.java)

    override fun scraping(): CountryVillageStatusDto {
        return try {
            logic.scraping(url)
        } catch (e: Exception) {
            slackLogic.postToSlackIfNeeded(this::class.simpleName!!, e)
            logger.error(e.message, e)
            CountryVillageStatusDto()
        }
    }
}
