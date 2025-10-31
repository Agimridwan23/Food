package com.example.mylayouts


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mylayouts.R

class Screen7Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen7)

        val etNamaInstitusi = findViewById<EditText>(R.id.etNamaInstitusi)
        val etAlamat = findViewById<EditText>(R.id.etAlamat)
        val etKonfirmasiAlamat = findViewById<EditText>(R.id.etKonfirmasiAlamat)
        val btnOrder = findViewById<Button>(R.id.btnOrder)

        btnOrder.setOnClickListener {
            val namaInstitusi = etNamaInstitusi.text.toString()
            val alamat = etAlamat.text.toString()
            val konfirmasiAlamat = etKonfirmasiAlamat.text.toString()

            if (namaInstitusi.isEmpty() || alamat.isEmpty() || konfirmasiAlamat.isEmpty()) {
                Toast.makeText(this, "Semua field harus diisi", Toast.LENGTH_SHORT).show()
            } else {
                // Proses order
                val intent = Intent(this, Screen8Activity::class.java)
                startActivity(intent)
            }
        }
    }
}