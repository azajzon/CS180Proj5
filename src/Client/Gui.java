package Client;

import javax.swing.*;
import java.util.LinkedList;

public class Gui {
    private static String hostName;

    // create a variable to initialize new threads with


    // the threads are kept track of with a linked list
    private static LinkedList<Thread> list = new LinkedList<Thread>();

    public static JFrame mainFrame;
    public static JPanel panel;
    public static JLabel userLabel;
    public static JLabel passwordLabel;
    public static JTextField userText;
    public static JTextField passText;

    public static JLabel welcomeLabel;
    public static JLabel lsmTool;

    /////////////////////////
    //TEACHER MENU ATTRIBUTES
    /////////////////////////
    public static JButton createTeacherButton;
    public static JButton loginTeacherAccountButton;
    public static JButton createTeacherAccountButton;
    public static JFrame teacherLoginFrame;
    public static JPanel teacherLoginPanel;
    public static JLabel teacherWelcomeLabel;
    public static JLabel teacherLoginLabel;
    public static JLabel teacherPasswordLabel;
    public static JTextField teacherUsernameText;
    public static JTextField teacherPasswordText;
    public static JFrame createTeacherFrame;
    public static JPanel createTeacherPanel;
    public static JLabel createTeacherWelcomeLabel;
    public static JLabel createTeacherNameLabel;
    public static JTextField createTeacherUsernameText;
    public static JTextField createTeacherNameText;
    public static JLabel createTeacherUsernameLabel;
    public static JLabel createTeacherPasswordLabel;
    public static JTextField createTeacherPasswordText;

    public static JButton loginTeacherButton;
    public static JButton loginStudentButton;
    public static JButton saveButton;
    public static JLabel nameLabel;
    public static JTextField nameText;


