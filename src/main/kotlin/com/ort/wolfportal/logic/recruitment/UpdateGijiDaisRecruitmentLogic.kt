package com.ort.wolfportal.logic.recruitment

import com.ort.wolfportal.logic.slack.SlackLogic
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class UpdateGijiDaisRecruitmentLogic(
    val logic: GijiScrapingLogic,
    val slackLogic: SlackLogic
) : AbstractUpdateRecruitmentLogic() {

    private val logger = LoggerFactory.getLogger(UpdateGijiDaisRecruitmentLogic::class.java)
    private val url = "http://dais.kokage.cc/dais/sow.cgi"

    override fun scraping(): CountryVillageStatusDto {
        try {
            return logic.scraping(url)
        } catch (e: Exception) {
            slackLogic.postToSlackIfNeeded(this::class.simpleName!!, e)
            logger.error(e.message, e)
            return CountryVillageStatusDto()
        }
    }
}
