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

    public Questions setQuestions(Collection<Question> questions) {
        this.questions = questions;

        return this;
    }

    public Questions addQuestion(Question question) {
        questions.add(question);

        return this;
    }
}
