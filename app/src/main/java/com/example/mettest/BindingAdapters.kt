package com.example.mettest

import android.annotation.SuppressLint
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@SuppressLint("SetTextI18n")
@BindingAdapter("price")
fun bindPrice(v: TextView, data: String?){
    data.let {
        v.text = "$$data"
    }
}

@BindingAdapter("imgURL")
fun bindImage(v: ImageView, imgUrl: String?){
    imgUrl?.let {
        val imgURI = it.toUri().buildUpon().scheme("https").build()
        Glide.with(v.context)
            .load(imgURI)
            .apply(
                RequestOptions()
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_broken_image))
            .into(v)
    }
}