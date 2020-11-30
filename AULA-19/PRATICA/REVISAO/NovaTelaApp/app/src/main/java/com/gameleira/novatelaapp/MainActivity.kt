package com.gameleira.novatelaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPrincipal.setOnClickListener{
            val intent = Intent(this, NovaTela::class.java);
            intent.putExtra("NAME", "Gabriel");
            startActivity(intent);
        }

        btnPrincipal.isEnabled = false;

        vcDeseja.setOnCheckedChangeListener {_, isChecked ->
            btnPrincipal.isEnabled = isChecked;
            Toast.makeText(this, isChecked.toString(), Toast.LENGTH_LONG).show();
        }
    }
}