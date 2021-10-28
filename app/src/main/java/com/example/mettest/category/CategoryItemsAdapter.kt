package com.example.mettest.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mettest.R
import com.example.mettest.databinding.LayoutPinkItemBinding
import com.example.mettest.models.Item

class CategoryItemsAdapter:
    ListAdapter<Item, CategoryItemsAdapter.ViewHolder>(DiffCallback){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutPinkItemBinding.inflate(LayoutInflater.from(parent.context)))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }
    class ViewHolder(private val binding: LayoutPinkItemBinding):
        RecyclerView.ViewHolder(binding.root){
        private var itemCount = 0
        private var bookmark = false
        fun bind(item: Item){
            binding.model = item
            binding.itemAdd.setOnClickListener {
                itemCount += 1
                binding.itemCount.text = itemCount.toString()
            }
            binding.itemSub.setOnClickListener {
                if (itemCount>0){
                    itemCount -= 1
                    binding.itemCount.text = itemCount.toString()
                }
            }
            binding.itemBookmark.setOnClickListener {
                bookmark = if(!bookmark) {
                    binding.itemBookmark.setImageResource(R.drawable.ic_baseline_favorite_24)
                    true
                } else {
                    binding.itemBookmark.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                    false
                }
            }

            binding.executePendingBindings()
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Item>() {
        override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem.categoryId == newItem.categoryId
        }
    }

}