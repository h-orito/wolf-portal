package com.ort.wolfportal.api.controller

import com.ort.dbflute.exbhv.CountryBhv
import com.ort.dbflute.exbhv.CountryPlayerBhv
import com.ort.dbflute.exbhv.PlayerBhv
import com.ort.dbflute.exbhv.VillageBhv
import com.ort.dbflute.exbhv.VillagePlayerStatsBhv
import com.ort.dbflute.exentity.Country
import com.ort.dbflute.exentity.CountryPlayer
import com.ort.dbflute.exentity.Player
import com.ort.dbflute.exentity.Village
import com.ort.dbflute.exentity.VillagePlayerStats
import com.ort.wolfportal.api.form.SaveStatsForm
import com.ort.wolfportal.api.form.StatsCountryPlayerListForm
import com.ort.wolfportal.api.form.StatsPlayerForm
import com.ort.wolfportal.api.form.StatsVillageListForm
import com.ort.wolfportal.api.view.PagingModel
import com.ort.wolfportal.logic.stats.AbstractUpdateStatsLogic
import com.ort.wolfportal.logic.stats.RematchLogic
import com.ort.wolfportal.logic.stats.UpdateFireWolfStatsLogic
import com.ort.wolfportal.logic.stats.UpdateGetsurouSideEStatsLogic
import com.ort.wolfportal.logic.stats.UpdateGetsurouSideHStatsLogic
import com.ort.wolfportal.logic.stats.UpdateGetsurouSideMStatsLogic
import com.ort.wolfportal.logic.stats.UpdateHowlingWolfStatsLogic
import com.ort.wolfportal.logic.stats.UpdateMikazukiStatsLogic
import com.ort.wolfportal.logic.stats.UpdateStarHunterStatsLogic
import com.ort.wolfportal.logic.stats.UpdateWolfMansionStatsLogic
import com.ort.wolfportal.logic.stats.UpdateWolfbbsGStatsLogic
import org.dbflute.cbean.result.ListResultBean
import org.dbflute.cbean.result.PagingResultBean
import org.slf4j.LoggerFactory
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody


