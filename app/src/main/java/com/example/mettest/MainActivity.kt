package com.example.mettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.mettest.databinding.ActivityMainBinding
import com.example.mettest.models.PinkItems
import com.google.gson.GsonBuilder
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private val viewModel:MainViewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }
    private val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.tabItems.setupWithViewPager(binding.pgrItems)
        viewModel.volleyPost(context = applicationContext)


        viewModel.data.observe(this,{
            binding.pgrItems.adapter = CategoryAdapter(supportFragmentManager,
                it
            )
        })
    }
}