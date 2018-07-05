package es.kotlin.misdesarrollos.tupv

import android.app.Activity
import android.app.Application
import android.util.Log
import com.google.firebase.database.FirebaseDatabase
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import es.kotlin.misdesarrollos.tupv.di.component.AppComponent
import es.kotlin.misdesarrollos.tupv.di.component.DaggerAppComponent
import javax.inject.Inject

class App: Application(), HasActivityInjector {

    lateinit var appComponent: AppComponent

    @Inject
    lateinit var mFirebaseDatabase: FirebaseDatabase


    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityDispatchingAndroidInjector
    }

    override fun onCreate() {
        super.onCreate()

        appComponent= DaggerAppComponent.builder()
                .application(this)
                .build()

        appComponent.inject(this)

        Log.d(TAG, mFirebaseDatabase.toString())

    }

    companion object {

        const val TAG: String = "App"
    }
}