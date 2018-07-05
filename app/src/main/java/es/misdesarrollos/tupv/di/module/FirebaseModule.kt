package es.misdesarrollos.tupv.di.module

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FirebaseModule {

    @Provides
    @Singleton
    fun provideFirebaseAuth()=  FirebaseAuth.getInstance()

    @Provides
    @Singleton
    fun provideFirebaseDatabase()= FirebaseDatabase.getInstance()

}