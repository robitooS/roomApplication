package com.example.roomapplicationaula

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog.Builder
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Concessionária"
        val btnAdd = findViewById<FloatingActionButton>(R.id.btnAdd)
        val listaCarros = findViewById<ListView>(R.id.listCarros)

        btnAdd.setOnClickListener{
            val intent = Intent(this, NewCar::class.java)
            startActivity(intent)
        }

        listaCarros.setOnItemClickListener { parent, view, position, id ->
            val carro = listaCarros.getItemAtPosition(position) as Car

            val intent = Intent(this, EditCar::class.java)
            intent.putExtra("carro", carro)

            startActivity(intent)
        }

        listaCarros.setOnItemLongClickListener { parent, view, position, id ->
            val carro = listaCarros.getItemAtPosition(position) as Car

            val builder = Builder(this)
            builder
                .setTitle("Apagar carro")
                .setMessage("Deseja apagar o carro com o ID ${carro.id} ?")
                .setPositiveButton("Sim") { dialog, which ->
                    Database.getInstance(this)!!.carDAO().deletar(carro)
                    atualizarLista("id")
                    Toast.makeText(this, "Carro Apagado Com Sucesso!", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("Não") { dialog, which ->
                    Toast.makeText(this, "Operação Cancelada!", Toast.LENGTH_SHORT).show()
                }
                .show()
                true
        }
    }

    override fun onResume() {
        super.onResume()
        atualizarLista("id") // Atualiza a lista automaticamente pelo id
    }

    private fun atualizarLista(ordenacao: String) {

        var carros: List<Car> = ArrayList()

        when (ordenacao) {
            "id" -> carros = Database.getInstance(this)!!.carDAO().listarCarros()
            "modelo" -> carros = Database.getInstance(this)!!.carDAO().listarModelo()
            "marca" -> carros = Database.getInstance(this)!!.carDAO().listarMarca()
            "ano" -> carros = Database.getInstance(this)!!.carDAO().listarAno()
        }

        val listaAdaptada = ArrayAdapter(this, android.R.layout.simple_list_item_1, carros)

        val listaCarros = findViewById<ListView>(R.id.listCarros)

        listaCarros.adapter = listaAdaptada
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main_ac, menu)

        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.ordModelo -> {
                atualizarLista("modelo")
                return super.onOptionsItemSelected(item)
            }
            R.id.ordAno -> {
                atualizarLista("ano")
                return super.onOptionsItemSelected(item)
            }
            R.id.ordMarca -> {
                atualizarLista("marca")
                return super.onOptionsItemSelected(item)
            }

            else -> {
                atualizarLista("id")
                return super.onOptionsItemSelected(item)}
        }
    }


}
