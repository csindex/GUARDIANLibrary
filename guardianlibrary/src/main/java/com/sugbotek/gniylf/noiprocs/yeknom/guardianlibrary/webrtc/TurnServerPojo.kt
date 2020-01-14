package com.sugbotek.gniylf.noiprocs.yeknom.guardianlibrary.webrtc

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class TurnServerPojo : Serializable {

    @SerializedName("s")
    @Expose
    var s: String? = null
//    @SerializedName("p")
//    @Expose
//    var p: String? = null
//    @SerializedName("e")
//    @Expose
//    var e: Any? = null
    @SerializedName("v")
    @Expose
    var iceServerList: IceServerList? = null

    class IceServerList : Serializable {

        @SerializedName("iceServers")
        @Expose
        var iceServers: List<IceServer>? = null

    }

}