package com.example.absensiqu.database

import androidx.room.Database
import com.example.absensiqu.model.ModelDatabase
import androidx.room.RoomDatabase
import com.example.absensiqu.database.dao.DatabaseDao

@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}