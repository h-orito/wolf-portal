package com.ort.wolfportal.api.form

data class StatsPlayerForm(
    val villageName: String?
) {
    constructor() : this(null)
}