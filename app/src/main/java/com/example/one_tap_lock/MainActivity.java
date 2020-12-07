package com.example.one_tap_lock;

import androidx.appcompat.app.AppCompatActivity;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DevicePolicyManager deviceManager = (DevicePolicyManager) getSystemService(Context. DEVICE_POLICY_SERVICE );
        ComponentName thisApp = new ComponentName(getApplication(), MainActivity.class);
        deviceManager.lockNow();
        System.out.println("Locked");
        finishAffinity();
        System.exit(0);
    }
}