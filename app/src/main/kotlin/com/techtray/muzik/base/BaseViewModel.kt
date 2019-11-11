package com.techtray.muzik.base

import androidx.lifecycle.ViewModel
import com.techtray.muzik.injection.component.DaggerViewModelInjector
import com.techtray.muzik.injection.component.ViewModelInjector
import com.techtray.muzik.injection.module.NetworkModule
import com.techtray.muzik.ui.song.SongListViewModel
import com.techtray.muzik.ui.song.SongViewModel

abstract class BaseViewModel:ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is SongListViewModel -> injector.inject(this)
            is SongViewModel -> injector.inject(this)
        }
    }
}