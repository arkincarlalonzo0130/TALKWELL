package com.example.talkwell;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Alonzo_InteractiveLearning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactivelearning);

        // Topic buttons
        Button anxietyButton = findViewById(R.id.anxietyButton);

        // Open Anxiety screen
        anxietyButton.setOnClickListener(v -> {
            Intent intent = new Intent(
                    Alonzo_InteractiveLearning.this, // Fixed class name case
                    AnxietyActivity.class
            );
            startActivity(intent);
        });
    }
}