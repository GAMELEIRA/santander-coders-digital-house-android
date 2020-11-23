package com.example.projeto_01.repository

import com.example.projeto_01.repository.endpoints.EndPointCategories

class Categories {
    private val client = EndPointCategories.endpoint
    suspend fun getCategories() = client.obterCategorias();
}