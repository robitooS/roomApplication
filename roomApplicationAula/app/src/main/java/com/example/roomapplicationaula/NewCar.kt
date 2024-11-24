package com.example.roomapplicationaula

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NewCar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_new_car)

        val marca = findViewById<EditText>(R.id.edtMarca)
        val modelo = findViewById<EditText>(R.id.edtModelo)
        val placa = findViewById<EditText>(R.id.edtPlaca)
        val ano = findViewById<EditText>(R.id.edtAno)

        val btnSalvar = findViewById<ImageButton>(R.id.btnSalvar)
        val btnCancelar = findViewById<ImageButton>(R.id.btnCancelar)

        btnSalvar.setOnClickListener{
           val camposPreenchidos = marca.text.toString().isNotEmpty() &&
                                   modelo.text.toString().isNotEmpty() &&
                                   placa.text.toString().isNotEmpty() &&
                                   ano.text.toString().isNotEmpty()

            if (camposPreenchidos) {
                val carro = Car(marca.text.toString(), modelo.text.toString(), placa.text.toString(), ano.text.toString().toInt(), null)
                Database.getInstance(this)!!.carDAO().salvar(carro)
                Toast.makeText(this, "Salvo com sucesso!", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Todos os campos devem ser preenchidos!", Toast.LENGTH_SHORT).show()
            }

        }

        btnCancelar.setOnClickListener{
            finish()
        }

    }
}