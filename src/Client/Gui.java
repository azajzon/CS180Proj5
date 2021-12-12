import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Project 4 - Gui.java
 * <p>
 * The Gui.java class works with the client side of the network I/O and uses graphical user interfaces
 * and integrates the logic with objects from other classes to create the learning system management program.
 * @author Aarohi Panzade, Abel Zazjon, Aditi Barla, and Yaseen Shady 039
 *
 * @version 12/12/21
 */

public class Gui {

    // initialize all the following fields
    private static String hostName;

    // create a variable to initialize new threads with
    // the threads are kept track of with a linked list
    private static LinkedList<Thread> list = new LinkedList<Thread>();
    private static JDialog currentQuestionQuizDialog;

    private static Object answersLock;
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

    // main method calls mainMenu() to begin the application flow
    public static void main(String[] args) {
        mainMenu();
    }

    // mainMenu() contains centralized location of pathways that student and teacher can access
    public static void mainMenu() {

        // sets specific frame and panel for menu and adds the panel to frame
        mainFrame = new JFrame();
        panel = new JPanel();
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(panel);

        // label for application
        lsmTool = new JLabel("Learning System Management Tool");
        lsmTool.setBounds(80, 20, 500, 25);
        panel.add(lsmTool);

        // button for login teacher
        loginTeacherButton = new JButton("Login Teacher");
        loginTeacherButton.setBounds(110, 50, 150, 25);
        loginTeacherButton.addActionListener((e) -> {
            //disposes mainFrame and call the loginTeacher()
            mainFrame.setVisible(false);
            mainFrame.dispose();
            loginTeacher();

        });
        panel.add(loginTeacherButton);

        // button for login student
        loginStudentButton = new JButton("Login Student");
        loginStudentButton.setBounds(110, 80, 150, 25);
        loginStudentButton.addActionListener((e) -> {
            //disposes mainFrame and call the loginTeacher()
            mainFrame.setVisible(false);
            mainFrame.dispose();
            loginStudent();

        });
        panel.add(loginStudentButton);

        // button for login student
        createTeacherButton = new JButton("Create Teacher");
        createTeacherButton.setBounds(110, 110, 150, 25);
        createTeacherButton.addActionListener((e) -> {
            //disposes mainFrame and call the createTeacher()
            mainFrame.setVisible(false);
            mainFrame.dispose();
            createTeacher();
        });
        panel.add(createTeacherButton);

        createStudentButton = new JButton("Create Student");
        createStudentButton.setBounds(110, 140, 150, 25);
        createStudentButton.addActionListener((e) -> {
            //disposes mainFrame and call the createStudent()
            mainFrame.setVisible(false);
            mainFrame.dispose();
            createStudent();

        });
        panel.add(createStudentButton);
        {

            // sets specific frame and panel for menu and adds the panel to frame
            mainFrame = new JFrame();
            panel = new JPanel();
            mainFrame.setSize(400, 300);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.add(panel);

            // label for application
            lsmTool = new JLabel("Learning System Management Tool");
            lsmTool.setBounds(80, 20, 500, 25);
            panel.add(lsmTool);

            // button for login teacher
            loginTeacherButton = new JButton("Login Teacher");
            loginTeacherButton.setBounds(110, 50, 150, 25);
            loginTeacherButton.addActionListener((e) -> {
                //disposes mainFrame and call the loginTeacher()
                mainFrame.setVisible(false);
                mainFrame.dispose();
                loginTeacher();

            });
            panel.add(loginTeacherButton);

            // button for login student
            loginStudentButton = new JButton("Login Student");
            loginStudentButton.setBounds(110, 80, 150, 25);
            loginStudentButton.addActionListener((e) -> {
                //disposes mainFrame and call the loginTeacher()
                mainFrame.setVisible(false);
                mainFrame.dispose();
                loginStudent();

            });
            panel.add(loginStudentButton);

            // button for login student
            createTeacherButton = new JButton("Create Teacher");
            createTeacherButton.setBounds(110, 110, 150, 25);
            createTeacherButton.addActionListener((e) -> {
                //disposes mainFrame and call the createTeacher()
                mainFrame.setVisible(false);
                mainFrame.dispose();
                createTeacher();
            });
            panel.add(createTeacherButton);

            createStudentButton = new JButton("Create Student");
            createStudentButton.setBounds(110, 140, 150, 25);
            createStudentButton.addActionListener((e) -> {
                //disposes mainFrame and call the createStudent()
                mainFrame.setVisible(false);
                mainFrame.dispose();
                createStudent();

            });
            panel.add(createStudentButton);

            //sets panel layout and frame to visible
            panel.setLayout(null);
            mainFrame.setVisible(true);

        }
        //sets panel layout and frame to visible
        panel.setLayout(null);
        mainFrame.setVisible(true);

    }

