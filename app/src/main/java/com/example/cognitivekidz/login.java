package com.example.cognitivekidz;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class login extends AppCompatActivity {

    private EditText emailEditText, passsEditText;
    private String current = "";
    private String ddmmyyyy = "DDMMYYYY";
    private String ddmmyyyyWithSlashes = "DD/MM/YYYY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button loginButton = findViewById(R.id.sign);
        emailEditText = findViewById(R.id.emaiLs);
        passsEditText = findViewById(R.id.passs);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if any EditText field is empty
                if (isEditTextEmpty(emailEditText) || isEditTextEmpty(passsEditText)) {
                    // Display toast message to fill in the information
                    Toast.makeText(login.this, "Please fill in all the information", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(login.this, home.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                }
            }
        });

        passsEditText.addTextChangedListener(new TextWatcher() {
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
                        //This part makes sure that when we finish entering numbers
                        //the date is correct, fixing it otherwise
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
                    passsEditText.setText(current);
                    passsEditText.setSelection(Math.min(sel, current.length()));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        emailEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // This method is intentionally left blank
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // This method is intentionally left blank
            }
            @Override
            public void afterTextChanged(Editable s) {
                String emailInput = s.toString().trim();

                // Limit the length of the input to at most 20 characters at the beginning
                if (emailInput.length() > 20) {
                    emailInput = emailInput.substring(0, 20);
                    emailEditText.setText(emailInput);
                    emailEditText.setSelection(emailInput.length());
                }
            }
        });
    }

    // Method to check if an EditText field is empty
    private boolean isEditTextEmpty(EditText editText) {
        return editText.getText().toString().trim().isEmpty();
    }
}
