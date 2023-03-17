package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var button: Button = this.findViewById<Button>(R.id.button)
        var text: TextView = this.findViewById(R.id.description)

        button.setOnClickListener { this.finish() }
        text.text = intent.getStringExtra("text")
    }
}