package com.example.admin.week7daily3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    private TextView tvScanFormat;
    private TextView tvScanContent;
    private Button btnScanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.plant(new Timber.DebugTree());
    }


    public void onScannerPressed(View view) {
        //Intent intent = new Intent(this, ScannerActivity.class);
        //startActivity(intent);
        new IntentIntegrator(this).initiateScan();
    }
}
