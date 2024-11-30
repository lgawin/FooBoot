package dev.lgawin.fooboot

import android.app.Application
import android.util.Log

class FooApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d("gawluk", "onCreate")
    }
}
