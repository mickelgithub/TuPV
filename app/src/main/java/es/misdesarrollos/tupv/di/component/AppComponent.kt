package es.misdesarrollos.tupv.di.component

import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import es.misdesarrollos.tupv.App
import es.misdesarrollos.tupv.di.builder.ActivityBuilder
import es.misdesarrollos.tupv.di.module.AppModule
import es.misdesarrollos.tupv.di.module.FirebaseModule
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class, FirebaseModule::class,
    ActivityBuilder::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: App): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)

}