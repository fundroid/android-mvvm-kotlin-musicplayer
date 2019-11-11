package com.techtray.muzik.injection.component

import dagger.Component
import com.techtray.muzik.injection.module.NetworkModule
import com.techtray.muzik.ui.song.SongListViewModel
import com.techtray.muzik.ui.song.SongViewModel
import javax.inject.Singleton

/**
 * Component providing inject() methods for presenters.
 */
@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {
    /**
     * Injects required dependencies into the specified SongListViewModel.
     * @param postListViewModel SongListViewModel in which to inject the dependencies
     */
    fun inject(postListViewModel: SongListViewModel)
    /**
     * Injects required dependencies into the specified SongViewModel.
     * @param postViewModel SongViewModel in which to inject the dependencies
     */
    fun inject(postViewModel: SongViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}