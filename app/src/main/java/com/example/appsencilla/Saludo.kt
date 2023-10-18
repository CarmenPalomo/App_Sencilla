package com.example.appsencilla


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Saludo : AppCompatActivity() {

    private lateinit var txtSaludo : TextView
    private lateinit var txtEdad : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        //Obtenemos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.txtSaludo)

        //Recuperamos la información pasada en el intent
        val saludo = intent.getStringExtra("NOMBRE")

        //Construimos el mensaje a mostrar
        txtSaludo.text = "Hola $saludo"

        //Modificacion txtEdad

        txtEdad = findViewById(R.id.txtEdad)
        val edad = intent.getStringExtra("EDAD")
        txtEdad.text = "Tu edad es $edad"
    }
}