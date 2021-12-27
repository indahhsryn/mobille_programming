package com.latihan.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var edNama: EditText
    private lateinit var btnTekan: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edNama = findViewById(R.id.edNama)
        btnTekan = findViewById(R.id.btnTekan)
        btnTekan.setOnClickListener{

        }
    }
}