package com.ort.wolfportal.logic.stats

import com.ort.dbflute.allcommon.CDef
import com.ort.wolfportal.logic.stats.response.HowlingWolfResponse
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Component
class UpdateHowlingWolfStatsLogic(
    private val restTemplate: RestTemplate
) : AbstractUpdateStatsLogic() {

    private val logger = LoggerFactory.getLogger(UpdateHowlingWolfStatsLogic::class.java)
    private val url = "https://wolfort.net/howling-wolf/village-record/list"
    private val formatter = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm")

    override fun fetchVillageNoList(): List<Int> {
        return try {
            val latestVillageNo = restTemplate.getForObject(
                "https://wolfort.net/howling-wolf/village-record/latest-vid",
                LatestVillageNo::class.java
            )
            return (1..latestVillageNo!!.vid).toList()
        } catch (e: RuntimeException) {
            logger.error(e.message, e)
            listOf()
        }
    }

    override fun fetchVillageInfo(villageNo: Int): VillageStats? {
        val response = restTemplate.getForObject("$url?vid=${villageNo}", HowlingWolfResponse::class.java) ?: return null
        if (response.list.isEmpty()) return null
        val record = response.list.first()
        if (record.status == "廃村") return null
        return VillageStats(
            villageName = record.name,
            villageNo = record.id,
            villageUrl = record.url,
            villageStartDatetime = LocalDateTime.parse(record.startDatetime, formatter),
            villageEndDatetime = LocalDateTime.parse(record.epilogueDatetime, formatter),
            winCampName = record.winCampName!!,
            playerStatsList = record.participantList.map {
                VillagePlayerStats(
                    userId = if (it.otherSiteUserId.isNullOrEmpty()) it.twitterUserId else it.otherSiteUserId,
                    characterName = it.characterName,
                    skillName = it.skillName!!,
                    winlose = if (it.win!!) CDef.WinLose.勝利 else CDef.WinLose.敗北,
                    life = if (it.dead) "${it.deadDay}d${it.deadReason}" else "生存"
                )
            }
        )
    }

    data class LatestVillageNo(val vid: Int)
}
