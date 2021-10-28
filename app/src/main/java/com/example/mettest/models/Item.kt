package com.example.mettest.models

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.example.mettest.models.Datum

class Item {
    @SerializedName("product_id")
    @Expose
    var productId: String? = null

    @SerializedName("product_suk_id")
    @Expose
    var productSukId: String? = null

    @JvmField
    @SerializedName("product_name")
    @Expose
    var productName: String? = null

    @SerializedName("category_id")
    @Expose
    var categoryId: String? = null

    @SerializedName("description")
    @Expose
    var description: String? = null

    @JvmField
    @SerializedName("product_image")
    @Expose
    var productImage: String? = null

    @JvmField
    @SerializedName("price")
    @Expose
    var price: String? = null

    @SerializedName("vendor_id")
    @Expose
    var vendorId: String? = null

    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

    @JvmField
    @SerializedName("category_name")
    @Expose
    var categoryName: String? = null

    @SerializedName("vendor_name")
    @Expose
    var vendorName: String? = null
}