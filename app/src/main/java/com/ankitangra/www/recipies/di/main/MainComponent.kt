package com.ankitangra.www.recipies.di.main

import com.ankitangra.www.recipies.ui.main.MainActivity
import dagger.Subcomponent


@Subcomponent (
    modules = [
        MainModule::class,
        MainViewModelModule::class
    ]
)
interface MainComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create () : MainComponent
    }

    fun inject (mainActivity : MainActivity)
}