package com.pandorina.periodictableapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pandorina.periodictableapp.databinding.ItemGroupBinding
import com.pandorina.periodictableapp.holder.GroupHolder

class GroupAdapter(private val list: List<Int>): RecyclerView.Adapter<GroupHolder>(){
    override fun onBindViewHolder(holder: GroupHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupHolder {
        val binding = ItemGroupBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GroupHolder((binding))

    }

    override fun getItemCount() = list.size

}
