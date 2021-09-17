package com.pandorina.periodictableapp.ui.holder

import androidx.recyclerview.widget.RecyclerView
import com.pandorina.periodictableapp.data.model.Element
import com.pandorina.periodictableapp.databinding.ItemElementBinding

class ElementHolder(private val binding: ItemElementBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Element) {
        binding.element = item
    }
}