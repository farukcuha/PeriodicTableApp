package com.pandorina.periodictableapp.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.pandorina.periodictableapp.R
import com.pandorina.periodictableapp.data.Resource
import com.pandorina.periodictableapp.data.model.Element
import com.pandorina.periodictableapp.data.model.LantActi
import com.pandorina.periodictableapp.databinding.FragmentTableBinding
import com.pandorina.periodictableapp.ui.adapter.GroupAdapter
import com.pandorina.periodictableapp.ui.adapter.PeriodAdapter
import com.pandorina.periodictableapp.ui.adapter.TableAdapter


class TableFragment: BaseFragment<FragmentTableBinding>(FragmentTableBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initPeriods(binding)
        initGroups(binding)
        initElements(binding)
    }

    private fun initGroups(binding: FragmentTableBinding) {
        val groupList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18)
        binding.rvGroups.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = GroupAdapter(groupList)
        }
    }

    private fun initPeriods(binding: FragmentTableBinding) {
        val periodList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
        binding.rvPeriods.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = PeriodAdapter(periodList)
        }
    }

    private fun initElements(binding: FragmentTableBinding) {
        binding.rvPeriodicTable.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 18)

            val elementList = arrayListOf<Any?>()

            for (i in 0..178) {
                elementList.add(null)
            }

            for (item in Resource.getElementList(requireContext())) {
                when (item) {
                    is Element -> {
                        elementList[item.index] = item
                    }
                    is LantActi -> {
                        elementList[item.index] = item
                    }
                }
            }
            adapter = TableAdapter(elementList)
        }
    }
}