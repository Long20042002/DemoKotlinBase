package com.prox.demokolingst.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.prox.demokolingst.PhuongTien

@Database(
    entities = [PhuongTien::class],
    exportSchema = false,
    version = 1
)
abstract class PhuongTienDatabase : RoomDatabase() {
    companion object {
        private val DATABASE_NAME = "alarm.db"
        private var instance: PhuongTienDatabase? = null

        @Synchronized
        fun getInstance(context: Context): PhuongTienDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    PhuongTienDatabase::class.java,
                    DATABASE_NAME
                )
                    .allowMainThreadQueries()
                    .build()
            }
            return instance!!
        }
    }

    abstract fun phuongTienDao(): PhuongTienDao
}