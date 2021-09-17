package com.pandorina.periodictableapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pandorina.periodictableapp.databinding.ItemGroupBinding
import com.pandorina.periodictableapp.ui.holder.GroupHolder

class GroupAdapter(private val list: List<Int>) : RecyclerView.Adapter<GroupHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupHolder {
        val binding = ItemGroupBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GroupHolder((binding))
    }

    override fun onBindViewHolder(holder: GroupHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

}
