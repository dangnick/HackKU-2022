package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.content.Intent
import android.widget.GridLayout

class HatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hat)

        val grid_hats = findViewById(R.id.hatGrid) as GridLayout
        var count = 0

        for(x in 0..10){
            val newHat = ImageButton(this)
            if(x%2 == 0){
                newHat.layoutParams= GridLayout.LayoutParams(GridLayout.spec(count,1F), GridLayout.spec(0,1F))

            }
            else{
                newHat.layoutParams= GridLayout.LayoutParams(GridLayout.spec(count,1F), GridLayout.spec(1,1F))
                count =count+1

            }
            newHat.setImageResource(R.drawable.ic_launcher_background)

            grid_hats.addView(newHat)

            newHat.setOnClickListener{

                val Intent =Intent(this,MainActivity::class.java)
                startActivity(Intent)
            }


        }
        val backButton = findViewById<ImageButton>(R.id.backbutton)
        backButton.setOnClickListener{
            finish()
        }
        val addItem = findViewById<ImageButton>(R.id.addItem)
        addItem.setOnClickListener{
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }


    }
}