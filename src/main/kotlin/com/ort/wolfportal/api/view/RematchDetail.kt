package com.ort.wolfportal.api.view

data class RematchDetail(
    val countryId: Int,
    val countryName: String,
    val villageId: Int,
    val villageName: String,
    val playerId: Int,
    val countryPlayerId: Int,
    val userId: String,
    val characterName: String,
    val skillName: String
)
