
package com.example.mettest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("error_code")
    @Expose
    public Integer errorCode;
    @SerializedName("message")
    @Expose
    public String message;

}
