package Client;

import java.io.PrintWriter;

public class CreateTeacherParameters {
    private String name;
    private String username;
    private String password;

    public CreateTeacherParameters(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public void formatCreateTeacherRequest(PrintWriter out) {
        out.println("command:1");
        out.println("name:" + name);
        out.println("username:" + username); // we will change this username later to the input from gui
        out.println("password:" + password);
    }
}
