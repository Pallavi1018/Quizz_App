package model;

public class Question {
    private String questionText;
    private String answer;

    // Constructor
    public Question(String questionText, String answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

    // Getter for question text
    public String getQuestionText() {
        return questionText;
    }

    // Getter for answer
    public String getAnswer() {
        return answer;
    }

    // Check if the user's answer is correct
    public boolean isCorrect(String userAnswer) {
        return answer.equalsIgnoreCase(userAnswer.trim());
    }
}
