package com.alexbdev.quizzy.data;

/**
 * Created by alexis on 25/05/17.
 */

public class Question {
    protected String text;
    protected Answers answers;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Answers getAnswers() {
        return answers;
    }

    public void setAnswers(Answers answers) {
        this.answers = answers;
    }
}
