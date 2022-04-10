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
        val button3 = findViewById<Button>(R.id.button2)
        val button4 = findViewById<Button>(R.id.button3)
        val button5 = findViewById<Button>(R.id.button4)
        val button6 = findViewById<Button>(R.id.button5)

        button.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener{
            val intent2 = Intent(this, CreateActivity::class.java)
            startActivity(intent2)
        }

        button3.setOnClickListener{
            val intent3 = Intent(this, HatActivity::class.java)
            startActivity(intent3)
        }

        button4.setOnClickListener{
            val intent4 = Intent(this, TopsActivity::class.java)
            startActivity(intent4)
        }

        button5.setOnClickListener{
            val intent5 = Intent(this, PantsActivity::class.java)
            startActivity(intent5)
        }

        button6.setOnClickListener{
            val intent6 = Intent(this, PantsActivity::class.java)
            startActivity(intent6)
        }
    }



}