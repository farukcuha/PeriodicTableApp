package com.pandorina.periodictableapp.ui.holder

import androidx.recyclerview.widget.RecyclerView
import com.pandorina.periodictableapp.data.model.Element
import com.pandorina.periodictableapp.databinding.ItemSearchElementBinding

class SearchHolder(val binding: ItemSearchElementBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Element) {
        binding.element = item
    }
}
