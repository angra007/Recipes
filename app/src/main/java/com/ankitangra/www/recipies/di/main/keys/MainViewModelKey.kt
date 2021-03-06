package com.ankitangra.www.recipies.di.main.keys

import android.text.Annotation
import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@MustBeDocumented
@Target (
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention (AnnotationRetention.RUNTIME)
@MapKey
annotation class MainViewModelKey (val value : KClass<out ViewModel>)