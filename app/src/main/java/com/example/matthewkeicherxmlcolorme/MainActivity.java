package com.example.matthewkeicherxmlcolorme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Create buttons
    private Button btnRed, btnGreen, btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set view to buttons with resource ID
        btnRed = findViewById(R.id.btnRed);
        btnGreen = findViewById(R.id.btnGreen);
        btnBlue = findViewById(R.id.btnBlue);

        // Set event listeners for when buttons are pressed
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColorAndShowToast(btnRed, R.color.colorRed);
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColorAndShowToast(btnGreen, R.color.colorGreen);
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColorAndShowToast(btnBlue, R.color.colorBlue);
            }
        });
    }

    // Method taht changes a button's background color and shows a Toast message
    private void changeColorAndShowToast(Button button, int colorResId) {
        int color = getResources().getColor(colorResId);
        button.setBackgroundColor(color);
        showToast(button.getText() + " button pressed");
    }

    // Method that shows a short-term Toast message
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}