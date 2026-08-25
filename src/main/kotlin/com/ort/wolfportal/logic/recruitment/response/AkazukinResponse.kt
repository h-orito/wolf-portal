package com.ort.wolfportal.logic.recruitment.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class AkazukinResponse(
    /** 村リスト */
    val villages: List<AkazukinVillageDetail>
)
