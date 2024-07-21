package com.example.cognitivekidz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class profile extends AppCompatActivity {

    private ImageView profilePicture;
    private TextView nameText, ageText, emailText, phoneText;
    private Button saveButton, editButton;
    private TextView generalText, personalizationText, helpText, notificationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Initialize Views
        profilePicture = findViewById(R.id.profile_picture);
        nameText = findViewById(R.id.name_text);
        ageText = findViewById(R.id.age_text);
        emailText = findViewById(R.id.email_text);
        phoneText = findViewById(R.id.phone_text);
        saveButton = findViewById(R.id.save_button);
        editButton = findViewById(R.id.edit_button);
        generalText = findViewById(R.id.general_text);
        personalizationText = findViewById(R.id.personalization_text);
        helpText = findViewById(R.id.help_text);
        notificationText = findViewById(R.id.notification_text);

        // Set initial values
        profilePicture.setImageResource(R.drawable.profile);
        nameText.setText("ABC");
        ageText.setText("Age: 7");
        emailText.setText("abc@email.com");
        phoneText.setText("+91 1234567890");

        // Save Button Click Listener
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Save profile changes
                Toast.makeText(profile.this, "Profile saved!", Toast.LENGTH_SHORT).show();
            }
        });

        // Edit Button Click Listener
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to edit profile activity
                // For now, show a toast message
                Toast.makeText(profile.this, "Edit profile clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        // Section Click Listeners
        generalText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to general section
                Toast.makeText(profile.this, "GENERAL Section!", Toast.LENGTH_SHORT).show();
            }
        });

        personalizationText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to personalization section
                Toast.makeText(profile.this, "Personalization Section!", Toast.LENGTH_SHORT).show();
            }
        });

        helpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to help section
                Toast.makeText(profile.this, "Help Section!", Toast.LENGTH_SHORT).show();
            }
        });

        notificationText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to notification section
                Toast.makeText(profile.this, "Notification Section!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
