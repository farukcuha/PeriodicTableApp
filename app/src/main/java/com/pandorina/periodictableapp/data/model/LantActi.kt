package com.pandorina.periodictableapp.data.model

import androidx.annotation.DrawableRes

data class LantActi(
    val index: Int,
    @DrawableRes val background: Int,
    val range: String,
    val title: String
)
