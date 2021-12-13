import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

/** Project 4 - User.java
 * The User class contains the create account/login information that belong to a user
 * (whether they are a teacher or a student). This includes their name,
 * username, password, and courses.
 *
 * @author Aarohi Panzade, Abel Zazjon, Aditi Barla, Yaseen Shady
 *
 * @version 11/14/21
 */

// implements Serializable to use the User object and store/serialize it
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

// implements Serializable to use the User object and store/serialize it
public class User implements Serializable {
    //initializes the following fields
    private String name;
    private String username;
    private String password;
    //private ArrayList<Course> courses; //courses taken by a student or taught by a teacher

    //Constructs a newly allocated User object with the field values specified by the input parameter
    //initializing the parameters/field variables
    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
    //Returns the inputted password of the user when creating/logging into their account
    public String getPassword() {
        return password;
    }
    //sets the password instance variable to the value given in the parameter
    public void setPassword(String password) {
        this.password = password;
    }
    //Returns the inputted name of the user when creating/logging into their account
    public String getName() {
        return name;
    }
    //sets the password instance variable to the value given in the parameter
    public void setName(String name) {
        this.name = name;
    }
    //Returns the inputted username of the user when creating/logging into their account
    public String getUsername() {
        return username;
    }
    //sets the password instance variable to the value given in the parameter
    public void setUsername(String username) {
        this.username = username;
    }
}
