package com.example.roomapplicationaula

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface CarDAO {
    @Insert
    fun salvar(o: Car)

    @Query ("SELECT * FROM Car ORDER BY marca")
    fun listarMarca(): List<Car>

    @Query ("SELECT * FROM Car ORDER BY modelo")
    fun listarModelo(): List<Car>

    @Query ("SELECT * FROM Car ORDER BY ano")
    fun listarAno(): List<Car>

    @Query ("SELECT * FROM Car")
    fun listarCarros(): List<Car>

    @Delete
    fun deletar(o: Car)

    @Update
    fun atualizar(o: Car)

}