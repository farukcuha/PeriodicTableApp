package com.pandorina.periodictableapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pandorina.periodictableapp.databinding.ItemPeriodBinding
import com.pandorina.periodictableapp.holder.PeriodHolder

class PeriodAdapter(private val list: List<Int>): RecyclerView.Adapter<PeriodHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeriodHolder {
        val binding = ItemPeriodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PeriodHolder(binding)
    }

    override fun onBindViewHolder(holder: PeriodHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size
}