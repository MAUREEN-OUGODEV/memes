package com.techmania.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MemePage4 : AppCompatActivity() {
    lateinit var button3:TextView
    lateinit var btnFour: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_page4)
        button3= findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, MemePage3::class.java)
            startActivity(intent)
        }
        btnFour=findViewById(R.id.btnFour)
        btnFour.setOnClickListener {
            startActivity(Intent(this,MemePage5::class.java))
        }
        }
    }
