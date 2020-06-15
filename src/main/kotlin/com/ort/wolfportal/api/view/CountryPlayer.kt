package com.ort.wolfportal.api.view

data class CountryPlayer(
    val countryPlayerId: Int,
    val playerId: Int,
    val userId: String,
    val countryId: Int,
    val countryName: String?,
    var participateNum: Int?
)