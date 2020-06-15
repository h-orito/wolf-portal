package com.ort.wolfportal.api.view

data class Country(
    val countryId: Int,
    val countryName: String,
    var villageList: List<Village>
)