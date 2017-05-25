package com.alexbdev.quizzy;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alexbdev.quizzy.builder.CheckBoxAnswerBuilder;
import com.alexbdev.quizzy.widget.CheckBoxAnswer;

import java.util.ArrayList;

public class QuizQuestionActivity extends AppCompatActivity {

    TextView questionText;
    LinearLayout answerLinearLayout;
    ArrayList<CheckBoxAnswer> checkBoxesAnswerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_question);
        setTitleQuestion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus pellentesque pulvinar rutrum.");

        answerLinearLayout = (LinearLayout) findViewById(R.id.answerLinearLayout);
        createAnswers();
        displayAnswers();
    }

    private void setTitleQuestion(String titleQuestion) {
        questionText = (TextView) findViewById(R.id.titleQuestionText);
        questionText.setText(titleQuestion);
    }

    private void displayAnswers() {
        for (CheckBoxAnswer answer: checkBoxesAnswerList) {
            answerLinearLayout.addView(answer);
        }
    }

    private void createAnswers() {
        checkBoxesAnswerList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            String content = "Réponse : "+i;
            checkBoxesAnswerList.add(CheckBoxAnswerBuilder.create(this, content, false));
        }
    }

    private String getQuizQuestionId() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return extras.getString(MainActivity.INTENT_QUIZ_QUESTION_ID);
        }

        return null;
    }
}