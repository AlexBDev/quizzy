package com.alexbdev.quizzy.builder;

import android.content.Context;

import com.alexbdev.quizzy.data.Answer;
import com.alexbdev.quizzy.widget.CheckBoxAnswer;

/**
 * Created by alexis on 25/05/17.
 */

public class CheckBoxAnswerBuilder {
    public static CheckBoxAnswer create(Context context, String text, Boolean isCorrectAnswer) {
        Answer answer = new Answer();
        CheckBoxAnswer checkBoxAnswer = new CheckBoxAnswer(context);

        answer.create(text, isCorrectAnswer);
        checkBoxAnswer.setText(text);
        checkBoxAnswer.setLines(1);
        checkBoxAnswer.setWidth(400);
        checkBoxAnswer.setText(text);
        checkBoxAnswer.setClickable(true);
        checkBoxAnswer.setHeight(75);

        return checkBoxAnswer;
    }
}
