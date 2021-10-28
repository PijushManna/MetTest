package com.example.mettest.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PinkItems {
    @SerializedName("status")
    @Expose
    var status: Status? = null

    @SerializedName("result")
    @Expose
    var result: Result? = null
}