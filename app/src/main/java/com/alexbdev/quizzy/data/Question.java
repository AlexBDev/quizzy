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

    public Question setText(String text) {
        this.text = text;

        return this;
    }

    public Answers getAnswers() {
        return answers;
    }

    public Question setAnswers(Answers answers) {
        this.answers = answers;

        return this;
    }
}
