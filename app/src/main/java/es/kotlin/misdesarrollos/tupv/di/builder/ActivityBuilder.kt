package es.kotlin.misdesarrollos.tupv.di.builder

import dagger.Module
import es.kotlin.misdesarrollos.tupv.SplashActivity
import dagger.android.ContributesAndroidInjector



@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = arrayOf(SplashActivityModule::class))
    abstract fun bindSplashActivity(): SplashActivity
}