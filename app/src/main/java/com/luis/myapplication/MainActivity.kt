package com.luis.myapplication

import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luis.myapplication.Utils.NetworkChangeReceiver

class MainActivity : AppCompatActivity() {
    val net = NetworkChangeReceiver()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//
//
//        if(){
//            txt_status.text = "Not Connected"
//        }else{
//            txt_status.text = "Connected"
//        }
    }

    override fun onStart() {
        super.onStart()
        val intent = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        registerReceiver(net,intent)

    }

}
