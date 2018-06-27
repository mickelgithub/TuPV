package es.kotlin.misdesarrollos.tupv.di.module

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideFirebaseAuth()=  FirebaseAuth.getInstance()

    @Provides
    fun provideFirebaseDatabase()= FirebaseDatabase.getInstance()


}