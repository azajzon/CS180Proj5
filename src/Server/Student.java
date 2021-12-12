import java.io.Serializable;
import java.util.ArrayList;

/** Project 5 - Server.Student.java
 * The Server.Student class contains the login information that belong to student user. This includes their name,
 * username, and password. A super is used to access the teacher and call
 * functions in the Server.Student constructor. It also includes the quiz
 * submissions by the students.
 *
 * @author Aarohi Panzade, Abel Zazjon, Aditi Barla, Yaseen Shady
 *
 * @version 11/14/21
 */

//extending Server.User class to access the teacher login variables/fields
// implements Serializable to use the Server.Student object and store/serialize it
public class Student extends User implements Serializable {
    //initializes the following fields
    private ArrayList<QuizSubmission> quizSubmissions;

    //Constructs a newly allocated Server.Student object with the field values specified by the input parameter
    // Utilizes super to access the student and call functions in the Server.Student constructor from the Server.User.java
    public Student(String name, String username, String password) {
        super(name, username, password);
        this.quizSubmissions = new ArrayList<>();
    }

    //creates a Server.QuizSubmission object and checks to see if the quizSubmissions by student are
    // equivalent to the course names and the quiz names. Returns the quiz submission of the student.
    public QuizSubmission findQuizSubmission(String courseName, String quizName) {
        for (QuizSubmission qs: quizSubmissions) {
            if (qs.getCourseName().equals(courseName) && qs.getQuizName().equals(quizName)) {
                return qs;
            }
        }
        return null;
    }
    //An object of the quizSubmissions is used to add the quiz submission to the list of quiz submissions.
    public void addQuizSubmission(QuizSubmission qs) {
        quizSubmissions.add(qs);
    }
    //Returns the quiz submissions by the student
    public ArrayList<QuizSubmission> getQuizSubmissions() {
        return quizSubmissions;
    }

}
