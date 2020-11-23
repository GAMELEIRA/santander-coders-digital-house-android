package com.example.projeto_01.repository.endpoints

import com.example.projeto_01.models.ApiReponse
import com.example.projeto_01.utils.EndUtils
import retrofit2.http.GET
import retrofit2.http.Query

interface EndPointJokes {
    @GET("random")
    suspend fun buscarPiada(@Query("category") category: String?): ApiReponse

    companion object {
        val endpoint: EndPointCategories by lazy {
            EndUtils.getRetrofitInstance().create(EndPointCategories::class.java)
        }
    }
}