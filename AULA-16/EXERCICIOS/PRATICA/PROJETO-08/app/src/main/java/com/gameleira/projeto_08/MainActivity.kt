package com.gameleira.projeto_08

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
            R.id.btn -> converterCelsius();
        }
    }

    fun converterCelsius() {

        val temperaturaCelsius = temperatura.text.toString().toFloat();

        val temperaturaConvertida = converterCelsius(temperaturaCelsius);

        retorno.text = getString(R.string.resultado, temperaturaConvertida);

    }

    fun converterCelsius(celsius: Float): Float {

        return ((celsius * 9) / 5) + 32;

    }

}