package com.example.admin.week7daily3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import com.google.zxing.integration.android.*;

public class ScannerActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null) {
            if(result.getContents() == null) {
//cancel
            } else {
//Scanned successfully
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.ONE_D_CODE_TYPES);
        integrator.setPrompt("Scan a barcode");
        integrator.setCameraId(0);  // Use a specific camera of the device
        integrator.setBeepEnabled(false);
        integrator.setBarcodeImageEnabled(true);
        integrator.initiateScan();
        if(result != null) {
            if(result.getContents() == null) {
//cancel
            } else {
//Scanned successfully
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }

    }

}
