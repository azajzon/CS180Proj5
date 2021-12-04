package Client;

import java.io.PrintWriter;

public class LoginStudentParams {
    private String username;
    private String password;

    public LoginStudentParams(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public void formatLoginStudentRequest(PrintWriter out) {
        out.println("command:2");
        out.println("username:" + username); // we will change this username later to the input from gui
        out.println("password:" + password);
    }
}
