package com.pandorina.periodictableapp.ui.holder

import androidx.recyclerview.widget.RecyclerView
import com.pandorina.periodictableapp.databinding.ItemGroupBinding

class GroupHolder(private val binding: ItemGroupBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(number: Int) {
        binding.groupNumber = number
    }
}