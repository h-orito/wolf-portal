package com.ort.wolfportal.logic.recruitment.response

import com.fasterxml.jackson.annotation.JsonProperty

data class LastWolfVillageDetail(
    /** 村ID */
    val id: Int,

    /** 村名 */
    val name: String,

    /** 状態 */
    val status: String,

    /** 人数 */
    @JsonProperty("participant_count")
    val participantCount: Int,

    /** 上限人数 */
    @JsonProperty("participant_capacity")
    val participantCapacity: Int,

    /** 昼時間 */
    @JsonProperty("noon_seconds")
    val noonSeconds: Int,

    /** 投票時間 */
    @JsonProperty("vote_seconds")
    val voteSeconds: Int,

    /** 夜時間 */
    @JsonProperty("night_seconds")
    val nightSeconds: Int,

    /** 開始日時 */
    @JsonProperty("start_datetime")
    val startDatetime: String,

    /** キャラチップ */
    @JsonProperty("charachip_name")
    val charachipName: String,

    /** URL */
    val url: String,

    /** 編成 */
    val organization: String
)
