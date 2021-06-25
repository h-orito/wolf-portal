package com.ort.wolfportal.logic.stats

import com.ort.dbflute.exbhv.CountryPlayerBhv
import com.ort.dbflute.exbhv.PlayerBhv
import com.ort.dbflute.exbhv.VillageBhv
import com.ort.dbflute.exbhv.VillagePlayerStatsBhv
import com.ort.dbflute.exentity.CountryPlayer
import com.ort.dbflute.exentity.Player
import com.ort.dbflute.exentity.Village
import com.ort.dbflute.exentity.VillagePlayerStats
import org.dbflute.cbean.result.ListResultBean
import org.dbflute.optional.OptionalEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
abstract class AbstractUpdateStatsLogic {

    @Autowired
    private lateinit var villageBhv: VillageBhv

    @Autowired
    private lateinit var playerBhv: PlayerBhv

    @Autowired
    private lateinit var countryPlayerBhv: CountryPlayerBhv

    @Autowired
    private lateinit var villagePlayerStatsBhv: VillagePlayerStatsBhv

    abstract fun fetchVillageInfo(villageNo: Int): VillageStats?

    abstract fun fetchVillageNoList(): List<Int>

    fun upsertCountryStats(countryId: Int, villageStats: VillageStats) {
        val villageId = upsertVillage(countryId, villageStats)
        villageStats.playerStatsList.forEach { villagePlayer ->
            val countryPlayerId = insertCountryPlayerIfNeeded(countryId, villagePlayer)
            upsertVillagePlayerStats(villageId, countryPlayerId, villagePlayer)
        }
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    private fun insertVillage(countryId: Int?, v: VillageStats): Int {
        val village = Village()
        village.countryId = countryId
        village.villageName = v.villageName
        village.villageNo = v.villageNo
        village.villageUrl = v.villageUrl
        village.villageStartDatetime = v.villageStartDatetime
        village.villageEndDatetime = v.villageEndDatetime
        village.winCampName = v.winCampName
        villageBhv.insert(village)
        return village.villageId
    }

    private fun updateVillage(villageId: Int, v: VillageStats) {
        val village = Village()
        village.villageId = villageId
        village.villageName = v.villageName
        village.villageNo = v.villageNo
        village.villageUrl = v.villageUrl
        village.villageStartDatetime = v.villageStartDatetime
        village.villageEndDatetime = v.villageEndDatetime
        village.winCampName = v.winCampName
        villageBhv.update(village)
    }

    private fun insertCountryPlayer(countryId: Int, playerId: Int?, userId: String): Int {
        val cp = CountryPlayer()
        cp.countryId = countryId
        cp.playerId = playerId
        cp.userId = userId
        countryPlayerBhv.insert(cp)
        return cp.countryPlayerId
    }

    private fun insertPlayer(): Int {
        val player = Player()
        playerBhv.insert(player)
        return player.playerId
    }

    private fun insertVillaePlayerStats(
        villageId: Int,
        countryPlayerId: Int,
        v: com.ort.wolfportal.logic.stats.VillagePlayerStats
    ) {
        val stats = VillagePlayerStats()
        stats.countryPlayerId = countryPlayerId
        stats.villageId = villageId
        stats.characterName = v.characterName
        stats.skillName = v.skillName
        stats.winloseCodeAsWinLose = v.winlose
        stats.life = v.life
        villagePlayerStatsBhv.insert(stats)
    }

    private fun updateVillagePlayerStats(
        villagePlayerStatsId: Int?,
        v: com.ort.wolfportal.logic.stats.VillagePlayerStats
    ) {
        val stats = VillagePlayerStats()
        stats.villagePlayerStatsId = villagePlayerStatsId
        stats.characterName = v.characterName
        stats.skillName = v.skillName
        stats.winloseCodeAsWinLose = v.winlose
        stats.life = v.life
        villagePlayerStatsBhv.update(stats)
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    private fun selectVillage(countryId: Int, village: VillageStats): OptionalEntity<Village> {
        return villageBhv.selectEntity { cb ->
            cb.query().setVillageNo_Equal(village.villageNo)
            cb.query().setCountryId_Equal(countryId)
        }
    }

    private fun selectCountryPlayer(userId: String): ListResultBean<CountryPlayer> {
        return countryPlayerBhv.selectList { cb ->
            cb.setupSelect_Player()
            cb.query().setUserId_Equal(userId)
            cb.query().addOrderBy_RegisterDatetime_Desc()
        }
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private fun upsertVillage(countryId: Int, villageStats: VillageStats): Int {
        val optVillage = selectVillage(countryId, villageStats)
        if (optVillage.isPresent) {
            val villageId = optVillage.get().villageId
            updateVillage(villageId, villageStats)
            return villageId
        }
        return insertVillage(countryId, villageStats)
    }

    private fun insertCountryPlayerIfNeeded(
        countryId: Int,
        villagePlayer: com.ort.wolfportal.logic.stats.VillagePlayerStats
    ): Int {
        val userId = villagePlayer.userId
        val countryPlayerList = selectCountryPlayer(userId)
        if (countryPlayerList.any { it.countryId == countryId }) {
            // 同じ国にすでに登録済み
            return countryPlayerList.first { it.countryId == countryId }.countryPlayerId
        }
        val playerId = insertPlayerIfNeeded(countryPlayerList)
        return insertCountryPlayer(countryId, playerId, userId)
    }

    private fun insertPlayerIfNeeded(countryPlayerList: ListResultBean<CountryPlayer>): Int? {
        return if (countryPlayerList.isNotEmpty()) countryPlayerList[0].playerId // 別の国に同一ユーザIDがいる
        else insertPlayer() // 新規
    }

    private fun upsertVillagePlayerStats(
        villageId: Int,
        countryPlayerId: Int,
        villagePlayer: com.ort.wolfportal.logic.stats.VillagePlayerStats
    ) {
        val optVillagePlayerStats = villagePlayerStatsBhv.selectEntity { cb ->
            cb.query().setVillageId_Equal(villageId)
            cb.query().setCountryPlayerId_Equal(countryPlayerId)
            cb.fetchFirst(1)
        }
        if (optVillagePlayerStats.isPresent) {
            val villagePlayerStatsId = optVillagePlayerStats.get().villagePlayerStatsId
            updateVillagePlayerStats(villagePlayerStatsId, villagePlayer)
            return
        }
        insertVillaePlayerStats(villageId, countryPlayerId, villagePlayer)
    }
}
