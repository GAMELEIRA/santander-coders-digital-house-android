package com.example.projeto_01.repository

import com.example.projeto_01.repository.endpoints.EndPointJokes

class Piadas {
    private val client = EndPointJokes.endpoint
    suspend fun getJoke(category: String?) = client.obterPiada(category);
}