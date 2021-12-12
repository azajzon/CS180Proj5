import java.io.Serializable;
import java.util.ArrayList;

/**
 * Project 4 - Course
 * <p>
 * The Course class implements Serializable and has an array list of quizzes where you can get a quiz, add a quiz, or delete a quiz.
 * @author Aarohi Panzade, Abel Zazjon, Aditi Barla, and Yaseen Shady 039
 *
 * @version 11/14/2021
 */

public class Course implements Serializable {

    // Constructs a newly allocated Course object with the field values specified by the input parameters.
    public Course(String name) {
        this.name = name;
        this.quizzes = new ArrayList<>();
    }

    // initializes the fields
    private ArrayList<Quiz> quizzes;
    private String name;

    // returns the name of the course
    public String getName() {
        return name;
    }

    // returns the array list of the quizzes
    public ArrayList<Quiz> getQuizzes() {
        return quizzes;
    }

    //returns a quiz based on the name of the quiz
    public Quiz getQuiz(String quizName) {
        //for each loop with a quiz object to check if the name of the quiz the user typed in is equal to the one that the teacher creates
        for (Quiz quiz: quizzes) {
            if(quiz.getQuizName().equals(quizName)) {
                return quiz;
            }
        }
        return null;
    }

    // adds a quiz to the list of the quizzes
    public void addQuiz(Quiz q) {
        // checks if a quiz is null
        if (q == null) {
            return;
        }
        quizzes.add(q);
    }

    // deletes a quiz from the list of quizzes
    public void deleteQuiz(Quiz q) {
        quizzes.remove(q);
    }
}
