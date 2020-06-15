package com.ort.wolfportal.logic.stats

import com.ort.dbflute.allcommon.CDef

data class VillagePlayerStats(
    val userId: String,

    val characterName: String,

    val skillName: String,

    val winlose: CDef.WinLose?,

    val life: String?
)