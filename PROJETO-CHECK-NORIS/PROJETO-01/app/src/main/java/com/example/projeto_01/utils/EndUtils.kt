package com.example.projeto_01.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class EndUtils {
    companion object {
        const val URL_BASE = "https://api.chucknorris.io/jokes/"
        fun getRetrofitInstance(baseUrl: String = URL_BASE): Retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}