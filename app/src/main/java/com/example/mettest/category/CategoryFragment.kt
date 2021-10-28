package com.example.mettest.category

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.mettest.MainViewModel
import com.example.mettest.databinding.FragmentCategoryBinding


class CategoryFragment : Fragment() {
    private lateinit var binding: FragmentCategoryBinding
    private val viewModel: MainViewModel by activityViewModels()
    private val adapter = CategoryItemsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCategoryBinding.inflate(inflater, container, false)
        binding.rcrItems.adapter = adapter

        arguments?.getString("ID")?.also { arg ->
            viewModel.data.observe(viewLifecycleOwner, { it1 ->
                val formattedList = it1.filter {
                    it.catId == arg
                }
                adapter.submitList(formattedList[0].items)
            })
        }

        return binding.root
    }
}