@Controller
class StatsController(
    private val countryBhv: CountryBhv,
    private val villageBhv: VillageBhv,
    private val playerBhv: PlayerBhv,
    private val countryPlayerBhv: CountryPlayerBhv,
    private val villagePlayerStatsBhv: VillagePlayerStatsBhv,
    private val updateWolfbbsGStatsLogic: UpdateWolfbbsGStatsLogic,
    private val updateGetsurouSideMStatsLogic: UpdateGetsurouSideMStatsLogic,
    private val updateGetsurouSideHStatsLogic: UpdateGetsurouSideHStatsLogic,
    private val updateGetsurouSideEStatsLogic: UpdateGetsurouSideEStatsLogic,
    private val updateMikazukiStatsLogic: UpdateMikazukiStatsLogic,
    private val updateHowlingWolfStatsLogic: UpdateHowlingWolfStatsLogic,
    private val updateFireWolfStatsLogic: UpdateFireWolfStatsLogic,
    private val updateWolfMansionStatsLogic: UpdateWolfMansionStatsLogic,
    private val updateStarHunterStatsLogic: UpdateStarHunterStatsLogic,
    private val rematchLogic: RematchLogic
) {

    private val logger = LoggerFactory.getLogger(StatsController::class.java)

    @GetMapping("/stats")
    fun stats(): String = "stats"

    @GetMapping("/stats/country/{countryId}/village-list")
    fun country(
        @PathVariable countryId: Int,
        @PageableDefault(size = 10, page = 1, direction = Sort.Direction.DESC, sort = ["villageNo"]) pageable: Pageable,
        @ModelAttribute("searchForm") form: StatsVillageListForm, model: Model
    ): String {
        val country = selectCountry(countryId)
        val villageList = selectVillageList(countryId, form, pageable)
        val countryModel = mappingToCountry(country)
        countryModel.villageList = mappingToVillageList(villageList)
        model.addAttribute("country", countryModel)
        model.addAttribute("paging", PagingModel(villageList))
        return "stats-village-list"
    }

    @GetMapping("/stats/country/{countryId}/village-no/{villageNo}")
    fun village(@PathVariable countryId: Int?, @PathVariable villageNo: Int?): String {
        val optVillage = villageBhv.selectEntity { cb ->
            cb.query().setCountryId_Equal(countryId)
            cb.query().setVillageNo_Equal(villageNo)
        }
        return if (optVillage.isPresent) {
            "redirect:/stats/country/" + countryId + "/village/" + optVillage.get().villageId
        } else {
            "redirect:/stats/country/$countryId/village-list"
        }
    }

    @GetMapping("/stats/country/{countryId}/village/{villageId}")
    fun village(@PathVariable countryId: Int, @PathVariable villageId: Int, model: Model): String {
        val village = selectVillage(villageId)
        val villageModel = mappingToVillage(village)
        model.addAttribute("village", villageModel)
        val country =
            countryBhv.selectEntityWithDeletedCheck { cb -> cb.query().setCountryId_Equal(village.getCountryId()) }
        val countryModel = mappingToCountry(country)
        model.addAttribute("country", countryModel)
        val rematchList = rematchLogic.selectRematchList(village)
        model.addAttribute("rematchList", rematchList)
        return "stats-village"
    }

    @GetMapping("/stats/player/{playerId}")
    fun player(
        @PathVariable playerId: Int,
        @PageableDefault(
            size = 10,
            page = 1,
            direction = Sort.Direction.DESC,
            sort = ["villageStartDatetime"]
        ) pageable: Pageable,
        @ModelAttribute("searchForm") form: StatsPlayerForm, model: Model
    ): String {
        val player = selectPlayer(playerId)
        val playerModel = mappingToPlayer(player)
        model.addAttribute("player", playerModel)
        val vpsList = selectVillagePlayerStatsList(playerId, form, pageable)
        val vpsModelList = mappingToVillagePlayerStatsList(vpsList)
        model.addAttribute("vpsList", vpsModelList)
        model.addAttribute("paging", PagingModel(vpsList))
        return "stats-player"
    }

    @GetMapping("/stats/country/{countryId}/country-player/{countryPlayerId}")
    fun countryPlayer(
        @PathVariable countryId: Int,
        @PathVariable countryPlayerId: Int,
        @PageableDefault(
            size = 10,
            page = 1,
            direction = Sort.Direction.DESC,
            sort = ["villageStartDatetime"]
        ) pageable: Pageable,
        @ModelAttribute("searchForm") form: StatsPlayerForm,
        model: Model
    ): String {
        val countryPlayer = selectCountryPlayer(countryPlayerId)
        val countryPlayerModel = mappingToCountryPlayer(countryPlayer)
        model.addAttribute("countryPlayer", countryPlayerModel)
        val vpsList = selectVillagePlayerStatsListByCountryPlayerId(countryPlayer.countryPlayerId, form, pageable)
        val vpsModelList = mappingToVillagePlayerStatsList(vpsList)
        model.addAttribute("vpsList", vpsModelList)
        model.addAttribute("paging", PagingModel(vpsList))
        return "stats-country-player"
    }

    @GetMapping("/stats/country/{countryId}/player-list")
    fun countryPlayerList(
        @PathVariable countryId: Int,
        @PageableDefault(size = 10, page = 1, direction = Sort.Direction.DESC, sort = ["userId"]) pageable: Pageable,
        @ModelAttribute("searchForm") form: StatsCountryPlayerListForm, model: Model
    ): String {
        val country = selectCountry(countryId)
        val countryModel = mappingToCountry(country)
        model.addAttribute("country", countryModel)
        val countryPlayerList = selectCountryPlayerList(countryId, pageable, form)
        val cpModelList = mappingToCountryPlayerList(countryPlayerList)
        model.addAttribute("countryPlayerList", cpModelList)
        model.addAttribute("paging", PagingModel(countryPlayerList))
        return "stats-country-player-list"
    }

    @PostMapping("/stats/country/{countryId}")
    @ResponseBody
    fun saveCountryVillageStats(@PathVariable countryId: Int, form: SaveStatsForm): String? {
        val logic = detectLogic(countryId)
        val villageNoList = detectTargetVillageNoList(countryId, form, logic)
        villageNoList.forEach { vid ->
            try {
                logic.fetchVillageInfo(vid)?.let { logic.upsertCountryStats(countryId, it) }
            } catch (e: Exception) {
                logger.error(e.message, e)
                return null
            }
        }
        return null
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    fun selectCountry(countryId: Int): Country {
        return countryBhv.selectEntityWithDeletedCheck { it.query().setCountryId_Equal(countryId) }
    }

    fun selectVillageList(
        countryId: Int,
        form: StatsVillageListForm,
        pageable: Pageable
    ): PagingResultBean<Village> {
        return villageBhv.selectPage { cb ->
            cb.query().setCountryId_Equal(countryId)
            form.villageName?.let {
                if (it.isNotEmpty()) cb.query().setVillageName_LikeSearch(it) { op -> op.likeContain() }
            }
            cb.paging(pageable.pageSize, pageable.pageNumber)
            cb.query().addOrderBy_VillageNo_Desc()
        }
    }

    fun selectVillage(villageId: Int): Village {
        val village = villageBhv.selectEntityWithDeletedCheck { cb ->
            cb.setupSelect_Country()
            cb.query().setVillageId_Equal(villageId)
        }
        villageBhv.loadVillagePlayerStats(village) { vpCB ->
            vpCB.setupSelect_CountryPlayer()
            vpCB.query().addOrderBy_Life_Asc().withNullsLast()
        }
        return village
    }

    private fun selectVillageList(countryId: Int): ListResultBean<Village> {
        return villageBhv.selectList { cb -> cb.query().setCountryId_Equal(countryId) }
    }

    private fun selectPlayer(playerId: Int): Player {
        val player = playerBhv.selectEntityWithDeletedCheck {
            it.query().setPlayerId_Equal(playerId)
        }
        playerBhv.load(player) {
            it.loadCountryPlayer { cpCB ->
                cpCB.setupSelect_Country()
            }.withNestedReferrer { cpLoader ->
                cpLoader.loadVillagePlayerStats { vpsCB ->
                    vpsCB.setupSelect_Village().withCountry()
                    vpsCB.query().queryVillage().addOrderBy_VillageStartDatetime_Asc()
                }
            }
        }
        return player
    }

    private fun selectVillagePlayerStatsList(
        playerId: Int, form: StatsPlayerForm, pageable: Pageable
    ): PagingResultBean<VillagePlayerStats> {
        return villagePlayerStatsBhv.selectPage { cb ->
            cb.setupSelect_CountryPlayer()
            cb.setupSelect_Village().withCountry()
            cb.query().queryCountryPlayer().setPlayerId_Equal(playerId)
            form.villageName?.let {
                if (it.isNotEmpty()) {
                    cb.query().queryVillage().setVillageName_LikeSearch(it) { op -> op.likeContain() }
                }
            }
            cb.paging(pageable.pageSize, pageable.pageNumber)
            cb.query().queryVillage().addOrderBy_VillageStartDatetime_Desc()
        }
    }

    private fun selectCountryPlayerList(
        countryId: Int, pageable: Pageable, form: StatsCountryPlayerListForm
    ): PagingResultBean<CountryPlayer> {
        if (form.userId == null || form.userId.isEmpty()) return PagingResultBean<CountryPlayer>()
        return countryPlayerBhv.selectPage { cb ->
            cb.specify().derivedVillagePlayerStats()
                .count({ vpsCB -> vpsCB.specify().columnVillagePlayerStatsId() }, CountryPlayer.participateCount)
            cb.query().setCountryId_Equal(countryId)
            cb.query().setUserId_LikeSearch(form.userId) { op -> op.likeContain() }
            cb.paging(pageable.pageSize, pageable.pageNumber)
        }
    }

    private fun selectCountryPlayer(countryPlayerId: Int): CountryPlayer {
        return countryPlayerBhv.selectEntityWithDeletedCheck { cb ->
            cb.setupSelect_Country()
            cb.query().setCountryPlayerId_Equal(countryPlayerId)
        }
    }

    private fun selectVillagePlayerStatsListByCountryPlayerId(
        countryPlayerId: Int, form: StatsPlayerForm, pageable: Pageable
    ): PagingResultBean<VillagePlayerStats> {
        return villagePlayerStatsBhv.selectPage { cb ->
            cb.setupSelect_Village().withCountry()
            cb.setupSelect_CountryPlayer()
            cb.query().setCountryPlayerId_Equal(countryPlayerId)
            form.villageName?.let {
                if (it.isNotEmpty()) cb.query().queryVillage().setVillageName_LikeSearch(it) { op -> op.likeContain() }
            }
            form.villageName?.let { }
            cb.query().queryVillage().addOrderBy_VillageStartDatetime_Desc()
            cb.paging(pageable.pageSize, pageable.pageNumber)
        }
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private fun detectLogic(countryId: Int): AbstractUpdateStatsLogic {
        return when (countryId) {
            1 -> updateWolfMansionStatsLogic
            2 -> updateWolfbbsGStatsLogic
            4 -> updateGetsurouSideMStatsLogic
            5 -> updateGetsurouSideHStatsLogic
            6 -> updateGetsurouSideEStatsLogic
            7 -> updateMikazukiStatsLogic
            23 -> updateHowlingWolfStatsLogic
            24 -> updateFireWolfStatsLogic
            26 -> updateStarHunterStatsLogic
            else -> throw IllegalStateException("invalid countryId")
        }
    }

    private fun detectTargetVillageNoList(
        countryId: Int,
        form: SaveStatsForm,
        logic: AbstractUpdateStatsLogic
    ): List<Int> {
        form.villageNo?.let { return listOf(it) }
        form.villageId?.let {
            val village = villageBhv.selectEntityWithDeletedCheck { cb ->
                cb.query().setCountryId_Equal(countryId)
                cb.query().setVillageId_Equal(it)
            }
            return listOf(village.villageNo)
        }
        val villageNoList = logic.fetchVillageNoList()
        if (form.ignoreExistsVillage == true) return villageNoList
        val dbVillageNoList = selectVillageList(countryId).map { it.villageNo }
        return villageNoList.filter { !dbVillageNoList.contains(it) }
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private fun mappingToCountry(c: Country): com.ort.wolfportal.api.view.Country {
        return com.ort.wolfportal.api.view.Country(
            countryId = c.countryId,
            countryName = c.countryName,
            villageList = c.villageList.map { mappingToVillage(it) }
        )
    }

    private fun mappingToVillageList(villageList: List<Village>): List<com.ort.wolfportal.api.view.Village> {
        return villageList.map { mappingToVillage(it) }
    }


    private fun mappingToVillage(v: Village): com.ort.wolfportal.api.view.Village {
        return com.ort.wolfportal.api.view.Village(
            countryId = v.countryId,
            countryName = null,
            villageId = v.villageId,
            villageNo = v.villageNo,
            villageName = v.villageName,
            villageUrl = v.villageUrl,
            villageStartDatetime = v.villageStartDatetime,
            villageEndDatetime = v.villageEndDatetime,
            winCampName = v.winCampName,
            villagePlayerStatsList = v.villagePlayerStatsList.map {
                mappingToVillagePlayerStats(it)
            }
        )
    }

    private fun mappingToVillagePlayerStatsList(
        vpsList: PagingResultBean<VillagePlayerStats>
    ): List<com.ort.wolfportal.api.view.VillagePlayerStats> {
        return vpsList.map { vps ->
            val vpsModel = mappingToVillagePlayerStats(vps)
            vpsModel.village = vps.village.map {
                val village = mappingToVillage(it)
                village.countryName = it.country.get().countryName
                village
            }.orElse(null)
            vpsModel.countryPlayer = vps.countryPlayer.map { cp ->
                com.ort.wolfportal.api.view.CountryPlayer(
                    countryPlayerId = cp.countryPlayerId,
                    playerId = cp.playerId,
                    userId = cp.userId,
                    countryId = cp.countryId,
                    countryName = null,
                    participateNum = null
                )
            }.orElse(null)
            vpsModel
        }
    }

    private fun mappingToVillagePlayerStats(vps: VillagePlayerStats): com.ort.wolfportal.api.view.VillagePlayerStats {
        return com.ort.wolfportal.api.view.VillagePlayerStats(
            characterName = vps.characterName,
            countryPlayer = vps.countryPlayer.map { mappingToCountryPlayer(it) }.orElse(null),
            skillName = vps.skillName,
            life = vps.life,
            winlose = vps.winloseCodeAsWinLose?.alias() ?: "",
            village = null,
            countryPlayerId = null
        )
    }

    private fun mappingToCountryPlayerList(
        countryPlayerList: PagingResultBean<CountryPlayer>
    ): List<com.ort.wolfportal.api.view.CountryPlayer> {
        return countryPlayerList.map { cp ->
            val cpModel = this.mappingToCountryPlayer(cp)
            cpModel.participateNum = cp.participateCount
            cpModel
        }
    }

    private fun mappingToCountryPlayer(cp: CountryPlayer): com.ort.wolfportal.api.view.CountryPlayer {
        return com.ort.wolfportal.api.view.CountryPlayer(
            countryPlayerId = cp.countryPlayerId,
            playerId = cp.playerId,
            userId = cp.userId,
            countryId = cp.countryId,
            countryName = cp.country.map { it.countryName }.orElse(null),
            participateNum = null
        )
    }

    private fun mappingToPlayer(player: Player): com.ort.wolfportal.api.view.Player {
        return com.ort.wolfportal.api.view.Player(
            countryPlayerList = player.countryPlayerList.map { mappingToCountryPlayer(it) }
        )
    }
}