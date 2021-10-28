package com.example.mettest.models

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.example.mettest.models.Datum

class Status {
    @SerializedName("error_code")
    @Expose
    var errorCode: Int? = null

    @SerializedName("message")
    @Expose
    var message: String? = null
}