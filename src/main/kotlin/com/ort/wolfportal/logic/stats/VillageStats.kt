package com.ort.wolfportal.logic.stats

import java.time.LocalDateTime

data class VillageStats(
    val villageName: String,

    val villageNo: Int?,

    val villageUrl: String,

    val villageStartDatetime: LocalDateTime?,

    val villageEndDatetime: LocalDateTime?,

    val winCampName: String,

    val playerStatsList: List<VillagePlayerStats>
)
