package com.example.lekshmi.kwa_new;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent) {
       Toast.makeText(context, "ALARM", Toast.LENGTH_LONG).show();
       AppUtils.makeCall(context);
    }

}
