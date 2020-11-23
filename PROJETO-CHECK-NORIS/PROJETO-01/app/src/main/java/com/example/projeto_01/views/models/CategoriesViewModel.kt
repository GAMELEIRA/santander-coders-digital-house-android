package com.example.projeto_01.views.models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.projeto_01.repository.Categories
import kotlinx.coroutines.Dispatchers

class CategoriesViewModel (
    private val repository: Categories
): ViewModel() {

    private lateinit var _categories: List<String>


    fun getCategories() = liveData(Dispatchers.IO) {
        val response = repository.getCategories()
        _categories = response

        emit(response)
    }

    class ListViewModelFactory (
        private val repository: Categories
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return CategoriesViewModel(repository) as T
        }
    }

}