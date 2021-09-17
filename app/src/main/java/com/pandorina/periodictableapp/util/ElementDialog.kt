package com.pandorina.periodictableapp.util

import android.app.AlertDialog
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.pandorina.periodictableapp.R
import com.pandorina.periodictableapp.data.model.Element
import com.pandorina.periodictableapp.databinding.ItemDialogBinding

object ElementDialog {
    fun get(holder: RecyclerView.ViewHolder, item: Element) {
        val binding: ItemDialogBinding =
            ItemDialogBinding.inflate(LayoutInflater.from(holder.itemView.context))

        binding.element = item

        val alertDialog = AlertDialog.Builder(holder.itemView.context).run {
            setView(binding.root)
            create()
        }.apply {
            window?.setWindowAnimations(R.style.ElementDialogAnimation)
            window?.setBackgroundDrawableResource(android.R.color.transparent)
        }

        holder.itemView.setOnClickListener { alertDialog.show() }
        binding.ibCloseDialog.setOnClickListener { alertDialog.dismiss() }
    }
}