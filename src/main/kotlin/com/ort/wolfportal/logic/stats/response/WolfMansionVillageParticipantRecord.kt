package com.ort.wolfportal.logic.stats.response

import com.fasterxml.jackson.annotation.JsonProperty

data class WolfMansionVillageParticipantRecord(
    @JsonProperty("character_name")
    val characterName: String,
    @JsonProperty("user_id")
    val userId: String,
    @JsonProperty("skill_name")
    val skillName: String?,
    val spectator: Boolean,
    val dead: Boolean,
    @JsonProperty("dead_day")
    val deadDay: Int?,
    @JsonProperty("dead_reason")
    val deadReason: String?,
    val win: Boolean?
)
