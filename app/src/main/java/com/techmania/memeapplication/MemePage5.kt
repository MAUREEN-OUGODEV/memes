package com.techmania.memeapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemePage5 : AppCompatActivity() {
    lateinit var buttonPreviousLast: TextView
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_page5)

        buttonPreviousLast =findViewById(R.id.buttonPreviousLast)

        val intent = Intent(this, MemePage4::class.java)
        startActivity(intent)
    }
}