package com.ort.wolfportal.logic.recruitment.response

import com.fasterxml.jackson.annotation.JsonProperty

data class HowlingWolfResponse(
    /** 村リスト */
    @JsonProperty("village_list")
    val villageList: List<HowlingWolfVillageDetail>,

    /** 予約村リスト */
    @JsonProperty("reserved_village_list")
    val reservedVillageList: List<HowlingWolfReservedVillageDetail>
)