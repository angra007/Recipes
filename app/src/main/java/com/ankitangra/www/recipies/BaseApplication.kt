package com.ankitangra.www.recipies

import android.app.Application
import com.ankitangra.www.recipies.di.AppComponent
import com.ankitangra.www.recipies.di.DaggerAppComponent

class BaseApplication : Application() {

    lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()
        initAppComponent()
    }

    private fun initAppComponent () {
        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
    }

}