package com.example.cst2335.greetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.btn);
        editText = findViewById(R.id.editText1);

        button.setOnClickListener( c -> {
            String name = getText(editText);
            Toast.makeText(MainActivity.this,
                    String.format("Hello %s", name),
                    Toast.LENGTH_LONG).show();
        });
    }

    private String getText(TextView text) {
        return text.getText().toString();
    }
}