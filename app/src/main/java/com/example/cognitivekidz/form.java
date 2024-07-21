package com.example.cognitivekidz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;

public class form extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            // Open the link in a web browser
            String url = "https://forms.gle/EkeV1hDyA7d9ipy56";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

        CheckBox check1 = findViewById(R.id.checkBox2);
        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Intent intent = new Intent(form.this, login.class);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Check if the app was launched from the custom URL scheme
        Uri data = getIntent().getData();
        if (data != null && "home".equals(data.getScheme())) {
            // Redirect to the home page of your app
            Intent intent = new Intent(this, login.class);
            startActivity(intent);
            finish(); // Close the current activity to prevent going back to the form
        }
    }
}
