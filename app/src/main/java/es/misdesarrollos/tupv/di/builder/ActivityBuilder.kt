package es.misdesarrollos.tupv.di.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import es.misdesarrollos.tupv.ui.splash.SplashActivity
import es.misdesarrollos.tupv.ui.splash.SplashActivityModule


@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [SplashActivityModule::class])
    abstract fun bindSplashActivity(): SplashActivity
}