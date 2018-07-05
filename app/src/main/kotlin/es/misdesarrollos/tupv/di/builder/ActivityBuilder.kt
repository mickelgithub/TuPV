package es.kotlin.misdesarrollos.tupv.di.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import es.kotlin.misdesarrollos.tupv.ui.splash.SplashActivity
import es.kotlin.misdesarrollos.tupv.ui.splash.SplashActivityModule


@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [SplashActivityModule::class])
    abstract fun bindSplashActivity(): SplashActivity
}