    /////////////////////
    //Student attributes
    ////////////////////
    public static JButton createStudentButton;
    public static JButton loginStudentAccountButton;
    public static JButton createStudentAccountButton;
    public static JFrame studentLoginFrame;
    public static JPanel studentLoginPanel;
    public static JLabel studentWelcomeLabel;
    public static JLabel studentLoginLabel;
    public static JLabel studentPasswordLabel;
    public static JTextField studentUsernameText;
    public static JTextField studentPasswordText;
    public static JFrame createStudentFrame;
    public static JPanel createStudentPanel;
    public static JLabel createStudentWelcomeLabel;
    public static JLabel createStudentNameLabel;
    public static JTextField createStudentUsernameText;
    public static JTextField createStudentNameText;
    public static JLabel createStudentUsernameLabel;
    public static JLabel createStudentPasswordLabel;
    public static JTextField createStudentPasswordText;

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


    }

    public static void mainMenu() {
        mainFrame = new JFrame();
        panel = new JPanel();
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(panel);


        lsmTool = new JLabel("Learning System Management Tool");
        lsmTool.setBounds(80, 20, 500, 25);
        panel.add(lsmTool);

        loginTeacherButton = new JButton("Login Teacher");
        loginTeacherButton.setBounds(110, 50, 150, 25);
        loginTeacherButton.addActionListener((e) -> {
            loginTeacher();
        });
        panel.add(loginTeacherButton);

        loginStudentButton = new JButton("Login Student");
        loginStudentButton.setBounds(110, 80, 150, 25);
        loginStudentButton.addActionListener((e) -> {
            loginStudent();
        });
        panel.add(loginStudentButton);

        createTeacherButton = new JButton("Create Teacher");
        createTeacherButton.setBounds(110, 110, 150, 25);
        createTeacherButton.addActionListener((e) -> {
            createTeacher();
        });
        panel.add(createTeacherButton);

        createStudentButton = new JButton("Create Student");
        createStudentButton.setBounds(110, 140, 150, 25);
        createStudentButton.addActionListener((e) -> {
            createStudent();
        });
        panel.add(createStudentButton);


        saveButton = new JButton("Save and Exit");
        saveButton.setBounds(110, 170, 150, 25);
        panel.add(saveButton);

        panel.setLayout(null);

        mainFrame.setVisible(true);

    }

    public static void loginTeacher() {
        teacherLoginFrame = new JFrame();
        teacherLoginPanel = new JPanel();
        teacherLoginFrame.setSize(400, 300);
        teacherLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teacherLoginFrame.add(teacherLoginPanel);

        teacherLoginPanel.setLayout(null);

        teacherWelcomeLabel = new JLabel("Welcome teachers!");
        teacherWelcomeLabel.setBounds(80, 20, 150, 25);
        teacherLoginPanel.add(teacherWelcomeLabel);

        teacherLoginLabel = new JLabel("Username:");
        teacherLoginLabel.setBounds(20, 50, 80, 25);
        teacherLoginPanel.add(teacherLoginLabel);

        teacherPasswordLabel = new JLabel("Password:");
        teacherPasswordLabel.setBounds(20, 80, 80, 25);
        teacherLoginPanel.add(teacherPasswordLabel);


        teacherUsernameText = new JTextField(20);
        teacherUsernameText.setBounds(100, 50, 165, 25);
        teacherLoginPanel.add(teacherUsernameText);

        teacherPasswordText = new JTextField(20);
        teacherPasswordText.setBounds(100, 80, 165, 25);
        teacherLoginPanel.add(teacherPasswordText);

        loginTeacherAccountButton = new JButton("Login");
        loginTeacherAccountButton.addActionListener((e) -> {
            Thread thrd = new Thread(new ClientThread(0, new LoginTeacherParams(teacherUsernameText.getText(), teacherPasswordText.getText())));
            thrd.start(); // start the thread
            list.add(thrd);
        });
        loginTeacherAccountButton.setBounds(30, 120, 80, 25);
        teacherLoginPanel.add(loginTeacherAccountButton);


        teacherLoginFrame.setVisible(true);
    }

    public static void createTeacher() {
        createTeacherFrame = new JFrame();
        createTeacherPanel = new JPanel();
        createTeacherFrame.setSize(400, 300);
        createTeacherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createTeacherFrame.add(createTeacherPanel);

        createTeacherPanel.setLayout(null);

        createTeacherWelcomeLabel = new JLabel("Create a teacher account");
        createTeacherWelcomeLabel.setBounds(80, 20, 200, 25);
        createTeacherPanel.add(createTeacherWelcomeLabel);

        createTeacherNameLabel = new JLabel("First & Last Name:");
        createTeacherNameLabel.setBounds(20, 50, 150, 25);
        createTeacherPanel.add(createTeacherNameLabel);

        createTeacherNameText = new JTextField(20);
        createTeacherNameText.setBounds(150, 50, 165, 25);
        createTeacherPanel.add(createTeacherNameText);

        createTeacherUsernameLabel = new JLabel("Username:");
        createTeacherUsernameLabel.setBounds(20, 80, 80, 25);
        createTeacherPanel.add(createTeacherUsernameLabel);

        createTeacherUsernameText = new JTextField(20);
        createTeacherUsernameText.setBounds(150, 80, 165, 25);
        createTeacherPanel.add(createTeacherUsernameText);

        createTeacherPasswordLabel = new JLabel("Password:");
        createTeacherPasswordLabel.setBounds(20, 110, 80, 25);
        createTeacherPanel.add(createTeacherPasswordLabel);

        createTeacherPasswordText = new JTextField(20);
        createTeacherPasswordText.setBounds(150, 110, 165, 25);
        createTeacherPanel.add(createTeacherPasswordText);

        createTeacherAccountButton = new JButton("Create Account");
        createTeacherAccountButton.setBounds(30, 150, 150, 25);
        createTeacherAccountButton.addActionListener((e) -> {
            Thread thrd = new Thread(new ClientThread(1,
                    new CreateTeacherParams(createTeacherNameText.getText(),
                            createTeacherUsernameText.getText(),
                            createTeacherPasswordText.getText())));
            thrd.start(); // start the thread
            list.add(thrd);
        });
        createTeacherPanel.add(createTeacherAccountButton);


        createTeacherFrame.setVisible(true);

    }
    public static void loginStudent() {
        studentLoginFrame = new JFrame();
        studentLoginPanel = new JPanel();
        studentLoginFrame.setSize(400, 300);
        studentLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentLoginFrame.add(studentLoginPanel);

        studentLoginPanel.setLayout(null);

        studentWelcomeLabel = new JLabel("Welcome students!");
        studentWelcomeLabel.setBounds(80, 20, 150, 25);
        studentLoginPanel.add(studentWelcomeLabel);

        studentLoginLabel = new JLabel("Username:");
        studentLoginLabel.setBounds(20, 50, 80, 25);
        studentLoginPanel.add(studentLoginLabel);

        studentPasswordLabel = new JLabel("Password:");
        studentPasswordLabel.setBounds(20, 80, 80, 25);
        studentLoginPanel.add(studentPasswordLabel);


        studentUsernameText = new JTextField(20);
        studentUsernameText.setBounds(100, 50, 165, 25);
        studentLoginPanel.add(studentUsernameText);

        studentPasswordText = new JTextField(20);
        studentPasswordText.setBounds(100, 80, 165, 25);
        studentLoginPanel.add(studentPasswordText);

        loginStudentAccountButton = new JButton("Login");
        loginStudentAccountButton.addActionListener((e) -> {
            Thread thrd = new Thread(new ClientThread(2, new LoginStudentParams(studentUsernameText.getText(), studentPasswordText.getText())));
            thrd.start(); // start the thread
            list.add(thrd);
        });
        loginStudentAccountButton.setBounds(30, 120, 80, 25);
        studentLoginPanel.add(loginStudentAccountButton);


        studentLoginFrame.setVisible(true);
    }

    public static void createStudent() {
        createStudentFrame = new JFrame();
        createStudentPanel = new JPanel();
        createStudentFrame.setSize(400, 300);
        createStudentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createStudentFrame.add(createStudentPanel);

        createStudentPanel.setLayout(null);

        createStudentWelcomeLabel = new JLabel("Create a student account");
        createStudentWelcomeLabel.setBounds(80, 20, 200, 25);
        createStudentPanel.add(createStudentWelcomeLabel);

        createStudentNameLabel = new JLabel("First & Last Name:");
        createStudentNameLabel.setBounds(20, 50, 150, 25);
        createStudentPanel.add(createStudentNameLabel);

        createStudentNameText = new JTextField(20);
        createStudentNameText.setBounds(150, 50, 165, 25);
        createStudentPanel.add(createStudentNameText);

        createStudentUsernameLabel = new JLabel("Username:");
        createStudentUsernameLabel.setBounds(20, 80, 80, 25);
        createStudentPanel.add(createStudentUsernameLabel);

        createStudentUsernameText = new JTextField(20);
        createStudentUsernameText.setBounds(150, 80, 165, 25);
        createStudentPanel.add(createStudentUsernameText);

        createStudentPasswordLabel = new JLabel("Password:");
        createStudentPasswordLabel.setBounds(20, 110, 80, 25);
        createStudentPanel.add(createStudentPasswordLabel);

        createStudentPasswordText = new JTextField(20);
        createStudentPasswordText.setBounds(150, 110, 165, 25);
        createStudentPanel.add(createStudentPasswordText);

        createStudentAccountButton = new JButton("Create Account");
        createStudentAccountButton.setBounds(30, 150, 150, 25);
        createStudentAccountButton.addActionListener((e) -> {
            Thread thrd = new Thread(new ClientThread(3,
                    new CreateStudentParams(createStudentNameText.getText(),
                            createStudentUsernameText.getText(),
                            createStudentPasswordText.getText())));
            thrd.start(); // start the thread
            list.add(thrd);
        });
        createStudentPanel.add(createStudentAccountButton);


        createStudentFrame.setVisible(true);
    }






}
