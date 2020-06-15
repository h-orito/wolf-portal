package com.ort.wolfportal.logic.recruitment.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class JinroOnlineXResponse(
    /** 村リスト */
    val villages: List<JinroOnlineXResponseDetail>?
) {
    constructor() : this(null)
}
