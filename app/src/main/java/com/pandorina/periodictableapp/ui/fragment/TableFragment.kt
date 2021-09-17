package com.pandorina.periodictableapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.pandorina.periodictableapp.data.Resource
import com.pandorina.periodictableapp.databinding.FragmentTableBinding
import com.pandorina.periodictableapp.ui.adapter.GroupAdapter
import com.pandorina.periodictableapp.ui.adapter.PeriodAdapter
import com.pandorina.periodictableapp.ui.adapter.TableAdapter


class TableFragment : Fragment() {
    var _binding: FragmentTableBinding? = null
    val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTableBinding.inflate(inflater)

        initElements(binding)
        initPeriods(binding)
        initGroups(binding)

        return binding.root
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
        val periodList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 8, 10)

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
            adapter = TableAdapter(Resource.getElementList())
        }
    }
}