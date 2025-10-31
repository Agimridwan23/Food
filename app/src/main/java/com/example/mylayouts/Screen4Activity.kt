package com.example.mylayouts


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mylayouts.R

class Screen4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4)

        val etNamaLengkap = findViewById<EditText>(R.id.etNamaLengkap)
        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val namaLengkap = etNamaLengkap.text.toString()
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (namaLengkap.isEmpty() || username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Semua field harus diisi", Toast.LENGTH_SHORT).show()
            } else {
                // Simulasi registrasi berhasil
                Toast.makeText(this, "Registrasi berhasil!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Screen5Activity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}