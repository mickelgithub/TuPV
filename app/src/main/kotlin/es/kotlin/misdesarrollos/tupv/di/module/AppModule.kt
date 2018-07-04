package es.kotlin.misdesarrollos.tupv.di.module

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideFirebaseAuth()=  FirebaseAuth.getInstance()

    @Provides
    @Singleton
    fun provideFirebaseDatabase()= FirebaseDatabase.getInstance()


}