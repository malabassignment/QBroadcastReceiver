package com.juwmonitaskapp.q_broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // broadcast a custom intent.

    public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("com.juwmonitaskap.CUSTOM_INTENT");
        sendBroadcast(intent);

    }
}