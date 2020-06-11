package com.ort.wolfportal.fw

import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

class WolfPortalWebMvcConfig : WebMvcConfigurer {

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(WolfPortalAccessContextInterceptor()).addPathPatterns("/**").excludePathPatterns("/static/**")
    }
}
