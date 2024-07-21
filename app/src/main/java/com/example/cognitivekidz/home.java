package com.example.cognitivekidz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //therapy page navigation
        ImageView imageTherapy=findViewById(R.id.imageView6);
        TextView therapyTv=findViewById(R.id.textView9);
        therapyTv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, therapy.class);
                startActivity(intent);
            }});
        imageTherapy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, therapy.class);
                startActivity(intent);
            }
        });

        //consultation page navigation
        ImageView imageConsult=findViewById(R.id.imageView7);
        TextView consultTv=findViewById(R.id.textView23);
        consultTv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, counsultation.class);
                startActivity(intent);
            }});
        imageConsult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, counsultation.class);
                startActivity(intent);
            }
        });

        //activities page navigation
        ImageView imageactivity= findViewById(R.id.imageView8);
        TextView activityTv=findViewById(R.id.textView24);
        activityTv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, activity.class);
                startActivity(intent);
            }});

        imageactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, activity.class);
                startActivity(intent);
            }
        });

        //todopage navigation
        ImageView imageTodo=findViewById(R.id.imageView15);
        TextView todoTv=findViewById(R.id.textView25);
        todoTv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, todo.class);
                startActivity(intent);
            }});
        imageTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, todo.class);
                startActivity(intent);
            }
        });


        //my activity navigation
        ImageView imageMyAct=findViewById(R.id.imageView10);
        TextView myactTv=findViewById(R.id.textView12);
        myactTv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, MyActivity.class);
                startActivity(intent);
            }});
        imageMyAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, MyActivity.class);
                startActivity(intent);
            }
        });

        //profile
        ImageView imageProfile=findViewById(R.id.imageView9);
        TextView profileTv=findViewById(R.id.textView11);
        profileTv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, profile.class);
                startActivity(intent);
            }});
        imageProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, profile.class);
                startActivity(intent);
            }
        });

        //feedback
        ImageView imageFeedback=findViewById(R.id.imageView12);
        TextView feedbackTv=findViewById(R.id.textView14);
        imageFeedback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, feedback.class);
                startActivity(intent);
            }});
        feedbackTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, feedback.class);
                startActivity(intent);
            }
        });

        // 3lines navigation
        ImageView imageLines=findViewById(R.id.imageView);
        imageLines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(home.this, lines.class);
                startActivity(intent);
            }
        });
        //rewards
        ImageView imageReward= findViewById(R.id.imageView16);
        TextView rewardTv=findViewById(R.id.textView27);
        imageReward.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, rewards.class);
                startActivity(intent);
            }});
        rewardTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, rewards.class);
                startActivity(intent);
            }
        });

        //report
        ImageView imageReport=findViewById(R.id.imageView17);
        TextView reportTv=findViewById(R.id.textView29);
        imageReport.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, report.class);
                startActivity(intent);
            }});
        reportTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, report.class);
                startActivity(intent);
            }
        });

        //chatbot
        ImageView imageChatbot = findViewById(R.id.imageView13);
        TextView chatbotTv = findViewById(R.id.textView15);

        // Set onClickListener for imageView13
        imageChatbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Direct link to open in Google
                String url = "https://kesha09.000webhostapp.com/chatbot/index.html";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
                finish();
            }
        });

        chatbotTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://kesha09.000webhostapp.com/chatbot/index.html";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
                finish(); // This will close the current activity and return to the previous one
            }
        });
    }
}