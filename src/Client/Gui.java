package Client;

import Server.Question;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
    public static JPanel teacherMenuPanel;
    public static JPanel addCoursePanel;


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
    public static JFrame teacherMenuFrame;


    public static JPanel studentMenuPanel;
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
            if (ClientClass.serverCall(new String[]{"command:0", "username:" + teacherUsernameText.getText(),
                    "password:" + teacherPasswordText.getText()})) {
                JOptionPane.showMessageDialog(null, "Logged in successfully.",
                        "Login", JOptionPane.INFORMATION_MESSAGE);
                teacherMenu();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect username or password.", "Login", JOptionPane.WARNING_MESSAGE);
                mainMenu();
            }
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
            if (ClientClass.serverCall(new String[]{"command:1", "name:" + createTeacherNameText.getText(),
                    "username:" + createTeacherUsernameText.getText(), "password:" + createTeacherPasswordText.getText()})) {
                JOptionPane.showMessageDialog(null, "Account created successfully.", "Login", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Account creation failed.", "Login", JOptionPane.WARNING_MESSAGE);
            }
            mainMenu();
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
            if (ClientClass.serverCall(new String[]{"command:2", "username:" + studentUsernameText.getText(),
                    "password:" + studentPasswordText.getText()})) {
                JOptionPane.showMessageDialog(null, "Logged in successfully.", "Login", JOptionPane.INFORMATION_MESSAGE);
                studentMenu();
            } else {
                JOptionPane.showMessageDialog(null, "Account creation failed.", "Login", JOptionPane.WARNING_MESSAGE);
                mainMenu();
            }
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
            if (ClientClass.serverCall(new String[]{"command:3", "name:" + createStudentNameText.getText(),
                    "username:" + createStudentUsernameText.getText(), "password:" + createStudentPasswordText})) {
                JOptionPane.showMessageDialog(null, "Account created successfully.", "Login", JOptionPane.INFORMATION_MESSAGE);
                mainMenu();
            } else {
                JOptionPane.showMessageDialog(null, "Account creation failed.", "Login", JOptionPane.WARNING_MESSAGE);
            }
        });
        createStudentPanel.add(createStudentAccountButton);


        createStudentFrame.setVisible(true);
    }

    public static void teacherMenu() {
        teacherMenuFrame = new JFrame();
        teacherMenuPanel = new JPanel();
        teacherMenuFrame.setSize(400, 300);
        teacherMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teacherMenuFrame.add(teacherMenuPanel);

        JLabel addCourseLabel = new JLabel("Do you want to add a course?");
        addCourseLabel.setBounds(80, 20, 200, 25);
        teacherMenuPanel.add(addCourseLabel);

        JButton yesCourseButton = new JButton("Yes");
        yesCourseButton.setBounds(120, 50, 80, 25);
        teacherMenuPanel.add(yesCourseButton);

        yesCourseButton.addActionListener((e) -> {
            teacherMenuFrame.setVisible(false);
            teacherMenuFrame.dispose();
            addCourse();
        });

        JButton noCourseButton = new JButton("No");
        noCourseButton.setBounds(120, 80, 80, 25);
        teacherMenuPanel.add(noCourseButton);

        //if teacher doesn't want to create a course
        noCourseButton.addActionListener((e) -> {
            teacherQuizMenu();
        });

        teacherMenuPanel.setLayout(null);
        teacherMenuFrame.setVisible(true);
    }

    public static void addCourse() {
        JFrame addCourseFrame = new JFrame();
        addCoursePanel = new JPanel();
        addCourseFrame.setSize(400, 300);
        addCourseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addCourseFrame.add(addCoursePanel);

        // if yes to adding a course
        // PATHWAY IS

        JLabel enterCourseNameLabel = new JLabel("Enter Course Name:");
        enterCourseNameLabel.setBounds(130, 20, 200, 25);
        addCoursePanel.add(enterCourseNameLabel);

        JTextField enterCourseNameText = new JTextField(50);
        enterCourseNameText.setBounds(120, 50, 165, 25);
        addCoursePanel.add(enterCourseNameText);

        JButton createCourseButton = new JButton("Create Course");
        createCourseButton.setBounds(180, 80, 140, 25);

        addCoursePanel.add(createCourseButton);

        createCourseButton.addActionListener((e) -> {

            if (ClientClass.serverCall(new String[]{"command:4", "name:" + enterCourseNameText.getText()})) {
                JOptionPane.showMessageDialog(null, "Course created successfully.", "Course Creation", JOptionPane.INFORMATION_MESSAGE);
                teacherQuizMenu();
            }
        });

        JButton addCourseBackButton = new JButton("Back");
        addCourseBackButton.setBounds(60, 80, 80, 25);
        addCoursePanel.add(addCourseBackButton);

        addCourseBackButton.addActionListener((e) -> {
            addCourseFrame.setVisible(false);
            addCourseFrame.dispose();
            teacherQuizMenu();
        });

        addCoursePanel.setLayout(null);
        addCourseFrame.setVisible(true);
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
            //takeQuiz();
        });

        JButton viewGradedQuizButton = new JButton("View Graded Quiz");
        viewGradedQuizButton.setBounds(80, 80, 250, 25);

        studentMenuPanel.add(viewGradedQuizButton);

        viewGradedQuizButton.addActionListener(e -> {
            studentMenuFrame.setVisible(false);
            studentMenuFrame.dispose();
            //viewGradedQuiz();
        });

        JButton editStudentAccountButton = new JButton("Edit Account");
        editStudentAccountButton.setBounds(80, 110, 250, 25);

        studentMenuPanel.add(editStudentAccountButton);

        editStudentAccountButton.addActionListener(e -> {
            studentMenuFrame.setVisible(false);
            studentMenuFrame.dispose();
            //editStudentAccount();
        });

        JButton studentLogOutButton = new JButton("Logout");
        studentLogOutButton.setBounds(80, 140, 250, 25);

        studentMenuPanel.add(studentLogOutButton);

        //TODO what should happen when the student log outs
        /*
        studentLogOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        */

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
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            //editQuiz();
        });

        JButton deleteQuizButton = new JButton("Delete Quiz");
        deleteQuizButton.setBounds(80, 110, 250, 25);
        teacherQuizMenuPanel.add(deleteQuizButton);

        JButton viewStudentQuizSubmissionsButton = new JButton("View Student Quiz Submissions");
        viewStudentQuizSubmissionsButton.setBounds(80, 140, 250, 25);
        teacherQuizMenuPanel.add(viewStudentQuizSubmissionsButton);

        JButton editTeacherAccountButton = new JButton("Edit Account");
        editTeacherAccountButton.setBounds(80, 170, 250, 25);
        teacherQuizMenuPanel.add(editTeacherAccountButton);

        editTeacherAccountButton.addActionListener((e) -> {
            teacherQuizMenuFrame.setVisible(false);
            teacherQuizMenuFrame.dispose();
            //editTeacherAccount();

        });


        JButton teacherQuizMenuBackButton = new JButton("Back");
        teacherQuizMenuBackButton.setBounds(30, 200, 110, 25);
        teacherQuizMenuPanel.add(teacherQuizMenuBackButton);

        teacherQuizMenuBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherQuizMenuFrame.setVisible(false);
                teacherQuizMenuFrame.dispose();
                addCourse();
            }
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
            multipleChoiceQuiz();
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

    public static void multipleChoiceQuiz() {
        JFrame multipleChoiceQuizFrame = new JFrame();
        JPanel multipleChoiceQuizPanel = new JPanel();
        ArrayList<Question> questions = new ArrayList<>();
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
            q.addChoice(optionOneMCLabel.getText());
            q.addChoice(optionTwoMCLabel.getText());
            q.addChoice(optionThreeMCLabel.getText());
            q.addChoice(optionFourMCLabel.getText());
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
                createQuiz();
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
                ClientClass.createQuiz(questionOneMCText.getText(), questions);
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

    public static void addAnotherQuestion(ArrayList<Question> questions) {


    }


}
