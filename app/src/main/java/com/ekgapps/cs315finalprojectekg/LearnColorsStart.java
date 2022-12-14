package com.ekgapps.cs315finalprojectekg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.cs315finalprojectekg.R;

public class LearnColorsStart extends AppCompatActivity {

    Button startQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_colors_start);

        startQuiz = (Button) findViewById(R.id.start_colors);
        startQuiz.setOnClickListener(view -> {
            Intent intent = new Intent(LearnColorsStart.this, QuizActivity.class);
            intent.putExtra("quizType", "colors");
            startActivity(intent);
        });
    }
}