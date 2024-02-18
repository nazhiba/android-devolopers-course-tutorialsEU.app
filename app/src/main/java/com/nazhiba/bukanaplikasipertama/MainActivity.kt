package com.nazhiba.bukanaplikasipertama

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val tvtextview = findViewById<TextView>(R.id.textView)
        var timesclicked = 0
        button.setOnClickListener(){
            timesclicked+=1

            tvtextview.text = timesclicked.toString()
        }
    }
}