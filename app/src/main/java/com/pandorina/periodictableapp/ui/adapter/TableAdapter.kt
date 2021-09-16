package com.pandorina.periodictableapp.ui.adapter

import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.pandorina.periodictableapp.databinding.*
import com.pandorina.periodictableapp.util.Constant.VIEW_TYPE_ELEMENT
import com.pandorina.periodictableapp.util.Constant.VIEW_TYPE_LANT_ACTI
import com.pandorina.periodictableapp.ui.holder.ElementHolder
import com.pandorina.periodictableapp.ui.holder.LantActiHolder
import com.pandorina.periodictableapp.data.model.Element
import com.pandorina.periodictableapp.data.model.LantActi

class TableAdapter(private val list: ArrayList<Any?>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
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

                    val binding: ItemDialogBinding =
                        ItemDialogBinding.inflate(LayoutInflater.from(holder.itemView.context))
                    binding.element = item

                    val alertDialog = AlertDialog.Builder(holder.itemView.context).run {
                        setView(binding.root)
                        create()
                    }.apply {
                        window?.setBackgroundDrawableResource(android.R.color.transparent)
                    }

                    holder.itemView.setOnClickListener { alertDialog.show() }
                    binding.ibCloseDialog.setOnClickListener { alertDialog.dismiss() }
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