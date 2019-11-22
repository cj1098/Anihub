package com.example.anihub.di

import android.app.Application
import android.content.Context
import com.example.anihub.AniHubApplication
import com.example.anihub.MainActivity
import com.example.anihub.di.modules.ApiModule
import com.example.anihub.di.modules.AppModule
import com.example.anihub.di.modules.CacheModule
import com.example.anihub.di.modules.ContextModule
import com.example.anihub.ui.anime.list.AnimeListFragment
import com.example.anihub.ui.anime.shared.AnimeSharedViewModel
import com.example.anihub.ui.anime.ViewModelFactory
import com.example.anihub.ui.anime.detail.AnimeActivity
import com.example.anihub.ui.anime.detail.AnimeDetailFragment
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Component(
    modules = [CacheModule::class, AppModule::class, ApiModule::class, ContextModule::class])
@Singleton
interface AppComponent{

    fun inject(myApplication: AniHubApplication)
    fun inject(mainActivity: MainActivity)
    fun inject(animeListFragment: AnimeListFragment)
    fun inject(animeSharedViewModel: AnimeSharedViewModel)
    fun inject(viewModelFactory: ViewModelFactory)
    fun inject(animeFragment: AnimeActivity)
    fun inject(animeDetailFragment: AnimeDetailFragment)
}