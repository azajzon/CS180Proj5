import java.io.*;

/** Project 5 - Server.Teacher.java
 * The Server.Teacher class contains the login information that belong to teacher user.
 * This includes their name, username, and password. A super is used to access the teacher and call
 * functions in the Server.Teacher constructor.
 *
 * @author Aarohi Panzade, Abel Zazjon, Aditi Barla, Yaseen Shady
 *
 * @version 11/14/21
 */

//extending Server.User class to access the teacher login variables/fields
// implements Serializable to use the Server.Teacher object and store/serialize it
public class Teacher extends User implements Serializable {
    // A super is used to access the teacher and call functions in the Server.Teacher constructor from the Server.User.java
    public Teacher(String teacherName, String teacherUsername, String teacherPassword) {
        super(teacherName, teacherUsername, teacherPassword);
    }
}
