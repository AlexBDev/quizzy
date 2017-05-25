package com.alexbdev.quizzy.data;

import java.util.Collection;

/**
 * Created by alexis on 25/05/17.
 */

public class Answers {
    protected Collection<Answer> answers;

    public Collection<Answer> getAnswers() {
        return answers;
    }

    public Answers setAnswers(Collection<Answer> answers) {
        this.answers = answers;

        return this;
    }

    public Answers addAnswer(Answer answer) {
        answers.add(answer);

        return this;
    }

    public Answers getCorrectAnswers() {
        Answers correctAnswers = new Answers();

        for (Answer answer: answers) {
            if (answer.isCorrectAnswer()) {
                correctAnswers.addAnswer(answer);
            }
        }

        return correctAnswers;
    }
}
