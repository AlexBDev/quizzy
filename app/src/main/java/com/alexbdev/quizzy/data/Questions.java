package com.alexbdev.quizzy.data;

import java.util.List;

/**
 * Created by alexis on 25/05/17.
 */

public class Questions {
    protected List<Question> questions;
    protected int questionIndex = 0;


    public List<Question> getQuestions() {
        return questions;
    }

    public Questions setQuestions(List<Question> questions) {
        this.questions = questions;

        return this;
    }

    public Questions addQuestion(Question question) {
        questions.add(question);

        return this;
    }

    public int getQuestionIndex() {
        return questionIndex;
    }

    public void setQuestionIndex(int questionIndex) {
        this.questionIndex = questionIndex;
    }

    public Question getCurrentQuestion()
    {
        return getQuestions().get(getQuestionIndex());
    }

    public Question getNextQuestion()
    {
        if (getQuestionIndex() <= getQuestions().size()) {
            setQuestionIndex(getQuestionIndex() + 1);

            return getCurrentQuestion();
        }

        return null;
    }

    public Question getPreviousQuestion()
    {
        if (getQuestionIndex() > 1) {
            setQuestionIndex(getQuestionIndex() - 1);

            return getCurrentQuestion();
        }

        return null;
    }
}