    // createTeacher() has text fields and validates the teacher to create an account
    public static void createTeacher() {
        // frame and panel created pertaining to createTeacher screen
        createTeacherFrame = new JFrame();
        createTeacherPanel = new JPanel();
        createTeacherFrame.setSize(400, 300);
        createTeacherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createTeacherFrame.add(createTeacherPanel);

        createTeacherPanel.setLayout(null);

        // label for create a teacher account
        createTeacherWelcomeLabel = new JLabel("Create a teacher account");
        createTeacherWelcomeLabel.setBounds(80, 20, 200, 25);
        createTeacherPanel.add(createTeacherWelcomeLabel);

        // label for teacher name label
        createTeacherNameLabel = new JLabel("First & Last Name:");
        createTeacherNameLabel.setBounds(20, 50, 150, 25);
        createTeacherPanel.add(createTeacherNameLabel);

        // text field for createTeacher first and last name field
        createTeacherNameText = new JTextField(20);
        createTeacherNameText.setBounds(150, 50, 165, 25);
        createTeacherPanel.add(createTeacherNameText);

        // label for username
        createTeacherUsernameLabel = new JLabel("Username:");
        createTeacherUsernameLabel.setBounds(20, 80, 80, 25);
        createTeacherPanel.add(createTeacherUsernameLabel);

        //text field for createTeacher username field
        createTeacherUsernameText = new JTextField(20);
        createTeacherUsernameText.setBounds(150, 80, 165, 25);
        createTeacherPanel.add(createTeacherUsernameText);

        // label for password
        createTeacherPasswordLabel = new JLabel("Password:");
        createTeacherPasswordLabel.setBounds(20, 110, 80, 25);
        createTeacherPanel.add(createTeacherPasswordLabel);

        // text field for createTeacher password field
        createTeacherPasswordText = new JTextField(20);
        createTeacherPasswordText.setBounds(150, 110, 165, 25);
        createTeacherPanel.add(createTeacherPasswordText);

        // button for create account
        createTeacherAccountButton = new JButton("Create Account");
        createTeacherAccountButton.setBounds(30, 150, 150, 25);
        createTeacherAccountButton.addActionListener((e) -> {
            //checks for user input validation by getting text field for all text fields
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


    // teachAccountCreationField() checks for account duplication validation for student and teacher
    public static void teachAccountCreationFailed(){

        // create specific JFrame and JPanel
        teachAccountCreationFailedFrame = new JFrame();
        teachAccountCreationFailedPanel = new JPanel();
        teachAccountCreationFailedFrame.setSize(400, 300);
        teachAccountCreationFailedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teachAccountCreationFailedFrame.add(teachAccountCreationFailedPanel);
        teachAccountCreationFailedPanel.setLayout(null);

        // label for account created message
        accountCreationLabel = new JLabel("This account has already been created.");
        accountCreationLabel.setBounds(110, 20, 330, 25);
        teachAccountCreationFailedPanel.add(accountCreationLabel);

        // button for back to create account
        teachAccountCreationFailedBackButton = new JButton("Back to Create Account");
        teachAccountCreationFailedBackButton.setBounds(150, 70, 210, 25);
        teachAccountCreationFailedPanel.add(teachAccountCreationFailedBackButton);

        // action button for accountCreationFailed
        teachAccountCreationFailedBackButton.addActionListener(e -> {
            // returns back to createTeacher() pathway for user to retry input
            teachAccountCreationFailedPanel.setVisible(false);
            teachAccountCreationFailedFrame.dispose();
            createTeacher();
        });

        teachAccountCreationFailedPanel.setLayout(null);
        teachAccountCreationFailedFrame.setVisible(true);
    }

    // accountCreatedTeacher() is for when the user create account is validated
    public static void accountCreatedTeacher() {

        // create specific JFrame and JPanel
        accountCreatedTeacherFrame = new JFrame();
        accountCreatedTeacherPanel = new JPanel();
        accountCreatedTeacherFrame.setSize(400, 300);
        accountCreatedTeacherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        accountCreatedTeacherFrame.add(accountCreatedTeacherPanel);
        accountCreatedTeacherPanel.setLayout(null);

        // label for account successfully created
        teacherAccountCreatedLabel = new JLabel("Account successfully created!");
        teacherAccountCreatedLabel.setBounds(110, 20, 200, 25);
        accountCreatedTeacherPanel.add(teacherAccountCreatedLabel);

        // button to head to teacher log in screen after creating account
        teacherLogInButton = new JButton("Log In");
        teacherLogInButton.setBounds(150, 70, 90, 25);
        accountCreatedTeacherPanel.add(teacherLogInButton);

        // action button to lead to loginTeacher screen after validated user input for createAccount
        teacherLogInButton.addActionListener(e -> {
            accountCreatedTeacherFrame.setVisible(false);
            accountCreatedTeacherFrame.dispose();
            loginTeacher();
        });

        accountCreatedTeacherPanel.setLayout(null);
        accountCreatedTeacherFrame.setVisible(true);

    }

    // loginTeacher() has the login screen for teacher user to interact with
    public static void loginTeacher() {

        // creates specific JFrame and JPanel
        teacherLoginFrame = new JFrame();
        teacherLoginPanel = new JPanel();
        teacherLoginFrame.setSize(400, 300);
        teacherLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teacherLoginFrame.add(teacherLoginPanel);

        teacherLoginPanel.setLayout(null);

        // welcome message label for teachers
        teacherWelcomeLabel = new JLabel("Welcome teachers!");
        teacherWelcomeLabel.setBounds(80, 20, 150, 25);
        teacherLoginPanel.add(teacherWelcomeLabel);

        // label for username
        teacherLoginLabel = new JLabel("Username:");
        teacherLoginLabel.setBounds(20, 50, 80, 25);
        teacherLoginPanel.add(teacherLoginLabel);

        // label for password
        teacherPasswordLabel = new JLabel("Password:");
        teacherPasswordLabel.setBounds(20, 80, 80, 25);
        teacherLoginPanel.add(teacherPasswordLabel);

        // text field for teacher username
        teacherUsernameText = new JTextField(20);
        teacherUsernameText.setBounds(100, 50, 165, 25);
        teacherLoginPanel.add(teacherUsernameText);

        // text field for teacher password
        teacherPasswordText = new JTextField(20);
        teacherPasswordText.setBounds(100, 80, 165, 25);
        teacherLoginPanel.add(teacherPasswordText);

        // checks for teacher user input validation in text fields
        loginTeacherAccountButton = new JButton("Login");
        loginTeacherAccountButton.addActionListener((e) -> {
            if ((Boolean) ClientClass.serverCall(0, new String[] {teacherUsernameText.getText(),
                    teacherPasswordText.getText()})) {
                // checks for teacher user input validation in text fields
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

    // teacherCourseMenu() allows teacher to add a course for students
    public static void teacherCourseMenu() {
        // creates a specific JFrame and JPanel
        teacherCourseMenuFrame = new JFrame();
        teacherCourseMenuPanel = new JPanel();
        teacherCourseMenuFrame.setSize(400, 300);
        teacherCourseMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teacherCourseMenuFrame.add(teacherCourseMenuPanel);

        // label for adding a course
        addCourseLabel = new JLabel("Do you want to add a course?");
        addCourseLabel.setBounds(80, 20, 200, 25);
        teacherCourseMenuPanel.add(addCourseLabel);

        // button for replying yes to adding a course
        yesCourseButton = new JButton("Yes");
        yesCourseButton.setBounds(120, 50, 80, 25);
        teacherCourseMenuPanel.add(yesCourseButton);

        // action button to lead to adding a course
        yesCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherCourseMenuFrame.setVisible(false);
                teacherCourseMenuFrame.dispose();
                addCourse();
            }
        });
        
        // button for not adding a course
        noCourseButton = new JButton("No");
        noCourseButton.setBounds(120, 80, 80, 25);
        teacherCourseMenuPanel.add(noCourseButton);

         //if teacher doesn't want to create a course, they are directed to the quiz menu screen
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

    // addCourse() allows teacher to add a new course
    public static void addCourse() {

        // creates a new frame and panel
        addCourseFrame = new JFrame();
        addCoursePanel = new JPanel();
        addCourseFrame.setSize(400, 300);
        addCourseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addCourseFrame.add(addCoursePanel);

        // label for entering a course
        enterCourseNameLabel = new JLabel("Enter Course Name:");
        enterCourseNameLabel.setBounds(130, 20, 200, 25);
        addCoursePanel.add(enterCourseNameLabel);

        // text field for entering a course name
        enterCourseNameText = new JTextField(50);
        enterCourseNameText.setBounds(120, 50, 165, 25);
        addCoursePanel.add(enterCourseNameText);

        // button for creating a course
        createCourseButton = new JButton("Create Course");
        createCourseButton.setBounds(180, 80, 140, 25);
        addCoursePanel.add(createCourseButton);

        createCourseButton.addActionListener(e -> {
            // action button will lead to the teacher's menu
            addCourseFrame.setVisible(false);
            addCourseFrame.dispose();
            teacherQuizMenu();
        });

         // button for back page
        addCourseBackButton = new JButton("Back");
        addCourseBackButton.setBounds(60, 80, 80, 25);
        addCoursePanel.add(addCourseBackButton);

         // action button will lead teacher back to the course menu
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

    // createStudent() has text fields and validates the teacher to create an account
    public static void createStudent() {
         // frame and panel created pertaining to createStudent screen
        createStudentFrame = new JFrame();
        createStudentPanel = new JPanel();
        createStudentFrame.setSize(400, 300);
        createStudentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createStudentFrame.add(createStudentPanel);

        createStudentPanel.setLayout(null);

         // label for create a student account
        createStudentWelcomeLabel = new JLabel("Create a student account");
        createStudentWelcomeLabel.setBounds(80, 20, 200, 25);
        createStudentPanel.add(createStudentWelcomeLabel);

        // label for first and last name
        createStudentNameLabel = new JLabel("First & Last Name:");
        createStudentNameLabel.setBounds(20, 50, 150, 25);
        createStudentPanel.add(createStudentNameLabel);

        // text field for create student name
        createStudentNameText = new JTextField(20);
        createStudentNameText.setBounds(150, 50, 165, 25);
        createStudentPanel.add(createStudentNameText);

         // label for create student
        createStudentUsernameLabel = new JLabel("Username:");
        createStudentUsernameLabel.setBounds(20, 80, 80, 25);
        createStudentPanel.add(createStudentUsernameLabel);

        // text field for create student username
        createStudentUsernameText = new JTextField(20);
        createStudentUsernameText.setBounds(150, 80, 165, 25);
        createStudentPanel.add(createStudentUsernameText);

        // label for create student password
        createStudentPasswordLabel = new JLabel("Password:");
        createStudentPasswordLabel.setBounds(20, 110, 80, 25);
        createStudentPanel.add(createStudentPasswordLabel);

         // text field for create student password
        createStudentPasswordText = new JTextField(20);
        createStudentPasswordText.setBounds(150, 110, 165, 25);
        createStudentPanel.add(createStudentPasswordText);

         // button for create student account
        createStudentAccountButton = new JButton("Create Account");
        createStudentAccountButton.setBounds(30, 150, 150, 25);
        createStudentAccountButton.addActionListener((e) -> {
             //checks for user input validation by getting text field for all text fields
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

    // studAccountCreationFailed() checks for student input validation
    public static void studAccountCreationFailed(){
         // creates a specific frame and panel
        studAccountCreationFailedFrame = new JFrame();
        studAccountCreationFailedPanel = new JPanel();
        studAccountCreationFailedFrame.setSize(400, 300);
        studAccountCreationFailedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studAccountCreationFailedFrame.add(studAccountCreationFailedPanel);
        studAccountCreationFailedPanel.setLayout(null);

         // label for duplicated account created
        accountCreationLabel = new JLabel("This account has already been created.");
        accountCreationLabel.setBounds(15, 20, 380, 25);
        studAccountCreationFailedPanel.add(accountCreationLabel);

        // button to head back to original create account
        stuAccountCreationFailedBackButton = new JButton("Back to Create Account");
        stuAccountCreationFailedBackButton.setBounds(100, 70, 210, 25);
        studAccountCreationFailedPanel.add(stuAccountCreationFailedBackButton);

        // action listener to go back to create student screen to retry student input
        stuAccountCreationFailedBackButton.addActionListener(e -> {
            studAccountCreationFailedPanel.setVisible(false);
            studAccountCreationFailedFrame.dispose();
            createStudent();
        });

        studAccountCreationFailedPanel.setLayout(null);
        studAccountCreationFailedFrame.setVisible(true);
    }

    // accountCreatedStudent() shows the message dialog for a successful account that has been created
    public static void accountCreatedStudent() {
        // creates specific frame and panel
        accountCreatedStudentFrame = new JFrame();
        accountCreatedStudentPanel = new JPanel();
        accountCreatedStudentFrame.setSize(400, 300);
        accountCreatedStudentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        accountCreatedStudentFrame.add(accountCreatedStudentPanel);
        accountCreatedStudentPanel.setLayout(null);

        // label for account successfully created
        studentAccountCreatedLabel = new JLabel("Account successfully created!");
        studentAccountCreatedLabel.setBounds(80, 20, 200, 25);
        accountCreatedStudentPanel.add(studentAccountCreatedLabel);

        // button for student login
        studentLogInButton = new JButton("Log In");
        studentLogInButton.setBounds(130, 60, 80, 25);
        accountCreatedStudentPanel.add(studentLogInButton);

        // action button for student user to be led to loginStudent()
        studentLogInButton.addActionListener(e -> {
            accountCreatedStudentFrame.setVisible(false);
            accountCreatedStudentFrame.dispose();
            loginStudent();
        });

        accountCreatedStudentFrame.setVisible(true);

    }

    //loginStudent() leads to the login screen for student user to log in
    public static void loginStudent() {
        //creates specific frame and panel
        studentLoginFrame = new JFrame();
        studentLoginPanel = new JPanel();
        studentLoginFrame.setSize(400, 300);
        studentLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentLoginFrame.add(studentLoginPanel);

        studentLoginPanel.setLayout(null);

        //label for welcome students
        studentWelcomeLabel = new JLabel("Welcome students!");
        studentWelcomeLabel.setBounds(80, 20, 150, 25);
        studentLoginPanel.add(studentWelcomeLabel);

        //label for username
        studentLoginLabel = new JLabel("Username:");
        studentLoginLabel.setBounds(20, 50, 80, 25);
        studentLoginPanel.add(studentLoginLabel);

        //label for password
        studentPasswordLabel = new JLabel("Password:");
        studentPasswordLabel.setBounds(20, 80, 80, 25);
        studentLoginPanel.add(studentPasswordLabel);

        //text field for student username
        studentUsernameText = new JTextField(20);
        studentUsernameText.setBounds(100, 50, 165, 25);
        studentLoginPanel.add(studentUsernameText);

        //text field for student password
        studentPasswordText = new JTextField(20);
        studentPasswordText.setBounds(100, 80, 165, 25);
        studentLoginPanel.add(studentPasswordText);

        // login button for student user
        loginStudentAccountButton = new JButton("Login");
        loginStudentAccountButton.addActionListener((e) -> {
             // checks for user input validation by getting text from all text fields
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

     // checks for user input validation by getting text from all text fields
    public static void studentMenu() {
         //creates specific frame and panel
        JFrame studentMenuFrame = new JFrame();
        studentMenuPanel = new JPanel();
        studentMenuFrame.setSize(400, 300);
        studentMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentMenuFrame.add(studentMenuPanel);

        // label for student menu
        JLabel lsmToolLabel = new JLabel("Learning System Management Tool");
        lsmToolLabel.setBounds(90, 20, 500, 25);
        studentMenuPanel.add(lsmToolLabel);

        //button for take quiz
        JButton takeQuizButton = new JButton("Take a Quiz");
        takeQuizButton.setBounds(80, 50, 250, 25);

        studentMenuPanel.add(takeQuizButton);

         // button leads to a drop down menu for student user to choose which quiz they want to take
        takeQuizButton.addActionListener(e -> {
            studentMenuFrame.setVisible(false);
            studentMenuFrame.dispose();
            whichQuizToTake();
        });

        // button for view graed quiz
        JButton viewGradedQuizButton = new JButton("View Graded Quiz");
        viewGradedQuizButton.setBounds(80, 80, 250, 25);

        studentMenuPanel.add(viewGradedQuizButton);

        viewGradedQuizButton.addActionListener(e -> {
             // student user gains access to view a graded quiz they submitted once button is pushed
            studentMenuFrame.setVisible(false);
            studentMenuFrame.dispose();
            viewGradedQuiz((ArrayList<QuizSubmission>) ClientClass.serverCall(9,username));
        });

        // button for edit account
        JButton editStudentAccountButton = new JButton("Edit Account");
        editStudentAccountButton.setBounds(80, 110, 250, 25);

        studentMenuPanel.add(editStudentAccountButton);

        editStudentAccountButton.addActionListener(e -> {
             // student user can edit account once button is pushed
            studentMenuFrame.setVisible(false);
            studentMenuFrame.dispose();
            editStudentAccount();
        });

        // button for logout
        JButton studentLogOutButton = new JButton("Logout");
        studentLogOutButton.setBounds(80, 140, 250, 25);

        studentMenuPanel.add(studentLogOutButton);

        studentLogOutButton.addActionListener(e -> {
            // back button leads back to menu screen
            studentMenuFrame.setVisible(false);
            studentMenuFrame.dispose();
            mainMenu();
        });

        // button for delete account
        JButton deleteStudentAccount = new JButton("Delete Account");
        deleteStudentAccount.setBounds(30, 170, 190, 25);
        studentMenuPanel.add(deleteStudentAccount);

        deleteStudentAccount.addActionListener(e -> {
             // once account is deleted, student user goes back to mainMenu()
            ClientClass.serverCall(13, username);
            studentMenuFrame.setVisible(false);
            studentMenuFrame.dispose();
            mainMenu();
        });

        studentMenuPanel.setLayout(null);
        studentMenuFrame.setVisible(true);
    }

     // teacherQuizMenu() allows teacher to do various options with quiz
    public static void teacherQuizMenu() {
        // creates a new frame and panel
        JFrame teacherQuizMenuFrame = new JFrame();
        JPanel teacherQuizMenuPanel = new JPanel();
        teacherQuizMenuFrame.setSize(400, 300);
        teacherQuizMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teacherQuizMenuFrame.add(teacherQuizMenuPanel);

         // label for learning system management tool
        JLabel lsmToolLabel = new JLabel("Learning System Management Tool");
        lsmToolLabel.setBounds(90, 20, 500, 25);
        teacherQuizMenuPanel.add(lsmToolLabel);

         // button for create quiz
        JButton createQuizButton = new JButton("Create a Quiz");
        createQuizButton.setBounds(80, 50, 250, 25);
        teacherQuizMenuPanel.add(createQuizButton);

        createQuizButton.addActionListener(e -> {
             // action button that leads to create quiz screen
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            createQuiz();
        });

        // button for edit quiz
        JButton editQuizButton = new JButton("Edit Quiz");
        editQuizButton.setBounds(80, 80, 250, 25);
        teacherQuizMenuPanel.add(editQuizButton);

        editQuizButton.addActionListener(e -> {
              // action button that leads to edit quiz screen
            ArrayList<String> quizNames = (ArrayList<String>) ClientClass.serverCall(6, " ");
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            editQuiz(quizNames);
        });

          // button for delete quiz
        JButton deleteQuizButton = new JButton("Delete Quiz");
        deleteQuizButton.setBounds(80, 110, 250, 25);
        teacherQuizMenuPanel.add(deleteQuizButton);

        deleteQuizButton.addActionListener((e) -> {
            // action button that leads to delete quiz screen
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            deleteQuiz();
        });

        // button for view student quiz submissions
        JButton viewStudentQuizSubmissionsButton = new JButton("View Student Quiz Submissions");
        viewStudentQuizSubmissionsButton.setBounds(80, 140, 250, 25);
        teacherQuizMenuPanel.add(viewStudentQuizSubmissionsButton);

        viewStudentQuizSubmissionsButton.addActionListener((e) -> {
            // action button leads teacher user to view student quiz submissions
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            viewStudentQuizSubmissions();
        });

        // button for edit teacher account
        JButton editTeacherAccountButton = new JButton("Edit Account");
        editTeacherAccountButton.setBounds(80, 170, 250, 25);
        teacherQuizMenuPanel.add(editTeacherAccountButton);

         // action button for editing teacher account
        editTeacherAccountButton.addActionListener((e) -> {
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            editTeacherAccount();

        });

        // button for logout
        JButton teacherQuizMenuBackButton = new JButton("Logout");
        teacherQuizMenuBackButton.setBounds(30, 200, 110, 25);
        teacherQuizMenuPanel.add(teacherQuizMenuBackButton);

        teacherQuizMenuBackButton.addActionListener(e -> {
            // action button for teacher user to log out and be led back to main menu
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            mainMenu();
        });

        //button for delete account
        JButton deleteTeacherAccount = new JButton("Delete Account");
        deleteTeacherAccount.setBounds(30, 230, 190, 25);
        teacherQuizMenuPanel.add(deleteTeacherAccount);
        deleteTeacherAccount.addActionListener(e -> {
             // action button for eading teacher user back to main menu after deleting an account
            ClientClass.serverCall(12, username);
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            mainMenu();
        });

        teacherQuizMenuPanel.setLayout(null);
        teacherQuizMenuFrame.setVisible(true);
    }

     // createQuiz allows teacher user to create a quiz for students to access
    public static void createQuiz() {
        // create a specific frame and panel
        JFrame createQuizFrame = new JFrame();
        JPanel createQuizPanel = new JPanel();
        createQuizFrame.setSize(400, 300);
        createQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createQuizFrame.add(createQuizPanel);

         // label for create quiz
        JLabel lsmToolLabel = new JLabel("Create a Quiz");
        lsmToolLabel.setBounds(130, 20, 500, 25);
        createQuizPanel.add(lsmToolLabel);

        // label for name of quiz
        JLabel nameOfQuizLabel = new JLabel("Name of Quiz:");
        nameOfQuizLabel.setBounds(20, 50, 150, 25);
        createQuizPanel.add(nameOfQuizLabel);

        // text field for name of quiz
        JTextField nameOfQuizText = new JTextField(20);
        nameOfQuizText.setBounds(120, 50, 125, 25);
        createQuizPanel.add(nameOfQuizText);

         // label for format of quiz
        JLabel formatOfQuizLabel = new JLabel("Format of Quiz:");
        formatOfQuizLabel.setBounds(20, 90, 150, 25);
        createQuizPanel.add(formatOfQuizLabel);

         // button for format quiz (multiple choice)
        JButton formatOfQuiz1Button = new JButton("Multiple-Choice");
        formatOfQuiz1Button.setBounds(80, 130, 190, 25);
        createQuizPanel.add(formatOfQuiz1Button);

        formatOfQuiz1Button.addActionListener(e -> {
            // action button to get the text field info from the multiple choice quiz
            createQuizFrame.setVisible(false);
            createQuizFrame.dispose();
            multipleChoiceQuiz(nameOfQuizText.getText());
        });

         // button for format quiz (true/false)
        JButton formatOfQuiz2Button = new JButton("True/False");
        formatOfQuiz2Button.setBounds(80, 160, 190, 25);
        createQuizPanel.add(formatOfQuiz2Button);

        formatOfQuiz2Button.addActionListener(e -> {
            createQuizFrame.setVisible(false);
            createQuizFrame.dispose();
            //trueOrFalseQuiz();
        });

        // back button to go back tp teacher menu
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

     // array list of questions from the quizzes
    static ArrayList<Question> questions = new ArrayList<>();

     // multiple choice quiz method contains screen for teacher user to input and create a multiple choice question in a quiz
    public static void multipleChoiceQuiz(String quizName) {
         // create a specific frame and panel
        JFrame multipleChoiceQuizFrame = new JFrame();
        JPanel multipleChoiceQuizPanel = new JPanel();
        multipleChoiceQuizFrame.setSize(400, 320);
        multipleChoiceQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        multipleChoiceQuizFrame.add(multipleChoiceQuizPanel);

        // label for generic multiple choice quiz
        JLabel lsmToolLabel = new JLabel("Name of Quiz: "); // + show name of quiz);
        lsmToolLabel.setBounds(130, 20, 500, 25);
        multipleChoiceQuizPanel.add(lsmToolLabel);

        // label for question
        var questionOneMCLabel = new JLabel("Type in Question");
        questionOneMCLabel.setBounds(20, 50, 130, 25);
        multipleChoiceQuizPanel.add(questionOneMCLabel);

         // text field for question
        var questionOneMCText = new JTextField(20);
        questionOneMCText.setBounds(210, 50, 165, 25);
        multipleChoiceQuizPanel.add(questionOneMCText);

        // label for option 1
        var optionOneMCLabel = new JLabel("Option 1:");
        optionOneMCLabel.setBounds(20, 80, 80, 25);
        multipleChoiceQuizPanel.add(optionOneMCLabel);

        // text for option 1
        var optionOneMCText = new JTextField(20);
        optionOneMCText.setBounds(210, 80, 165, 25);
        multipleChoiceQuizPanel.add(optionOneMCText);

        // label for option 2
        var optionTwoMCLabel = new JLabel("Option 2:");
        optionTwoMCLabel.setBounds(20, 110, 80, 25);
        multipleChoiceQuizPanel.add(optionTwoMCLabel);

         // text for option 2
        var optionTwoMCText = new JTextField(20);
        optionTwoMCText.setBounds(210, 110, 165, 25);
        multipleChoiceQuizPanel.add(optionTwoMCText);

        // label for option 3
        var optionThreeMCLabel = new JLabel("Option 3:");
        optionThreeMCLabel.setBounds(20, 140, 80, 25);
        multipleChoiceQuizPanel.add(optionThreeMCLabel);

         // text for option 3
        var optionThreeMCText = new JTextField(20);
        optionThreeMCText.setBounds(210, 140, 165, 25);
        multipleChoiceQuizPanel.add(optionThreeMCText);

         // label for option 4
        var optionFourMCLabel = new JLabel("Option 4:");
        optionFourMCLabel.setBounds(20, 170, 80, 25);
        multipleChoiceQuizPanel.add(optionFourMCLabel);

         // text for option 4
        var optionFourMCText = new JTextField(20);
        optionFourMCText.setBounds(210, 170, 165, 25);
        multipleChoiceQuizPanel.add(optionFourMCText);

        // label for correct answer choice
        var correctAnsChoiceMCLabel = new JLabel("Enter correct answer choice:");
        correctAnsChoiceMCLabel.setBounds(20, 200, 250, 25);
        multipleChoiceQuizPanel.add(correctAnsChoiceMCLabel);

        // text field for teacher user to enter correct answer choice
        var correctAnsChoiceMCText = new JTextField(20);
        correctAnsChoiceMCText.setBounds(210, 200, 165, 25);
        multipleChoiceQuizPanel.add(correctAnsChoiceMCText);

        // label for enter a point value
        var pointValueMCLabel = new JLabel("Enter the point value:");
        pointValueMCLabel.setBounds(20, 230, 250, 25);
        multipleChoiceQuizPanel.add(pointValueMCLabel);

         // text field for teacher user to enter point value for each question
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

             // gets the text from the text field in relation to the correct answer
            if (correctAnsChoiceMCText.getText().equals("1"))
                q.setAnswer(optionOneMCText.getText());
            if (correctAnsChoiceMCText.getText().equals("2"))
                q.setAnswer(optionTwoMCText.getText());
            if (correctAnsChoiceMCText.getText().equals("3"))
                q.setAnswer(optionThreeMCText.getText());
            if (correctAnsChoiceMCText.getText().equals("4"))
                q.setAnswer(optionFourMCText.getText());

             // converting to an integer
            q.setPointValue(Integer.parseInt(pointValueMCText.getText()));
            questions.add(q);

             // creates a specific frame and panel
            JFrame addAnotherQuestionFrame = new JFrame();
            JPanel addAnotherQuestionPanel = new JPanel();
            addAnotherQuestionFrame.setSize(400, 300);
            addAnotherQuestionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            addAnotherQuestionFrame.add(addAnotherQuestionPanel);

            // label for adding another question
            var addAnotherQuestionLabel = new JLabel("Do you want to add another question?");
            addAnotherQuestionLabel.setBounds(70, 20, 280, 25);
            addAnotherQuestionPanel.add(addAnotherQuestionLabel);

            // button for adding another question
            var yesAnotherQuestionButton = new JButton("Yes");
            yesAnotherQuestionButton.setBounds(110, 50, 80, 25);
            addAnotherQuestionPanel.add(yesAnotherQuestionButton);
            yesAnotherQuestionButton.addActionListener(ae -> {
            // action button leads to another screen for a multiple choice quiz if the user wants to add another question,
            // displays the screen of the question, options, correct answer and point value again
            //this time however, it says type in question 2
                multipleChoiceQuizFrame.setVisible(false);
                multipleChoiceQuizFrame.dispose();
                addAnotherQuestionFrame.setVisible(false);
                addAnotherQuestionFrame.dispose();
                multipleChoiceQuiz(quizName);
            });


            // if the user doesn't want to add another question
            var noAnotherQuestionButton = new JButton("No");
            noAnotherQuestionButton.setBounds(200, 50, 80, 25);
            addAnotherQuestionPanel.add(noAnotherQuestionButton);
            noAnotherQuestionButton.addActionListener(ae -> {
                 // action button calls the teacher quiz menu for teacher user to go back to
                if ((Boolean) ClientClass.serverCall(4, new Quiz(questions, quizName))) {
                    multipleChoiceQuizFrame.setVisible(false);
                    multipleChoiceQuizFrame.dispose();
                    addAnotherQuestionFrame.setVisible(false);
                    addAnotherQuestionFrame.dispose();
                    teacherQuizMenu();
                }

            });

            addAnotherQuestionPanel.setLayout(null);
            addAnotherQuestionFrame.setVisible(true);
        });

        // button for back to create a quiz
        JButton multipleChoiceQuizBackButton = new JButton("Back");
        multipleChoiceQuizBackButton.setBounds(30, 290, 110, 25);
        multipleChoiceQuizPanel.add(multipleChoiceQuizBackButton);

        // action button leads teacher user to go back to creating a quiz
        multipleChoiceQuizBackButton.addActionListener(e -> {
            multipleChoiceQuizFrame.setVisible(false);
            multipleChoiceQuizFrame.dispose();
            createQuiz();
        });

        multipleChoiceQuizPanel.setLayout(null);
        multipleChoiceQuizFrame.setVisible(true);
    }

     // editQuiz allows teacher to edit a quiz that they have previously made
    public static void editQuiz(ArrayList<String> quizNames) {
         // create new frame and panel
        JFrame editQuizFrame = new JFrame();
        JPanel editQuizPanel = new JPanel();
        editQuizFrame.setSize(400, 300);
        editQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editQuizFrame.add(editQuizPanel);

         // label for edit a quiz
        JLabel lsmToolLabel = new JLabel("Edit a Quiz");
        lsmToolLabel.setBounds(160, 20, 500, 25);
        editQuizPanel.add(lsmToolLabel);

        // drop down box for quiz names to edit from
        JComboBox jComboBox = new JComboBox(quizNames.toArray());
        jComboBox.setBounds(100, 70, 180, 20);

        editQuizPanel.add(jComboBox);
        editQuizPanel.setLayout(null);
        editQuizFrame.setVisible(true);
        JButton nextForEditQuiz = new JButton("Next");

        // button for next screen
        nextForEditQuiz.setBounds(120, 220, 110, 25);
        editQuizPanel.add(nextForEditQuiz);

        nextForEditQuiz.addActionListener(e -> {
              // action button allows the selected quiz to be viewed
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
        // creates a frame and panel
        JFrame questionForEditQuizFrame = new JFrame();
        JPanel questionForEditQuizPanel = new JPanel();
        questionForEditQuizFrame.setSize(400, 320);
        questionForEditQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questionForEditQuizFrame.add(questionForEditQuizPanel);

        // goes through the question titles array list for the teacher to edit the questions and options
        ArrayList<String> questionTitles = new ArrayList<>();
        for(Question question: q.getQuestions()) {
            questionTitles.add(question.getQuestionTitle());
        }

        // drop down boz to select which question to choose from
        JComboBox jComboBox = new JComboBox(questionTitles.toArray());
        jComboBox.setBounds(130, 30, 200, 25);
        questionForEditQuizPanel.add(jComboBox);

        // label for question within the quiz
        JLabel questionOneMCLabel = new JLabel("Question: ");
        questionOneMCLabel.setBounds(20, 30, 160, 25);
        questionForEditQuizPanel.add(questionOneMCLabel);

        // label for option 1
        JLabel optionOneEditLabel = new JLabel("Option 1:");
        optionOneEditLabel.setBounds(20, 60, 80, 25);
        questionForEditQuizPanel.add(optionOneEditLabel);

        // text field for editing option 1
        JTextField editOptionOneMCText = new JTextField(20);
        editOptionOneMCText.setBounds(210, 60, 165, 25);
        questionForEditQuizPanel.add(editOptionOneMCText);

        // label for option 2
        JLabel optionTwoEditLabel = new JLabel("Option 2:");
        optionTwoEditLabel.setBounds(20, 90, 80, 25);
        questionForEditQuizPanel.add(optionTwoEditLabel);

        // text field for editing option 2
        JTextField editOptionTwoMCText = new JTextField(20);
        editOptionTwoMCText.setBounds(210, 90, 165, 25);
        questionForEditQuizPanel.add(editOptionTwoMCText);

        // label for option 3
        JLabel optionThreeEditLabel = new JLabel("Option 3:");
        optionThreeEditLabel.setBounds(20, 120, 80, 25);
        questionForEditQuizPanel.add(optionThreeEditLabel);

        // text field for editing option 3
        JTextField editOptionThreeMCText = new JTextField(20);
        editOptionThreeMCText.setBounds(210, 120, 165, 25);
        questionForEditQuizPanel.add(editOptionThreeMCText);

        // label for editing option 4
        JLabel optionFourEditLabel = new JLabel("Option 4:");
        optionFourEditLabel.setBounds(20, 150, 80, 25);
        questionForEditQuizPanel.add(optionFourEditLabel);

        // text field for editing option 4
        JTextField editOptionFourMCText = new JTextField(20);
        editOptionFourMCText.setBounds(210, 150, 165, 25);
        questionForEditQuizPanel.add(editOptionFourMCText);

        // label for selecting the correct answer choice
        JLabel correctAnsChoiceMCLabel = new JLabel("Enter correct answer choice:");
        correctAnsChoiceMCLabel.setBounds(20, 180, 250, 25);
        questionForEditQuizPanel.add(correctAnsChoiceMCLabel);

        // text field for editing the correct answer choice
        JTextField editCorrectAnsChoiceMCText = new JTextField(20);
        editCorrectAnsChoiceMCText.setBounds(210, 180, 165, 25);
        questionForEditQuizPanel.add(editCorrectAnsChoiceMCText);

        // label for point value
        JLabel pointValueMCLabel = new JLabel("Enter the point value:");
        pointValueMCLabel.setBounds(20, 210, 250, 25);
        questionForEditQuizPanel.add(pointValueMCLabel);

        // text field for editing a point value
        JTextField editPointValueMCText = new JTextField(20);
        editPointValueMCText.setBounds(210, 210, 165, 25);
        questionForEditQuizPanel.add(editPointValueMCText);

        //saves question
        JButton saveEditQuizButton = new JButton("Save and Update Quiz");
        saveEditQuizButton.setBounds(210, 240, 150, 25);
        questionForEditQuizPanel.add(saveEditQuizButton);

        // updates the editing question into the quiz
        saveEditQuizButton.addActionListener(e -> {
             // action button leads the teacher user back to the teacher quiz menu
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

        questionForEditQuizPanel.setLayout(null);
        questionForEditQuizFrame.setVisible(true);
    }

    // editTeacherAccount() allows the teacher to edit their account and the fields
    public static void editTeacherAccount() {
        // creates new frame and panel
        JFrame editTeacherAccountFrame = new JFrame();
        JPanel editTeacherAccountPanel = new JPanel();
        editTeacherAccountFrame.setSize(400, 300);
        editTeacherAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editTeacherAccountFrame.add(editTeacherAccountPanel);
        editTeacherAccountPanel.setLayout(null);

        // label for edit teacher account
        JLabel editTeacherAccountLabel = new JLabel("Edit Teacher Account");
        editTeacherAccountLabel.setBounds(130, 20, 200, 25);
        editTeacherAccountPanel.add(editTeacherAccountLabel);

        // label for first and last name in teacher account
        JLabel editedTeacherNameLabel = new JLabel("First & Last Name:");
        editedTeacherNameLabel.setBounds(20, 50, 150, 25);
        editTeacherAccountPanel.add(editedTeacherNameLabel);

        // text field for editing teacher name
        JTextField editedTeacherNameText = new JTextField(20);
        editedTeacherNameText.setBounds(150, 50, 165, 25);
        editTeacherAccountPanel.add(editedTeacherNameText);

        // label for editing teacher username
        JLabel editedTeacherUsernameLabel = new JLabel("Username:");
        editedTeacherUsernameLabel.setBounds(20, 80, 80, 25);
        editTeacherAccountPanel.add(editedTeacherUsernameLabel);

        // text field for editing teacher username
        JTextField editedTeacherUsernameText = new JTextField(20);
        editedTeacherUsernameText.setBounds(150, 80, 165, 25);
        editTeacherAccountPanel.add(editedTeacherUsernameText);

        // label for editing teacher password
        JLabel editedTeacherPasswordLabel = new JLabel("Password:");
        editedTeacherPasswordLabel.setBounds(20, 110, 80, 25);
        editTeacherAccountPanel.add(editedTeacherPasswordLabel);

        // text field for editing teacher password
        JTextField editedTeacherPasswordText = new JTextField(20);
        editedTeacherPasswordText.setBounds(150, 110, 165, 25);
        editTeacherAccountPanel.add(editedTeacherPasswordText);

        // button for updating the teacher account
        JButton updateTeacherAccountButton = new JButton("Save and Update Account");
        updateTeacherAccountButton.setBounds(30, 150, 200, 25);
        updateTeacherAccountButton.addActionListener(e -> {
            // action button updates the text fields to the new user accounts
            // once done, calls the screen to confirm edit teacher account
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

        // button for being led back to teacher quiz menu for teacher user
        JButton editTeacherAccountBackButton = new JButton("Back");
        editTeacherAccountBackButton.setBounds(30, 180, 110, 25);
        editTeacherAccountPanel.add(editTeacherAccountBackButton);

        editTeacherAccountBackButton.addActionListener(e -> {
             // action button leads teacher user back to teacher quiz
            editTeacherAccountFrame.setVisible(false);
            editTeacherAccountFrame.dispose();
            teacherQuizMenu();
        });

        editTeacherAccountFrame.setVisible(true);
    }

     // editTeachAccountDone() has the information about the teacher account being updated
    public static void editTeachAccountDone(){
        // create a frame and panel
        editTeachAccountDoneFrame = new JFrame();
        editTeachAccountDonePanel = new JPanel();
        editTeachAccountDoneFrame.setSize(400, 300);
        editTeachAccountDoneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editTeachAccountDoneFrame.add(editTeachAccountDonePanel);
        editTeachAccountDonePanel.setLayout(null);

        // label for account updated
        accountUpdatedLabel = new JLabel("Account updated!");
        accountUpdatedLabel.setBounds(140, 30, 280, 25);
        editTeachAccountDonePanel.add(accountUpdatedLabel);

        // button for back to homepage
        editTeacAccountDoneBackButton = new JButton("Back To HomePage");
        editTeacAccountDoneBackButton.setBounds(100, 60, 180, 25);
        editTeachAccountDonePanel.add(editTeacAccountDoneBackButton);

        editTeacAccountDoneBackButton.addActionListener(e -> {
            // action button for teacher account frame
            editTeachAccountDoneFrame.setVisible(false);
            editTeachAccountDoneFrame.dispose();
            teacherQuizMenu();
        });


        editTeachAccountDoneFrame.setVisible(true);

    }

     // editStudentAccount() allows student to edit their account from all text fields
    public static void editStudentAccount() {
        // creates new frame and panel
        JFrame editStudentAccountFrame = new JFrame();
        JPanel editStudentAccountPanel = new JPanel();
        editStudentAccountFrame.setSize(400, 300);
        editStudentAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editStudentAccountFrame.add(editStudentAccountPanel);
        editStudentAccountPanel.setLayout(null);

        // labels the edit student account
        JLabel editStuAccountLabel = new JLabel("Edit Student Account");
        editStuAccountLabel.setBounds(130, 20, 200, 25);
        editStudentAccountPanel.add(editStuAccountLabel);

        // label for first and last name for student user
        JLabel editedStuNameLabel = new JLabel("First & Last Name:");
        editedStuNameLabel.setBounds(20, 50, 150, 25);
        editStudentAccountPanel.add(editedStuNameLabel);

        // text field for editing student name
        JTextField editedStuNameText = new JTextField(20);
        editedStuNameText.setBounds(150, 50, 165, 25);
        editStudentAccountPanel.add(editedStuNameText);

         // label for student username
        JLabel editedStuUsernameLabel = new JLabel("Username:");
        editedStuUsernameLabel.setBounds(20, 80, 80, 25);
        editStudentAccountPanel.add(editedStuUsernameLabel);

        // text field for editing student username
        JTextField editedStuUsernameText = new JTextField(20);
        editedStuUsernameText.setBounds(150, 80, 165, 25);
        editStudentAccountPanel.add(editedStuUsernameText);

        // label for editing student password
        JLabel editedStuPasswordLabel = new JLabel("Password:");
        editedStuPasswordLabel.setBounds(20, 110, 80, 25);
        editStudentAccountPanel.add(editedStuPasswordLabel);

        // text field for editing student password
        JTextField editedStuPasswordText = new JTextField(20);
        editedStuPasswordText.setBounds(150, 110, 165, 25);
        editStudentAccountPanel.add(editedStuPasswordText);

        // button for updating student account
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

        // back button for edit student account
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

    // whichQuizToTake() allows student user to choose a quiz to take
    public static void whichQuizToTake() {
        // creates a new frame and panel
        JFrame whichQuizToTakeFrame = new JFrame();
        JPanel whichQuizToTakePanel = new JPanel();
        whichQuizToTakeFrame.setSize(400, 300);
        whichQuizToTakeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        whichQuizToTakeFrame.add(whichQuizToTakePanel);

        // label for choosing quiz title
        JLabel chooseQuizTakeTitleLabel = new JLabel("Choose Quiz To Take");
        chooseQuizTakeTitleLabel.setBounds(120, 20, 500, 25);
        whichQuizToTakePanel.add(chooseQuizTakeTitleLabel);

        // label for choosing which quiz to take
        JLabel studentChooseQuizLabel = new JLabel("Which quiz would you like to take?");
        studentChooseQuizLabel.setBounds(30, 50, 700, 25);
        whichQuizToTakePanel.add(studentChooseQuizLabel);

        //below array needs to contain the list of quizzes for the course choose by the user
        ArrayList<String> quizNames = (ArrayList<String>) ClientClass.serverCall(6, " ");
        JComboBox jComboBox = new JComboBox(quizNames.toArray());
        jComboBox.setBounds(120, 80, 140, 20);
        whichQuizToTakePanel.add(jComboBox);

        // next button leads to the next question
        JButton quizChoosenNextButton = new JButton("Next");
        quizChoosenNextButton.setBounds(220, 180, 110, 25);
        whichQuizToTakePanel.add(quizChoosenNextButton);
        quizChoosenNextButton.addActionListener(e -> {
            // action button updates the question and moves to the next question
            Quiz q = (Quiz) ClientClass.serverCall(7, jComboBox.getSelectedItem());
            whichQuizToTakeFrame.setVisible(false);

            if(q != null) {
                try {
                    quizStudentTakes(whichQuizToTakeFrame, q);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            whichQuizToTakeFrame.dispose();
        });

        whichQuizToTakePanel.setLayout(null);
        whichQuizToTakeFrame.setVisible(true);
    }

    // quizStudentTakes() allows students to take the questions within the quiz and answers
    public static void quizStudentTakes(JFrame parentFrame, Quiz quiz) throws InterruptedException {
        ArrayList<Question> questions = quiz.getQuestions();
        //save a copy of the original questions before shuffling
        ArrayList<Question> originalQuestions = new ArrayList<>(questions);
        Collections.shuffle(questions);
        ArrayList<Answer> answers = new ArrayList<>();

        //get answers from student
        int num = 1;
        while(answers.size() < questions.size()) {

            // create dialog for question view
            currentQuestionQuizDialog = quizView(parentFrame, questions, num, quiz, answers);
            currentQuestionQuizDialog.setVisible(true);

            num++;
        }
        //at this point all answers have been entered

        //reshuffle answers in the order of the original questions
        ArrayList<Answer> newAnswers = new ArrayList<>(answers);
        int index = 0;
        for(Question question: questions) {
            int originalIndex = findIndexOfQuestion(question.getQuestionTitle(), originalQuestions);
            if (originalIndex != -1) {
                newAnswers.set(originalIndex, answers.get(index));
            }
            index++;
        }
        answers = new ArrayList<>(newAnswers);

        //send submission to server
        QuizSubmission qs = new QuizSubmission("", quiz.getQuizName() + " --- " + username, answers);
        ClientClass.serverCall(8, qs);
        //show view to get back to student home page
        quizSubmitted();
    }

    // findIndexOfQuestion finds the index of the question and returns the index
    public static int findIndexOfQuestion(String question, ArrayList<Question> originalQuestions){
        int index = 0;
        for(Question q: originalQuestions) {
            if (q.getQuestionTitle().equals(question)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    // quizView() allows student user to view the quiz while taking the quiz
    public static JDialog quizView(JFrame parent, ArrayList<Question> questions, int num, Quiz quiz, ArrayList<Answer> answers) {
        Question q = questions.get(num - 1);
        ArrayList<String> choices =  q.getChoices();

        currentQuestionQuizDialog = new JDialog(parent);
        currentQuestionQuizDialog.setModal(true);
        // creates a frame and panel
        JPanel quizStudentTakesPanel1;
        quizStudentTakesPanel1 = new JPanel();
        currentQuestionQuizDialog.setSize(400, 300);
        currentQuestionQuizDialog.add(quizStudentTakesPanel1);

        JLabel questionOneTitleLabel;
        questionOneTitleLabel = new JLabel("             Question " + num + ": ");
        questionOneTitleLabel.setBounds(120, 20, 500, 25);
        quizStudentTakesPanel1.add(questionOneTitleLabel);

        //below label will display the first question of the quiz
        JLabel questionOneStuQuizLabel;
        questionOneStuQuizLabel = new JLabel( q.getQuestionTitle() + "                                     ");
        questionOneStuQuizLabel.setBounds(30, 50, 700, 25);
        quizStudentTakesPanel1.add(questionOneStuQuizLabel);

        //OPTIONS DISPLAYED (MULTIPLE CHOICE)
        JLabel optionOneMC = new JLabel("Option 1: " + choices.get(0) + "                ");
        optionOneMC.setBounds(30, 80, 300, 25);
        quizStudentTakesPanel1.add(optionOneMC);

        JLabel optionTwoMC = new JLabel("Option 2: " + choices.get(1) + "                ");
        optionTwoMC.setBounds(30, 110, 300, 25);
        quizStudentTakesPanel1.add(optionTwoMC);

        JLabel optionThreeMC = new JLabel("Option 3: " + choices.get(2) + "                ");
        optionThreeMC.setBounds(30, 140, 300, 25);
        quizStudentTakesPanel1.add(optionThreeMC);

        JLabel optionFourMC = new JLabel("Option 4: " + choices.get(3) + "                ");
        optionFourMC.setBounds(30, 170, 300, 25);
        quizStudentTakesPanel1.add(optionFourMC);

        // label for typing in answer choice
        JLabel typeInAnswerLabel = new JLabel("Type in the answer (not the option number): ");
        typeInAnswerLabel.setBounds(30, 200, 700, 25);
        quizStudentTakesPanel1.add(typeInAnswerLabel);

        // text field for question one created by teacher
        JTextField questionOneStuAns = new JTextField(20);
        questionOneStuAns.setBounds(200, 200, 60, 25);
        quizStudentTakesPanel1.add(questionOneStuAns);

       // next button leads to next question for student user
        JButton quizStuTakesNextButton = new JButton("Next");
        quizStuTakesNextButton.setBounds(250, 230, 110, 25);
        quizStudentTakesPanel1.add(quizStuTakesNextButton);


        quizStuTakesNextButton.addActionListener(e -> {
            //quiz student takes is saved and updated to teachers side
            answers.add(new Answer(q.getQuestionTitle(), questionOneStuAns.getText()));
            currentQuestionQuizDialog.dispose();
            currentQuestionQuizDialog = null;
        });

        return currentQuestionQuizDialog;
    }

    // quizSubmitted() sets the quiz to be submitted
    public static void quizSubmitted() {
         // creats a frame and panel
        JFrame quizSubmittedFrame = new JFrame();
        JPanel quizSubmittedPanel = new JPanel();
        quizSubmittedFrame.setSize(400, 300);
        quizSubmittedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quizSubmittedFrame.add(quizSubmittedPanel);

        // label for submitting a quiz
        JLabel quizSubmittedLabel = new JLabel("You are done with the quiz and it has been submitted!");
        quizSubmittedLabel.setBounds(30, 20, 500, 25);
        quizSubmittedPanel.add(quizSubmittedLabel);
        
        // button for bringing back to homepag
        JButton quizDoneBackToStuMenuButton = new JButton("Back To HomePage");
        quizDoneBackToStuMenuButton.setBounds(90, 60, 200, 25);
        quizSubmittedPanel.add(quizDoneBackToStuMenuButton);

        quizDoneBackToStuMenuButton.addActionListener(e -> {
             // action button leads the student user back to student menu after finishing their quiz
            quizSubmittedFrame.setVisible(false);
            quizSubmittedFrame.dispose();
            studentMenu();
        });
        quizSubmittedPanel.setLayout(null);
        quizSubmittedFrame.setVisible(true);
    }

    // viewGradedQuiz() allows student to view graded quiz
    public static void viewGradedQuiz(ArrayList<QuizSubmission> qs) {
        // arraylist of quiz submissions
        ArrayList<QuizSubmission> subs = qs;

        // goes through each quiz submission with reference to the username
        for (QuizSubmission q : subs) {
            if (!(q.getQuizName().contains(username)))
                subs.remove(q);
        }
         // goes through each quiz submission with reference to the username
        String[] quizzes = new String[subs.size()];
        int i = 0;
        for (QuizSubmission q : subs) {
            quizzes[i] = q.getQuizName();
            i += 1;
        }

        // creates a frame and panel
        JFrame viewGradedQuizFrame = new JFrame();
        JPanel viewGradedQuizPanel = new JPanel();
        viewGradedQuizFrame.setSize(400, 300);
        viewGradedQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewGradedQuizFrame.add(viewGradedQuizPanel);

        // label for viewing a graded quiz
        JLabel viewGradedQuizTitleLabel = new JLabel("View a Graded Quiz");
        viewGradedQuizTitleLabel.setBounds(140, 20, 500, 25);
        viewGradedQuizPanel.add(viewGradedQuizTitleLabel);
        
        // label for the graded quizzes that students want to view
        JLabel whichGradedQuizToViewLabel = new JLabel("Which of the graded quizzes do you want to view?");
        whichGradedQuizToViewLabel.setBounds(30, 50, 500, 25);
        viewGradedQuizPanel.add(whichGradedQuizToViewLabel);

        // below array has to contain the graded quizzes for the student that is logged in
        String[] gradedQuizOptions = quizzes;
        JComboBox<String> jComboBox = new JComboBox<>(gradedQuizOptions);
        jComboBox.setBounds(120, 80, 140, 20);
        viewGradedQuizPanel.add(jComboBox);

        // button for view quiz
        JButton viewQuizButton = new JButton("View Quiz");
        viewQuizButton.setBounds(90, 140, 200, 25);
        viewGradedQuizPanel.add(viewQuizButton);

        viewQuizButton.addActionListener(e -> {
            viewGradedQuizFrame.setVisible(false);
            viewGradedQuizFrame.dispose();
            // goes through each quiz submission and updates it to dropdown/jComboBox
            for (QuizSubmission q : subs) {
                if ((q.getQuizName().equals(jComboBox.getSelectedItem())))
                    showsStuGradedQuiz(q);
            }
        });

        viewGradedQuizPanel.setLayout(null);
        viewGradedQuizFrame.setVisible(true);

    }

    // showStuGradedQuiz() shows students their graded quiz, passes through the quiz submission object
    public static void showsStuGradedQuiz(QuizSubmission qs){
        // creates a frame and panel
        JFrame stuGradedQuizFrame = new JFrame();
        JPanel stuGradedQuizPanel = new JPanel();
        stuGradedQuizFrame.setSize(500, 400);
        stuGradedQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        stuGradedQuizFrame.add(stuGradedQuizPanel);

        // label for graded quiz
        JLabel stuGradedQuizLabel = new JLabel("Graded Quiz");
        stuGradedQuizLabel.setBounds(210, 20, 500, 25);
        stuGradedQuizPanel.add(stuGradedQuizLabel);

        // text area for quiz to be portrayed on
        JTextArea showsStuGradedQuizText = new JTextArea(getQuizString(qs));
        showsStuGradedQuizText.setBounds(30,50, 400,200);

        // scrollPane for the quiz to be shown
        JScrollPane scrollPane = new JScrollPane(showsStuGradedQuizText);
        scrollPane.setBounds(10,60,300,200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        stuGradedQuizPanel.add(scrollPane);

         // allows student to view and go back to homepage after viewing their quiz submission
        JButton stuGradedQuizScreenBackButton = new JButton("Back To HomePage");
        stuGradedQuizScreenBackButton.setBounds(270, 320, 190, 25);
        stuGradedQuizPanel.add(stuGradedQuizScreenBackButton);

        // action button to allow student to go back to student menu
        stuGradedQuizScreenBackButton.addActionListener(e -> {
            stuGradedQuizFrame.setVisible(false);
            stuGradedQuizFrame.dispose();
            studentMenu();
        });

        stuGradedQuizPanel.setLayout(null);
        stuGradedQuizFrame.setVisible(true);

    }

     // getQuizString() returns the string of the quiz that the teacher user has created
    public static String getQuizString(QuizSubmission qs) {
        // initializes variable for quiz components like total, points, and the string
        int total = 0;
        int points = 0;
        String returnStr = "";

        // return string of quiz
        returnStr = "Quiz: " + qs.getQuizName() + "\n";
        Date date = new Date(qs.getTimeStamp());
        returnStr = returnStr + date + "\n\n";

        // gets the quiz name
        int index = qs.getQuizName().indexOf("---");
        String name = "";
        if (index >= 0)
            name = qs.getQuizName().substring(0, index);
        //System.out.println(name);
        Quiz q = (Quiz) ClientClass.serverCall(7, name.trim());
        int x = 0;

        // gets the arraylist of answers
        ArrayList<Answer> answs = qs.getAnswers();

        // goes through each question and gets questions, choices, and question title
        for(Question ques : q.getQuestions()) {
            returnStr = returnStr + ques.getQuestionTitle() + "\n";
            int i = 1;
            for (String c : ques.getChoices()) {
                returnStr = returnStr + i + ". " + c + "\n";
                i += 1;
            }

            // return string of answer and correct answer
            String anw = answs.get(x).getAnswerChosen();
            returnStr = returnStr + "Your Answer: " + anw + "\n";
            returnStr = returnStr + "Correct Answer: " + ques.getAnswer() + "\n";
            x += 1;
            returnStr = returnStr + "\n";

            total += ques.getPointValue();
             // checks for student input and answer key
            if (anw.equals(ques.getAnswer())){
                points += ques.getPointValue();
            }
        }

        // returns string of student scored and total points
        returnStr = returnStr + "\nStudent scored " + points + " out of " + total;
        return returnStr;
    }

    // viewStudentQuizSubmissions() allows teacher user to view the student quiz submissions
    public static void viewStudentQuizSubmissions() {
        // writes array list of student from the client
        CopyOnWriteArrayList<Student> students = (CopyOnWriteArrayList<Student>) ClientClass.serverCall(14," ");
        String str = "";

        // runs through student object to the array list of students and gets the quiz submissions
        for( Student s : students ) {
            for (QuizSubmission q : s.getQuizSubmissions()) {
                str = str + getQuizString(q);
            }
        }

        // creates frame and panel
        JFrame stuGradedQuizFrame = new JFrame();
        JPanel stuGradedQuizPanel = new JPanel();
        stuGradedQuizFrame.setSize(500, 400);
        stuGradedQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        stuGradedQuizFrame.add(stuGradedQuizPanel);

        // label for student quiz submissions
        JLabel stuGradedQuizLabel = new JLabel("Student Quiz Submissions");
        stuGradedQuizLabel.setBounds(210, 20, 500, 25);
        stuGradedQuizPanel.add(stuGradedQuizLabel);

         // text area to show the graded quiz text from the student
        JTextArea showsStuGradedQuizText = new JTextArea(str);
        showsStuGradedQuizText.setBounds(30,50, 400,200);

        // scrolling feature for teacher to scroll down
        JScrollPane scrollPane = new JScrollPane(showsStuGradedQuizText);
        scrollPane.setBounds(10,60,300,200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        stuGradedQuizPanel.add(scrollPane);

        // button for teacher to go back to home page
        JButton stuGradedQuizScreenBackButton = new JButton("Back To HomePage");
        stuGradedQuizScreenBackButton.setBounds(270, 320, 190, 25);
        stuGradedQuizPanel.add(stuGradedQuizScreenBackButton);

        // action button for teacher to head back to their teacher menu
        stuGradedQuizScreenBackButton.addActionListener(e -> {
            stuGradedQuizFrame.setVisible(false);
            stuGradedQuizFrame.dispose();
            teacherQuizMenu();
        });

        stuGradedQuizPanel.setLayout(null);
        stuGradedQuizFrame.setVisible(true);
    }

    // deletes a quiz
    public static void deleteQuiz(){
        JFrame deleteQuizFrame = new JFrame();
        JPanel deleteQuizPanel = new JPanel();
        deleteQuizFrame.setSize(400, 300);
        deleteQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        deleteQuizFrame.add(deleteQuizPanel);

        JLabel lsmToolLabel = new JLabel("Delete a Quiz");
        lsmToolLabel.setBounds(160, 20, 500, 25);
        deleteQuizPanel.add(lsmToolLabel);

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

     // quizDeleted() has the updated message of whether a quiz has been deleted
    public static void quizDeleted(){
        // creates a frame and panel
        JFrame quizDeletedFrame = new JFrame();
        JPanel quizDeletedPanel = new JPanel();
        quizDeletedFrame.setSize(400, 300);
        quizDeletedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quizDeletedFrame.add(quizDeletedPanel);

        // label that quiz has been deleted
        JLabel deleteQuizLabel = new JLabel("Quiz has been deleted!");
        deleteQuizLabel.setBounds(120, 50, 700, 25);
        quizDeletedPanel.add(deleteQuizLabel);

        // button for teacher user to return back to homepage
        JButton quizDeletedBackButton = new JButton("Return to Homepage");
        quizDeletedBackButton.setBounds(100, 100, 190, 25);
        quizDeletedPanel.add(quizDeletedBackButton);

        // button for leading back to teacher menu screen
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
