package com.alexbdev.quizzy.data;

import java.util.Collection;

/**
 * Created by alexis on 25/05/17.
 */

public class Questions {
    protected Collection<Question> questions;

    public Collection<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Collection<Question> questions) {
        this.questions = questions;
    }
}
