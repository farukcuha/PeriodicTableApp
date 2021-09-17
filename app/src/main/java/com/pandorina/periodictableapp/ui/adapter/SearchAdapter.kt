package com.pandorina.periodictableapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.pandorina.periodictableapp.data.model.Element
import com.pandorina.periodictableapp.databinding.ItemSearchElementBinding
import com.pandorina.periodictableapp.ui.holder.SearchHolder
import com.pandorina.periodictableapp.util.ElementDialog

class SearchAdapter : ListAdapter<Element, SearchHolder>(Comparator) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchHolder {
        val binding = ItemSearchElementBinding.inflate(LayoutInflater.from(parent.context))
        return SearchHolder(binding)
    }

    override fun onBindViewHolder(holder: SearchHolder, position: Int) {
        val item = getItem(position)
        holder.apply {
            bind(getItem(position))
            ElementDialog.get(holder, item)
        }
    }

    object Comparator : DiffUtil.ItemCallback<Element>() {
        override fun areItemsTheSame(oldItem: Element, newItem: Element): Boolean {
            return oldItem.number == newItem.number
        }

        override fun areContentsTheSame(oldItem: Element, newItem: Element): Boolean {
            return oldItem == newItem
        }

    }
}