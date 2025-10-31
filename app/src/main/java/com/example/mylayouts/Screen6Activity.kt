package com.example.mylayouts


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.mylayouts.R

class Screen6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen6)

        val btnPesan = findViewById<Button>(R.id.btnPesan)

        btnPesan.setOnClickListener {
            val intent = Intent(this, Screen7Activity::class.java)
            startActivity(intent)
        }

        // Bottom Navigation
        val navHome = findViewById<LinearLayout>(R.id.navHome)
        val navMakanan = findViewById<LinearLayout>(R.id.navOrder)
        val navProfile = findViewById<LinearLayout>(R.id.navProfile)

        navHome.setOnClickListener {
            finish() // Kembali ke home
        }

        navMakanan.setOnClickListener {
            // Already on makanan section
        }

        navProfile.setOnClickListener {
            // Navigate to profile
        }
    }
}