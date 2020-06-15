package com.ort.wolfportal.api.view

import org.dbflute.cbean.result.PagingResultBean

data class PagingModel<T>(
    val allPageCount: Int,
    val existPrePage: Boolean,
    val existNextPage: Boolean,
    val currentPageNum: Int,
    var pageNumList: List<Int>
) {
    constructor(
        pageResult: PagingResultBean<T>
    ) : this(
        allPageCount = pageResult.allPageCount,
        existPrePage = pageResult.existsPreviousPage(),
        existNextPage = pageResult.existsNextPage(),
        currentPageNum = pageResult.currentPageNumber,
        pageNumList = listOf()
    ) {
        var startPage = this.currentPageNum - 2
        var endPage = this.currentPageNum + 2
        if (startPage < 1) {
            startPage = 1
            endPage = 5
        }
        if (endPage > allPageCount) {
            endPage = allPageCount
            startPage = allPageCount - 4
            if (startPage < 1) {
                startPage = 1
            }
        }
        this.pageNumList = (startPage..endPage).toList()
    }
}