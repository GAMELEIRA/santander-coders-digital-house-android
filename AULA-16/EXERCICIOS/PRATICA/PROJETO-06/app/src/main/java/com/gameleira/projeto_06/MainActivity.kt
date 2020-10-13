package com.gameleira.projeto_06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener(this);
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn -> mudarTexto();
        }
    }

    fun validar(): Boolean {

        return txtNumero.text.toString().toInt() % 2 == 0;

    }

    fun mudarTexto() {
        if (validar()) {
            resultado.text = "É PAR";
        } else {
            resultado.text = "É IMPAR";
        }
    }
}