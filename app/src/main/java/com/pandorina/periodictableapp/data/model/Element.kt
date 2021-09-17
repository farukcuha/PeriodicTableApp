package com.pandorina.periodictableapp.data.model


data class Element(
    val index: Int,
    val background: Int,
    val shortening: String,
    val name: String,
    val number: Int
) {
    val image: String
        get() = IMAGE_URL + name.lowercase() + ".jpg"

    companion object{
        const val IMAGE_URL = "https://images-of-elements.com/s/"
    }
}


