package com.techmania.memeapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemePage3 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var nextButtonThree: TextView
        lateinit var buttonTwoNext: TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_page3)
        nextButtonThree = findViewById(R.id.nextButtonThree)
        nextButtonThree.setOnClickListener {
            val intent = Intent(this, MemePage4::class.java)
            startActivity(intent)


        }
        buttonTwoNext = findViewById(R.id.buttonTwoNext)
        buttonTwoNext.setOnClickListener {
            val intent = Intent(this, MemePage2::class.java)
            startActivity(intent)


        }
    }
}