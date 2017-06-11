package com.alexbdev.quizzy;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alexbdev.quizzy.builder.CheckBoxAnswerBuilder;
import com.alexbdev.quizzy.data.Answer;
import com.alexbdev.quizzy.data.Answers;
import com.alexbdev.quizzy.data.Question;
import com.alexbdev.quizzy.data.Questions;
import com.alexbdev.quizzy.widget.CheckBoxAnswer;

import java.util.ArrayList;

public class QuizQuestionActivity extends AppCompatActivity {

    TextView textViewQuestion;
    LinearLayout answerLinearLayout;
    Button submitButton;

    Question currentQuestion;
    Questions questions;
    ArrayList<CheckBoxAnswer> checkBoxesAnswerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz_question);
        answerLinearLayout = (LinearLayout) findViewById(R.id.answerLinearLayout);
        textViewQuestion = (TextView) findViewById(R.id.titleQuestionText);
        Button submitButton = (Button) findViewById(R.id.submitButton);

        createQuestions();
        questions.getQuestions().


//        textViewQuestion.setText(question.getText());


        submitButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                for (CheckBoxAnswer checkBoxAnswer: checkBoxesAnswerList) {
                    if(checkBoxAnswer.isChecked()) {
                        System.out.println(checkBoxAnswer.getAnswer().isSelected());
                    }
                }
            }
        });
    }

    private void displayAnswers() {
        checkBoxesAnswerList = new ArrayList<>();
        CheckBoxAnswer checkbox = CheckBoxAnswerBuilder.create(this, answer);
        checkBoxesAnswerList.add(checkbox);
        for (CheckBoxAnswer answer: checkBoxesAnswerList) {
            answerLinearLayout.addView(answer);
        }
    }

    private void createQuestions() {
        questions = new Questions();
        for (int i = 1; i < 6; i++) {
            Question question = createQuestion("Question : "+i);
            questions.addQuestion(question);
        }
    }

    private Question createQuestion(String text) {
        Question question = new Question();
        question.setText(text);
        question.setAnswers(createAnswers());

        return question;
    }

    private Answers createAnswers() {
        Answers answers = new Answers();
        for (int i = 1; i < 5; i++) {
            Answer answer;

            if (i == 2) {
                answer = createAnswer("Réponse "+i, true);
            } else {
                answer = createAnswer("Réponse "+i, false);
            }

            answers.addAnswer(answer);
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