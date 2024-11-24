package com.example.roomapplicationaula

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Car(
    var marca: String,
    var modelo: String,
    var placa: String,
    var ano: Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int?
) : Serializable {

    override fun toString(): String {
        return "$id Marca: $marca | Modelo: $modelo | Placa: $placa | Ano: $ano"
    }
}



