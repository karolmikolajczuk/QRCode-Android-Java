package com.karolm.qrcodegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.BitSet;

public class QRResultActivity extends AppCompatActivity {

    Bitmap bitmapQR;
    LinearLayout bitmapLay;
    BitSet bits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrresult);

        this.bits = (BitSet)
            getIntent().
            getExtras().
            get("bits_list");

        this.bitmapLay =
            (LinearLayout) findViewById(R.id.bitmapLay);

        this.bitmapQR = Bitmap.
            createBitmap(/*width, hight, whole white*/);


        this.bitmapLay.addView(this.bitmapQR);
        // create this bitmap
        // frames 3 squares with specific size
        // bits 1 0 1 0 says if black or white square ??

    }
}