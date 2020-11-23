package com.example.projeto_01.views.models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.projeto_01.models.ApiReponse
import com.example.projeto_01.repository.Piadas
import kotlinx.coroutines.Dispatchers

class JokeViewModel (
    private val repository: Piadas
): ViewModel() {
    private lateinit var _joke: ApiReponse

    fun getJoke(category: String? = null) = liveData(Dispatchers.IO) {

        val response = repository.getJoke(category)
        _joke = response

        emit(response)

    }

    class JokeViewModelFactory (
        private val repository: Piadas
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return JokeViewModel(repository) as T
        }
    }
}