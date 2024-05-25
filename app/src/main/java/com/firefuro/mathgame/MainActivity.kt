package com.firefuro.mathgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var addition : Button
    lateinit var subtraction : Button
    lateinit var multiplication : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addition=findViewById(R.id.button_add)
        subtraction=findViewById(R.id.button_sub)
        multiplication=findViewById(R.id.button_multiply)

        addition.setOnClickListener{
            var intent=Intent(this@MainActivity,AdditionScreen::class.java)
            startActivity(intent)

        }



    }
}