package com.example.projeto_01.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projeto_01.R
import com.example.projeto_01.repository.Categories
import com.example.projeto_01.views.models.CategoriesViewModel

class CatListFragment : Fragment() {

    private lateinit var _viewModel: CategoriesViewModel
    private lateinit var _view: View
    private lateinit var _catListAdapter: CatListAdapter

    private var _categoryList = mutableListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this._view = view

        val navControl: NavController = Navigation.findNavController(view)

        val list = view.findViewById<RecyclerView>(R.id.list)
        val manager = LinearLayoutManager(view.context)

        _catListAdapter = CatListAdapter(_categoryList) {
            val bundle = bundleOf("category" to it)
            navControl.navigate(R.id.action_catListFragment_to_jokeFragment, bundle)
        }

        list.apply {
            setHasFixedSize(true)

            layoutManager = manager
            adapter = _catListAdapter
        }


        _viewModel = ViewModelProvider(
            this,
            CategoriesViewModel.ListViewModelFactory(Categories())
        ).get(CategoriesViewModel::class.java)

        _viewModel.getCategories().observe(viewLifecycleOwner, {
            showResults(it)
        })

    }

    private fun showResults(categories: List<String>) {
        _categoryList.addAll(categories)

        _catListAdapter.notifyDataSetChanged()
    }
}