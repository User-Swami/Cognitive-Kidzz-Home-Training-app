package com.example.cognitivekidz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class lines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lines);
    }

    // Click listener for the Settings option
    public void onSettingsClick(View view) {
        // Add code to handle Settings click
        Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
    }

    public void onHelpClick(View view) {

        Toast.makeText(this, "Help clicked", Toast.LENGTH_SHORT).show();

        String[] addresses = {"cognitivekidzhometraining@gmail.com"}; // Change this to your support email
        composeEmail(addresses, "Help needed", "Hello,\n\nI need help with...");
    }

    // Method to compose email
    public void composeEmail(String[] addresses, String subject, String message) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // Only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    }



