package com.example.roomapplicationaula
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

@androidx.room.Database(entities = [Car::class], version = 1)
abstract class Database : RoomDatabase() {
    abstract fun carDAO(): CarDAO

    companion object {
        private var database: Database? = null

        fun getInstance(context: Context): Database? {
            if (database == null) {
                return createDB(context)
            }
            return database
        }

        private fun createDB(context: Context): Database? {
            return Room.databaseBuilder(context, Database::class.java, "CARROS").allowMainThreadQueries().build()
        }

    }


}