package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_all)
        val button2 = findViewById<Button>(R.id.button_create)
        val button3 = findViewById<Button>(R.id.button3)


        button.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener{
            val intent2 = Intent(this, CreateActivity::class.java)
            startActivity(intent2)
        }


    }



}