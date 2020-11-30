package com.gameleira.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val manager = supportFragmentManager;

        btnPrimeiro.setOnClickListener{
            val transaction = manager.beginTransaction();
            transaction.replace(R.id.container, FragmentA())
            transaction.commit();

        }

        btnSegundo.setOnClickListener{
            val transaction = manager.beginTransaction();
            transaction.replace(R.id.container, FragmentB())
            transaction.commit();
        }
    }
}