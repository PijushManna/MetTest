package com.example.mettest.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Result {
    @SerializedName("data")
    @Expose
    var data: List<Datum>? = null
}