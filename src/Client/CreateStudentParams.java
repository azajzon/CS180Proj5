package Client;

import java.io.PrintWriter;

public class CreateStudentParams {
    private String name;
    private String username;
    private String password;

    public CreateStudentParams(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public void formatCreateStudentRequest(PrintWriter out) {
        out.println("command:3");
        out.println("name:" + name);
        out.println("username:" + username); // we will change this username later to the input from gui
        out.println("password:" + password);
    }
}
