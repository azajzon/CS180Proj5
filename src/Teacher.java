import java.io.*;
import java.util.ArrayList;

/** Project 4 - Teacher.java
 * The Teacher class contains the login information that belong to teacher user.
 * This includes their name, username, and password. A super is used to access the teacher and call
 * functions in the Teacher constructor.
 *
 * @author Aarohi Panzade, Abel Zazjon, Aditi Barla, Yaseen Shady
 *
 * @version 11/14/21
 */

//extending User class to access the teacher login variables/fields
// implements Serializable to use the Teacher object and store/serialize it
public class Teacher extends User implements Serializable {
    // A super is used to access the teacher and call functions in the Teacher constructor from the User.java
    public Teacher(String teacherName, String teacherUsername, String teacherPassword) {
        super(teacherName, teacherUsername, teacherPassword);
    }
}
