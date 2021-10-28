
package com.example.mettest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PinkItems {

    @SerializedName("status")
    @Expose
    public Status status;
    @SerializedName("result")
    @Expose
    public Result result;

}
