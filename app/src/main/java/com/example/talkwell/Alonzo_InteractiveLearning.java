package com.example.talkwell;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Topic buttons
        Button anxietyButton = findViewById(R.id.selfEsteemButton);
        Button depressionButton = findViewById(R.id.anxietyButton);
        Button selfEsteemButton = findViewById(R.id.depressionButton);

        // Open Anxiety screen
        anxietyButton.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    AnxietyActivity.class
            );
            startActivity(intent);
        });

        // Open Depression screen
        depressionButton.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    DepressionActivity.class
            );
            startActivity(intent);
        });

        // Open Self-Esteem screen
        selfEsteemButton.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    SelfEsteemActivity.class
            );
            startActivity(intent);
        });
    }
}