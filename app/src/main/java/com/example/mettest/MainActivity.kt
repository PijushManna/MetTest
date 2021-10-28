package com.example.mettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.mettest.category.CategoryAdapter
import com.example.mettest.databinding.ActivityMainBinding

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