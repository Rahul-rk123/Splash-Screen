package com.example.splash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val sd = findViewById<Button>(R.id.button2)
        supportActionBar?.hide()
        sd.setOnClickListener{
            intent = Intent(applicationContext, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}