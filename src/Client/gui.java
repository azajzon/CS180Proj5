package Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicLong;

public class gui {
    private static String hostName;

    // create a variable to initialize new threads with
    private static Thread thrd = null;

    // the threads are kept track of with a linked list
    private static LinkedList<Thread> list = new LinkedList<Thread>();

    // AtomicLong is a class that is synchronized, and can be used across
    // multiple threads. Here it is used for benchmarking, to store the sum
    // of the command completion times for all threads
    private static AtomicLong totalTime = new AtomicLong(0);

    // this AtomicLong is used to keep track of the current # of running threads
    private static AtomicLong runningThreads = new AtomicLong(0);
    private static boolean printOutput = true;
    public static JFrame frame;
    public static JPanel panel;
    public static JLabel userLabel;
    public static JLabel passwordLabel;
    public static JTextField userText;
    public static JTextField passText;
    public static JButton loginButton;
    public static JLabel welcomeLabel;
    public static JLabel lsmTool;
    public static JButton createTeacherButton;
    public static JButton createStudentButton;
    public static JButton loginTeacherButton;
    public static JButton loginStudentButton;
    public static JButton saveButton;
    public static JLabel nameLabel;
    public static JTextField nameText;
    public static JLabel addCourse;
    public static JButton yesCourse;
    public static JButton noCourse;
    public static JLabel courseName;
    public static JTextField courseText;
    public static JButton courseEnter;
    public static JButton createQuiz;
    public static JButton editQuiz;
    public static JButton deleteQuiz;
    public static JButton viewStudentQuizSubmissions;
    public static JButton takeQuiz;
    public static JButton viewGradedQuiz;
    public static JButton editAccount;
    public static JButton logout;



    public static void main(String[] args) {
        int numProcesses = 1;


        mainMenu();
        loginTeacherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginTeacher();
                thrd = new Thread(new ClientThread(0, totalTime, printOutput, runningThreads));
                thrd.start(); // start the thread
                list.add(thrd);
            }
        });
        createTeacherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createTeacher();
                //thrd = new Thread(new ClientThread(1, totalTime, printOutput, runningThreads));
                //thrd.start(); // start the thread
                //list.add(thrd);
            }
        });
    }

    public static void mainMenu() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);


        lsmTool = new JLabel("Learning System Management Tool");
        lsmTool.setBounds(80, 20, 500, 25);
        panel.add(lsmTool);

        loginTeacherButton = new JButton("Login Teacher");
        loginTeacherButton.setBounds(110, 50, 150, 25);
        panel.add(loginTeacherButton);

        loginStudentButton = new JButton("Login Student");
        loginStudentButton.setBounds(110, 80, 150, 25);
        panel.add(loginStudentButton);

        createTeacherButton = new JButton("Create Teacher");
        createTeacherButton.setBounds(110, 110, 150, 25);
        panel.add(createTeacherButton);

        createStudentButton = new JButton("Create Student");
        createStudentButton.setBounds(110, 140, 150, 25);
        panel.add(createStudentButton);


        saveButton = new JButton("Save and Exit");
        saveButton.setBounds(110, 170, 150, 25);
        panel.add(saveButton);

        panel.setLayout(null);

        frame.setVisible(true);

    }

    public static void loginTeacher() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        welcomeLabel = new JLabel("Welcome teachers!");
        welcomeLabel.setBounds(80, 20, 150, 25);
        panel.add(welcomeLabel);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 50, 80, 25);
        panel.add(userLabel);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 80, 80, 25);
        panel.add(passwordLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 50, 165, 25);
        panel.add(userText);

        passText = new JTextField(20);
        passText.setBounds(100, 80, 165, 25);
        panel.add(passText);

        loginButton = new JButton("Login");
        loginButton.setBounds(30, 120, 80, 25);
        panel.add(loginButton);


        frame.setVisible(true);
    }

    public static void createTeacher() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        welcomeLabel = new JLabel("Create a teacher account");
        welcomeLabel.setBounds(80, 20, 200, 25);
        panel.add(welcomeLabel);

        nameLabel = new JLabel("First & Last Name:");
        nameLabel.setBounds(20, 50, 150, 25);
        panel.add(nameLabel);

        nameText = new JTextField(20);
        nameText.setBounds(150, 50, 165, 25);
        panel.add(nameText);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 80, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(150, 80, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 110, 80, 25);
        panel.add(passwordLabel);

        passText = new JTextField(20);
        passText.setBounds(150, 110, 165, 25);
        panel.add(passText);

        loginButton = new JButton("Create Account");
        loginButton.setBounds(30, 150, 150, 25);
        panel.add(loginButton);


        frame.setVisible(true);

    }
}
