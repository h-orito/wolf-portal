package com.ort.wolfportal.logic.recruitment.response

data class WolfMansionResponseDetail(

    /** 村ID */
    val villageId: Int,

    /** 村表示用番号 */
    val villageNumber: String,

    /** 村名 */
    val villageName: String,

    /** 人数 */
    val participateNum: String,

    /** 見学人数 */
    val spectateNum: String,

    /** 更新時間 */
    val daychangeDatetime: String,

    /** 更新間隔 */
    val daychangeInterval: String,

    /** キャラチップ */
    val charaset: String,

    /** 発言制限 */
    val restrict: String,

    /** 状態 */
    val status: String,

    /** URL */
    val url: String
)
