package com.pandorina.periodictableapp.data.model

import androidx.annotation.DrawableRes
import com.pandorina.periodictableapp.util.Constant

data class Element(
    val index: Int,
    @DrawableRes val background: Int,
    val shortening: String,
    val name: String,
    val number: Int
) {
    val image: String
        get() = Constant.IMAGE_URL + name.lowercase() + ".jpg"
}


