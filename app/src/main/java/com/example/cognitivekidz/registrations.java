package com.example.cognitivekidz;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class registrations extends AppCompatActivity {

    private EditText nameEditText, emailEditText, passwordEditText;
    private String current = "";
    private String ddmmyyyy = "DDMMYYYY";
    private String ddmmyyyyWithSlashes = "DD/MM/YYYY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrations);

        nameEditText = findViewById(R.id.name);
        emailEditText = findViewById(R.id.emaiL);
        passwordEditText = findViewById(R.id.pass);

        TextView textView = findViewById(R.id.textView1);
        Button signUpButton = findViewById(R.id.sign);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(nameEditText.getText().toString().trim()) ||
                        TextUtils.isEmpty(passwordEditText.getText().toString().trim()) ||
                        TextUtils.isEmpty(emailEditText.getText().toString().trim())) {
                    // Display toast message to fill in the information
                    Toast.makeText(registrations.this, "Please fill in all the information", Toast.LENGTH_SHORT).show();
                } else {
                    // All fields are filled, proceed with the login process
                    Intent intent = new Intent(registrations.this, Consent.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                }
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registrations.this, login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });

        String name = nameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            Toast.makeText(registrations.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent(registrations.this, Consent.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent) ;
        finish();

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click on sign up button
                // For example, navigate to login activity
                Intent intent = new Intent(registrations.this, Consent.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });

        EditText passEditText = findViewById(R.id.pass);
        passEditText.addTextChangedListener(new TextWatcher() {
            private String current;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().equals(current)) {
                    String cleanString = s.toString().replaceAll("[^\\d]", "");

                    String cleanC = current.replaceAll("[^\\d]", "");

                    int cl = cleanString.length();
                    int sel = cl;
                    for (int i = 2; i <= cl && i < 6; i += 2) {
                        sel++;
                    }
                    //Fix for pressing delete next to a forward slash
                    if (cleanString.equals(cleanC)) sel--;

                    if (cleanString.length() < 8) {
                        cleanString = cleanString + ddmmyyyy.substring(cleanString.length());
                    } else {
                        int day = Integer.parseInt(cleanString.substring(0, 2));
                        int mon = Integer.parseInt(cleanString.substring(2, 4));
                        int year = Integer.parseInt(cleanString.substring(4, 8));

                        if (mon > 12) mon = 12;
                        if (day > 31) day = 31;
                        year = Math.min(year, Calendar.getInstance().get(Calendar.YEAR));

                        cleanString = String.format("%02d%02d%02d", day, mon, year);
                    }

                    cleanString = String.format("%s/%s/%s", cleanString.substring(0, 2),
                            cleanString.substring(2, 4),
                            cleanString.substring(4, 8));

                    sel = Math.max(sel, 0);
                    current = cleanString;
                    passEditText.setText(current);
                    passEditText.setSelection(Math.min(sel, current.length()));
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
