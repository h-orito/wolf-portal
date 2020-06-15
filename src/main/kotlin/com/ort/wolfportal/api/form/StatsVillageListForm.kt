package com.ort.wolfportal.api.form

data class StatsVillageListForm(
    val villageName: String?,
    val skillName: String?
) {
    constructor() : this(null, null)
}