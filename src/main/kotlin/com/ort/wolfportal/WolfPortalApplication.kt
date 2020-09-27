package com.ort.wolfportal

import com.ort.dbflute.allcommon.DBFluteBeansJavaConfig
import com.ort.wolfportal.fw.WolfPortalWebMvcConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Import
import org.springframework.web.client.RestTemplate


@SpringBootApplication
@EnableCaching
@Import(
    DBFluteBeansJavaConfig::class,
    WolfPortalWebMvcConfig::class
)
class WolfPortalApplication {
    @Bean
    fun restTemplate(builder: RestTemplateBuilder): RestTemplate {
        return builder.build()
    }
}

fun main(args: Array<String>) {
    runApplication<WolfPortalApplication>(*args)
}

