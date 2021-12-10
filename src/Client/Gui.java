package Client;

import Server.Answer;
import Server.Question;
import Server.Quiz;
import Server.QuizSubmission;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

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

    public static String username = "";


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
            if ((Boolean) ClientClass.serverCall(0, new String[] {teacherUsernameText.getText(),
                    teacherPasswordText.getText()})) {
                JOptionPane.showMessageDialog(null, "Logged in successfully.",
                        "Login", JOptionPane.INFORMATION_MESSAGE);
                teacherQuizMenu();
                username = teacherUsernameText.getText();
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
            if ((Boolean) ClientClass.serverCall(1, new String[] {createTeacherNameText.getText(),
                    createTeacherUsernameText.getText(), createTeacherPasswordText.getText()})) {
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
            if ((Boolean) ClientClass.serverCall(2, new String[]{studentUsernameText.getText(), studentPasswordText.getText()})) {
                JOptionPane.showMessageDialog(null, "Logged in successfully.", "Login", JOptionPane.INFORMATION_MESSAGE);
                studentMenu();
                username = studentUsernameText.getText();
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
            if ((Boolean) ClientClass.serverCall(3, new String[]{createStudentNameText.getText(),
                    createStudentUsernameText.getText(), createStudentPasswordText.getText()})) {
                JOptionPane.showMessageDialog(null, "Account created successfully.", "Login", JOptionPane.INFORMATION_MESSAGE);
                mainMenu();
            } else {
                JOptionPane.showMessageDialog(null, "Account creation failed.", "Login", JOptionPane.WARNING_MESSAGE);
            }
        });
        createStudentPanel.add(createStudentAccountButton);


        createStudentFrame.setVisible(true);
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

        //TODO what should happen when the student log outs

        studentLogOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentMenuFrame.setVisible(false);
                studentMenuFrame.dispose();
                mainMenu();
            }
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


        JButton teacherQuizMenuBackButton = new JButton("Logout");
        teacherQuizMenuBackButton.setBounds(30, 200, 110, 25);
        teacherQuizMenuPanel.add(teacherQuizMenuBackButton);

        teacherQuizMenuBackButton.addActionListener(e -> {
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
                if ((Boolean) ClientClass.serverCall(4, new Server.Quiz(questions, quizName))) {
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

        // dropdown feature to show list of courses
        /*
        String[] optionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
        String getCourse = (String) JOptionPane.showInputDialog(
                null,
                "Which course do you want to edit quiz from?",
                "Choose Course",
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsToChoose,
                optionsToChoose[0]);
        */

        editQuizPanel.setLayout(null);
        editQuizFrame.setVisible(true);

    }

    public static void editTeacherAccount() {
        JFrame editTeacherAccountFrame = new JFrame();
        JPanel editTeacherAccountPanel = new JPanel();
        editTeacherAccountFrame.setSize(400, 300);
        editTeacherAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editTeacherAccountFrame.add(editTeacherAccountPanel);

        editTeacherAccountPanel.setLayout(null);

        JLabel editTeachAccountLabel = new JLabel("Edit Student Account");
        editTeachAccountLabel.setBounds(80, 20, 200, 25);
        editTeacherAccountPanel.add(editTeachAccountLabel);

        JLabel editedTeachNameLabel = new JLabel("First & Last Name:");
        editedTeachNameLabel.setBounds(20, 50, 150, 25);
        editTeacherAccountPanel.add(editedTeachNameLabel);

        JTextField editedTeachNameText = new JTextField(20);
        editedTeachNameText.setBounds(150, 50, 165, 25);
        editTeacherAccountPanel.add(editedTeachNameText);

        JLabel editedTeachUsernameLabel = new JLabel("Username:");
        editedTeachUsernameLabel.setBounds(20, 80, 80, 25);
        editTeacherAccountPanel.add(editedTeachUsernameLabel);

        JTextField editedTeachUsernameText = new JTextField(20);
        editedTeachUsernameText.setBounds(150, 80, 165, 25);
        editTeacherAccountPanel.add(editedTeachUsernameText);

        JLabel editedTeachPasswordLabel = new JLabel("Password:");
        editedTeachPasswordLabel.setBounds(20, 110, 80, 25);
        editTeacherAccountPanel.add(editedTeachPasswordLabel);

        JTextField editedTeachPasswordText = new JTextField(20);
        editedTeachPasswordText.setBounds(150, 110, 165, 25);
        editTeacherAccountPanel.add(editedTeachPasswordText);

        JButton updateTeachAccountButton = new JButton("Save and Update Account");
        updateTeachAccountButton.setBounds(30, 150, 200, 25);
        editTeacherAccountPanel.add(updateTeachAccountButton);

        //TODO what should happen when the student save and updates their information (call the specific method that saves the updated data)
        /*
        updateTeachAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        */

        JButton editTeachAccountBackButton = new JButton("Back");
        editTeachAccountBackButton.setBounds(30, 180, 110, 25);
        editTeacherAccountPanel.add(editTeachAccountBackButton);

        editTeachAccountBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editTeacherAccountFrame.setVisible(false);
                editTeacherAccountFrame.dispose();
                studentMenu();
            }
        });


        editTeacherAccountFrame.setVisible(true);

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
                    editedStuUsernameLabel.getText(),
                    editedStuPasswordLabel.getText()})).booleanValue() ){
                JOptionPane.showMessageDialog(null, "Account Info Changed successfully.",
                        "Acc Info Change", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Account Info Changed unsuccessfully.",
                        "Acc Info Change", JOptionPane.INFORMATION_MESSAGE);
            }
            editStudentAccountFrame.setVisible(false);
            editStudentAccountFrame.dispose();
            studentMenu();
        });
        editStudentAccountPanel.add(updateStuAccountButton);

        JButton editStuAccountBackButton = new JButton("Back");
        editStuAccountBackButton.setBounds(30, 180, 110, 25);
        editStudentAccountPanel.add(editStuAccountBackButton);

        editStuAccountBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editStudentAccountFrame.setVisible(false);
                editStudentAccountFrame.dispose();
                studentMenu();
            }
        });

        editStudentAccountFrame.setVisible(true);
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
        int cNum = 1;
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

        viewQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewGradedQuizFrame.setVisible(false);
                viewGradedQuizFrame.dispose();

                for (QuizSubmission q : subs) {
                    if ((q.getQuizName().equals(jComboBox.getSelectedItem())))
                        showsStuGradedQuiz(q);
                }
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

        stuGradedQuizScreenBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stuGradedQuizFrame.setVisible(false);
                stuGradedQuizFrame.dispose();
                studentMenu();
            }
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

        returnStr = returnStr + "\nYou scored " + points + " out of " + total;
        return returnStr;
    }

}