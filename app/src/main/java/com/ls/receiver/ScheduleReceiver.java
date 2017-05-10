package com.ls.receiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.WakefulBroadcastReceiver;

import com.ls.utils.L;

public class ScheduleReceiver extends WakefulBroadcastReceiver {
    public ScheduleReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        L.e("ScheduleReceiver");
        Uri data = intent.getData();
        if (data != null && data.isHierarchical()) {
            String uri = intent.getDataString();
            com.ls.util.L.e("ScheduleReceiver Deep link clicked " + uri);

            throw new UnsupportedOperationException("Not yet implemented");
        }
    }
}
