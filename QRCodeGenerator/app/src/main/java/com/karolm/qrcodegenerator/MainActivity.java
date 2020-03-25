package com.karolm.qrcodegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.BitSet;

public class MainActivity extends AppCompatActivity {

    Button generateButton;
    EditText inputToEncode;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inputToEncode =
            (EditText) findViewById(R.id.inputToEncode);

        this.generateButton =
            (Button) findViewById(R.id.generateButton);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            AlphanumericComputing alpha =
                new AlphanumericComputing(inputToEncode.toString());

            // String -> byte[]
            byte[] bytes = inputToEncode.toString().getBytes();
            BitSet bits = new BitSet(bytes.length*8);

            // prepare data to send to next page
            Intent qrResultActivity = new Intent(
                MainActivity.this, QRResultActivity.class);

            qrResultActivity.putExtra("bits_list", bits);

            // open new activity where QR Code
                // is generated for given string
            startActivity(qrResultActivity);
            }
        });

    }
}
