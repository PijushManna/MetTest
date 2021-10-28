package com.example.mettest

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.mettest.models.Datum
import com.example.mettest.models.PinkItems
import com.google.gson.GsonBuilder
import org.json.JSONException
import org.json.JSONObject

class MainViewModel : ViewModel() {
    private val gson = GsonBuilder().create()
    val data = MutableLiveData<List<Datum>>()

    fun volleyPost(context:Context) {
        val postUrl = "https://devfitser.com/PinkDelivery/dev/api/product/get"
        val requestQueue = Volley.newRequestQueue(context)
        val postData = JSONObject()
        try {
            postData.put("store_id", "3")
            postData.put("u_id", "")
            postData.put("access_type", "1")
            postData.put("source", "mob")
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.POST, postUrl, postData,
            { response ->
                Log.i("Response",response.toString())
                val res = gson.fromJson(response.toString(), PinkItems::class.java)
                data.value = res.result.data
            }
        ) { error ->
            error.printStackTrace()
        }
        requestQueue.add(jsonObjectRequest)
    }
}