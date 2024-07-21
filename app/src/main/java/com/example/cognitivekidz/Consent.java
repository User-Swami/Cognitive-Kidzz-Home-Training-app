package com.example.cognitivekidz;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class Consent extends AppCompatActivity {
    private CheckBox btnCheckbox;
    private static final int REQUEST_CODE_GOOGLE_FORM = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consent);

        TextView textView = findViewById(R.id.textView28);

        String consentText = "<p>This consent form seeks approval for your child to use a mobile " +
                "application designed for home retraining of children with cognitive " +
                "developmental disabilities. The application offers various engaging " +
                "exercises tailored to improve specific cognitive skills through interactive " +
                "content.</p>" +
                "<p>Participation involves regular supervised use of the app, " +
                "completion of cognitive exercises, and interaction with adaptive learning " +
                "technologies suited to your child’s pace and preferences. To minimize potential risks such as eye strain and decreased physical " +
                "activity, recommended practices include setting time limits, taking regular " +
                "breaks, and engaging in varied exercises.</p>" +
                 "<p>Benefits of using the app include enhanced cognitive skills, increased " +
                "motivation, and a personalized learning experience. Your child’s privacy " +
                "will be safeguarded, with all collected information securely stored and " +
                "used only to enhance the learning experience.</p>";

        textView.setText(Html.fromHtml(consentText));

        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Consent.this, form.class);
                startActivity(intent);
            }});
    }}
