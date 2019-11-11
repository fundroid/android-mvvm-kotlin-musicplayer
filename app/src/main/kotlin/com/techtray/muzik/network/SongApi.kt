package com.techtray.muzik.network

import io.reactivex.Observable
import com.techtray.muzik.model.Song
import retrofit2.http.GET

/**
 * The interface which provides methods to get result of webservices
 */
interface SongApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("/studio")
    fun getPosts(): Observable<List<Song>>
}