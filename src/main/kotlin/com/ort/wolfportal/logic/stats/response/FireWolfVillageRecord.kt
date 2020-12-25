package com.ort.wolfportal.logic.stats.response

import com.fasterxml.jackson.annotation.JsonProperty

data class FireWolfVillageRecord(
    val id: Int,
    val name: String,
    val status: String,
    @JsonProperty("start_datetime")
    val startDatetime: String?,
    @JsonProperty("epilogue_datetime")
    val epilogueDatetime: String?,
    val organization: String,
    val url: String,
    @JsonProperty("win_camp_name")
    val winCampName: String?,
    @JsonProperty("participant_list")
    val participantList: List<FireWolfVillageParticipantRecord>
)
