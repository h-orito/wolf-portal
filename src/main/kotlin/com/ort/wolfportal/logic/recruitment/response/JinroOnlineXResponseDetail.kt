package com.ort.wolfportal.logic.recruitment.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class JinroOnlineXResponseDetail(
    val id: String?,
    val accessOnlyPlayer: String?,
    val backlog: String?,
    val battle_mode: String?,
    val beginner: String?,
    val charavote: String?,
    val comment: String?,
    val create_date: String?,
    val game_interval: String?,
    val max_player: String?,
    val min_valuation: String?,
    val need_accesscode: String?,
    val need_minvaluation: String?,
    val owner_userid: String?,
    val player_count: String?,
    val start_schedule: String?,
    val status: String?,
    val title: String?,
    val updateSchedule1: String?,
    val updateSchedule2: String?,
    val updateSchedule3: String?,
    val village_name: String?
) {
    constructor() : this(
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null
    )
}
