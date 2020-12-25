package com.ort.wolfportal.logic.recruitment.response

import com.fasterxml.jackson.annotation.JsonProperty

data class FireWolfResponse(
    /** 村リスト 中身はHOWLINGと同じ */
    @JsonProperty("village_list")
    val villageList: List<HowlingWolfVillageDetail>
)