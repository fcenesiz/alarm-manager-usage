package com.fcenesiz.alarmmanagerusage

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log


class AlarmReceiver : BroadcastReceiver() {
    companion object{
        public val TAG: String = AlarmReceiver::class.simpleName.toString()
    }
    override fun onReceive(context: Context?, intent: Intent?) {
        val message = intent?.getStringExtra("EXTRA_MESSAGE") ?: return
        Log.i(TAG, "Alarm triggered: $message")
    }

}