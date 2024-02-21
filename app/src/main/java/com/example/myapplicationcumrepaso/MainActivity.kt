package com.example.myapplicationcumrepaso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtNombre = EditText(this)
        var txtCarnet = EditText(this)
        var txtCum = EditText(this)

        txtNombre = findViewById(R.id.TxtNombre)
        txtCarnet = findViewById(R.id.TxtCarnet)
        txtCum = findViewById(R.id.TxtCum)

        var btnCum = Button(this)
        btnCum = findViewById(R.id.BtnCum)

        btnCum.setOnClickListener {
            val intent = Intent(this, FrmCum::class.java)
            intent.putExtra("nombre", txtNombre.text.toString())
            intent.putExtra("carnet", txtCarnet.text.toString())
            intent.putExtra("cum", txtCum.text.toString())
            startActivity(intent)
        }
    }
}