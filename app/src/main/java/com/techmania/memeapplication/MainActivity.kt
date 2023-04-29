package com.techmania.memeapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnNextOne:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       btnNextOne=findViewById(R.id.btnNextOne)
        btnNextOne.setOnClickListener{
            val intent=Intent(this,MemePage2::class.java)
            startActivity(intent)
//
        }
    }
}