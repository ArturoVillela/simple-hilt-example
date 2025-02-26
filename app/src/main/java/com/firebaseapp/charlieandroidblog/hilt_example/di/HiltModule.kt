package com.firebaseapp.charlieandroidblog.hilt_example.di

import com.firebaseapp.charlieandroidblog.hilt_example.domain.MyCustomObject
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)  //wtf..
object HiltModule {

    @Provides
    @Named("myObject")
    fun providesMyObject(): MyCustomObject {
        return MyCustomObject("cad injected 123!!!",1313)
    }
}