package com.example.mettest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.mettest.databinding.FragmentCategoryBinding


class CategoryFragment : Fragment() {
    private lateinit var binding: FragmentCategoryBinding
    private val viewModel:MainViewModel by activityViewModels()
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCategoryBinding.inflate(inflater,container,false)
       
        arguments?.getString("ID")?.also { arg ->
            viewModel.data.observe(viewLifecycleOwner,{ it1 ->
                val formattedList = it1.filter {
                    it.catId == arg
                }
                binding.textView2.text = formattedList[0].catName
            }) 
        }
        
        return binding.root
    }
}