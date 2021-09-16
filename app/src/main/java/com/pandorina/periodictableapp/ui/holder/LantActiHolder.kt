package com.pandorina.periodictableapp.ui.holder

import androidx.recyclerview.widget.RecyclerView
import com.pandorina.periodictableapp.databinding.ItemLantActiBinding
import com.pandorina.periodictableapp.data.model.LantActi

class LantActiHolder(val binding: ItemLantActiBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: LantActi){
        binding.lantacti = item
    }
}