package com.example.projeto_01.models

import com.google.gson.annotations.SerializedName

class Categories(
    @SerializedName("categories")
    val categorias: Array<String>,

    @SerializedName("created_at")
    val criadoEm: String,

    @SerializedName("icon_url")
    val icone: String,
    val id: String,

    @SerializedName("updated_at")
    val atualizadoEm: String,
    val url: String,

    @SerializedName("value")
    val value: String
)



