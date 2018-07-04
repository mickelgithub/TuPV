package es.kotlin.misdesarrollos.tupv.di.component

import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import es.kotlin.misdesarrollos.tupv.TupvApp
import es.kotlin.misdesarrollos.tupv.di.builder.ActivityBuilder
import es.kotlin.misdesarrollos.tupv.di.module.AppModule
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityBuilder::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(tupvApp: TupvApp): Builder

        fun build(): AppComponent
    }

    fun inject(app: TupvApp)

}