package com.ort.wolfportal.logic.recruitment

import com.ort.dbflute.exbhv.*
import com.ort.dbflute.exentity.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.CacheEvict
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import kotlin.collections.Map.Entry

@Component
abstract class AbstractUpdateRecruitmentLogic {

    @Autowired
    private lateinit var countryBhv: CountryBhv

    @Autowired
    private lateinit var countryRecruitmentBhv: CountryRecruitmentBhv

    @Autowired
    private lateinit var countryRecruitmentDetailBhv: CountryRecruitmentDetailBhv

    @Autowired
    private lateinit var countryProgressBhv: CountryProgressBhv

    @Autowired
    private lateinit var countryProgressDetailBhv: CountryProgressDetailBhv

    abstract fun scraping(): CountryVillageStatusDto

    @CacheEvict("recruit", key = "'recruit'")
    fun deleteInsertCountryRecruitment(
        countryId: Int,
        countryRecruitmentInfo: CountryVillageStatusDto
    ) {
        // 登録済みの募集状況は削除
        deleteCountryVillages(countryId)
        // 取得失敗していたら失敗した旨登録して終了
        if (!countryRecruitmentInfo.isSuccess) {
            updateCountry(countryId, true)
            return
        } else {
            updateCountry(countryId, false)
        }
        // 取得できてるので登録していく
        insertCountryRecruitment(countryId, countryRecruitmentInfo.recruitVillageList)
        insertCountryProgress(countryId, countryRecruitmentInfo.progressVillageList)
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    private fun deleteCountryVillages(countryId: Int?) {
        countryRecruitmentDetailBhv.queryDelete {
            it.query().queryCountryRecruitment().setCountryId_Equal(countryId)
        }
        countryRecruitmentBhv.queryDelete { it.query().setCountryId_Equal(countryId) }
        countryProgressDetailBhv.queryDelete {
            it.query().queryCountryProgress().setCountryId_Equal(countryId)
        }
        countryProgressBhv.queryDelete { it.query().setCountryId_Equal(countryId) }
    }

    private fun updateCountry(countryId: Int, isFailure: Boolean) {
        val country = Country()
        country.countryId = countryId
        country.isCrawlFail = isFailure
        country.lastUpdateDatetime = LocalDateTime.now()
        countryBhv.update(country)
    }

    private fun insertCountryRecruitment(countryId: Int, displayOrder: Int): Int {
        val recruit = CountryRecruitment()
        recruit.countryId = countryId
        recruit.displayOrder = displayOrder
        countryRecruitmentBhv.insert(recruit)
        return recruit.countryRecruitmentId
    }

    private fun insertCountryRecruitmentDetail(
        countryRecruitmentId: Int,
        entry: Entry<String, String>
    ) {
        val detail = CountryRecruitmentDetail()
        detail.itemName = entry.key
        detail.itemValue = entry.value
        detail.countryRecruitmentId = countryRecruitmentId
        countryRecruitmentDetailBhv.insert(detail)
    }

    private fun insertCountryProgress(countryId: Int, displayOrder: Int): Int {
        val recruit = CountryProgress()
        recruit.countryId = countryId
        recruit.displayOrder = displayOrder
        countryProgressBhv.insert(recruit)
        return recruit.countryProgressId
    }

    private fun insertCountryProgressDetail(countryProgressId: Int, entry: Entry<String, String>) {
        val detail = CountryProgressDetail()
        detail.itemName = entry.key
        detail.itemValue = entry.value
        detail.countryProgressId = countryProgressId
        countryProgressDetailBhv.insert(detail)
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private fun insertCountryRecruitment(countryId: Int, villageList: List<CountryVillageDto>) {
        villageList.forEachIndexed { index, village ->
            val countryRecruitmentId = insertCountryRecruitment(countryId, index + 1)
            village.itemMap.entries.forEach {
                insertCountryRecruitmentDetail(
                    countryRecruitmentId,
                    it
                )
            }
        }
    }

    private fun insertCountryProgress(countryId: Int, villageList: List<CountryVillageDto>) {
        villageList.forEachIndexed { index, village ->
            val countryProgressId = insertCountryProgress(countryId, index + 1)
            village.itemMap.entries.forEach { insertCountryProgressDetail(countryProgressId, it) }
        }
    }
}
