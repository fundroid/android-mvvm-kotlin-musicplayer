package com.techtray.muzik.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.techtray.muzik.model.Song
import com.techtray.muzik.model.SongDao

@Database(entities = [Song::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): SongDao
}