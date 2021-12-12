import java.io.Serializable;

/**
 * Project 4 - Answer
 * <p>
 * The Answer class implements Serializable and gets the question title and the answer chosen.
 * @author Aarohi Panzade, Abel Zazjon, Aditi Barla, and Yaseen Shady 039
 *
 * @version 11/14/2021
 */

import java.io.Serializable;

public class Answer implements Serializable {

    // initializes the fields
    private String questionTitle;
    private String answerChosen; //answer that the student picked

    // Constructs a newly allocated Answer object with the field values specified by the input parameters.
    public Answer(String questionTitle, String answerChosen) {
        this.questionTitle = questionTitle;
        this.answerChosen = answerChosen;
    }

    // returns the question title
    public String getQuestionTitle() {
        return questionTitle;
    }

    //returns the answer chosen
    public String getAnswerChosen() {
        return answerChosen;
    }

    //sets the answer chosen instance variable to the value given as a parameter
    public void setAnswerChosen(String answerChosen) {
        this.answerChosen = answerChosen;
    }
}
