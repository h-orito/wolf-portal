package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.logic.slack.SlackLogic
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class UpdateAbyssRedRecruitmentLogic(
    val logic: AbyssScrapingLogic,
    val slackLogic: SlackLogic
) : AbstractUpdateRecruitmentLogic() {

    private val logger = LoggerFactory.getLogger(UpdateAbyssRedRecruitmentLogic::class.java)
    private val url = "http://red-abyss.net/abyss/sow.cgi"

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
