package com.ort.wolfportal.util

import org.jsoup.Connection
import org.jsoup.Jsoup


object BrowserUtil {

    /**
     * 指定URLのConnection作成、接続
     *
     * @param url url
     * @return response
     */
    fun createConnectionAndConnect(url: String): Connection.Response {
        return Jsoup.connect(url).userAgent("Mozilla").method(Connection.Method.GET).execute()
    }

    /**
     * 指定URLのConnection作成、接続
     *
     * @param url url
     * @return resposne
     */
    fun createConnectionAndConnectWithSleep(url: String): Connection.Response {
        sleep(1000)
        return this.createConnectionAndConnect(url)
    }

    private fun sleep(milliSec: Int) {
        Thread.sleep(milliSec.toLong())
    }
}
