package com.ort.wolfportal.api.controller

import com.ort.wolfportal.api.view.PingResponse
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class IndexController {

    @GetMapping("/ping")
    @ResponseBody
    fun ping(): PingResponse {
        return PingResponse("pong")
    }

    @GetMapping("/")
    fun index(): String {
        return "index"
    }
}