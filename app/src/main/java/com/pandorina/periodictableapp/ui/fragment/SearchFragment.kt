package com.pandorina.periodictableapp.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.pandorina.periodictableapp.R
import com.pandorina.periodictableapp.data.Resource
import com.pandorina.periodictableapp.data.model.Element
import com.pandorina.periodictableapp.data.model.LantActi
import com.pandorina.periodictableapp.databinding.FragmentSearchBinding
import com.pandorina.periodictableapp.ui.adapter.SearchAdapter
import com.pandorina.periodictableapp.util.ElementSearchListener


class SearchFragment : BaseFragment<FragmentSearchBinding>(FragmentSearchBinding::inflate) {
    val searchAdapter = SearchAdapter()
    lateinit var elementList: List<Element?>
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setUpRecyclerView()
        fetchElementList()
        searchAdapter.submitList(elementList)
        searchElements()
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
                return if (newText == "") {
                    searchAdapter.submitList(elementList)
                    true
                } else {
                    val filteredList = elementList.filter {
                        it!!.name.lowercase().contains(newText!!)
                    }
                    searchAdapter.submitList(filteredList)
                    true
                }
            }
        })
    }

    private fun fetchElementList() {
        elementList = Resource.getElementList().apply {
            remove(LantActi(92, R.drawable.shape_7, "57-71", "Lanthanoids"))
            remove(LantActi(110, R.drawable.shape_7, "89-103", "Actinioids"))
            removeAll(listOf(null))
        }.map {
            it as Element
        }
    }
}