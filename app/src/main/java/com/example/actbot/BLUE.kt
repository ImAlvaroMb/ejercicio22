package com.example.actbot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import android.widget.TextView


class BLUE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blue)


        val colorTextView = findViewById<TextView>(R.id.showColor)

        val colorRGB = intent.getIntExtra("color", Color.BLACK)
        val colorString = intent?.extras?.getString("color").toString()
        val buttton = findViewById<Button>(R.id.back)

        buttton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val red = Color.red(colorRGB)
        val green = Color.green(colorRGB)
        val blue = Color.blue(colorRGB)

        //colorTextView.text = colorString
        colorTextView.text = "RGB: $red, $green, $blue"
    }
}