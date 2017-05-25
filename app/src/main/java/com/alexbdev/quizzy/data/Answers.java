package com.alexbdev.quizzy.data;

import java.util.ArrayList;

/**
 * Created by alexis on 25/05/17.
 */

public class Answers {
    protected ArrayList<Answer> answers = new ArrayList<>();

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public Answers setAnswers(ArrayList<Answer> answers) {
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
