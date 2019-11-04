package com.luis.myapplication

import android.app.Application
import android.app.IntentService
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.util.Log
import android.widget.Toast
import com.luis.myapplication.Utils.NetworkChangeReceiver
import com.luis.myapplication.Utils.NetworkUtil
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

class App : Application() {
    val net = NetworkChangeReceiver()
    override fun onCreate() {
        super.onCreate()

        Log.d("NETWORK_LISTENER", "${net.resultCode}")
        if(NetworkUtil.getConnectivityStatus(this@App) == 0){
            Log.d("NETWORK_LISTENER", "NOT CONNECTED")
        }else{
            Log.d("NETWORK_LISTENER", "CONNECTED")
        }
    }
}