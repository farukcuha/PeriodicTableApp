package com.pandorina.periodictableapp.data.model


data class Element(
    val index: Int,
    val background: Int,
    val shortening: String,
    val originalName: String,
    val name: String,
    val number: Int,
    val weight: String,
    val energyLevels: String,
    val electronegativity: String?,
    val meltingPoint: String?,
    val boilingPoint: String?,
    val description: String
) {
    val image: String
        get() = "https://images-of-elements.com/s/" + originalName.lowercase() + ".jpg"
}


