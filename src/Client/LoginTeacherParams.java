package Client;

import java.io.PrintWriter;

public class LoginTeacherParams {
    private String username;
    private String password;

    public LoginTeacherParams(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public void formatLoginTeacherRequest(PrintWriter out) {
        out.println("command:0");
        out.println("username:" + username); // we will change this username later to the input from gui
        out.println("password:" + password);
    }


}
