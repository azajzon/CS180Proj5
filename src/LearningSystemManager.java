

//NOTE: WITH GUI's, not done yet

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearningSystemManager implements ActionListener {
    public static JFrame frame;
    public static JPanel panel;
    public static JLabel userLabel;
    public static JLabel passwordLabel;
    public static JTextField userText;
    public static JTextField passText;
    public static JButton loginButton;
    public static JLabel welcomeLabel;
    public static JLabel lsmTool;
    public static JButton createTeacher;
    public static JButton createStudent;
    public static JButton loginTeacher;
    public static JButton loginStudent;
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

        //teacherLogIn(); //Screen for teacher login
        //studentLogIn(); // Screen for student login
        mainMenu();
        //createTeacher();
        //createStudent();
        //teacherMenu();
        //addCourse();
        //teacherQuizMenu();
        //editAccount();
    }

    public static void mainMenu() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);


        lsmTool = new JLabel("Welcome to Learning System Management Tool!");
        lsmTool.setBounds(80, 20, 500, 25);
        panel.add(lsmTool);

        createTeacher = new JButton("Create Teacher");
        createTeacher.setBounds(110, 50, 150, 25);
        createTeacher.addActionListener(new LearningSystemManager());
        panel.add(createTeacher);

        createTeacher.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createTeacher();
            }
        });

        createStudent = new JButton("Create Student");
        createStudent.setBounds(110, 80, 150, 25);
        createStudent.addActionListener(new LearningSystemManager());
        panel.add(createStudent);

        createStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createStudent();
            }
        });

        loginTeacher = new JButton("Login Teacher");
        loginTeacher.setBounds(110, 110, 150, 25);
        loginTeacher.addActionListener(new LearningSystemManager());
        panel.add(loginTeacher);

        loginTeacher.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                logInTeacher();
            }
        });

        loginStudent = new JButton("Login Student");
        loginStudent.setBounds(110, 140, 150, 25);
        loginStudent.addActionListener(new LearningSystemManager());
        panel.add(loginStudent);

        loginStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                logInStudent();
            }
        });

        saveButton = new JButton("Save and Exit");
        saveButton.setBounds(110, 170, 150, 25);
        saveButton.addActionListener(new LearningSystemManager());
        panel.add(saveButton);

        panel.setLayout(null);

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

        loginButton = new JButton("Create");
        loginButton.setBounds(30, 150, 80, 25);
        loginButton.addActionListener(new LearningSystemManager());
        panel.add(loginButton);


        frame.setVisible(true);

    }

    public static void logInTeacher() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        welcomeLabel = new JLabel("Log In to your teacher account");
        welcomeLabel.setBounds(80, 20, 200, 25);
        panel.add(welcomeLabel);

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

        loginButton = new JButton("Log In");
        loginButton.setBounds(30, 150, 80, 25);
        loginButton.addActionListener(new LearningSystemManager());
        panel.add(loginButton);


        frame.setVisible(true);

    }

    public static void teacherMenu() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        addCourse = new JLabel("Do you want to add a course?");
        addCourse.setBounds(80, 20, 200, 25);
        panel.add(addCourse);

        yesCourse = new JButton("Yes");
        yesCourse.setBounds(120, 50, 80, 25);
        yesCourse.addActionListener(new LearningSystemManager());
        panel.add(yesCourse);

        noCourse = new JButton("No");
        noCourse.setBounds(120, 80, 80, 25);
        noCourse.addActionListener(new LearningSystemManager());
        panel.add(noCourse);


        panel.setLayout(null);
        frame.setVisible(true);

    }

    public static void addCourse() {

        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        // if yes to adding a course
        // PATHWAY IS

        courseName = new JLabel("Enter Course Name:");
        courseName.setBounds(80, 20, 200, 25);
        panel.add(courseName);

        courseText = new JTextField(50);
        courseText.setBounds(60, 50, 165, 25);
        panel.add(courseText);

        courseEnter = new JButton("Create Course");
        courseEnter.setBounds(70, 80, 140, 25);
        courseEnter.addActionListener(new LearningSystemManager());
        panel.add(courseEnter);

        panel.setLayout(null);
        frame.setVisible(true);
    }

    public static void teacherQuizMenu() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        lsmTool = new JLabel("Learning System Management Tool");
        lsmTool.setBounds(90, 20, 500, 25);
        panel.add(lsmTool);

        createQuiz = new JButton("Create a Quiz");
        createQuiz.setBounds(80, 50, 250, 25);
        createQuiz.addActionListener(new LearningSystemManager());
        panel.add(createQuiz);

        editQuiz = new JButton("Edit Quiz");
        editQuiz.setBounds(80, 80, 250, 25);
        editQuiz.addActionListener(new LearningSystemManager());
        panel.add(editQuiz);

        deleteQuiz = new JButton("Delete Quiz");
        deleteQuiz.setBounds(80, 110, 250, 25);
        deleteQuiz.addActionListener(new LearningSystemManager());
        panel.add(deleteQuiz);

        viewStudentQuizSubmissions = new JButton("View Student Quiz Submissions");
        viewStudentQuizSubmissions.setBounds(80, 140, 250, 25);
        viewStudentQuizSubmissions.addActionListener(new LearningSystemManager());
        panel.add(viewStudentQuizSubmissions);


        panel.setLayout(null);
        frame.setVisible(true);
    }

    public static void createStudent() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        welcomeLabel = new JLabel("Create a student account");
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

        loginButton = new JButton("Login");
        loginButton.setBounds(30, 150, 80, 25);
        loginButton.addActionListener(new LearningSystemManager());
        panel.add(loginButton);


        frame.setVisible(true);
    }

    public static void logInStudent() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        welcomeLabel = new JLabel("Log In to your student account");
        welcomeLabel.setBounds(80, 20, 200, 25);
        panel.add(welcomeLabel);

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

        loginButton = new JButton("Login");
        loginButton.setBounds(30, 150, 80, 25);
        loginButton.addActionListener(new LearningSystemManager());
        panel.add(loginButton);


        frame.setVisible(true);
    }

    public static void studentMenu() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        lsmTool = new JLabel("Learning System Management Tool");
        lsmTool.setBounds(90, 20, 500, 25);
        panel.add(lsmTool);

        takeQuiz = new JButton("Take a Quiz");
        takeQuiz.setBounds(80, 50, 250, 25);
        takeQuiz.addActionListener(new LearningSystemManager());
        panel.add(takeQuiz);

        viewGradedQuiz = new JButton("View Graded Quiz");
        viewGradedQuiz.setBounds(80, 80, 250, 25);
        viewGradedQuiz.addActionListener(new LearningSystemManager());
        panel.add(viewGradedQuiz);

        editAccount = new JButton("Edit Account");
        editAccount.setBounds(80, 110, 250, 25);
        editAccount.addActionListener(new LearningSystemManager());
        panel.add(editAccount);

        logout = new JButton("Logout");
        logout.setBounds(80, 140, 250, 25);
        logout.addActionListener(new LearningSystemManager());
        panel.add(logout);

        panel.setLayout(null);
        frame.setVisible(true);
    }

    public static void editAccount() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        welcomeLabel = new JLabel("Edit Student Account");
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

        loginButton = new JButton("Save and Update Account");
        loginButton.setBounds(30, 150, 200, 25);
        loginButton.addActionListener(new LearningSystemManager());
        panel.add(loginButton);


        frame.setVisible(true);

    }
    public static void teacherLogIn() {
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
        loginButton.addActionListener(new LearningSystemManager());
        panel.add(loginButton);


        frame.setVisible(true);
    }

    public static void studentLogIn() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        welcomeLabel = new JLabel("Welcome students!");
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
        loginButton.addActionListener(new LearningSystemManager());
        panel.add(loginButton);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
