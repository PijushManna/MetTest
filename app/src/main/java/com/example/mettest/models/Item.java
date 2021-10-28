
package com.example.mettest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("product_id")
    @Expose
    public String productId;
    @SerializedName("product_suk_id")
    @Expose
    public String productSukId;
    @SerializedName("product_name")
    @Expose
    public String productName;
    @SerializedName("category_id")
    @Expose
    public String categoryId;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("product_image")
    @Expose
    public String productImage;
    @SerializedName("price")
    @Expose
    public String price;
    @SerializedName("vendor_id")
    @Expose
    public String vendorId;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("updated_at")
    @Expose
    public String updatedAt;
    @SerializedName("category_name")
    @Expose
    public String categoryName;
    @SerializedName("vendor_name")
    @Expose
    public String vendorName;

}
