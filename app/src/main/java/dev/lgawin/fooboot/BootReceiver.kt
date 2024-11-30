package dev.lgawin.fooboot

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class BootReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.d("gawluk", "onReceive: $intent")
        if (intent.action == Intent.ACTION_BOOT_COMPLETED) {
            Log.d("gawluk", "ACTION_BOOT_COMPLETED received")
            // TODO
        }
    }
}
