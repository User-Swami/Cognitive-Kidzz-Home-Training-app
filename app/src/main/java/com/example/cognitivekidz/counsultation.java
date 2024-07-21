package com.example.cognitivekidz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class counsultation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counsultation);

        Button pay1=findViewById(R.id.pay1);
        Button pay2=findViewById(R.id.pay2);
        Button pay3=findViewById(R.id.pay3);
        Button pay4=findViewById(R.id.pay4);
        Button pay5=findViewById(R.id.pay5);
        Button pay6=findViewById(R.id.pay6);

        pay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(counsultation.this , payment.class);
                startActivity(intent);
            }
        });
        pay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(counsultation.this , payment.class);
                startActivity(intent);
            }
        });
        pay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(counsultation.this , payment.class);
                startActivity(intent);
            }
        });
        pay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(counsultation.this , payment.class);
                startActivity(intent);
            }
        });
        pay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(counsultation.this , payment.class);
                startActivity(intent);
            }
        });
        pay6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(counsultation.this , payment.class);
                startActivity(intent);
            }
        });

    }
}