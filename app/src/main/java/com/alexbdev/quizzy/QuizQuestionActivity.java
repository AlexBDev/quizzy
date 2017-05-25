package com.alexbdev.quizzy;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alexbdev.quizzy.builder.CheckBoxAnswerBuilder;
import com.alexbdev.quizzy.data.Answer;
import com.alexbdev.quizzy.data.Answers;
import com.alexbdev.quizzy.data.Question;
import com.alexbdev.quizzy.widget.CheckBoxAnswer;

import java.util.ArrayList;

public class QuizQuestionActivity extends AppCompatActivity {

    TextView textViewQuestion;
    LinearLayout answerLinearLayout;

    Question question;
    ArrayList<CheckBoxAnswer> checkBoxesAnswerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_question);
        answerLinearLayout = (LinearLayout) findViewById(R.id.answerLinearLayout);
        textViewQuestion = (TextView) findViewById(R.id.titleQuestionText);

        createQuestion().setText("Qu'elle est la capital de France ?");

        displayAnswers();

        textViewQuestion.setText(question.getText());
    }

    private void displayAnswers() {
        for (CheckBoxAnswer answer: checkBoxesAnswerList) {
            answerLinearLayout.addView(answer);
        }
    }

    private Question createQuestion() {
        question = new Question();
        question.setAnswers(createAnswers());

        return question;
    }

    private Answers createAnswers() {
        Answers answers = new Answers();
        checkBoxesAnswerList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            Answer answer;

            if (i == 2) {
                answer = createAnswer("Réponse "+i, true);
            } else {
                answer = createAnswer("Réponse "+i, false);
            }

            answers.addAnswer(answer);
            CheckBoxAnswer checkbox = CheckBoxAnswerBuilder.create(this, answer);
            checkBoxesAnswerList.add(checkbox);
        }

        return answers;
    }

    private Answer createAnswer(String text, Boolean isCorrect) {
        Answer answer = new Answer();

        answer.setText(text);
        answer.setCorrectAnswer(isCorrect);

        return answer;
    }

    private String getQuizQuestionId() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return extras.getString(MainActivity.INTENT_QUIZ_QUESTION_ID);
        }

        return null;
    }
}