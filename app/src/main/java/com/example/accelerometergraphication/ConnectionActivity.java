package com.example.accelerometergraphication;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ConnectionActivity extends AppCompatActivity {
    TextView deviceNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);
        final Intent intent = getIntent();
        final BluetoothDevice device = intent.getParcelableExtra("Example item");

        deviceNameTextView = findViewById(R.id.device_name);

        deviceNameTextView.setText("Device Name: " + device.getName());

    }
}