package com.sugbotek.gniylf.noiprocs.yeknom.guardianlibrary.webrtc

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class IceServer : Serializable {

    @SerializedName("url")
    @Expose
    var url: String? = null
    @SerializedName("username")
    @Expose
    var username: String? = null
    @SerializedName("credential")
    @Expose
    var credential: String? = null

    override fun toString(): String {
        return "IceServer{" +
                "url='" + url + '\''.toString() +
                ", username='" + username + '\''.toString() +
                ", credential='" + credential + '\''.toString() +
                '}'.toString()
    }

}