package com.pandorina.periodictableapp.ui.holder

import androidx.recyclerview.widget.RecyclerView
import com.pandorina.periodictableapp.data.model.LantActi
import com.pandorina.periodictableapp.databinding.ItemLantActiBinding

class LantActiHolder(val binding: ItemLantActiBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: LantActi) {
        binding.lantacti = item
    }
}