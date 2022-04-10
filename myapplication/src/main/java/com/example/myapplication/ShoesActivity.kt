package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.content.Intent
import android.widget.GridLayout

class ShoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoes)

        val grid_Shoes = findViewById(R.id.ShoesGrid) as GridLayout
        var count = 0

        for(x in 0..10){
            val newShoes = ImageButton(this)
            if(x%2 == 0){
                newShoes.layoutParams= GridLayout.LayoutParams(GridLayout.spec(count,1F), GridLayout.spec(0,1F))

            }
            else{
                newShoes.layoutParams= GridLayout.LayoutParams(GridLayout.spec(count,1F), GridLayout.spec(1,1F))
                count =count+1

            }
            newShoes.setImageResource(R.drawable.ic_launcher_background)

            grid_Shoes.addView(newShoes)

            newShoes.setOnClickListener{

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