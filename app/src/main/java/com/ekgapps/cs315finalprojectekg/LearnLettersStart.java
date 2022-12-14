package com.ekgapps.cs315finalprojectekg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.cs315finalprojectekg.R;

public class LearnLettersStart extends AppCompatActivity {

    Button startQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_letters_start);

        startQuiz = (Button) findViewById(R.id.start_letters);
        startQuiz.setOnClickListener(view -> {
            Intent intent = new Intent(LearnLettersStart.this, QuizActivity.class);
            intent.putExtra("quizType", "letters");
            startActivity(intent);
        });
    }
}