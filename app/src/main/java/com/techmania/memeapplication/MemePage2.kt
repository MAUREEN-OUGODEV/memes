package com.techmania.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MemePage2 : AppCompatActivity() {
  lateinit var nextButtonTwo:TextView
  lateinit var PreviousButtonOne:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_page2)
        nextButtonTwo=findViewById(R.id.nextButtonTwo)
        nextButtonTwo.setOnClickListener{
            val intent= Intent(this,MemePage3::class.java)
            startActivity(intent)
        }
        PreviousButtonOne=findViewById(R.id.PreviousButtonOne)
        PreviousButtonOne.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}