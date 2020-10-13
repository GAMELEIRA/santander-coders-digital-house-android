package com.gameleira.projeto_05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = actMainTxtnNome.text;

        findViewById<TextView>(R.id.actMainTxtnNomePre).text = nome;

        findViewById<TextView>(R.id.actMainTxtHello).text = "I AM HERE!";

        actMainBtn.setOnClickListener(this)

        /**actMainBtn.setOnClickListener {

            actMainTxtnNomePre.text = "Vc clicou!!!!";

        }**/
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.actMainBtn -> mudarTexto()
        }
    }

    fun mudarTexto(){

        actMainTxtnNomePre.text = "Vc clicou!!!!";

    }
}