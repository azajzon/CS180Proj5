import java.io.Serializable;
import java.util.ArrayList;

/**
 * Project 4 - Question
 * <p>
 * The Question class implements Serializable and gets the title of the question, the choices, answer and the point value for a question
 *
 * @author Aarohi Panzade, Abel Zazjon, Aditi Barla, and Yaseen Shady 039
 * @version 11/14/2021
 */

public class Question implements Serializable {

    // initializes the fields
    private String questionTitle;
    private int numChoices;
    private String answer;
    private ArrayList<String> choices;
    private double pointValue;

    // Constructs a newly allocated Question object with the field values specified by the input parameters
    public Question(String questionTitle) {
        this.questionTitle = questionTitle;
        this.choices = new ArrayList<>();
    }

    // returns the title of the question
    public String getQuestionTitle() {
        return questionTitle;
    }

    //sets the question title instance variable to the value given as a parameter
    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public int getNumChoices() {
        return numChoices;
    }

    public void setNumChoices(int numChoices) {
        this.numChoices = numChoices;
    }

    // returns the answer
    public String getAnswer() {
        return answer;
    }

    //sets the answer instance variable to the value given as a parameter
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // returns the array list of choices
    public ArrayList<String> getChoices() {
        return choices;
    }

    // adds the choice of the user to the array list of choices
    public void addChoice(String choice) {
        choices.add(choice);
    }

    //sets the choices instance variable to the value given as a parameter
    public void setChoices(String[] choices) {
        // Transforms the string array (parameter) to an ArrayList
        ArrayList<String> c = new ArrayList<>();
        for (String a : choices) {
            c.add(a);
        }
        this.choices = c;
    }

    // returns the point value for a question
    public double getPointValue() {
        return pointValue;
    }

    //sets the point value instance variable to the value given as a parameter
    public void setPointValue(double pointValue) {
        this.pointValue = pointValue;
    }
}
