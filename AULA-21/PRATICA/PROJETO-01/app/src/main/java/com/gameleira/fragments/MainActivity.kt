package com.gameleira.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var manager: FragmentManager;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        manager = supportFragmentManager
        val meuF1 = MeuFragment();
        val meuF2 = MeuFragment2();
        btnAdicionaFragmentA.setOnClickListener {
            val transaction = manager.beginTransaction();
            transaction.replace(R.id.fragmentContainer, meuF1);
            transaction.commit();
        }

        btnAdicionaFragmentB.setOnClickListener {
            val transaction = manager.beginTransaction();
            transaction.replace(R.id.fragmentContainer, meuF2);
            transaction.commit();
        }
    }
}