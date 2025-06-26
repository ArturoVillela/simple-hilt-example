package com.firebaseapp.charlieandroidblog.hilt_example.di

import com.firebaseapp.charlieandroidblog.hilt_example.domain.MyCustomObject
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Named
import javax.inject.Singleton

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [HiltModule::class]
)
object TestHiltModule {

    @Provides
    @Singleton
    @Named("myObject")
    fun providesTestMyObject(): MyCustomObject {
        return MyCustomObject("HelloFromTest", 9999)
    }
}