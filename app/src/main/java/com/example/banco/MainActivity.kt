package com.example.banco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCalc = findViewById<Button>(R.id.btnCalcular)
        btnCalc.setOnClickListener {
            val empr = findViewById<EditText>(R.id.editValor)
            val tempo = findViewById<EditText>(R.id.editTempo)
            
        }
    }
}