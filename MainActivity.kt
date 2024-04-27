package com.example.a34a

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var radioBoy:RadioButton
    lateinit var radioWater:RadioButton
    lateinit var radioCartoon:RadioButton
    lateinit var image:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioBoy=findViewById(R.id.boy)
        radioWater=findViewById(R.id.water)
        radioCartoon=findViewById(R.id.cartoon)
        image=findViewById(R.id.imageView)

        radioBoy.setOnClickListener {
            image.setImageResource(R.drawable.girl)

        }
        radioCartoon.setOnClickListener{
            image.setImageResource(R.drawable.fire)
        }
        radioWater.setOnClickListener{
            image.setImageResource(R.drawable.water)
        }
    }

}