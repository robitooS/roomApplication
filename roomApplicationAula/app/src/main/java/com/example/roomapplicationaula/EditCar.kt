package com.example.roomapplicationaula

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EditCar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edit_car)
            val carro = intent.getSerializableExtra("carro") as Car

            val txtId = findViewById<TextView>(R.id.txtIdCarro)
            val editAno = findViewById<EditText>(R.id.editarAno)
            val editPlaca = findViewById<EditText>(R.id.editarPlaca)

            val btnSalvar = findViewById<ImageButton>(R.id.btnEdtSalvar)
            val btnCancelar = findViewById<ImageButton>(R.id.btnEdtCancelar)

            txtId.text = "ID CARRO: ${carro.id.toString()}"
            editAno.setText(carro.ano.toString())
            editPlaca.setText(carro.placa)

            btnSalvar.setOnClickListener{
                carro.ano = editAno.text.toString().toInt()
                carro.placa = editPlaca.text.toString()

                Database.getInstance(this)!!.carDAO().atualizar(carro)
                finish()
            }

            btnCancelar.setOnClickListener {
                finish()

            }
        }
    }
