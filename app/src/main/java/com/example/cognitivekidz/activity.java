package com.example.cognitivekidz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity extends AppCompatActivity {
    private Button playButton1;
    private Button playButton2;
    private Button playButton3;
    private Button playButton4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act);

        playButton1 = findViewById(R.id.numbergame);

        playButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the link in a web browser
                String url = "https://cognitivekidz.000webhostapp.com/Games/Counting%20Game/"; // Replace "https://yourlink.com" with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        playButton2 = findViewById(R.id.colouringgame);
        playButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the link in a web browser
                String url = "https://cognitivekidz.000webhostapp.com/Games/LearnColors/"; // Replace "https://yourlink.com" with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        playButton3= findViewById(R.id.sequenceSort);
        playButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the link in a web browser
                String url = "https://cognitivekidz.000webhostapp.com/Games/Sequencing%20Tasks%20Game/"; // Replace "https://yourlink.com" with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        playButton4= findViewById(R.id.wordgame);
        playButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the link in a web browser
                String url = "https://cognitivekidz.000webhostapp.com/Games/WordBuilder/"; // Replace "https://yourlink.com" with your desired URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
