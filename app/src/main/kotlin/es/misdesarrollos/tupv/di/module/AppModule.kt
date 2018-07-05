package es.kotlin.misdesarrollos.tupv.di.module

import dagger.Module
import dagger.Provides
import es.kotlin.misdesarrollos.tupv.App
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideContext(app: App)= app.applicationContext

}