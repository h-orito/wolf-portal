package com.ort.wolfportal.api.controller

import com.ort.dbflute.exbhv.CountryBhv
import com.ort.dbflute.exbhv.VillageBhv
import com.ort.dbflute.exentity.Country
import com.ort.dbflute.exentity.Village
import com.ort.wolfportal.api.form.StatsVillageListForm
import com.ort.wolfportal.api.view.RecruitmentCountry
import com.ort.wolfportal.logic.recruitment.ItemKey
import org.dbflute.cbean.result.ListResultBean
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute


@Controller
class VillageListController(
    private val villageBhv: VillageBhv,
    private val countryBhv: CountryBhv
) {

    @GetMapping("/village-list")
    fun country(
        @ModelAttribute("searchForm") form: StatsVillageListForm,
        model: Model
    ): String {
        val villageName = form.villageName
        val skillName = form.skillName
        if (villageName.isNullOrEmpty() && skillName.isNullOrEmpty()) {
            model.addAttribute("villageList", listOf<Void>())
            model.addAttribute("recruitmentCountryList", listOf<Void>())
            model.addAttribute("progressCountryList", listOf<Void>())
            return "village-list"
        }
        // 終了した村から検索
        val villageList = selectVillageList(villageName, skillName)
        model.addAttribute("villageList", mappingToVillageModelList(villageList))

        if (skillName.isNullOrEmpty()) {
            // 募集中の村から検索
            val recruitmentCountryList = selectRecruitmentCountryList(villageName!!)
            model.addAttribute("recruitmentCountryList", mappingToRecruitmentCountryModelList(recruitmentCountryList))
            // 進行中の村から検索
            val progressCountryList = selectProgressCountryList(villageName)
            model.addAttribute("progressCountryList", mappingToProgressCountryModelList(progressCountryList))
        } else {
            model.addAttribute("recruitmentCountryList", listOf<Void>())
            model.addAttribute("progressCountryList", listOf<Void>())
        }
        return "village-list"
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    private fun selectVillageList(villageName: String?, skillName: String?): ListResultBean<Village> {
        return villageBhv.selectList { cb ->
            if (!villageName.isNullOrEmpty()) {
                cb.query().setVillageName_LikeSearch(villageName) { op -> op.likeContain() }
            }
            if (!skillName.isNullOrEmpty()) {
                cb.query().existsVillagePlayerStats { pStatsCB -> pStatsCB.query().setSkillName_Equal(skillName) }
            }
            cb.query().addOrderBy_VillageStartDatetime_Desc().withNullsLast()
        }
    }

    private fun selectRecruitmentCountryList(villageName: String): ListResultBean<Country> {
        val countryList = countryBhv.selectList { cb ->
            cb.query().existsCountryRecruitment { recCB ->
                recCB.query().existsCountryRecruitmentDetail { detailCB ->
                    detailCB.query().setItemName_Equal(ItemKey.KEY_VILLAGE_NAME)
                    detailCB.query().setItemValue_LikeSearch(villageName) { op -> op.likeContain() }
                }
            }
            cb.query().setIsCrawlFail_Equal(false)
        }
        countryBhv.load(countryList) { loader ->
            loader.loadCountryRecruitment { recCB ->
                recCB.query().existsCountryRecruitmentDetail { detailCB ->
                    detailCB.query().setItemName_Equal(ItemKey.KEY_VILLAGE_NAME)
                    detailCB.query().setItemValue_LikeSearch(villageName) { op -> op.likeContain() }
                }
                recCB.query().addOrderBy_DisplayOrder_Asc()
            }.withNestedReferrer { cRecLoader -> cRecLoader.loadCountryRecruitmentDetail { } }
        }
        return countryList
    }

    private fun selectProgressCountryList(villageName: String): ListResultBean<Country> {
        val countryList = countryBhv.selectList { cb ->
            cb.query().existsCountryProgress { prgCB ->
                prgCB.query().existsCountryProgressDetail { detailCB ->
                    detailCB.query().setItemName_Equal(ItemKey.KEY_VILLAGE_NAME)
                    detailCB.query().setItemValue_LikeSearch(villageName) { op -> op.likeContain() }
                }
            }
            cb.query().setIsCrawlFail_Equal(false)
        }
        countryBhv.load(countryList) { loader ->
            loader.loadCountryProgress { prgCB ->
                prgCB.query().existsCountryProgressDetail { detailCB ->
                    detailCB.query().setItemName_Equal(ItemKey.KEY_VILLAGE_NAME)
                    detailCB.query().setItemValue_LikeSearch(villageName) { op -> op.likeContain() }
                }
                prgCB.query().addOrderBy_DisplayOrder_Asc()
            }.withNestedReferrer { cRecLoader -> cRecLoader.loadCountryProgressDetail { } }
        }
        return countryList
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private fun mappingToVillageModelList(villageList: List<Village>): List<com.ort.wolfportal.api.view.Village> {
        return villageList.map { mappingToVillageModel(it) }
    }

    private fun mappingToVillageModel(village: Village): com.ort.wolfportal.api.view.Village {
        return com.ort.wolfportal.api.view.Village(
            countryId = village.countryId,
            countryName = null,
            villageId = village.villageId,
            villageNo = village.villageNo,
            villageName = village.villageName,
            villageUrl = village.villageUrl,
            villageStartDatetime = village.villageStartDatetime,
            villageEndDatetime = village.villageEndDatetime,
            winCampName = village.winCampName,
            villagePlayerStatsList = listOf()
        )
    }

    private fun mappingToRecruitmentCountryModelList(recruitmentCountryList: ListResultBean<Country>): List<RecruitmentCountry> {
        return recruitmentCountryList.map { country -> RecruitmentCountry(country) }
    }

    private fun mappingToProgressCountryModelList(progressCountryList: ListResultBean<Country>): List<RecruitmentCountry> {
        return progressCountryList.map { country -> RecruitmentCountry(country) }
    }
}