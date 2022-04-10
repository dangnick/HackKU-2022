package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.content.Intent
import android.widget.GridLayout

class PantsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pants)

        val grid_pants = findViewById(R.id.pantsGrid) as GridLayout
        var count = 0

        for(x in 0..10){
            val newPants = ImageButton(this)
            if(x%2 == 0){
                newPants.layoutParams= GridLayout.LayoutParams(GridLayout.spec(count,1F), GridLayout.spec(0,1F))

            }
            else{
                newPants.layoutParams= GridLayout.LayoutParams(GridLayout.spec(count,1F), GridLayout.spec(1,1F))
                count =count+1

            }
            newPants.setImageResource(R.drawable.ic_launcher_background)

            grid_pants.addView(newPants)

            newPants.setOnClickListener{

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