package com.alexbdev.quizzy.data;

/**
 * Created by alexis on 25/05/17.
 */

public class Answer {
    protected String text;
    protected Boolean isCorrectAnswer = false;
    protected boolean isSelected = false;

    @Override
    public String toString() {
        return text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    public void setCorrectAnswer(Boolean correctAnswer) {
        isCorrectAnswer = correctAnswer;
    }

    public Answer create(String text, Boolean correctAnswer)
    {
        setText(text);
        setCorrectAnswer(correctAnswer);

        return this;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
