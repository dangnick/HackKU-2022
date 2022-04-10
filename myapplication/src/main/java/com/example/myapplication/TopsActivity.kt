package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.content.Intent
import android.widget.GridLayout
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage

class TopsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tops)
        val storageReference = Firebase.storage.reference
        val imageView = findViewById<ImageView>(R.id.download)
        Glide.with(this).load(storageReference).into(imageView)
        val grid_Tops = findViewById(R.id.topGrid) as GridLayout
        var count = 0

        for(x in 0..3){
            val newTop = ImageButton(this)
            if(x%2 == 0){
                newTop.layoutParams= GridLayout.LayoutParams(GridLayout.spec(count,1F), GridLayout.spec(0,1F))

            }
            else{
                newTop.layoutParams= GridLayout.LayoutParams(GridLayout.spec(count,1F), GridLayout.spec(1,1F))
                count =count+1

            }
            newTop.setImageResource(R.drawable.ic_launcher_background)

            grid_Tops.addView(newTop)

            newTop.setOnClickListener{

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
            val Intent = Intent(this,CameraActivity::class.java)
            startActivity(Intent)
        }


    }
}