package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class CreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        val button = findViewById<ImageButton>(R.id.backbutton)
        val button2 = findViewById<ImageButton>(R.id.imageHat)
        button.setOnClickListener{
            finish()
        }
        button2.visibility = View.VISIBLE

        button2.setOnClickListener{
            button2.visibility = View.INVISIBLE
        }
    }
}