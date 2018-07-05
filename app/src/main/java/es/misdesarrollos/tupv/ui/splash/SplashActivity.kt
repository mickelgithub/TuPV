package es.misdesarrollos.tupv.ui.splash

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import dagger.android.AndroidInjection
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {

    @Inject
    lateinit var mFirebaseDatabase: FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState)
        postDelay(5000)



    }

    fun postDelay(delay: Long) {
        val handler= Handler()
        handler.postDelayed({
            if (mFirebaseDatabase== null) {
                Log.d("SplashActivity", "es null firebasedb.....")
            } else {
                Log.d("SplashActivity", "es NOT null firebasedb.....")
            }
            Toast.makeText(this, "Holaaaaa", Toast.LENGTH_LONG).show()
        }, delay)

    }
}
