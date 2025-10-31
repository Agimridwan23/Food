package com.example.mylayouts


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mylayouts.R

class Screen8Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen8)

        val btnSelesai = findViewById<Button>(R.id.btnSelesai)

        btnSelesai.setOnClickListener {
            // Kembali ke home dan clear semua activity sebelumnya
            val intent = Intent(this, Screen5Activity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }
}