package com.example.appsencilla


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var txtNombre : EditText
    private lateinit var txtEdad : EditText
    private lateinit var btnAceptar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Obtenemos una referencia a los controles de la interfaz
        txtNombre = findViewById(R.id.txtNombre)
        txtEdad = findViewById(R.id.txtEdad)
        btnAceptar = findViewById(R.id.btnAceptar)

        btnAceptar.setOnClickListener {
            //Creamos el Intent
            val intent = Intent(this@MainActivity, Saludo::class.java)
            //Añadimos al intent la información a pasar entre actividades
            intent.putExtra("NOMBRE", txtNombre.text.toString())
            intent.putExtra("EDAD", txtEdad.text.toString())

            //Iniciamos la nueva actividad
            startActivity(intent)
        }
    }
}

