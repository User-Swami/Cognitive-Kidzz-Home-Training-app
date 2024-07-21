package com.example.cognitivekidz;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        // Get reference to the TableLayout
        TableLayout tableLayout = findViewById(R.id.activitiesTableLayout);

        // Dummy data for past activities
        String[][] pastActivities = {
                {"Therapy Session", "15 Apr", "10 AM", "2 hrs", "9"},
                {"Shape Sorter", "16 Apr", "2 PM", "1 hr 45 min", "7"},
                // Add more past activities here
        };

        // Add past activities dynamically to the table
        for (String[] activity : pastActivities) {
            TableRow row = new TableRow(this);

            // Add TextViews for each column
            for (String value : activity) {
                TextView textView = new TextView(this);
                textView.setText(value);
                textView.setPadding(8, 8, 8, 8);
                row.addView(textView);
            }

            // Add the TableRow to the TableLayout
            tableLayout.addView(row);
        }
    }}
