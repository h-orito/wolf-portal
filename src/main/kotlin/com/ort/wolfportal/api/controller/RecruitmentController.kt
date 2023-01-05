package com.ort.wolfportal.api.controller

import com.ort.dbflute.exbhv.CountryBhv
import com.ort.dbflute.exbhv.RecruitStatsBhv
import com.ort.dbflute.exentity.CountryProgress
import com.ort.dbflute.exentity.CountryRecruitment
import com.ort.dbflute.exentity.RecruitStats
import com.ort.wolfportal.api.form.RecruitmentForm
import com.ort.wolfportal.api.view.IndexContentResult
import com.ort.wolfportal.api.view.RecruitmentGraphResponse
import com.ort.wolfportal.logic.recruitment.AbstractUpdateRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.ItemKey
import com.ort.wolfportal.logic.recruitment.RecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateAbyssBlueRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateAbyssRedRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateChitoseRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateFireWolfRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateGetsurouSideERecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateGetsurouSideHRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateGetsurouSideMRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateGijiCielRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateGijiDaisRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateGijiPerjuryRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateGijiXebecRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateHowlingWolfRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateJinroLiteRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateJinroOnlineRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateJinroOnlineXRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateLastWolfRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateMikazukiRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateRealRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateRoseRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateRuruServerRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateSebasRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateStarHunterAkatsukiRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateStarHunterRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateUrikaRecruitmentLogic
import com.ort.wolfportal.logic.recruitment.UpdateWerewolfMansionRecruitmentLogic
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Controller
class RecruitmentController(
    private val countryBhv: CountryBhv,
    private val recruitStatsBhv: RecruitStatsBhv,
    private val updateWerewolfMansionRecruitmentLogic: UpdateWerewolfMansionRecruitmentLogic,
    private val updateUrikaRecruitmentLogic: UpdateUrikaRecruitmentLogic,
    private val updateGetsurouSideMRecruitmentLogic: UpdateGetsurouSideMRecruitmentLogic,
    private val updateGetsurouSideHRecruitmentLogic: UpdateGetsurouSideHRecruitmentLogic,
    private val updateGetsurouSideERecruitmentLogic: UpdateGetsurouSideERecruitmentLogic,
    private val updateStarHunterRecruitmentLogic: UpdateStarHunterRecruitmentLogic,
    private val updateStarHunterAkatsukiRecruitmentLogic: UpdateStarHunterAkatsukiRecruitmentLogic,
    private val updateMikazukiRecruitmentLogic: UpdateMikazukiRecruitmentLogic,
    private val updateGijiPerjuryRecruitmentLogic: UpdateGijiPerjuryRecruitmentLogic,
    private val updateGijiXebecRecruitmentLogic: UpdateGijiXebecRecruitmentLogic,
    private val updateGijiDaisRecruitmentLogic: UpdateGijiDaisRecruitmentLogic,
    private val updateGijiCielRecruitmentLogic: UpdateGijiCielRecruitmentLogic,
    private val updateSebasRecruitmentLogic: UpdateSebasRecruitmentLogic,
    private val updateRoseRecruitmentLogic: UpdateRoseRecruitmentLogic,
    private val updateChitoseRecruitmentLogic: UpdateChitoseRecruitmentLogic,
    private val updateAbyssBlueRecruitmentLogic: UpdateAbyssBlueRecruitmentLogic,
    private val updateAbyssRedRecruitmentLogic: UpdateAbyssRedRecruitmentLogic,
    private val updateRealRecruitmentLogic: UpdateRealRecruitmentLogic,
    private val updateJinroLiteRecruitmentLogic: UpdateJinroLiteRecruitmentLogic,
    private val updateJinroOnlineXRecruitmentLogic: UpdateJinroOnlineXRecruitmentLogic,
    private val updateJinroOnlineRecruitmentLogic: UpdateJinroOnlineRecruitmentLogic,
    private val updateRuruServerRecruitmentLogic: UpdateRuruServerRecruitmentLogic,
    private val updateHowlingWolfRecruitmentLogic: UpdateHowlingWolfRecruitmentLogic,
    private val updateFireWolfRecruitmentLogic: UpdateFireWolfRecruitmentLogic,
    private val updateLastWolfRecruitmentLogic: UpdateLastWolfRecruitmentLogic,
    private val recruitmentLogic: RecruitmentLogic
) {

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @GetMapping("/recruitment")
    fun init(model: Model): String {
        val countryList = recruitmentLogic.selectCountryList()
        model.addAttribute("content", IndexContentResult(countryList))
        return "recruitment"
    }

    @GetMapping("/recruitment-graph")
    @ResponseBody
    fun graph(): RecruitmentGraphResponse {
        val statsList = recruitStatsBhv.selectList { cb ->
            cb.query().setStatsDatetime_GreaterEqual(LocalDateTime.now().minusWeeks(2))
            cb.query().addOrderBy_StatsDatetime_Asc()
        }
        return RecruitmentGraphResponse(
            datetimeList = statsList.map { it.statsDatetime.format(DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm")) },
            villageNumList = statsList.map { it.villageNum },
            participateNumList = statsList.map { it.participateNum }
        )
    }

    @PostMapping("/recruitment")
    @ResponseBody
    fun updateRecruitment(form: RecruitmentForm): String? {
        val countryIdList = detectTargetCountryList(form.countryId)
        updateRecruitment(countryIdList)
        if (form.store == true) insertStats()
        return null
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    private fun insertStats() {
        val countryList = recruitmentLogic.selectCountryList()
        val recruitingVillageList = countryList.flatMap { it.countryRecruitmentList }
        val progressVillageList = countryList.flatMap { it.countryProgressList }
        val recruitStats = RecruitStats()
        recruitStats.villageNum = recruitingVillageList.size + progressVillageList.size
        recruitStats.participateNum =
            calculateRecParticipateNum(recruitingVillageList) + calculateProgressParticipateNum(progressVillageList)
        recruitStats.statsDatetime = LocalDateTime.now()
        recruitStatsBhv.insert(recruitStats)
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private fun detectTargetCountryList(countryId: Int?): List<Int> {
        return if (countryId != null) listOf(countryId)
        else countryBhv.selectList { cb -> cb.query().setIsDisplay_Equal(true) }.map { c -> c.countryId }
    }

    private fun updateRecruitment(countryIdList: List<Int>) {
        countryIdList.forEach { countryId ->
            val logic = detectLogic(countryId)
            val countryRecruitmentInfo = logic.scraping()
            logic.deleteInsertCountryRecruitment(countryId, countryRecruitmentInfo)
        }
    }

    private fun detectLogic(countryId: Int): AbstractUpdateRecruitmentLogic {
        when (countryId) {
            1 -> return updateWerewolfMansionRecruitmentLogic
            // 2: 人狼BBSは新規村が作成されなくなった
            3 -> return updateUrikaRecruitmentLogic
            4 -> return updateGetsurouSideMRecruitmentLogic
            5 -> return updateGetsurouSideHRecruitmentLogic
            6 -> return updateGetsurouSideERecruitmentLogic
            7 -> return updateMikazukiRecruitmentLogic
            8 -> return updateGijiPerjuryRecruitmentLogic
            9 -> return updateGijiXebecRecruitmentLogic
            10 -> return updateGijiDaisRecruitmentLogic
            11 -> return updateGijiCielRecruitmentLogic
            12 -> return updateSebasRecruitmentLogic
            13 -> return updateRoseRecruitmentLogic
            // 14: 象牙国は取得対象外
            15 -> return updateChitoseRecruitmentLogic
            16 -> return updateAbyssBlueRecruitmentLogic
            17 -> return updateAbyssRedRecruitmentLogic
            18 -> return updateRealRecruitmentLogic
            19 -> return updateJinroLiteRecruitmentLogic
            20 -> return updateJinroOnlineXRecruitmentLogic
            21 -> return updateJinroOnlineRecruitmentLogic
            22 -> return updateRuruServerRecruitmentLogic
            23 -> return updateHowlingWolfRecruitmentLogic
            24 -> return updateFireWolfRecruitmentLogic
            25 -> return updateLastWolfRecruitmentLogic
            26 -> return updateStarHunterRecruitmentLogic
            27 -> return updateStarHunterAkatsukiRecruitmentLogic
            else -> throw IllegalStateException("countryId is invalid.")
        }
    }

    private fun calculateRecParticipateNum(recruitingVillageList: List<CountryRecruitment>): Int {
        return recruitingVillageList
            .flatMap { it.countryRecruitmentDetailList }
            .filter { it.itemName == ItemKey.KEY_VILLAGE_PARTICIPATE_NUM }
            .sumBy { convertToParticipateNum(it.itemValue) }
    }

    private fun calculateProgressParticipateNum(progressVillageList: List<CountryProgress>): Int {
        return progressVillageList
            .flatMap { it.countryProgressDetailList }
            .filter { it.itemName == ItemKey.KEY_VILLAGE_PARTICIPATE_NUM }
            .sumBy { convertToParticipateNum(it.itemValue) }
    }

    private fun convertToParticipateNum(str: String): Int {
        if (str.isEmpty()) return 0
        return try {
            Integer.parseInt(str.split("/".toRegex())[0])
        } catch (e: NumberFormatException) {
            0
        }
    }
}
