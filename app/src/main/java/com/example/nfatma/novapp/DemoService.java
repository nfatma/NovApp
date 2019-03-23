package com.example.nfatma.novapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class DemoService extends Service {


    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Toast t = Toast.makeText(this, "service Created", Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Toast t = Toast.makeText(this, "service Destroyed", Toast.LENGTH_SHORT);
        t.show();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast t = Toast.makeText(this, "service running", Toast.LENGTH_SHORT);
        t.show();
        return super.onStartCommand(intent, flags, startId);
    }
}
