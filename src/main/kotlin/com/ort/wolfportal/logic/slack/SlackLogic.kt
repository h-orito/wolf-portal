package com.ort.wolfportal.logic.slack

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import java.io.PrintWriter
import java.io.StringWriter

@Component
class SlackLogic {

    @Value("\${slack.url: null}")
    private var url: String? = null

    fun postToSlackIfNeeded(className: String, e: Exception) {
        url ?: return
        try {
            val restTemplate = RestTemplate()
            val stacktrace = makeStacktraceString(e)
            // json変換するまでもないのでそのまま記述
            val request = "{\"text\": \"class: ${className}, trace: \n${stacktrace}\"}"
            val formHeaders = HttpHeaders()
            formHeaders.contentType = MediaType.APPLICATION_JSON
            val formEntity = HttpEntity(request, formHeaders)
            restTemplate.exchange(url!!, HttpMethod.POST, formEntity, String::class.java)
        } catch (ex: Exception) {
        }

    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private fun makeStacktraceString(e: Exception): String {
        val sw = StringWriter()
        val pw = PrintWriter(sw)
        e.printStackTrace(pw)
        pw.flush()
        var stacktrace = sw.toString()
        if (stacktrace.length > 500) stacktrace = stacktrace.substring(0, 500)
        return stacktrace
    }

}