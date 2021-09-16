package com.pandorina.periodictableapp.holder

import androidx.recyclerview.widget.RecyclerView
import com.pandorina.periodictableapp.databinding.ItemLantActiBinding
import com.pandorina.periodictableapp.model.LantActi

class LantActiHolder(val binding: ItemLantActiBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: LantActi){
        binding.lantacti = item
    }
}