package com.pandorina.periodictableapp.util

import androidx.appcompat.widget.SearchView

abstract class ElementSearchListener : SearchView.OnQueryTextListener {
    override fun onQueryTextSubmit(query: String?): Boolean {
        return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        return true
    }
}