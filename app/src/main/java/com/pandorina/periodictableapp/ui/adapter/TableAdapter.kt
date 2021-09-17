package com.pandorina.periodictableapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.pandorina.periodictableapp.data.model.Element
import com.pandorina.periodictableapp.data.model.LantActi
import com.pandorina.periodictableapp.databinding.ItemElementBinding
import com.pandorina.periodictableapp.databinding.ItemLantActiBinding
import com.pandorina.periodictableapp.ui.holder.ElementHolder
import com.pandorina.periodictableapp.ui.holder.LantActiHolder
import com.pandorina.periodictableapp.util.ElementDialog

class TableAdapter(private val list: ArrayList<Any?>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val VIEW_TYPE_ELEMENT = 1
        const val VIEW_TYPE_LANT_ACTI = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_ELEMENT -> {
                ElementHolder(
                    ItemElementBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            VIEW_TYPE_LANT_ACTI -> {
                LantActiHolder(
                    ItemLantActiBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            else -> ElementHolder(
                ItemElementBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]
        item?.let {
            when (holder) {
                is ElementHolder -> {
                    holder.bind(item as Element)
                    ElementDialog.get(holder, item)
                }
                is LantActiHolder -> {
                    holder.bind(item as LantActi)
                }
            }
        } ?: run {
            holder.itemView.isVisible = false
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (list[position]) {
            is Element -> {
                VIEW_TYPE_ELEMENT
            }
            is LantActi -> {
                VIEW_TYPE_LANT_ACTI
            }
            else -> super.getItemViewType(position)
        }
    }

    override fun getItemCount() = list.size
}