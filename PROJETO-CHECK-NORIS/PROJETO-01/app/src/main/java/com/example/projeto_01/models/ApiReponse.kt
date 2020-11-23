package com.example.projeto_01.models

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class ApiReponse(
    val id: String,
    val icon_url: String,
    val value: String,
    val categories: Array<String>,
    val created_at: String,
    val url: String,
    val updated_at: String
)

