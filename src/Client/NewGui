import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Gui {
    private static String hostName;

    // create a variable to initialize new threads with


    // the threads are kept track of with a linked list
    private static LinkedList<Thread> list = new LinkedList<Thread>();

    public static JFrame mainFrame;
    public static JPanel panel;
    public static JLabel lsmTool;

    /////////////////////////
    //TEACHER MENU ATTRIBUTES
    /////////////////////////
    public static JButton createTeacherButton;
    public static JButton loginTeacherAccountButton;
    public static JButton createTeacherAccountButton;
    public static JFrame accountCreatedTeacherFrame;
    public static JPanel accountCreatedTeacherPanel;
    public static JLabel teacherAccountCreatedLabel;
    public static JButton teacherLogInButton;
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

    public static JFrame editTeachAccountDoneFrame;
    public static JPanel editTeachAccountDonePanel;
    public static JLabel accountUpdatedLabel;
    public static JButton editTeacAccountDoneBackButton;
    public static JFrame teachAccountCreationFailedFrame;
    public static JPanel teachAccountCreationFailedPanel;
    public static JLabel accountCreationLabel;
    public static JButton teachAccountCreationFailedBackButton;


    public static JButton loginTeacherButton;
    public static JButton loginStudentButton;


    /////////////////////
    //Student attributes
    ////////////////////
    public static JButton createStudentButton;
    public static JButton loginStudentAccountButton;
    public static JButton createStudentAccountButton;

    public static JFrame accountCreatedStudentFrame;
    public static JPanel accountCreatedStudentPanel;
    public static JLabel studentAccountCreatedLabel;
    public static JButton studentLogInButton;
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

    public static JFrame editStudentAccountDoneFrame;
    public static JPanel editStudentAccountDonePanel;
    public static JButton editStuAccountDoneBackButton;

    public static JFrame studAccountCreationFailedFrame;
    public static JPanel studAccountCreationFailedPanel;
    public static JButton stuAccountCreationFailedBackButton;

    public static JPanel studentMenuPanel;
    public static JFrame teacherCourseMenuFrame;
    public static JPanel teacherCourseMenuPanel;
    public static JLabel addCourseLabel;
    public static JButton yesCourseButton;
    public static JButton noCourseButton;
    public static JPanel addCoursePanel;
    public static JFrame addCourseFrame;
    public static JLabel enterCourseNameLabel;
    public static JTextField enterCourseNameText;
    public static JButton createCourseButton;
    public static JButton addCourseBackButton;

    public static String username = "";

    //////////INVALID LABELS (replaced from JOptionPanes/////////////
    public static JLabel createAccountErrorLabel;
    public static JLabel logInErrorLabel;

    public static void main(String[] args) {
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
            mainFrame.setVisible(false);
            mainFrame.dispose();
            loginTeacher();

        });
        panel.add(loginTeacherButton);

        loginStudentButton = new JButton("Login Student");
        loginStudentButton.setBounds(110, 80, 150, 25);
        loginStudentButton.addActionListener((e) -> {
            mainFrame.setVisible(false);
            mainFrame.dispose();
            loginStudent();

        });
        panel.add(loginStudentButton);

        createTeacherButton = new JButton("Create Teacher");
        createTeacherButton.setBounds(110, 110, 150, 25);
        createTeacherButton.addActionListener((e) -> {
            mainFrame.setVisible(false);
            mainFrame.dispose();
            createTeacher();
        });
        panel.add(createTeacherButton);

        createStudentButton = new JButton("Create Student");
        createStudentButton.setBounds(110, 140, 150, 25);
        createStudentButton.addActionListener((e) -> {
            mainFrame.setVisible(false);
            mainFrame.dispose();
            createStudent();

        });
        panel.add(createStudentButton);

        panel.setLayout(null);
        mainFrame.setVisible(true);

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
            if ((Boolean) ClientClass.serverCall(1, new String[] {createTeacherNameText.getText(),
                    createTeacherUsernameText.getText(), createTeacherPasswordText.getText()})) {
                createTeacherFrame.setVisible(false);
                createTeacherFrame.dispose();
                accountCreatedTeacher();
            } else {
                createTeacherFrame.setVisible(false);
                createTeacherFrame.dispose();
                teachAccountCreationFailed();

            }

        });
        createTeacherPanel.add(createTeacherAccountButton);


        createTeacherFrame.setVisible(true);

    }

    public static void teachAccountCreationFailed(){
        teachAccountCreationFailedFrame = new JFrame();
        teachAccountCreationFailedPanel = new JPanel();
        teachAccountCreationFailedFrame.setSize(400, 300);
        teachAccountCreationFailedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teachAccountCreationFailedFrame.add(teachAccountCreationFailedPanel);
        teachAccountCreationFailedPanel.setLayout(null);

        accountCreationLabel = new JLabel("This account has already been created.");
        accountCreationLabel.setBounds(110, 20, 330, 25);
        teachAccountCreationFailedPanel.add(accountCreationLabel);

        teachAccountCreationFailedBackButton = new JButton("Back to Create Account");
        teachAccountCreationFailedBackButton.setBounds(150, 70, 210, 25);
        teachAccountCreationFailedPanel.add(teachAccountCreationFailedBackButton);

        teachAccountCreationFailedBackButton.addActionListener(e -> {
            teachAccountCreationFailedPanel.setVisible(false);
            teachAccountCreationFailedFrame.dispose();
            createTeacher();
        });

        teachAccountCreationFailedPanel.setLayout(null);

        teachAccountCreationFailedFrame.setVisible(true);
    }


    public static void accountCreatedTeacher() {
        accountCreatedTeacherFrame = new JFrame();
        accountCreatedTeacherPanel = new JPanel();
        accountCreatedTeacherFrame.setSize(400, 300);
        accountCreatedTeacherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        accountCreatedTeacherFrame.add(accountCreatedTeacherPanel);
        accountCreatedTeacherPanel.setLayout(null);

        teacherAccountCreatedLabel = new JLabel("Account successfully created!");
        teacherAccountCreatedLabel.setBounds(110, 20, 200, 25);
        accountCreatedTeacherPanel.add(teacherAccountCreatedLabel);

        teacherLogInButton = new JButton("Log In");
        teacherLogInButton.setBounds(150, 70, 90, 25);
        accountCreatedTeacherPanel.add(teacherLogInButton);

        teacherLogInButton.addActionListener(e -> {
            accountCreatedTeacherFrame.setVisible(false);
            accountCreatedTeacherFrame.dispose();
            loginTeacher();
        });

        accountCreatedTeacherPanel.setLayout(null);

        accountCreatedTeacherFrame.setVisible(true);

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
            if ((Boolean) ClientClass.serverCall(0, new String[] {teacherUsernameText.getText(),
                    teacherPasswordText.getText()})) {
                teacherLoginFrame.setVisible(false);
                teacherLoginFrame.dispose();
                teacherCourseMenu();
                username = teacherUsernameText.getText();
            } else {
                teacherLoginFrame.setVisible(false);
                teacherLoginFrame.dispose();
                //JOptionPane.showMessageDialog(null, "Incorrect username or password.", "Login", JOptionPane.WARNING_MESSAGE);
                mainMenu();
            }
        });
        loginTeacherAccountButton.setBounds(30, 120, 80, 25);
        teacherLoginPanel.add(loginTeacherAccountButton);


        teacherLoginFrame.setVisible(true);
    }


    public static void teacherCourseMenu() {
        teacherCourseMenuFrame = new JFrame();
        teacherCourseMenuPanel = new JPanel();
        teacherCourseMenuFrame.setSize(400, 300);
        teacherCourseMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teacherCourseMenuFrame.add(teacherCourseMenuPanel);

        addCourseLabel = new JLabel("Do you want to add a course?");
        addCourseLabel.setBounds(80, 20, 200, 25);
        teacherCourseMenuPanel.add(addCourseLabel);

        yesCourseButton = new JButton("Yes");
        yesCourseButton.setBounds(120, 50, 80, 25);
        teacherCourseMenuPanel.add(yesCourseButton);

        yesCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherCourseMenuFrame.setVisible(false);
                teacherCourseMenuFrame.dispose();
                addCourse();
            }
        });

        noCourseButton = new JButton("No");
        noCourseButton.setBounds(120, 80, 80, 25);
        teacherCourseMenuPanel.add(noCourseButton);

        //if teacher doesn't want to create a course
        noCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherCourseMenuFrame.setVisible(false);
                teacherCourseMenuFrame.dispose();
                teacherQuizMenu();
            }
        });


        teacherCourseMenuPanel.setLayout(null);
        teacherCourseMenuFrame.setVisible(true);

    }

    public static void addCourse() {

        addCourseFrame = new JFrame();
        addCoursePanel = new JPanel();
        addCourseFrame.setSize(400, 300);
        addCourseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addCourseFrame.add(addCoursePanel);

        // if yes to adding a course
        // PATHWAY IS

        enterCourseNameLabel = new JLabel("Enter Course Name:");
        enterCourseNameLabel.setBounds(130, 20, 200, 25);
        addCoursePanel.add(enterCourseNameLabel);

        enterCourseNameText = new JTextField(50);
        enterCourseNameText.setBounds(120, 50, 165, 25);
        addCoursePanel.add(enterCourseNameText);

        createCourseButton = new JButton("Create Course");
        createCourseButton.setBounds(180, 80, 140, 25);
        addCoursePanel.add(createCourseButton);

        createCourseButton.addActionListener(e -> {
            addCourseFrame.setVisible(false);
            addCourseFrame.dispose();
            teacherQuizMenu();
        });

        addCourseBackButton = new JButton("Back");
        addCourseBackButton.setBounds(60, 80, 80, 25);
        addCoursePanel.add(addCourseBackButton);

        addCourseBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCourseFrame.setVisible(false);
                addCourseFrame.dispose();
                teacherCourseMenu();
            }
        });

        addCoursePanel.setLayout(null);
        addCourseFrame.setVisible(true);
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
            if ((Boolean) ClientClass.serverCall(3, new String[]{createStudentNameText.getText(),
                    createStudentUsernameText.getText(), createStudentPasswordText.getText()})) {
                createStudentFrame.setVisible(false);
                createStudentFrame.dispose();
                accountCreatedStudent();
            } else {
                createStudentFrame.setVisible(false);
                createStudentFrame.dispose();
                studAccountCreationFailed();
            }
        });
        createStudentPanel.add(createStudentAccountButton);


        createStudentFrame.setVisible(true);
    }

    public static void studAccountCreationFailed(){
        studAccountCreationFailedFrame = new JFrame();
        studAccountCreationFailedPanel = new JPanel();
        studAccountCreationFailedFrame.setSize(400, 300);
        studAccountCreationFailedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studAccountCreationFailedFrame.add(studAccountCreationFailedPanel);
        studAccountCreationFailedPanel.setLayout(null);

        accountCreationLabel = new JLabel("This account has already been created.");
        accountCreationLabel.setBounds(15, 20, 380, 25);
        studAccountCreationFailedPanel.add(accountCreationLabel);

        stuAccountCreationFailedBackButton = new JButton("Back to Create Account");
        stuAccountCreationFailedBackButton.setBounds(100, 70, 210, 25);
        studAccountCreationFailedPanel.add(stuAccountCreationFailedBackButton);

        stuAccountCreationFailedBackButton.addActionListener(e -> {
            studAccountCreationFailedPanel.setVisible(false);
            studAccountCreationFailedFrame.dispose();
            createStudent();
        });

        studAccountCreationFailedPanel.setLayout(null);

        studAccountCreationFailedFrame.setVisible(true);
    }

    public static void accountCreatedStudent() {
        accountCreatedStudentFrame = new JFrame();
        accountCreatedStudentPanel = new JPanel();
        accountCreatedStudentFrame.setSize(400, 300);
        accountCreatedStudentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        accountCreatedStudentFrame.add(accountCreatedStudentPanel);
        accountCreatedStudentPanel.setLayout(null);

        studentAccountCreatedLabel = new JLabel("Account successfully created!");
        studentAccountCreatedLabel.setBounds(80, 20, 200, 25);
        accountCreatedStudentPanel.add(studentAccountCreatedLabel);

        studentLogInButton = new JButton("Log In");
        studentLogInButton.setBounds(130, 60, 80, 25);
        accountCreatedStudentPanel.add(studentLogInButton);

        studentLogInButton.addActionListener(e -> {
            accountCreatedStudentFrame.setVisible(false);
            accountCreatedStudentFrame.dispose();
            loginStudent();
        });

        accountCreatedStudentFrame.setVisible(true);

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
            if ((Boolean) ClientClass.serverCall(2, new String[]{studentUsernameText.getText(), studentPasswordText.getText()})) {
                studentLoginFrame.setVisible(false);
                studentLoginFrame.dispose();
                studentMenu();
                username = studentUsernameText.getText();
            } else {
                logInErrorLabel = new JLabel("Login Error Label");
                logInErrorLabel.setBounds(150, 150, 150, 25);
                studentLoginPanel.add(logInErrorLabel);
                //JOptionPane.showMessageDialog(null, "Account creation failed.", "Login", JOptionPane.WARNING_MESSAGE);
                mainMenu();
            }
        });
        loginStudentAccountButton.setBounds(30, 120, 80, 25);
        studentLoginPanel.add(loginStudentAccountButton);


        studentLoginFrame.setVisible(true);
    }


    public static void studentMenu() {
        JFrame studentMenuFrame = new JFrame();
        studentMenuPanel = new JPanel();
        studentMenuFrame.setSize(400, 300);
        studentMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentMenuFrame.add(studentMenuPanel);

        JLabel lsmToolLabel = new JLabel("Learning System Management Tool");
        lsmToolLabel.setBounds(90, 20, 500, 25);
        studentMenuPanel.add(lsmToolLabel);

        JButton takeQuizButton = new JButton("Take a Quiz");
        takeQuizButton.setBounds(80, 50, 250, 25);

        studentMenuPanel.add(takeQuizButton);

        takeQuizButton.addActionListener(e -> {
            studentMenuFrame.setVisible(false);
            studentMenuFrame.dispose();
            whichQuizToTake();
        });

        JButton viewGradedQuizButton = new JButton("View Graded Quiz");
        viewGradedQuizButton.setBounds(80, 80, 250, 25);

        studentMenuPanel.add(viewGradedQuizButton);

        viewGradedQuizButton.addActionListener(e -> {
            studentMenuFrame.setVisible(false);
            studentMenuFrame.dispose();
            viewGradedQuiz((ArrayList<QuizSubmission>) ClientClass.serverCall(9,username));
        });

        JButton editStudentAccountButton = new JButton("Edit Account");
        editStudentAccountButton.setBounds(80, 110, 250, 25);

        studentMenuPanel.add(editStudentAccountButton);

        editStudentAccountButton.addActionListener(e -> {
            studentMenuFrame.setVisible(false);
            studentMenuFrame.dispose();
            editStudentAccount();
        });

        JButton studentLogOutButton = new JButton("Logout");
        studentLogOutButton.setBounds(80, 140, 250, 25);

        studentMenuPanel.add(studentLogOutButton);


        studentLogOutButton.addActionListener(e -> {
            studentMenuFrame.setVisible(false);
            studentMenuFrame.dispose();
            mainMenu();
        });

        JButton deleteStudentAccount = new JButton("Delete Account");
        deleteStudentAccount.setBounds(30, 170, 190, 25);
        studentMenuPanel.add(deleteStudentAccount);

        deleteStudentAccount.addActionListener(e -> {
            ClientClass.serverCall(13, username);
            studentMenuFrame.setVisible(false);
            studentMenuFrame.dispose();
            mainMenu();
        });

        studentMenuPanel.setLayout(null);
        studentMenuFrame.setVisible(true);
    }

    public static void teacherQuizMenu() {
        JFrame teacherQuizMenuFrame = new JFrame();
        JPanel teacherQuizMenuPanel = new JPanel();
        teacherQuizMenuFrame.setSize(400, 300);
        teacherQuizMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teacherQuizMenuFrame.add(teacherQuizMenuPanel);

        JLabel lsmToolLabel = new JLabel("Learning System Management Tool");
        lsmToolLabel.setBounds(90, 20, 500, 25);
        teacherQuizMenuPanel.add(lsmToolLabel);

        JButton createQuizButton = new JButton("Create a Quiz");
        createQuizButton.setBounds(80, 50, 250, 25);
        teacherQuizMenuPanel.add(createQuizButton);

        createQuizButton.addActionListener(e -> {
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            createQuiz();
        });

        JButton editQuizButton = new JButton("Edit Quiz");
        editQuizButton.setBounds(80, 80, 250, 25);
        teacherQuizMenuPanel.add(editQuizButton);

        editQuizButton.addActionListener(e -> {
            ArrayList<String> quizNames = (ArrayList<String>) ClientClass.serverCall(6, " ");
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            editQuiz(quizNames);
        });

        JButton deleteQuizButton = new JButton("Delete Quiz");
        deleteQuizButton.setBounds(80, 110, 250, 25);
        teacherQuizMenuPanel.add(deleteQuizButton);

        deleteQuizButton.addActionListener((e) -> {
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            deleteQuiz();
        });

        JButton viewStudentQuizSubmissionsButton = new JButton("View Student Quiz Submissions");
        viewStudentQuizSubmissionsButton.setBounds(80, 140, 250, 25);
        teacherQuizMenuPanel.add(viewStudentQuizSubmissionsButton);

        viewStudentQuizSubmissionsButton.addActionListener((e) -> {
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            viewStudentQuizSubmissions();
        });

        JButton editTeacherAccountButton = new JButton("Edit Account");
        editTeacherAccountButton.setBounds(80, 170, 250, 25);
        teacherQuizMenuPanel.add(editTeacherAccountButton);

        editTeacherAccountButton.addActionListener((e) -> {
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            editTeacherAccount();

        });


        JButton teacherQuizMenuBackButton = new JButton("Logout");
        teacherQuizMenuBackButton.setBounds(30, 200, 110, 25);
        teacherQuizMenuPanel.add(teacherQuizMenuBackButton);

        teacherQuizMenuBackButton.addActionListener(e -> {
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            mainMenu();
        });

        JButton deleteTeacherAccount = new JButton("Delete Account");
        deleteTeacherAccount.setBounds(30, 230, 190, 25);
        teacherQuizMenuPanel.add(deleteTeacherAccount);
        deleteTeacherAccount.addActionListener(e -> {
            ClientClass.serverCall(12, username);
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            mainMenu();
        });


        teacherQuizMenuPanel.setLayout(null);
        teacherQuizMenuFrame.setVisible(true);
    }

    public static void createQuiz() {
        JFrame createQuizFrame = new JFrame();
        JPanel createQuizPanel = new JPanel();
        createQuizFrame.setSize(400, 300);
        createQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createQuizFrame.add(createQuizPanel);

        JLabel lsmToolLabel = new JLabel("Create a Quiz");
        lsmToolLabel.setBounds(130, 20, 500, 25);
        createQuizPanel.add(lsmToolLabel);

        JLabel nameOfQuizLabel = new JLabel("Name of Quiz:");
        nameOfQuizLabel.setBounds(20, 50, 150, 25);
        createQuizPanel.add(nameOfQuizLabel);

        JTextField nameOfQuizText = new JTextField(20);
        nameOfQuizText.setBounds(120, 50, 125, 25);
        createQuizPanel.add(nameOfQuizText);

        JLabel formatOfQuizLabel = new JLabel("Format of Quiz:");
        formatOfQuizLabel.setBounds(20, 90, 150, 25);
        createQuizPanel.add(formatOfQuizLabel);

        JButton formatOfQuiz1Button = new JButton("Multiple-Choice");
        formatOfQuiz1Button.setBounds(80, 130, 190, 25);
        createQuizPanel.add(formatOfQuiz1Button);

        formatOfQuiz1Button.addActionListener(e -> {
            createQuizFrame.setVisible(false);
            createQuizFrame.dispose();
            multipleChoiceQuiz(nameOfQuizText.getText());
        });

        JButton formatOfQuiz2Button = new JButton("True/False");
        formatOfQuiz2Button.setBounds(80, 160, 190, 25);
        createQuizPanel.add(formatOfQuiz2Button);

        formatOfQuiz2Button.addActionListener(e -> {
            createQuizFrame.setVisible(false);
            createQuizFrame.dispose();
            //trueOrFalseQuiz();
        });

        JButton createQuizBackButton = new JButton("Back");
        createQuizBackButton.setBounds(30, 190, 110, 25);
        createQuizPanel.add(createQuizBackButton);

        createQuizBackButton.addActionListener(e -> {
            createQuizFrame.setVisible(false);
            createQuizFrame.dispose();
            teacherQuizMenu();
        });

        createQuizPanel.setLayout(null);
        createQuizFrame.setVisible(true);
    }
    static ArrayList<Question> questions = new ArrayList<>();

    public static void multipleChoiceQuiz(String quizName) {
        JFrame multipleChoiceQuizFrame = new JFrame();
        JPanel multipleChoiceQuizPanel = new JPanel();
        multipleChoiceQuizFrame.setSize(400, 320);
        multipleChoiceQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        multipleChoiceQuizFrame.add(multipleChoiceQuizPanel);

        JLabel lsmToolLabel = new JLabel("Name of Quiz: "); // + show name of quiz);
        lsmToolLabel.setBounds(130, 20, 500, 25);
        multipleChoiceQuizPanel.add(lsmToolLabel);

        var questionOneMCLabel = new JLabel("Type in Question");
        questionOneMCLabel.setBounds(20, 50, 130, 25);
        multipleChoiceQuizPanel.add(questionOneMCLabel);

        var questionOneMCText = new JTextField(20);
        questionOneMCText.setBounds(210, 50, 165, 25);
        multipleChoiceQuizPanel.add(questionOneMCText);

        var optionOneMCLabel = new JLabel("Option 1:");
        optionOneMCLabel.setBounds(20, 80, 80, 25);
        multipleChoiceQuizPanel.add(optionOneMCLabel);

        var optionOneMCText = new JTextField(20);
        optionOneMCText.setBounds(210, 80, 165, 25);
        multipleChoiceQuizPanel.add(optionOneMCText);

        var optionTwoMCLabel = new JLabel("Option 2:");
        optionTwoMCLabel.setBounds(20, 110, 80, 25);
        multipleChoiceQuizPanel.add(optionTwoMCLabel);

        var optionTwoMCText = new JTextField(20);
        optionTwoMCText.setBounds(210, 110, 165, 25);
        multipleChoiceQuizPanel.add(optionTwoMCText);

        var optionThreeMCLabel = new JLabel("Option 3:");
        optionThreeMCLabel.setBounds(20, 140, 80, 25);
        multipleChoiceQuizPanel.add(optionThreeMCLabel);

        var optionThreeMCText = new JTextField(20);
        optionThreeMCText.setBounds(210, 140, 165, 25);
        multipleChoiceQuizPanel.add(optionThreeMCText);

        var optionFourMCLabel = new JLabel("Option 4:");
        optionFourMCLabel.setBounds(20, 170, 80, 25);
        multipleChoiceQuizPanel.add(optionFourMCLabel);

        var optionFourMCText = new JTextField(20);
        optionFourMCText.setBounds(210, 170, 165, 25);
        multipleChoiceQuizPanel.add(optionFourMCText);

        var correctAnsChoiceMCLabel = new JLabel("Enter correct answer choice:");
        correctAnsChoiceMCLabel.setBounds(20, 200, 250, 25);
        multipleChoiceQuizPanel.add(correctAnsChoiceMCLabel);

        var correctAnsChoiceMCText = new JTextField(20);
        correctAnsChoiceMCText.setBounds(210, 200, 165, 25);
        multipleChoiceQuizPanel.add(correctAnsChoiceMCText);

        var pointValueMCLabel = new JLabel("Enter the point value:");
        pointValueMCLabel.setBounds(20, 230, 250, 25);
        multipleChoiceQuizPanel.add(pointValueMCLabel);

        var pointValueMCText = new JTextField(20);
        pointValueMCText.setBounds(210, 230, 165, 25);
        multipleChoiceQuizPanel.add(pointValueMCText);

        //adds the questions
        var addQuestionMCButton = new JButton("Add Question");
        addQuestionMCButton.setBounds(210, 260, 150, 25);
        multipleChoiceQuizPanel.add(addQuestionMCButton);

        // once the add question button is clicked, we need to add the question to the list of questions for that specific quiz
        // calls the method that displays the screen and asks if the user wants to add another question or not

        addQuestionMCButton.addActionListener(e -> {
            Question q = new Question(questionOneMCText.getText());
            q.addChoice(optionOneMCText.getText());
            q.addChoice(optionTwoMCText.getText());
            q.addChoice(optionThreeMCText.getText());
            q.addChoice(optionFourMCText.getText());

            if (correctAnsChoiceMCText.getText().equals("1"))
                q.setAnswer(optionOneMCText.getText());
            if (correctAnsChoiceMCText.getText().equals("2"))
                q.setAnswer(optionTwoMCText.getText());
            if (correctAnsChoiceMCText.getText().equals("3"))
                q.setAnswer(optionThreeMCText.getText());
            if (correctAnsChoiceMCText.getText().equals("4"))
                q.setAnswer(optionFourMCText.getText());

            q.setPointValue(Integer.parseInt(pointValueMCText.getText()));
            questions.add(q);


            JFrame addAnotherQuestionFrame = new JFrame();
            JPanel addAnotherQuestionPanel = new JPanel();
            addAnotherQuestionFrame.setSize(400, 300);
            addAnotherQuestionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            addAnotherQuestionFrame.add(addAnotherQuestionPanel);

            var addAnotherQuestionLabel = new JLabel("Do you want to add another question?");
            addAnotherQuestionLabel.setBounds(70, 20, 280, 25);
            addAnotherQuestionPanel.add(addAnotherQuestionLabel);

            var yesAnotherQuestionButton = new JButton("Yes");
            yesAnotherQuestionButton.setBounds(110, 50, 80, 25);
            addAnotherQuestionPanel.add(yesAnotherQuestionButton);
            yesAnotherQuestionButton.addActionListener(ae -> {
                multipleChoiceQuizFrame.setVisible(false);
                multipleChoiceQuizFrame.dispose();
                addAnotherQuestionFrame.setVisible(false);
                addAnotherQuestionFrame.dispose();
                multipleChoiceQuiz(quizName);
            });

            //if the user wants to add another question, display the screen of the question, options, correct answer and point value again
            //this time however, it should say type in question 2
            //call whichever type of quiz based on the format of the quiz
        /*
        yesAnotherQuestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                multipleChoiceQuiz();
                trueOrFalseQuiz();
            }
        });
        */

            // if the user doesn't want to add another question
            var noAnotherQuestionButton = new JButton("No");
            noAnotherQuestionButton.setBounds(200, 50, 80, 25);
            addAnotherQuestionPanel.add(noAnotherQuestionButton);
            noAnotherQuestionButton.addActionListener(ae -> {
                if ((Boolean) ClientClass.serverCall(4, new Quiz(questions, quizName))) {
                    multipleChoiceQuizFrame.setVisible(false);
                    multipleChoiceQuizFrame.dispose();
                    addAnotherQuestionFrame.setVisible(false);
                    addAnotherQuestionFrame.dispose();
                    teacherQuizMenu();
                }

            });

            // save the quiz if the user doesn't want to add another question
        /*
        noAnotherQuestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        */

            addAnotherQuestionPanel.setLayout(null);
            addAnotherQuestionFrame.setVisible(true);
        });

        JButton multipleChoiceQuizBackButton = new JButton("Back");
        multipleChoiceQuizBackButton.setBounds(30, 290, 110, 25);
        multipleChoiceQuizPanel.add(multipleChoiceQuizBackButton);

        multipleChoiceQuizBackButton.addActionListener(e -> {
            multipleChoiceQuizFrame.setVisible(false);
            multipleChoiceQuizFrame.dispose();
            createQuiz();
        });

        multipleChoiceQuizPanel.setLayout(null);
        multipleChoiceQuizFrame.setVisible(true);
    }

    public static void editQuiz(ArrayList<String> quizNames) {
        JFrame editQuizFrame = new JFrame();
        JPanel editQuizPanel = new JPanel();
        editQuizFrame.setSize(400, 300);
        editQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editQuizFrame.add(editQuizPanel);

        JLabel lsmToolLabel = new JLabel("Edit a Quiz");
        lsmToolLabel.setBounds(160, 20, 500, 25);
        editQuizPanel.add(lsmToolLabel);


        JComboBox jComboBox = new JComboBox(quizNames.toArray());
        jComboBox.setBounds(100, 70, 180, 20);

        editQuizPanel.add(jComboBox);

        editQuizPanel.setLayout(null);
        editQuizFrame.setVisible(true);
        JButton nextForEditQuiz = new JButton("Next");
        nextForEditQuiz.setBounds(120, 220, 110, 25);
        editQuizPanel.add(nextForEditQuiz);

        nextForEditQuiz.addActionListener(e -> {
            editQuizFrame.setVisible(false);
            editQuizFrame.dispose();

            questionForEditQuiz((Quiz) ClientClass.serverCall(7, jComboBox.getSelectedItem())); // this brings the question to the next screen
            // (where they can edit the questions)
        });

        editQuizPanel.setLayout(null);
        editQuizFrame.setVisible(true);

    }

    //question screen that teacher can edit from
    public static void questionForEditQuiz(Quiz q) {

        //if multiple choice

        JFrame questionForEditQuizFrame = new JFrame();
        JPanel questionForEditQuizPanel = new JPanel();
        questionForEditQuizFrame.setSize(400, 320);
        questionForEditQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questionForEditQuizFrame.add(questionForEditQuizPanel);

        ArrayList<String> questionTitles = new ArrayList<>();
        for(Question question: q.getQuestions()) {
            questionTitles.add(question.getQuestionTitle());
        }
        JComboBox jComboBox = new JComboBox(questionTitles.toArray());
        jComboBox.setBounds(130, 30, 200, 25);

        questionForEditQuizPanel.add(jComboBox);

        JLabel questionOneMCLabel = new JLabel("Question: ");
        questionOneMCLabel.setBounds(20, 30, 160, 25);
        questionForEditQuizPanel.add(questionOneMCLabel);

/*
        JTextField editQuestionOneMCText = new JTextField(20);
        editQuestionOneMCText.setBounds(210, 50, 165, 25);
        questionForEditQuizPanel.add(editQuestionOneMCText);

 */

        JLabel optionOneEditLabel = new JLabel("Option 1:");
        optionOneEditLabel.setBounds(20, 60, 80, 25);
        questionForEditQuizPanel.add(optionOneEditLabel);


        JTextField editOptionOneMCText = new JTextField(20);
        editOptionOneMCText.setBounds(210, 60, 165, 25);
        questionForEditQuizPanel.add(editOptionOneMCText);

        JLabel optionTwoEditLabel = new JLabel("Option 2:");
        optionTwoEditLabel.setBounds(20, 90, 80, 25);
        questionForEditQuizPanel.add(optionTwoEditLabel);


        JTextField editOptionTwoMCText = new JTextField(20);
        editOptionTwoMCText.setBounds(210, 90, 165, 25);
        questionForEditQuizPanel.add(editOptionTwoMCText);

        JLabel optionThreeEditLabel = new JLabel("Option 3:");
        optionThreeEditLabel.setBounds(20, 120, 80, 25);
        questionForEditQuizPanel.add(optionThreeEditLabel);


        JTextField editOptionThreeMCText = new JTextField(20);
        editOptionThreeMCText.setBounds(210, 120, 165, 25);
        questionForEditQuizPanel.add(editOptionThreeMCText);

        JLabel optionFourEditLabel = new JLabel("Option 4:");
        optionFourEditLabel.setBounds(20, 150, 80, 25);
        questionForEditQuizPanel.add(optionFourEditLabel);


        JTextField editOptionFourMCText = new JTextField(20);
        editOptionFourMCText.setBounds(210, 150, 165, 25);
        questionForEditQuizPanel.add(editOptionFourMCText);

        JLabel correctAnsChoiceMCLabel = new JLabel("Enter correct answer choice:");
        correctAnsChoiceMCLabel.setBounds(20, 180, 250, 25);
        questionForEditQuizPanel.add(correctAnsChoiceMCLabel);


        JTextField editCorrectAnsChoiceMCText = new JTextField(20);
        editCorrectAnsChoiceMCText.setBounds(210, 180, 165, 25);
        questionForEditQuizPanel.add(editCorrectAnsChoiceMCText);

        JLabel pointValueMCLabel = new JLabel("Enter the point value:");
        pointValueMCLabel.setBounds(20, 210, 250, 25);
        questionForEditQuizPanel.add(pointValueMCLabel);


        JTextField editPointValueMCText = new JTextField(20);
        editPointValueMCText.setBounds(210, 210, 165, 25);
        questionForEditQuizPanel.add(editPointValueMCText);

        //saves question
        JButton saveEditQuizButton = new JButton("Save and Update Quiz");
        saveEditQuizButton.setBounds(210, 240, 150, 25);
        questionForEditQuizPanel.add(saveEditQuizButton);

        // once the add question button is clicked, we need to add the question to the list of questions \
        // for that specific quiz
        // calls the method that displays the screen and asks if the user wants to add another question or not


        saveEditQuizButton.addActionListener(e -> {
            Question newQuestion = new Question( (String)jComboBox.getSelectedItem());
            newQuestion.addChoice(editOptionOneMCText.getText());
            newQuestion.addChoice(editOptionTwoMCText.getText());
            newQuestion.addChoice(editOptionThreeMCText.getText());
            newQuestion.addChoice(editOptionFourMCText.getText());
            newQuestion.setAnswer(editPointValueMCText.getText());
            q.setQuestion(newQuestion, jComboBox.getSelectedIndex());
            ClientClass.serverCall(11, q);
            questionForEditQuizFrame.setVisible(false);
            questionForEditQuizFrame.dispose();
            teacherQuizMenu();
        });

        //

        questionForEditQuizPanel.setLayout(null);
        questionForEditQuizFrame.setVisible(true);
    }


    public static void editTeacherAccount() {
        JFrame editTeacherAccountFrame = new JFrame();
        JPanel editTeacherAccountPanel = new JPanel();
        editTeacherAccountFrame.setSize(400, 300);
        editTeacherAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editTeacherAccountFrame.add(editTeacherAccountPanel);
        editTeacherAccountPanel.setLayout(null);

        JLabel editTeacherAccountLabel = new JLabel("Edit Teacher Account");
        editTeacherAccountLabel.setBounds(130, 20, 200, 25);
        editTeacherAccountPanel.add(editTeacherAccountLabel);


        JLabel editedTeacherNameLabel = new JLabel("First & Last Name:");
        editedTeacherNameLabel.setBounds(20, 50, 150, 25);
        editTeacherAccountPanel.add(editedTeacherNameLabel);

        JTextField editedTeacherNameText = new JTextField(20);
        editedTeacherNameText.setBounds(150, 50, 165, 25);
        editTeacherAccountPanel.add(editedTeacherNameText);

        JLabel editedTeacherUsernameLabel = new JLabel("Username:");
        editedTeacherUsernameLabel.setBounds(20, 80, 80, 25);
        editTeacherAccountPanel.add(editedTeacherUsernameLabel);

        JTextField editedTeacherUsernameText = new JTextField(20);
        editedTeacherUsernameText.setBounds(150, 80, 165, 25);
        editTeacherAccountPanel.add(editedTeacherUsernameText);

        JLabel editedTeacherPasswordLabel = new JLabel("Password:");
        editedTeacherPasswordLabel.setBounds(20, 110, 80, 25);
        editTeacherAccountPanel.add(editedTeacherPasswordLabel);

        JTextField editedTeacherPasswordText = new JTextField(20);
        editedTeacherPasswordText.setBounds(150, 110, 165, 25);
        editTeacherAccountPanel.add(editedTeacherPasswordText);

        JButton updateTeacherAccountButton = new JButton("Save and Update Account");
        updateTeacherAccountButton.setBounds(30, 150, 200, 25);
        updateTeacherAccountButton.addActionListener(e -> {
            if (((Boolean) ClientClass.serverCall(10, new String[] {username,
                    editedTeacherNameText.getText(),
                    editedTeacherUsernameText.getText(),
                    editedTeacherPasswordText.getText()})).booleanValue()){
                editTeacherAccountFrame.setVisible(false);
                editTeacherAccountFrame.dispose();
                editTeachAccountDone();
            } else {
                JOptionPane.showMessageDialog(null, "Account Info Changed unsuccessfully.",
                        "Acc Info Change", JOptionPane.INFORMATION_MESSAGE);
            }

        });
        editTeacherAccountPanel.add(updateTeacherAccountButton);

        JButton editTeacherAccountBackButton = new JButton("Back");
        editTeacherAccountBackButton.setBounds(30, 180, 110, 25);
        editTeacherAccountPanel.add(editTeacherAccountBackButton);

        editTeacherAccountBackButton.addActionListener(e -> {
            editTeacherAccountFrame.setVisible(false);
            editTeacherAccountFrame.dispose();
            teacherQuizMenu();
        });

        editTeacherAccountFrame.setVisible(true);
    }

    public static void editTeachAccountDone(){
        editTeachAccountDoneFrame = new JFrame();
        editTeachAccountDonePanel = new JPanel();
        editTeachAccountDoneFrame.setSize(400, 300);
        editTeachAccountDoneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editTeachAccountDoneFrame.add(editTeachAccountDonePanel);
        editTeachAccountDonePanel.setLayout(null);

        accountUpdatedLabel = new JLabel("Account updated!");
        accountUpdatedLabel.setBounds(140, 30, 280, 25);
        editTeachAccountDonePanel.add(accountUpdatedLabel);

        editTeacAccountDoneBackButton = new JButton("Back To HomePage");
        editTeacAccountDoneBackButton.setBounds(100, 60, 180, 25);
        editTeachAccountDonePanel.add(editTeacAccountDoneBackButton);

        editTeacAccountDoneBackButton.addActionListener(e -> {
            editTeachAccountDoneFrame.setVisible(false);
            editTeachAccountDoneFrame.dispose();
            teacherQuizMenu();
        });


        editTeachAccountDoneFrame.setVisible(true);

    }

    public static void editStudentAccount() {
        JFrame editStudentAccountFrame = new JFrame();
        JPanel editStudentAccountPanel = new JPanel();
        editStudentAccountFrame.setSize(400, 300);
        editStudentAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editStudentAccountFrame.add(editStudentAccountPanel);
        editStudentAccountPanel.setLayout(null);

        JLabel editStuAccountLabel = new JLabel("Edit Student Account");
        editStuAccountLabel.setBounds(130, 20, 200, 25);
        editStudentAccountPanel.add(editStuAccountLabel);


        JLabel editedStuNameLabel = new JLabel("First & Last Name:");
        editedStuNameLabel.setBounds(20, 50, 150, 25);
        editStudentAccountPanel.add(editedStuNameLabel);

        JTextField editedStuNameText = new JTextField(20);
        editedStuNameText.setBounds(150, 50, 165, 25);
        editStudentAccountPanel.add(editedStuNameText);

        JLabel editedStuUsernameLabel = new JLabel("Username:");
        editedStuUsernameLabel.setBounds(20, 80, 80, 25);
        editStudentAccountPanel.add(editedStuUsernameLabel);

        JTextField editedStuUsernameText = new JTextField(20);
        editedStuUsernameText.setBounds(150, 80, 165, 25);
        editStudentAccountPanel.add(editedStuUsernameText);

        JLabel editedStuPasswordLabel = new JLabel("Password:");
        editedStuPasswordLabel.setBounds(20, 110, 80, 25);
        editStudentAccountPanel.add(editedStuPasswordLabel);

        JTextField editedStuPasswordText = new JTextField(20);
        editedStuPasswordText.setBounds(150, 110, 165, 25);
        editStudentAccountPanel.add(editedStuPasswordText);

        JButton updateStuAccountButton = new JButton("Save and Update Account");
        updateStuAccountButton.setBounds(30, 150, 200, 25);
        updateStuAccountButton.addActionListener(e -> {
            if ( ((Boolean) ClientClass.serverCall(5, new String[] {username,
                    editedStuNameText.getText(),
                    editedStuUsernameText.getText(),
                    editedStuPasswordText.getText()})).booleanValue() ){
                editStudentAccountFrame.setVisible(false);
                editStudentAccountFrame.dispose();
                editStudentAccountDone();

            } else {
                JOptionPane.showMessageDialog(null, "Account Info Changed unsuccessfully.",
                        "Acc Info Change", JOptionPane.INFORMATION_MESSAGE);
            }

        });
        editStudentAccountPanel.add(updateStuAccountButton);

        JButton editStuAccountBackButton = new JButton("Back");
        editStuAccountBackButton.setBounds(30, 180, 110, 25);
        editStudentAccountPanel.add(editStuAccountBackButton);

        editStuAccountBackButton.addActionListener(e -> {
            editStudentAccountFrame.setVisible(false);
            editStudentAccountFrame.dispose();
            studentMenu();
        });

        editStudentAccountFrame.setVisible(true);
    }

    public static void editStudentAccountDone(){
        editStudentAccountDoneFrame = new JFrame();
        editStudentAccountDonePanel = new JPanel();
        editStudentAccountDoneFrame.setSize(400, 300);
        editStudentAccountDoneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editStudentAccountDoneFrame.add(editStudentAccountDonePanel);

        editStudentAccountDonePanel.setLayout(null);
        accountUpdatedLabel = new JLabel("Account updated!");
        accountUpdatedLabel.setBounds(140, 30, 280, 25);
        editStudentAccountDonePanel.add(accountUpdatedLabel);

        editStuAccountDoneBackButton = new JButton("Back To HomePage");
        editStuAccountDoneBackButton.setBounds(100, 60, 180, 25);
        editStudentAccountDonePanel.add(editStuAccountDoneBackButton);

        editStuAccountDoneBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editStudentAccountDoneFrame.setVisible(false);
                editStudentAccountDoneFrame.dispose();
                studentMenu();
            }
        });


        editStudentAccountDoneFrame.setVisible(true);

    }

    public static void whichQuizToTake() {
        JFrame whichQuizToTakeFrame = new JFrame();
        JPanel whichQuizToTakePanel = new JPanel();
        whichQuizToTakeFrame.setSize(400, 300);
        whichQuizToTakeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        whichQuizToTakeFrame.add(whichQuizToTakePanel);

        JLabel chooseQuizTakeTitleLabel = new JLabel("Choose Quiz To Take");
        chooseQuizTakeTitleLabel.setBounds(120, 20, 500, 25);
        whichQuizToTakePanel.add(chooseQuizTakeTitleLabel);

        JLabel studentChooseQuizLabel = new JLabel("Which quiz would you like to take?");
        studentChooseQuizLabel.setBounds(30, 50, 700, 25);
        whichQuizToTakePanel.add(studentChooseQuizLabel);

        //below array needs to contain the list of quizzes for the course choose by the user
        ArrayList<String> quizNames = (ArrayList<String>) ClientClass.serverCall(6, " ");
        JComboBox jComboBox = new JComboBox(quizNames.toArray());
        jComboBox.setBounds(120, 80, 140, 20);
        whichQuizToTakePanel.add(jComboBox);

        JButton quizChoosenNextButton = new JButton("Next");
        quizChoosenNextButton.setBounds(220, 180, 110, 25);
        whichQuizToTakePanel.add(quizChoosenNextButton);
        quizChoosenNextButton.addActionListener(e -> {
            Quiz q = (Quiz) ClientClass.serverCall(7, jComboBox.getSelectedItem());
            whichQuizToTakeFrame.setVisible(false);
            whichQuizToTakeFrame.dispose();

            if( !(q == null) ) {
                quizStudentTakes(q);
            }
        });
        whichQuizToTakePanel.setLayout(null);
        whichQuizToTakeFrame.setVisible(true);
    }

    public static void quizStudentTakes(Quiz q){
        ArrayList<Question> questions = q.getQuestions();
        ArrayList<Answer> answers = new ArrayList<>();
        quizView(questions, answers, 1, q);
    }

    public static void quizView(ArrayList<Question> questions, ArrayList<Answer> answers, int num, Quiz quiz) {
        Question q = questions.get(num - 1);
        ArrayList<String> choices =  q.getChoices();

        JFrame quizStudentTakesFrame1;
        quizStudentTakesFrame1 = new JFrame();
        JPanel quizStudentTakesPanel1;
        quizStudentTakesPanel1 = new JPanel();
        quizStudentTakesFrame1.setSize(400, 300);
        quizStudentTakesFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quizStudentTakesFrame1.add(quizStudentTakesPanel1);


        JLabel questionOneTitleLabel;
        questionOneTitleLabel = new JLabel("Question " + num);
        questionOneTitleLabel.setBounds(120, 20, 500, 25);
        quizStudentTakesPanel1.add(questionOneTitleLabel);

        //below label will display the first question of the quiz
        JLabel questionOneStuQuizLabel;
        questionOneStuQuizLabel = new JLabel( q.getQuestionTitle());
        questionOneStuQuizLabel.setBounds(30, 50, 700, 25);
        quizStudentTakesPanel1.add(questionOneStuQuizLabel);

        // TODO true false quiz
        //OPTIONS DISPLAYED (MULTIPLE CHOICE)
        JLabel optionOneMC = new JLabel("Option 1: " + choices.get(0));
        optionOneMC.setBounds(30, 80, 300, 25);
        quizStudentTakesPanel1.add(optionOneMC);

        JLabel optionTwoMC = new JLabel("Option 2: " + choices.get(1));
        optionTwoMC.setBounds(30, 110, 300, 25);
        quizStudentTakesPanel1.add(optionTwoMC);

        JLabel optionThreeMC = new JLabel("Option 3: " + choices.get(2));
        optionThreeMC.setBounds(30, 140, 300, 25);
        quizStudentTakesPanel1.add(optionThreeMC);

        JLabel optionFourMC = new JLabel("Option 4: " + choices.get(3));
        optionFourMC.setBounds(30, 170, 300, 25);
        quizStudentTakesPanel1.add(optionFourMC);


        JLabel typeInAnswerLabel = new JLabel("Type in Answer Choice #: ");
        typeInAnswerLabel.setBounds(30, 200, 700, 25);
        quizStudentTakesPanel1.add(typeInAnswerLabel);

        JTextField questionOneStuAns = new JTextField(20);
        questionOneStuAns.setBounds(200, 200, 60, 25);
        quizStudentTakesPanel1.add(questionOneStuAns);

        JButton quizStuTakesNextButton = new JButton("Next");
        quizStuTakesNextButton.setBounds(250, 230, 110, 25);
        quizStudentTakesPanel1.add(quizStuTakesNextButton);

        int fNum = num;
        quizStuTakesNextButton.addActionListener(e -> {
            answers.add(new Answer(q.getQuestionTitle(), questionOneStuAns.getText()));
            quizStudentTakesFrame1.setVisible(false);
            quizStudentTakesFrame1.dispose();
            if (answers.size() == questions.size()) {
                QuizSubmission qs = new QuizSubmission("", quiz.getQuizName() + " --- " + username, answers);
                ClientClass.serverCall(8, qs);
                quizStudentTakesFrame1.setVisible(false);
                quizStudentTakesFrame1.dispose();
                quizSubmitted();
            } else {
                quizView(questions, answers, fNum + 1, quiz);
            }
        });
        quizStudentTakesPanel1.setLayout(null);
        quizStudentTakesFrame1.setVisible(true);
    }

    public static void quizSubmitted() {
        JFrame quizSubmittedFrame = new JFrame();
        JPanel quizSubmittedPanel = new JPanel();
        quizSubmittedFrame.setSize(400, 300);
        quizSubmittedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quizSubmittedFrame.add(quizSubmittedPanel);
        JLabel quizSubmittedLabel = new JLabel("You are done with the quiz and it has been submitted!");
        quizSubmittedLabel.setBounds(30, 20, 500, 25);
        quizSubmittedPanel.add(quizSubmittedLabel);
        JButton quizDoneBackToStuMenuButton = new JButton("Back To HomePage");
        quizDoneBackToStuMenuButton.setBounds(90, 60, 200, 25);
        quizSubmittedPanel.add(quizDoneBackToStuMenuButton);
        quizDoneBackToStuMenuButton.addActionListener(e -> {
            quizSubmittedFrame.setVisible(false);
            quizSubmittedFrame.dispose();
            studentMenu();
        });
        quizSubmittedPanel.setLayout(null);
        quizSubmittedFrame.setVisible(true);
    }

    public static void viewGradedQuiz(ArrayList<QuizSubmission> qs) {
        ArrayList<QuizSubmission> subs = qs;

        for (QuizSubmission q : subs) {
            if (!(q.getQuizName().contains(username)))
                subs.remove(q);
        }

        String[] quizzes = new String[subs.size()];
        int i = 0;
        for (QuizSubmission q : subs) {
            quizzes[i] = q.getQuizName();
            i += 1;
        }

        JFrame viewGradedQuizFrame = new JFrame();
        JPanel viewGradedQuizPanel = new JPanel();
        viewGradedQuizFrame.setSize(400, 300);
        viewGradedQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewGradedQuizFrame.add(viewGradedQuizPanel);

        JLabel viewGradedQuizTitleLabel = new JLabel("View a Graded Quiz");
        viewGradedQuizTitleLabel.setBounds(140, 20, 500, 25);
        viewGradedQuizPanel.add(viewGradedQuizTitleLabel);

        JLabel whichGradedQuizToViewLabel = new JLabel("Which of the graded quizzes do you want to view?");
        whichGradedQuizToViewLabel.setBounds(30, 50, 500, 25);
        viewGradedQuizPanel.add(whichGradedQuizToViewLabel);

        // below array has to contain the graded quizzes for the student that is logged in
        String[] gradedQuizOptions = quizzes;
        JComboBox<String> jComboBox = new JComboBox<>(gradedQuizOptions);
        jComboBox.setBounds(120, 80, 140, 20);
        viewGradedQuizPanel.add(jComboBox);

        JButton viewQuizButton = new JButton("View Quiz");
        viewQuizButton.setBounds(90, 140, 200, 25);
        viewGradedQuizPanel.add(viewQuizButton);

        viewQuizButton.addActionListener(e -> {
            viewGradedQuizFrame.setVisible(false);
            viewGradedQuizFrame.dispose();

            for (QuizSubmission q : subs) {
                if ((q.getQuizName().equals(jComboBox.getSelectedItem())))
                    showsStuGradedQuiz(q);
            }
        });

        viewGradedQuizPanel.setLayout(null);
        viewGradedQuizFrame.setVisible(true);


    }

    public static void showsStuGradedQuiz(QuizSubmission qs){
        JFrame stuGradedQuizFrame = new JFrame();
        JPanel stuGradedQuizPanel = new JPanel();
        stuGradedQuizFrame.setSize(500, 400);
        stuGradedQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        stuGradedQuizFrame.add(stuGradedQuizPanel);

        JLabel stuGradedQuizLabel = new JLabel("Graded Quiz");
        stuGradedQuizLabel.setBounds(210, 20, 500, 25);
        stuGradedQuizPanel.add(stuGradedQuizLabel);

        JTextArea showsStuGradedQuizText = new JTextArea(getQuizString(qs));
        showsStuGradedQuizText.setBounds(30,50, 400,200);

        JScrollPane scrollPane = new JScrollPane(showsStuGradedQuizText);
        scrollPane.setBounds(10,60,300,200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        stuGradedQuizPanel.add(scrollPane);

        JButton stuGradedQuizScreenBackButton = new JButton("Back To HomePage");
        stuGradedQuizScreenBackButton.setBounds(270, 320, 190, 25);
        stuGradedQuizPanel.add(stuGradedQuizScreenBackButton);

        stuGradedQuizScreenBackButton.addActionListener(e -> {
            stuGradedQuizFrame.setVisible(false);
            stuGradedQuizFrame.dispose();
            studentMenu();
        });

        stuGradedQuizPanel.setLayout(null);
        stuGradedQuizFrame.setVisible(true);

    }

    public static String getQuizString(QuizSubmission qs) {
        int total = 0;
        int points = 0;
        String returnStr = "";

        returnStr = "Quiz: " + qs.getQuizName() + "\n";
        Date date = new Date(qs.getTimeStamp());
        returnStr = returnStr + date + "\n\n";

        int index = qs.getQuizName().indexOf("---");
        String name = "";
        if (index >= 0)
            name = qs.getQuizName().substring(0, index);
        //System.out.println(name);
        Quiz q = (Quiz) ClientClass.serverCall(7, name.trim());
        int x = 0;
        ArrayList<Answer> answs = qs.getAnswers();
        for(Question ques : q.getQuestions()) {
            returnStr = returnStr + ques.getQuestionTitle() + "\n";
            int i = 1;
            for (String c : ques.getChoices()) {
                returnStr = returnStr + i + ". " + c + "\n";
                i += 1;
            }
            String anw = answs.get(x).getAnswerChosen();
            returnStr = returnStr + "Your Answer: " + anw + "\n";
            returnStr = returnStr + "Correct Answer: " + ques.getAnswer() + "\n";
            x += 1;
            returnStr = returnStr + "\n";

            total += ques.getPointValue();
            if (anw.equals(ques.getAnswer())){
                points += ques.getPointValue();
            }
        }

        returnStr = returnStr + "\nStudent scored " + points + " out of " + total;
        return returnStr;
    }

    public static void viewStudentQuizSubmissions() {
        CopyOnWriteArrayList<Student> students = (CopyOnWriteArrayList<Student>) ClientClass.serverCall(14," ");
        String str = "";

        for( Student s : students ) {
            for (QuizSubmission q : s.getQuizSubmissions()) {
                str = str + getQuizString(q);
            }
        }

        JFrame stuGradedQuizFrame = new JFrame();
        JPanel stuGradedQuizPanel = new JPanel();
        stuGradedQuizFrame.setSize(500, 400);
        stuGradedQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        stuGradedQuizFrame.add(stuGradedQuizPanel);

        JLabel stuGradedQuizLabel = new JLabel("Student Quiz Submissions");
        stuGradedQuizLabel.setBounds(210, 20, 500, 25);
        stuGradedQuizPanel.add(stuGradedQuizLabel);

        JTextArea showsStuGradedQuizText = new JTextArea(str);
        showsStuGradedQuizText.setBounds(30,50, 400,200);

        JScrollPane scrollPane = new JScrollPane(showsStuGradedQuizText);
        scrollPane.setBounds(10,60,300,200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        stuGradedQuizPanel.add(scrollPane);

        JButton stuGradedQuizScreenBackButton = new JButton("Back To HomePage");
        stuGradedQuizScreenBackButton.setBounds(270, 320, 190, 25);
        stuGradedQuizPanel.add(stuGradedQuizScreenBackButton);

        stuGradedQuizScreenBackButton.addActionListener(e -> {
            stuGradedQuizFrame.setVisible(false);
            stuGradedQuizFrame.dispose();
            teacherQuizMenu();
        });

        stuGradedQuizPanel.setLayout(null);
        stuGradedQuizFrame.setVisible(true);
    }

    public static void deleteQuiz(){
        JFrame deleteQuizFrame = new JFrame();
        JPanel deleteQuizPanel = new JPanel();
        deleteQuizFrame.setSize(400, 300);
        deleteQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        deleteQuizFrame.add(deleteQuizPanel);

        JLabel lsmToolLabel = new JLabel("Delete a Quiz");
        lsmToolLabel.setBounds(160, 20, 500, 25);
        deleteQuizPanel.add(lsmToolLabel);

        /// CHOOSE COURSE
        JLabel deleteQuizLabel = new JLabel("Which quiz would you like to delete?");
        deleteQuizLabel.setBounds(30, 50, 700, 25);
        deleteQuizPanel.add(deleteQuizLabel);

        //below array needs to contain the list of quizzes that have been created
        ArrayList<String> quizNames = (ArrayList<String>) ClientClass.serverCall(6, " ");
        JComboBox<String> quizzesList = new JComboBox(quizNames.toArray());
        quizzesList.setBounds(120, 80, 140, 20);
        deleteQuizPanel.add(quizzesList);


        JButton deleteTheQuizButton = new JButton("Delete");
        deleteTheQuizButton.setBounds(230, 130, 110, 25);
        deleteQuizPanel.add(deleteTheQuizButton);

        deleteTheQuizButton.addActionListener(e -> {
            deleteQuizFrame.setVisible(false);
            deleteQuizFrame.dispose();
            ClientClass.serverCall(15, quizzesList.getSelectedItem());
            quizDeleted(); // this brings the question to the next screen
            // (where they can edit the questions)
        });

        deleteQuizPanel.setLayout(null);
        deleteQuizFrame.setVisible(true);
    }

    public static void quizDeleted(){
        JFrame quizDeletedFrame = new JFrame();
        JPanel quizDeletedPanel = new JPanel();
        quizDeletedFrame.setSize(400, 300);
        quizDeletedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quizDeletedFrame.add(quizDeletedPanel);

        JLabel deleteQuizLabel = new JLabel("Quiz has been deleted!");
        deleteQuizLabel.setBounds(120, 50, 700, 25);
        quizDeletedPanel.add(deleteQuizLabel);

        JButton quizDeletedBackButton = new JButton("Return to Homepage");
        quizDeletedBackButton.setBounds(100, 100, 190, 25);
        quizDeletedPanel.add(quizDeletedBackButton);

        quizDeletedBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizDeletedFrame.setVisible(false);
                quizDeletedFrame.dispose();
                teacherQuizMenu(); // this brings the question to the next screen
                // (where they can edit the questions)
            }
        });

        quizDeletedPanel.setLayout(null);
        quizDeletedFrame.setVisible(true);
    }
}
