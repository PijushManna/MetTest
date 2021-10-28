package com.example.mettest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mettest.databinding.FragmentCategoryBinding


class CategoryFragment : Fragment() {

    private lateinit var binding: FragmentCategoryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCategoryBinding.inflate(inflater,container,false)
        binding.textView2.text = arguments?.getString("ID") ?: "Not Found"
        return binding.root
    }
}