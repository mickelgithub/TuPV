package es.kotlin.misdesarrollos.tupv.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import es.kotlin.misdesarrollos.tupv.TupvApp


interface AppComponent {

    fun inject(app: TupvApp)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

}