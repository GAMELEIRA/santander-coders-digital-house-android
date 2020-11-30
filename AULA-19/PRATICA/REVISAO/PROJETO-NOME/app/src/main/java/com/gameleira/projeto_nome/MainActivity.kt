package com.gameleira.projeto_nome

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val edInputName by lazy {findViewById<EditText>(R.id.edTexto)  }
    private val btnResult by lazy {findViewById<EditText>(R.id.btnExibir)  }
    private val tvResult by lazy {findViewById<TextView>(R.id.tvResultado)  }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnResult.setOnClickListener {
            val resul: String = edInputName.text.toString();

            tvResult.text = "Meu nome é $resul"
            tvResult.visibility = View.VISIBLE
        }
    }
}