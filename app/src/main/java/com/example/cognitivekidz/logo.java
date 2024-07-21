package com.example.cognitivekidz;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class logo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        int delayMillis = 2000;
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(logo.this, registrations.class);
                startActivity(intent);
                finish();
            }
        }, delayMillis);
    }
}