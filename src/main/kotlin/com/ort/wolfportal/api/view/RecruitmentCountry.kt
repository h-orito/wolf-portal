package com.ort.wolfportal.api.view

import com.ort.dbflute.exentity.Country
import com.ort.dbflute.exentity.CountryProgress
import com.ort.dbflute.exentity.CountryRecruitment
import java.time.format.DateTimeFormatter

data class RecruitmentCountry(
    val countryName: String,
    val countryUrl: String,
    val isFailure: Boolean,
    val lastupdate: String,
    val recruitVillageList: List<RecruitmentVillage>,
    val progressVillageList: List<RecruitmentVillage>
) {
    constructor(
        c: Country
    ) : this(
        countryName = c.countryName,
        countryUrl = c.countryTopPageUrl,
        lastupdate = if (c.lastUpdateDatetime == null) "未取得"
        else c.lastUpdateDatetime.format(DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm")),
        isFailure = c.isCrawlFail,
        recruitVillageList = if (c.isCrawlFail) listOf()
        else c.countryRecruitmentList.map { convertToRecruitVillage(it) },
        progressVillageList = if (c.isCrawlFail) listOf()
        else c.countryProgressList.map { convertToProgressVillage(it) }
    )

    companion object {

        private fun convertToRecruitVillage(rec: CountryRecruitment): RecruitmentVillage {
            return RecruitmentVillage(
                rec.countryRecruitmentDetailList.map { it.itemName to it.itemValue }.toMap()
            )
        }

        private fun convertToProgressVillage(rec: CountryProgress): RecruitmentVillage {
            return RecruitmentVillage(
                rec.countryProgressDetailList.map { it.itemName to it.itemValue }.toMap()
            )
        }

    }
}
