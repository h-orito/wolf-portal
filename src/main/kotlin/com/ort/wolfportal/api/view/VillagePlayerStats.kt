package com.ort.wolfportal.api.view

data class VillagePlayerStats(
    var countryPlayerId: Int?,
    var countryPlayer: CountryPlayer,
    val characterName: String,
    val skillName: String,
    val life: String?,
    val winlose: String,
    var village: Village?
)