package edu.uw.tacoma.mmuppa.batteryandnetworkmanagementexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BatteryLevelReceiver extends BroadcastReceiver {
    private static final String TAG = "BatteryLevelReceiver";

    public BatteryLevelReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive" + intent.getAction().toString());
    }
}
