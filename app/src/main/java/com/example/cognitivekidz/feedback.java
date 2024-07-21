package com.example.cognitivekidz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class feedback extends AppCompatActivity {

    private EditText experienceInput, suggestionInput;
    private RatingBar ratingBar;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        // Initialize Views
        experienceInput = findViewById(R.id.experience_input);
        suggestionInput = findViewById(R.id.suggestion_input);
        ratingBar = findViewById(R.id.rating_bar);
        submitButton = findViewById(R.id.submit_button);

        // Submit Button Click Listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get feedback details
                String experience = experienceInput.getText().toString().trim();
                String suggestion = suggestionInput.getText().toString().trim();
                float rating = ratingBar.getRating();

                // Validate and process feedback
                if (!experience.isEmpty() && !suggestion.isEmpty()) {
                    // Here you can send the feedback to your backend or process it as needed

                    // Show Thank You message
                    showThankYouDialog();

                } else {
                    Toast.makeText(feedback.this, "Please fill in all fields.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Method to show Thank You dialog
    private void showThankYouDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Thank You!")
                .setMessage("Your feedback has been submitted. We appreciate your input.")
                .setPositiveButton("OK", null); // Set positive button to close dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
