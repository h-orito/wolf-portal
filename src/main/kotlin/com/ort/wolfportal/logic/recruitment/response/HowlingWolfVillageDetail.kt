package com.ort.wolfportal.logic.recruitment.response

import com.fasterxml.jackson.annotation.JsonProperty

data class HowlingWolfVillageDetail(
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

    /** 更新時間 */
    @JsonProperty("day_change_time")
    val dayChangeTime: String,

    /** 開始日時 */
    @JsonProperty("start_datetime")
    val startDatetime: String,

    /** キャラチップ */
    @JsonProperty("charachip_name")
    val charachipName: String,

    /** 発言可能時間 */
    @JsonProperty("sayable_time")
    val sayableTime: String,

    /** URL */
    val url: String,

    /** 編成 */
    val organization: String
)
