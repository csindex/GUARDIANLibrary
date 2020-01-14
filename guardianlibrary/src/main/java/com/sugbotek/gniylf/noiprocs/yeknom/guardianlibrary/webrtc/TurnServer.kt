package com.sugbotek.gniylf.noiprocs.yeknom.guardianlibrary.webrtc

import retrofit2.Call
import retrofit2.http.Header
import retrofit2.http.PUT

/**
 * Webrtc_Step3
 * Created by vivek-3102 on 11/03/17.
 */


interface TurnServer {

    @PUT("/_turn/GUARDIAN")
    fun getIceCandidates(@Header("Authorization") authkey: String): Call<TurnServerPojo>

}