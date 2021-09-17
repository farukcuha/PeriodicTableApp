package com.pandorina.periodictableapp.util

import android.graphics.Color
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.pandorina.periodictableapp.R

const val COLOR_1 = "#347fd8"
const val COLOR_2 = "#b245da"
const val COLOR_3 = "#ef4a66"
const val COLOR_4 = "#ff931c"
const val COLOR_5 = "#bb6bad"
const val COLOR_6 = "#ffca04"
const val COLOR_7 = "#59d2d8"
const val COLOR_8 = "#accb39"

@BindingAdapter("app:setBackground")
fun ViewGroup.setBackground(background: Int) {
    setBackgroundResource(background)
}

@BindingAdapter("app:loadImage")
fun ImageView.loadImage(url: String) {
    Glide.with(this)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .error(R.drawable.img_error)
        .into(this)
}

@BindingAdapter("app:setTextColor")
fun TextView.setTextColor(background: Int) {
    when (background) {
        R.drawable.shape_1 -> setTextColor(Color.parseColor(COLOR_1))
        R.drawable.shape_2 -> setTextColor(Color.parseColor(COLOR_2))
        R.drawable.shape_3 -> setTextColor(Color.parseColor(COLOR_3))
        R.drawable.shape_4 -> setTextColor(Color.parseColor(COLOR_4))
        R.drawable.shape_5 -> setTextColor(Color.parseColor(COLOR_5))
        R.drawable.shape_6 -> setTextColor(Color.parseColor(COLOR_6))
        R.drawable.shape_7 -> setTextColor(Color.parseColor(COLOR_7))
        R.drawable.shape_8 -> setTextColor(Color.parseColor(COLOR_8))
    }
}

