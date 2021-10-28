
package com.example.mettest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("cat_id")
    @Expose
    public String catId;
    @SerializedName("cat_name")
    @Expose
    public String catName;
    @SerializedName("items")
    @Expose
    public List<Item> items = null;

}
