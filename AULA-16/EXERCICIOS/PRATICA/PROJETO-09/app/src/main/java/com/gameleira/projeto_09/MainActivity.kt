package com.gameleira.projeto_09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener(this);
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn -> calcularHorasTrabalhadas();
        }
    }

    fun calcularHorasTrabalhadas() {
        val horas = horasTrabalhadas.text.toString()!!.toFloat();
        val valor = horasTrabalhadas.text.toString()!!.toFloat();
        val resultado = horas * valor;
        res.text = getString(R.string.retorno, resultado);
    }

}