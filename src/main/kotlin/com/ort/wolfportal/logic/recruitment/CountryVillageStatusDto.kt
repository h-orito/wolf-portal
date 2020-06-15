package com.ort.wolfportal.logic.recruitment

data class CountryVillageStatusDto(
    val isSuccess: Boolean = false,
    val recruitVillageList: List<CountryVillageDto> = listOf(),
    val progressVillageList: List<CountryVillageDto> = listOf()
)
