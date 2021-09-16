package com.pandorina.periodictableapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.pandorina.periodictableapp.ui.adapter.GroupAdapter
import com.pandorina.periodictableapp.ui.adapter.PeriodAdapter
import com.pandorina.periodictableapp.ui.adapter.TableAdapter
import com.pandorina.periodictableapp.data.Resource
import com.pandorina.periodictableapp.databinding.ActivityMainBinding
import com.pandorina.periodictableapp.data.model.Element
import com.pandorina.periodictableapp.data.model.LantActi

class MainActivity : AppCompatActivity() {
    private val elementList = arrayListOf<Any?>()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initElements(binding)
        initPeriods(binding)
        initGroups(binding)
    }

    private fun initGroups(binding: ActivityMainBinding) {
        val groupList  = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18)

        binding.rvGroups.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = GroupAdapter(groupList)
        }
    }

    private fun initPeriods(binding: ActivityMainBinding){
        val periodList = listOf(1, 2,3,4,5,6,7, 8, 8, 10)

        binding.rvPeriods.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = PeriodAdapter(periodList)
        }
    }

    private fun initElements(binding: ActivityMainBinding){
        for (i in 0..178){
            elementList.add(null)
        }

        for (item in Resource.getTableItems()){
            when(item){
                is Element -> {
                    elementList[item.index] = item
                }
                is LantActi -> {
                    elementList[item.index] = item
                }
            }
        }

        binding.rvPeriodicTable.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 18)
            adapter = TableAdapter(elementList)
        }
    }
}