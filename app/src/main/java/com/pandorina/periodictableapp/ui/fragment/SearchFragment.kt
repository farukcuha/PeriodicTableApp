package com.pandorina.periodictableapp.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.GridLayoutManager
import com.pandorina.periodictableapp.R
import com.pandorina.periodictableapp.data.Resource
import com.pandorina.periodictableapp.data.model.Element
import com.pandorina.periodictableapp.data.model.LantActi
import com.pandorina.periodictableapp.databinding.FragmentSearchBinding
import com.pandorina.periodictableapp.ui.activity.MainActivity.Companion.adRequest
import com.pandorina.periodictableapp.ui.adapter.SearchAdapter
import com.pandorina.periodictableapp.util.ElementSearchListener


class SearchFragment : BaseFragment<FragmentSearchBinding>(FragmentSearchBinding::inflate) {
    val searchAdapter = SearchAdapter()
    lateinit var elementList: List<Element?>
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setUpRecyclerView()
        fetchElementList()
        searchAdapter.submitList(getRandomElementList())
        searchElements()
        binding.adViewSearch.loadAd(adRequest)
    }

    private fun setUpRecyclerView() {
        binding.rvSearch.apply {
            adapter = searchAdapter
            layoutManager = GridLayoutManager(requireContext(), 2)
            setHasFixedSize(true)
        }
    }

    private fun searchElements() {
        binding.svSearch.setOnQueryTextListener(object : ElementSearchListener() {
            override fun onQueryTextChange(newText: String?): Boolean {
                newText?.let {
                    elementList.filter {
                        it!!.name.lowercase().contains(newText)
                    }.let {
                        binding.emptyAnim.isVisible = it.isEmpty()
                        searchAdapter.submitList(it.take(8))
                    }
                    binding.rvSearch.requestLayout()
                    true
                }
                return true
            }
        })
    }

    private fun getRandomElementList(): List<Element?> {
        val randomList = arrayListOf<Element?>()
        do {
            val element = elementList.random()
            if (!randomList.contains(element)) {
                randomList.add(element)
            }
        } while (randomList.size <= 9)

        return randomList
    }

    private fun fetchElementList() {
        elementList = Resource.getElementList(requireContext()).apply {
            remove(LantActi(92, R.drawable.shape_7, "57-71", getString(R.string.lanthanoids)))
            remove(LantActi(110, R.drawable.shape_7, "89-103", getString(R.string.actinioids)))
            removeAll(listOf(null))
        }.map {
            it as Element
        }
    }
}