package com.example.myapplicationcumrepaso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class FrmCum: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cum)

        var txtSalidaNombre = TextView(this)
        var txtSalidaCarnet = TextView(this)
        var txtSalidaCum = TextView(this)
        var txtSalidaUv = TextView(this)
        var btnCumSalida = Button(this)

        txtSalidaNombre = findViewById(R.id.TxtSalidaNombre)
        txtSalidaCarnet = findViewById(R.id.TxtSalidaCarnet)
        txtSalidaCum = findViewById(R.id.TxtSalidaCum)
        txtSalidaUv = findViewById(R.id.TxtSalidaUv)
        btnCumSalida = findViewById(R.id.BtnSalidaCum)

        val extras = intent.extras

        txtSalidaNombre.text = extras?.getString("nombre")
        txtSalidaCarnet.text = extras?.getString("carnet")
        txtSalidaCum.text = extras?.getString("cum")

        Log.d("TAG", "nombre " + txtSalidaNombre.text)
        Log.d("TAG", "carnet " + txtSalidaCarnet.text)
        Log.d("TAG", "cum " + txtSalidaCum.text)


        var cum: Float = 0F
        cum = txtSalidaCum.text.toString().toFloat()

        val uv: Float = if (cum >= 7.5) 32F
        else if (cum >= 7.0 && cum < 7.5) 24F
        else if (cum >=6.0 && cum < 7.0) 20F
        else 16F;

        txtSalidaUv.text = uv.toString()


        btnCumSalida.setOnClickListener {
           val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }}