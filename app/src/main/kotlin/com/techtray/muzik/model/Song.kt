package com.techtray.muzik.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Class which provides a model for song
 * @constructor Sets all properties of the song
 * @property song the identifier of the song
 * @property url the identifier of the song link
 * @property artists the artists of the song
 * @property cover_image the cover image of the song
 */
@Entity
data class Song(
        val song: String, @field:PrimaryKey
        val url: String,
        val artists: String,
        val cover_image: String
)