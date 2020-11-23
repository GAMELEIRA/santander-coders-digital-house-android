package com.example.projeto_01.views

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projeto_01.R

import java.util.*

class CategoryViewHolder (
    view: View
): RecyclerView.ViewHolder(view) {

    private val catName = view.findViewById<TextView>(R.id.txtCatName)

    fun bind(category: String) {
        catName.text = category.capitalize(Locale.getDefault())
    }

}
