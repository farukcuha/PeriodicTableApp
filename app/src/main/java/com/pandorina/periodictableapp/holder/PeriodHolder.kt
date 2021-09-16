package com.pandorina.periodictableapp.holder

import androidx.recyclerview.widget.RecyclerView
import com.pandorina.periodictableapp.databinding.ItemPeriodBinding

class PeriodHolder(private val binding: ItemPeriodBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(number: Int){
        binding.periodNumber = number
    }
}