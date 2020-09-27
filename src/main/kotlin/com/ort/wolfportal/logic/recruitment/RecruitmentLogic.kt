package com.ort.wolfportal.logic.recruitment

import com.ort.dbflute.exbhv.CountryBhv
import com.ort.dbflute.exentity.Country
import org.dbflute.cbean.result.ListResultBean
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

/**
 * controllerだとcacheが効かないので切り出す
 */
@Service
class RecruitmentLogic(
    private val countryBhv: CountryBhv
) {
    @Cacheable("recruit", key = "'recruit'")
    fun selectCountryList(): ListResultBean<Country> {
        val countryList = countryBhv.selectList { cb ->
            cb.query().setIsDisplay_Equal(true)
            cb.query().addOrderBy_DisplayOrder_Asc()
        }
        countryBhv.load(countryList) { loader ->
            loader.loadCountryRecruitment { cRecCB -> cRecCB.query().addOrderBy_DisplayOrder_Asc() }
                .withNestedReferrer { cRecLoader -> cRecLoader.loadCountryRecruitmentDetail { cRecDetailCB -> } }
            loader.loadCountryProgress { cRecCB -> cRecCB.query().addOrderBy_DisplayOrder_Asc() }
                .withNestedReferrer { cRecLoader -> cRecLoader.loadCountryProgressDetail { cRecDetailCB -> } }
        }
        return countryList
    }
}