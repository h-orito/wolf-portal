package com.ort.wolfportal.api.view

import com.ort.dbflute.exentity.Country
import com.ort.dbflute.exentity.CountryProgress
import com.ort.dbflute.exentity.CountryRecruitment
import com.ort.wolfportal.logic.recruitment.ItemKey

data class IndexContentResult(
    val countryList: List<RecruitmentCountry>,

    /** 募集中の村の数 */
    val recruitingVillageNum: Int,

    /** 進行中の村の数 */
    val progressVillageNum: Int,

    /** 募集中の村に参加している人数 */
    val participateRecruitingVillageNum: Int,

    /** 進行中の村に参加している人数 */
    val participateProgressVillageNum: Int
) {
    constructor(
        countryList: List<Country>
    ) : this(
        countryList = countryList.map { RecruitmentCountry(it) },
        recruitingVillageNum = countryList.flatMap { it.countryRecruitmentList }.size,
        participateRecruitingVillageNum = calculateRecParticipateNum(countryList.flatMap { it.countryRecruitmentList }),
        progressVillageNum = countryList.flatMap { it.countryProgressList }.size,
        participateProgressVillageNum = calculateProgressParticipateNum(countryList.flatMap { it.countryProgressList })
    )

    companion object {
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
}
