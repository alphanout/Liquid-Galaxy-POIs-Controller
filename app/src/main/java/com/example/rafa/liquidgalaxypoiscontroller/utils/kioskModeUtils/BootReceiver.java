package com.example.rafa.liquidgalaxypoiscontroller.utils.kioskModeUtils;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.rafa.liquidgalaxypoiscontroller.LGPC;

/**
 * Created by lqwork on 1/08/16.
 */

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent myIntent = new Intent(context, LGPC.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(myIntent);
    }

}
