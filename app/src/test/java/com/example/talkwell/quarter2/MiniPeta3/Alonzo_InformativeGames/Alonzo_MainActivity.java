package com.example.talkwell.quarter2.MiniPeta3.Alonzo_InformativeGames;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.talkwell.R;

public class Alonzo_MainActivity extends AppCompatActivity {
    Button depressionButton;
    Button anxietyButton;
    Button selfEsteemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        depressionButton = findViewById(R.id.depressionButton);
        anxietyButton = findViewById(R.id.anxietyButton);
        selfEsteemButton = findViewById(R.id.anxietyButton);

        depressionButton.setOnClickListener(v -> {
           openGame("depression")
        });

        anxietyButton.setOnClickListener(v -> {
            openGame("anxiety")
        });

        selfEsteemButton.setOnClickListener(v -> {
            openGame("self_esteem")
        });

        public void openGame(String topic) {

            Intent intent = new Intent(Alonzo_MainActivity.this, Alonzo_MiniGameActivity.class);

            Intent.putExtra("topic", topic);

            startActivity(intent);
        }
    }
