
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Project 4 - Server.Quiz
 * <p>
 * The Server.Quiz class implements Serializable and gets the array
 * list of questions with the name of the quiz, the score
 * and the number of questions and also implements other
 * calculation methods.
 * @author Aarohi Panzade, Abel Zazjon, Aditi Barla, and Yaseen Shady 039
 *
 * @version 11/14/2021
 */

public class Quiz implements Serializable {

    // initializes the fields
    private ArrayList<Question> questions;
    private String quizName;
    private double score;
    private int numQuestions;

    //Constructs a newly allocated Server.Quiz object with the field values specified by the input parameters
    public Quiz(ArrayList<Question> questions, String quizName) {
        this.questions = questions;
        this.quizName = quizName;
        this.score = 0;
        this.numQuestions = questions.size();
    }

    // returns the array list of questions
    public ArrayList<Question> getQuestions() {
        return questions;
    }

    // returns the name of the quiz
    public String getQuizName() {
        return quizName;
    }

    //sets the quiz name instance variable to the value given as a parameter
    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    // returns the score of a quiz
    public double getScore() {
        return score;
    }

    public void setQuestion(Question q, int index) {
        questions.set(index, q);

    }
    // sets the score instance variable to the value given as a parameter
    public void setScore(double score) {
        this.score = score;
    }

    // returns the number of questions fo a quiz
    public int getNumQuestions() {
        return numQuestions;
    }

    // sets the num questions instance variable to the value given as a parameter
    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    // calculates the total score of a quiz
    public double calculateTotalScore() {
        double total = 0;
        // goes through all the question and add the point
        // values of all the questions to a total variable and then returns it
        for (Question question : questions) total += question.getPointValue();
        return total;
    }

    // adds a question to the array list of question
    public void addQuestion(Question q) {
        questions.add(q);
        numQuestions += 1;
    }

    // deletes a question from the array list of questions
    public void deleteQuestion(Question q) {
        questions.remove(q);
        numQuestions -= 1;
    }


}
