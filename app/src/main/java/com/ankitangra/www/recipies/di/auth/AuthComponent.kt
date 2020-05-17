package com.ankitangra.www.recipies.di.auth

import com.ankitangra.www.recipies.ui.auth.AuthActivity
import dagger.Subcomponent

@Subcomponent (
    modules = [
        AuthModule::class,
        AuthViewModuleModule::class
    ]
)
interface AuthComponent {


    @Subcomponent.Factory
    interface Factory {
        fun create () : AuthComponent
    }

    fun inject (authActivity : AuthActivity)
}