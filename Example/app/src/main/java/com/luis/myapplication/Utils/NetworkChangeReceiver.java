package com.luis.myapplication.Utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class NetworkChangeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, final Intent intent) {

        int status = NetworkUtil.getConnectivityStatusString(context);
        Log.e("NETWORK_HERE", "Network change");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (status == NetworkUtil.NETWORK_STATUS_NOT_CONNECTED) {
                Log.d("NETWORK_RECEIVER","Not connected");
                Toast.makeText(context,"NO CONNECTION",Toast.LENGTH_LONG).show();
            } else {
                Log.d("NETWORK_RECEIVER","Connected");
                Toast.makeText(context,"CONNECTED",Toast.LENGTH_LONG).show();

            }
        }
    }
}
