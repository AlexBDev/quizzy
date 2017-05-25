package com.alexbdev.quizzy.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;

import com.alexbdev.quizzy.data.Answer;

/**
 * Created by alexis on 25/05/17.
 */
public class CheckBoxAnswer extends AppCompatCheckBox {
    protected Answer answer;

    public CheckBoxAnswer(Context context) {
        super(context);
    }

    public CheckBoxAnswer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CheckBoxAnswer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Answer getAnswer() {
        return answer;
    }

    public CheckBoxAnswer setAnswer(Answer answer) {
        this.answer = answer;

        return this;
    }
}
