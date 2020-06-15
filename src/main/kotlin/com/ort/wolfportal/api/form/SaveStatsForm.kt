package com.ort.wolfportal.api.form

data class SaveStatsForm(
    val villageNo: Int?,
    val villageId: Int?,
    val ignoreExistsVillage: Boolean?
) {
    constructor() : this(null, null, null)
}
