package com.ort.wolfportal.api.view

import java.time.LocalDateTime

data class Village(
    val countryId: Int,
    var countryName: String?,
    val villageId: Int,
    val villageNo: Int,
    val villageName: String,
    val villageUrl: String,
    val villageStartDatetime: LocalDateTime?,
    val villageEndDatetime: LocalDateTime?,
    val winCampName: String,
    val villagePlayerStatsList: List<VillagePlayerStats>
)