package com.firebaseapp.charlieandroidblog.hilt_example.di

import com.firebaseapp.charlieandroidblog.hilt_example.domain.MyCustomObject
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)  //wtf..
object HiltModule {

    @Provides
    @Singleton
    @Named("myObject")
    fun providesMyObject(): MyCustomObject {
        return MyCustomObject("injected cad",1313)
    }

}

//@Module
//@TestInstallIn(components = [SingletonComponent::class], replaces = [MyCustomObject::class])
//interface FakeDataServiceModule {
//    @Binds
//    fun bind(impl: FakeDataService): DataService
//}
