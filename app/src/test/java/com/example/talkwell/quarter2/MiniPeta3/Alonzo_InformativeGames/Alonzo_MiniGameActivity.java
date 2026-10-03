package com.example.talkwell.quarter2.MiniPeta3.Alonzo_InformativeGames;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.talkwell.R;

public class Alonzo_MiniGameActivity extends AppCompatActivity {

    TextView questionText;

    Button answer1;
    Button answer2;
    Button answer3;

    String topic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        questionText = findViewById(R.id.questionText);

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
    }
}
