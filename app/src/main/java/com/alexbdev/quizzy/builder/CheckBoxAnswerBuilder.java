package com.alexbdev.quizzy.builder;

import android.content.Context;

import com.alexbdev.quizzy.data.Answer;
import com.alexbdev.quizzy.widget.CheckBoxAnswer;

/**
 * Created by alexis on 25/05/17.
 */

public class CheckBoxAnswerBuilder {
    public static CheckBoxAnswer create(Context context, Answer answer) {
        CheckBoxAnswer checkBoxAnswer = new CheckBoxAnswer(context);

        checkBoxAnswer.setAnswer(answer);
        checkBoxAnswer.setText(answer.getText());
        checkBoxAnswer.setLines(1);
        checkBoxAnswer.setWidth(400);
        checkBoxAnswer.setClickable(true);
        checkBoxAnswer.setHeight(75);

        return checkBoxAnswer;
    }
}
