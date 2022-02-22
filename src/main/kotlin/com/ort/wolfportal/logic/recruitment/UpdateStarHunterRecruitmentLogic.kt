package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.logic.slack.SlackLogic
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class UpdateStarHunterRecruitmentLogic(
    val logic: GetsurouScrapingLogic,
    val slackLogic: SlackLogic
) : AbstractUpdateRecruitmentLogic() {

    private val logger = LoggerFactory.getLogger(UpdateStarHunterRecruitmentLogic::class.java)
    private val url = "http://star-hunter.sakura.ne.jp/sow.cgi"

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
