package com.pandorina.periodictableapp.data.model


data class Element(
    val index: Int,
    val background: Int,
    val shortening: String,
    val name: String,
    val number: Int
) {
    val image: String
        get() = "https://images-of-elements.com/s/" + name.lowercase() + ".jpg"
}


