package com.ort.wolfportal.logic.recruitment.response

data class RuruServerResponse(

    /** 村番号 */
    val no: Int,

    /** 村の名前 */
    val name: String,

    /** PR文章 */
    val pr: String,

    /** 日付 */
    val day: Int,

    /** 現在の場面 0: 事件前日, 1: 夜, 2: 夜明け, 3: 昼, 4: 投票中, 5: 終了後トーク */
    val scene: Int,

    /** 定員人数 */
    val capacity: Int,

    /** 参加人数 */
    val players: Int,

    /** 構成 */
    val cast: String,

    /** 昼時間 */
    val time_day: Int,

    /** 夜時間 */
    val time_down: Int,

    /** 入村条件(トリップ) */
    val trip: Boolean,

    /** 入村条件(最低試合数) */
    val exp: Int?,

    /** GM有無 */
    val rule_gm: Boolean,

    /** 希望役職 */
    val rule_hope: Boolean,

    /** 身内 */
    val rule_family: Boolean
)
