package com.ort.wolfportal.logic.recruitment.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class AkazukinVillageDetail(
    /** 村ID */
    val id: Int,

    /** 村名 */
    val name: String,

    /** 村URL */
    val url: String,

    /** 状態 (prologue / progress / epilogue) */
    val status: String,

    /** 1日の長さ (例: 10分) */
    @JsonProperty("day_length_label")
    val dayLengthLabel: String?,

    /** 現在日 */
    @JsonProperty("current_day")
    val currentDay: Int?,

    /** 参加人数 */
    val players: Int,

    /** 定員 */
    val capacity: Int,

    /** 見学人数 */
    val spectators: Int?,

    /** 編成プリセット名 (例: 人狼BBS F国) */
    @JsonProperty("role_preset_label")
    val rolePresetLabel: String?,

    /** 予定編成 (役職キー -> 人数) */
    @JsonProperty("composition_planned")
    val compositionPlanned: Map<String, Int>?,

    /** 発言制限 */
    val speech: AkazukinSpeech?,

    /** 鍵付きか */
    @JsonProperty("has_password")
    val hasPassword: Boolean?,

    /** 募集締切 */
    @JsonProperty("recruit_deadline")
    val recruitDeadline: String?
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class AkazukinSpeech(
    val mode: String?,
    val preset: String?
)
