package com.ort.wolfportal.api.form

data class StatsCountryPlayerListForm(
    val userId: String?
) {
    constructor() : this(null)
}
