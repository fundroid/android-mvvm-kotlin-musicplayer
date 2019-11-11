package com.techtray.muzik.ui.song

import androidx.lifecycle.MutableLiveData
import android.util.Log
import com.techtray.muzik.base.BaseViewModel
import com.techtray.muzik.model.Song

class SongViewModel: BaseViewModel() {

//    companion object {
//        @JvmStatic @BindingAdapter("bind:imageUrl")
//        fun loadImage(view: ImageView, url: String) {
//            Log.d("test", "url : from image view : $url")
//            Glide.with(view.context).load(url).into(view)
//        }
//    }
    private val songTitle = MutableLiveData<String>()
    private val songArtists = MutableLiveData<String>()
    private val songUrl = MutableLiveData<String>()
    private val songImage = MutableLiveData<String>()

    fun bind(song: Song) {
        Log.d("test", "-----------  "+ song.song)
        songTitle.value = song.song
        songArtists.value = song.artists
        songUrl.value = song.url
        songImage.value = song.cover_image
    }

    fun getSongTitle():MutableLiveData<String>{
        return songTitle
    }

    fun getSongArtists():MutableLiveData<String>{
        return songArtists
    }
    fun getSongUrl():MutableLiveData<String>{
        return songUrl
    }

    fun getSongImage():MutableLiveData<String>{
        return songImage
    }


}