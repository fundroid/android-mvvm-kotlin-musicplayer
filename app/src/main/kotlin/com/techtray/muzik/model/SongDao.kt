package com.techtray.muzik.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SongDao {
    @get:Query("SELECT * FROM song")
    val all: List<Song>

    @Insert
    fun insertAll(vararg users: Song)
}