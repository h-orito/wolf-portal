package com.ort.wolfportal

import com.ort.dbflute.allcommon.DBFluteBeansJavaConfig
import com.ort.wolfportal.fw.WolfPortalWebMvcConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(
    DBFluteBeansJavaConfig::class,
    WolfPortalWebMvcConfig::class
)
class WolfPortalApplication

fun main(args: Array<String>) {
    runApplication<WolfPortalApplication>(*args)
}
