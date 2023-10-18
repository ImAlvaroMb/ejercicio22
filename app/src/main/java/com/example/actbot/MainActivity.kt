package com.example.actbot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.Color
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val verdButton = findViewById<Button>(R.id.green)
        val vermellButton = findViewById<Button>(R.id.red)
        val blauButton = findViewById<Button>(R.id.blue)

        verdButton.setOnClickListener {
            val intent = Intent(this, BLUE::class.java)
            //intent.putExtra("color", "green") // Código RGB para verde
            intent.putExtra("color", Color.rgb(0, 255, 0))
            startActivity(intent)
        }

        vermellButton.setOnClickListener {
            val intent = Intent(this, BLUE::class.java)
            intent.putExtra("color", Color.rgb(255, 0, 0)) // Código RGB para rojo
            startActivity(intent)
        }

        blauButton.setOnClickListener {
            val intent = Intent(this, BLUE::class.java)
            intent.putExtra("color", Color.rgb(0, 0, 255)) // Código RGB para azul
            startActivity(intent)
        }
    }
}