package com.example.mettest.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Datum {
    @SerializedName("cat_id")
    @Expose
    var catId: String? = null

    @SerializedName("cat_name")
    @Expose
    var catName: String? = null

    @SerializedName("items")
    @Expose
    var items: List<Item>? = null
}