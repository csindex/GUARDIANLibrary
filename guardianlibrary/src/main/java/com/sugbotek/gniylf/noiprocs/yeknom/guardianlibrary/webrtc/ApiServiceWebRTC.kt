package com.sugbotek.gniylf.noiprocs.yeknom.guardianlibrary.webrtc

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Webrtc_Step3
 * Created by vivek-3102 on 11/03/17.
 */

class ApiServiceWebRTC {

    private var retrofitInstance: Retrofit? = null

    fun getRetrofitInstance(): TurnServer {
        if (retrofitInstance == null) {
            retrofitInstance = Retrofit.Builder()
                .baseUrl(API_ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofitInstance!!.create(TurnServer::class.java)
    }

    companion object {
        private var instance: ApiServiceWebRTC? = null
        const val API_ENDPOINT = "https://global.xirsys.net"

        fun getInstance(): ApiServiceWebRTC? {
            if (instance == null) {
                instance = ApiServiceWebRTC()
            }
            return instance
        }
    }

}