package service;

import model.Question;

import java.util.Scanner;

public class Quiz {
    private Question[] questions;

    // Constructor: initializes the quiz with some questions
    public Quiz() {
        questions = new Question[] {
            new Question("What is the capital of France?", "Paris"),
            new Question("What is 2 + 2?", "4"),
            new Question("Which language is used for Android development?", "Java"),
            new Question("Who wrote 'Romeo and Juliet'?", "Shakespeare"),
            new Question("Which planet is known as the Red Planet?", "Mars")
        };
    }

    // Method to start the quiz
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("📘 Welcome to the Quiz!\n");

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("Q" + (i + 1) + ": " + q.getQuestionText());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (q.isCorrect(userAnswer)) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.getAnswer() + "\n");
            }
        }

        System.out.println("🎉 Quiz finished!");
        System.out.println("Your score: " + score + " out of " + questions.length);
        scanner.close();
    }
}
