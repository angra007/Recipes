package com.ankitangra.www.recipies.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component

@Component
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application (application: Application) : Builder

        fun build() : AppComponent
    }
}