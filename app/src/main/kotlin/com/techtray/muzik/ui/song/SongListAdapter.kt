package com.techtray.muzik.ui.song

import android.util.Log
import androidx.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.techtray.muzik.R
import com.techtray.muzik.databinding.ItemSongBinding
import com.techtray.muzik.model.Song

class SongListAdapter: RecyclerView.Adapter<SongListAdapter.ViewHolder>() {
    private lateinit var songList:List<Song>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemSongBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_song, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val song = songList[position]
//        holder.itemMain.setOnClickListener {
            Log.d("test", "clicked -- - - - - - -- - -" + position)
//            selectedPosition = position
//            listner.onGameClick(game)
//        }
        holder.bind(song)
    }

    override fun getItemCount(): Int {
        return if(::songList.isInitialized) songList.size else 0
    }

    fun updateSongList(songList:List<Song>){
        this.songList = songList
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: ItemSongBinding): RecyclerView.ViewHolder(binding.root){
        private val viewModel = SongViewModel()

//        val itemMain = binding.itemMain

        fun bind(song: Song){
            viewModel.bind(song)
            binding.viewModel = viewModel
        }
    }
}