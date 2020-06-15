package com.ort.wolfportal.api.form

data class RecruitmentForm(
    val countryId: Int?,
    val store: Boolean?
) {
    constructor() : this(null, null)
}
