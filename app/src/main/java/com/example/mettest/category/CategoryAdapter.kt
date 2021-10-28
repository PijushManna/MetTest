package com.example.mettest.category

import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.mettest.models.Datum

class CategoryAdapter(fm:FragmentManager,private val items:List<Datum>) : FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Fragment {
        val fragment = CategoryFragment()
        val bundle = Bundle()
        bundle.putString("ID",items[position].catId)
        fragment.arguments = bundle
        return fragment
    }

    override fun getPageTitle(position: Int): CharSequence {
        return items[position].catName
    }

    override fun saveState(): Parcelable? {
        return null
    }
}