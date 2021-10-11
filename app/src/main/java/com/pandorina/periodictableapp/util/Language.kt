package com.pandorina.periodictableapp.util

import android.content.Context
import android.content.SharedPreferences
import java.util.*

class Language(val context: Context) {
    private val preferences: SharedPreferences =
        context.getSharedPreferences(Constant.DEFAULT_PREFERENCE_KEY, Context.MODE_PRIVATE)

    fun set(countryTag: String){
        val locale = Locale(countryTag)
        val resources = context.resources
        val config = resources.configuration
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)
    }

    fun get() = preferences.getString(Constant.LANGUAGE, Constant.LANG_EN)
}