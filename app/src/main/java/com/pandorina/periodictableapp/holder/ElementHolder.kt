package com.pandorina.periodictableapp.holder

import androidx.recyclerview.widget.RecyclerView
import com.pandorina.periodictableapp.databinding.ItemElementBinding
import com.pandorina.periodictableapp.model.Element

class ElementHolder(private val binding: ItemElementBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Element) {
        binding.element = item
    }
}