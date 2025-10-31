package com.example.mylayouts

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Screen5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen5)

        // Ambil CardView dari layout
        val cardInfo1 = findViewById<CardView>(R.id.cardInfo1)
        val cardInfo2 = findViewById<CardView>(R.id.cardInfo2)
        val cardInfo3 = findViewById<CardView>(R.id.cardInfo3)
        val cardInfo4 = findViewById<CardView>(R.id.cardInfo4)
        val cardInfo5 = findViewById<CardView>(R.id.cardInfo5)
        val cardInfo6 = findViewById<CardView>(R.id.cardInfo6)
        val cardInfo7 = findViewById<CardView>(R.id.cardInfo7)
        val cardInfo8 = findViewById<CardView>(R.id.cardInfo8)
        val cardInfo9 = findViewById<CardView>(R.id.cardInfo9)
        val cardInfo10 = findViewById<CardView>(R.id.cardInfo10)


        // Klik card → pindah ke detail
        cardInfo1.setOnClickListener {
            val intent = Intent(this, Screen6Activity::class.java)
            startActivity(intent)
        }

        cardInfo2.setOnClickListener {
            val intent = Intent(this, Screen6Activity::class.java)
            startActivity(intent)
        }
        cardInfo3.setOnClickListener {
            val intent = Intent(this, Screen6Activity::class.java)
            startActivity(intent)
        }
        cardInfo4.setOnClickListener {
            val intent = Intent(this, Screen6Activity::class.java)
            startActivity(intent)
        }
        cardInfo5.setOnClickListener {
            val intent = Intent(this, Screen6Activity::class.java)
            startActivity(intent)
        }
        cardInfo6.setOnClickListener {
            val intent = Intent(this, Screen6Activity::class.java)
            startActivity(intent)
        }
        cardInfo7.setOnClickListener {
            val intent = Intent(this, Screen6Activity::class.java)
            startActivity(intent)
        }
        cardInfo8.setOnClickListener {
            val intent = Intent(this, Screen6Activity::class.java)
            startActivity(intent)
        }
        cardInfo9.setOnClickListener {
            val intent = Intent(this, Screen6Activity::class.java)
            startActivity(intent)
        }
        cardInfo10.setOnClickListener {
            val intent = Intent(this, Screen6Activity::class.java)
            startActivity(intent)
        }

        // Bottom Navigation
        val navHome = findViewById<LinearLayout>(R.id.navHome)
        val navOrder = findViewById<LinearLayout>(R.id.navOrder)
        val navProfile = findViewById<LinearLayout>(R.id.navProfile)

        navHome.setOnClickListener {
            val intent = Intent(this, Screen4Activity::class.java)
            startActivity(intent)
        }

        navOrder.setOnClickListener {
            // Sudah di halaman Order → tidak perlu pindah
        }

        navProfile.setOnClickListener {
            val intent = Intent(this, Screen7Activity::class.java)
            startActivity(intent)
        }
    }
}