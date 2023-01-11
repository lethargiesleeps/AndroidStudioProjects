package com.example.cst2335.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button plusButton;
    Button minusButton;
    TextView number;
    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plusButton = findViewById(R.id.button_plus);
        minusButton = findViewById(R.id.button_minus);
        number = findViewById(R.id.counter_text);
        value = 0;

        plusButton.setOnClickListener( c -> {
            value++;
            number.setText(String.format("%d", value));
        });

        minusButton.setOnClickListener( c -> {
            value--;
            if(value < 0) value = 0;
            number.setText(String.format("%d", value));
        });
    }
}