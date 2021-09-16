package com.pandorina.periodictableapp.util

import android.graphics.Color
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.pandorina.periodictableapp.R

@BindingAdapter("app:setBackground")
fun setBackground(viewGroup: ViewGroup, @DrawableRes background: Int) {
    viewGroup.setBackgroundResource(background)
}

@BindingAdapter("app:loadImage")
fun loadImage(imageView: ImageView, url: String) {
    Glide.with(imageView)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .thumbnail(0.1f)
        .error(R.drawable.img_error)
        .into(imageView)
}

@BindingAdapter("app:setTextColor")
fun setTextColor(textView: TextView, background: Int) {
    when (background) {
        R.drawable.shape_1 -> textView.setTextColor(Color.parseColor(Constant.COLOR_1))
        R.drawable.shape_2 -> textView.setTextColor(Color.parseColor(Constant.COLOR_2))
        R.drawable.shape_3 -> textView.setTextColor(Color.parseColor(Constant.COLOR_3))
        R.drawable.shape_4 -> textView.setTextColor(Color.parseColor(Constant.COLOR_4))
        R.drawable.shape_5 -> textView.setTextColor(Color.parseColor(Constant.COLOR_5))
        R.drawable.shape_6 -> textView.setTextColor(Color.parseColor(Constant.COLOR_6))
        R.drawable.shape_7 -> textView.setTextColor(Color.parseColor(Constant.COLOR_7))
        R.drawable.shape_8 -> textView.setTextColor(Color.parseColor(Constant.COLOR_8))
    }
}