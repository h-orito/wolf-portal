package com.ort.wolfportal.logic.recruitment.response

import com.fasterxml.jackson.annotation.JsonProperty

data class LastWolfResponse(
    /** 村リスト */
    @JsonProperty("village_list")
    val villageList: List<LastWolfVillageDetail>
)