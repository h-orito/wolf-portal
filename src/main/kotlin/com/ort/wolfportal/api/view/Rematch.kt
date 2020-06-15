package com.ort.wolfportal.api.view

data class Rematch(
    val userId: String,
    val countryId: Int,
    val countryPlayerId: Int,
    val rematchDetailList: List<RematchDetail>
)