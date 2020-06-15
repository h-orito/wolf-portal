package com.ort.wolfportal.logic.stats

import com.ort.dbflute.exbhv.VillageBhv
import com.ort.dbflute.exentity.Village
import com.ort.dbflute.exentity.VillagePlayerStats
import com.ort.wolfportal.api.view.Rematch
import com.ort.wolfportal.api.view.RematchDetail
import org.dbflute.cbean.result.ListResultBean
import org.springframework.stereotype.Component


@Component
class RematchLogic(
    val villageBhv: VillageBhv
) {

    fun selectRematchList(village: Village): List<Rematch> {
        // 今回の村
        val villageId = village.villageId
        // 今回の村に参加したプレイヤー
        val playerIdList = village.villagePlayerStatsList
            .filter { vps -> vps.countryPlayer.get().userId != "master" }
            .map { vps -> vps.countryPlayer.get().playerId }
        if (playerIdList.isEmpty()) return listOf()

        // 今回の村に参加したプレイヤーが参加したことのある村
        val playerWholeStatsList = selectPlayerStatsList(villageId, playerIdList)
        // 再戦の村
        val rematchVillageList = extractRematchVillage(playerWholeStatsList)
        // 表示用に変換
        return mappingToRematchList(village, rematchVillageList)
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    private fun selectPlayerStatsList(villageId: Int, playerIdList: List<Int>): ListResultBean<Village> {
        val villageList = villageBhv.selectList { cb ->
            cb.setupSelect_Country()
            cb.query().setVillageId_NotEqual(villageId)
            cb.query().existsVillagePlayerStats { vpsCB -> vpsCB.query().queryCountryPlayer().setPlayerId_InScope(playerIdList) }
            cb.query().addOrderBy_VillageNo_Asc()
        }
        villageBhv.loadVillagePlayerStats(villageList) { vpsCB ->
            vpsCB.setupSelect_CountryPlayer()
            vpsCB.query().queryCountryPlayer().setPlayerId_InScope(playerIdList)
        }
        return villageList
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private fun extractRematchVillage(villageList: ListResultBean<Village>): List<Village> {
        // 2名以上いれば再戦のある村
        return villageList.filter { v -> v.villagePlayerStatsList.size > 1 }
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private fun mappingToRematchList(village: Village, rematchVillageList: List<Village>): List<Rematch> {
        return village.villagePlayerStatsList
            .filter { vps -> vps.countryPlayer.get().userId != "master" }
            .map { vps ->
                Rematch(
                    countryId = village.countryId,
                    countryPlayerId = vps.countryPlayerId,
                    userId = vps.countryPlayer.get().userId,
                    rematchDetailList = extractPlayerRematchVillage(rematchVillageList, vps.countryPlayer.get().playerId)
                )
            }
    }

    private fun extractPlayerRematchVillage(
        rematchVillageList: List<Village>,
        playerId: Int
    ): List<RematchDetail> {
        return rematchVillageList.filter {
            it.villagePlayerStatsList.any { vps -> vps.countryPlayer.get().playerId == playerId }
        }.flatMap { v ->
            val countryId = v.countryId
            val countryName = v.country.get().countryName
            val villageName = v.villageName
            v.villagePlayerStatsList.filter { vps ->
                vps.countryPlayer.get().playerId != playerId
            }.map { vps ->
                mappingToRematchDetail(countryId, countryName, villageName, vps)
            }
        }
    }

    private fun mappingToRematchDetail(
        countryId: Int,
        countryName: String,
        villageName: String,
        vps: VillagePlayerStats
    ): RematchDetail {
        return RematchDetail(
            characterName = vps.characterName,
            countryId = countryId,
            countryName = countryName,
            countryPlayerId = vps.countryPlayerId,
            playerId = vps.countryPlayer.get().playerId,
            skillName = vps.skillName,
            userId = vps.countryPlayer.get().userId,
            villageId = vps.villageId,
            villageName = villageName
        )
    }
}
