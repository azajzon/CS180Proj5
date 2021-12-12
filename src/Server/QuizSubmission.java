package Server;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Project 5 - Server.QuizSubmission
 * <p>
 * The Server.QuizSubmission class implements Serializable and gets
 * the array list of answers, quiz name, course name and finds 
 * the answer based on the question.
 * @author Aarohi Panzade, Abel Zazjon, Aditi Barla, and Yaseen Shady 039
 *
 * @version 11/14/2021
 */

public class QuizSubmission implements Serializable {

    // initializes the fields
    private String courseName;
    private String quizName;
    private long timeStamp;
    //answers that the student chose
    private ArrayList<Answer> answers;

    //Constructs a newly allocated Server.QuizSubmission object with the field values specified by the input parameters
    public QuizSubmission(String courseName, String quizName, ArrayList<Answer> answers) {
        this.courseName = courseName;
        this.quizName = quizName;
        this.answers = answers;
        this.timeStamp = System.currentTimeMillis();
    }

    // returns the timestamp of the student
    public long getTimeStamp() {
        return timeStamp;
    }

    // returns the array list of the student answers
    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    // finds the answer the based on the question the user answers
    public Answer findAnswer(String questionTitle) {
        for (Answer answer: answers) {
            // checks if the question is equal to the question 
            // the student answers and based on that it returns the answer
            if (answer.getQuestionTitle().equals(questionTitle)) {
                return answer;
            }
        }
        return null;
    }

    // returns the name of the quiz
    public String getQuizName() {
        return quizName;
    }

    // returns the name of the course
    public String getCourseName() {
        return courseName;
    }

}
