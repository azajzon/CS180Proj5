import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    public static JFrame frame;
    public static JPanel panel;
    public static JLabel userLabel;
    public static JLabel passwordLabel;
    public static JTextField userText;
    public static JTextField passText;
    public static JButton loginButton;
    public static JButton createAccountButton;
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
    public static JLabel nameOfQuizLabel;
    public static JTextField nameOfQuizText;
    public static JLabel formatOfQuizLabel;
    public static JButton formatOfQuiz1;
    public static JButton formatOfQuiz2;
    public static JLabel questionOne;
    public static JTextField questionOneText;
    public static JLabel optionOne;
    public static JTextField optionOneText;
    public static JLabel optionTwo;
    public static JTextField optionTwoText;
    public static JLabel optionThree;
    public static JTextField optionThreeText;
    public static JLabel optionFour;
    public static JTextField optionFourText;
    public static JLabel correctAnsChoice;
    public static JTextField correctAnsChoiceText;
    public static JLabel pointValue;
    public static JTextField pointValueText;
    public static JButton editQuiz;
    public static JLabel courseToEditLabel;
    public static JButton deleteQuiz;
    public static JButton viewStudentQuizSubmissions;
    public static JButton takeQuiz;
    public static JButton viewGradedQuiz;
    public static JButton editAccount;
    public static JButton logout;
    public static JButton saveQuestion;
    public static JButton addQuestion;



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
        //createQuiz();
        //editQuiz();
        //accountCreatedTeacher();
        //multipleChoiceQuiz();

    }

    public static void mainMenu() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);


        lsmTool = new JLabel("Welcome to Learning System Management Tool!");
        lsmTool.setBounds(50, 20, 500, 25);
        panel.add(lsmTool);

        createTeacher = new JButton("Create Teacher");
        createTeacher.setBounds(120, 50, 150, 25);
        createTeacher.addActionListener(new Main());
        panel.add(createTeacher);

        createTeacher.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createTeacher();
            }
        });

        createStudent = new JButton("Create Student");
        createStudent.setBounds(120, 80, 150, 25);
        createStudent.addActionListener(new Main());
        panel.add(createStudent);

        createStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createStudent();
            }
        });

        loginTeacher = new JButton("Login Teacher");
        loginTeacher.setBounds(120, 110, 150, 25);
        loginTeacher.addActionListener(new Main());
        panel.add(loginTeacher);

        loginTeacher.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherLogIn();
            }
        });

        loginStudent = new JButton("Login Student");
        loginStudent.setBounds(120, 140, 150, 25);
        loginStudent.addActionListener(new Main());
        panel.add(loginStudent);

        loginStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentLogIn();
            }
        });

        saveButton = new JButton("Save and Exit");
        saveButton.setBounds(120, 170, 150, 25);
        saveButton.addActionListener(new Main());
        panel.add(saveButton);

        /*saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call the save data methods
            }
        });*/

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
        welcomeLabel.setBounds(120, 20, 200, 25);
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

        createAccountButton = new JButton("Create Account");
        createAccountButton.setBounds(120, 150, 150, 25);
        createAccountButton.addActionListener(new Main());
        panel.add(createAccountButton);

        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accountCreatedTeacher();
            }
        });

        frame.setVisible(true);

    }

    public static void accountCreatedTeacher() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        welcomeLabel = new JLabel("Account successfully created!");
        welcomeLabel.setBounds(110, 20, 200, 25);
        panel.add(welcomeLabel);

        loginButton = new JButton("Log In");
        loginButton.setBounds(150, 70, 90, 25);
        loginButton.addActionListener(new Main());
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherLogIn();
            }
        });

        panel.setLayout(null);

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
        welcomeLabel.setBounds(140, 20, 150, 25);
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
        loginButton.setBounds(150, 120, 80, 25);
        loginButton.addActionListener(new Main());
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherMenu();
            }
        });

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
        yesCourse.addActionListener(new Main());
        panel.add(yesCourse);

        yesCourse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCourse();
            }
        });

        noCourse = new JButton("No");
        noCourse.setBounds(120, 80, 80, 25);
        noCourse.addActionListener(new Main());
        panel.add(noCourse);

        /* what should happen if teacher doesn't want to create a course
        noCourse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        */

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
        courseEnter.addActionListener(new Main());
        panel.add(courseEnter);

        courseEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherQuizMenu();
            }
        });

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
        createQuiz.addActionListener(new Main());
        panel.add(createQuiz);

        createQuiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createQuiz();
            }
        });

        editQuiz = new JButton("Edit Quiz");
        editQuiz.setBounds(80, 80, 250, 25);
        editQuiz.addActionListener(new Main());
        panel.add(editQuiz);

        editQuiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editQuiz();
            }
        });

        deleteQuiz = new JButton("Delete Quiz");
        deleteQuiz.setBounds(80, 110, 250, 25);
        deleteQuiz.addActionListener(new Main());
        panel.add(deleteQuiz);

        viewStudentQuizSubmissions = new JButton("View Student Quiz Submissions");
        viewStudentQuizSubmissions.setBounds(80, 140, 250, 25);
        viewStudentQuizSubmissions.addActionListener(new Main());
        panel.add(viewStudentQuizSubmissions);


        panel.setLayout(null);
        frame.setVisible(true);
    }

    public static void createQuiz() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        lsmTool = new JLabel("Create a Quiz");
        lsmTool.setBounds(130, 20, 500, 25);
        panel.add(lsmTool);

        nameOfQuizLabel = new JLabel("Name of Quiz:");
        nameOfQuizLabel.setBounds(20, 50, 150, 25);
        panel.add(nameOfQuizLabel);

        nameOfQuizText = new JTextField(20);
        nameOfQuizText.setBounds(120, 50, 125, 25);
        panel.add(nameOfQuizText);

        formatOfQuizLabel = new JLabel("Format of Quiz:");
        formatOfQuizLabel.setBounds(20, 90, 150, 25);
        panel.add(formatOfQuizLabel);

        formatOfQuiz1 = new JButton("Multiple-Choice");
        formatOfQuiz1.setBounds(80, 130, 190, 25);
        formatOfQuiz1.addActionListener(new Main());
        panel.add(formatOfQuiz1);

        formatOfQuiz1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                multipleChoiceQuiz();
            }
        });

        formatOfQuiz2 = new JButton("True/False");
        formatOfQuiz2.setBounds(80, 160, 190, 25);
        formatOfQuiz2.addActionListener(new Main());
        panel.add(formatOfQuiz2);

        panel.setLayout(null);
        frame.setVisible(true);
    }

    public static void multipleChoiceQuiz() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        lsmTool = new JLabel("Name of Quiz: "); // + show name of quiz);
        lsmTool.setBounds(130, 20, 500, 25);
        panel.add(lsmTool);

        questionOne = new JLabel("Type in Question 1:");
        questionOne.setBounds(20, 50, 130, 25);
        panel.add(questionOne);

        questionOneText = new JTextField(20);
        questionOneText.setBounds(210, 50, 165, 25);
        panel.add(questionOneText);

        optionOne = new JLabel("Option 1:");
        optionOne.setBounds(20, 80, 80, 25);
        panel.add(optionOne);

        optionOneText = new JTextField(20);
        optionOneText.setBounds(210, 80, 165, 25);
        panel.add(optionOneText);

        optionTwo = new JLabel("Option 2:");
        optionTwo.setBounds(20, 110, 80, 25);
        panel.add(optionTwo);

        optionTwoText = new JTextField(20);
        optionTwoText.setBounds(210, 110, 165, 25);
        panel.add(optionTwoText);

        optionThree = new JLabel("Option 3:");
        optionThree.setBounds(20, 140, 80, 25);
        panel.add(optionThree);

        optionThreeText = new JTextField(20);
        optionThreeText.setBounds(210, 140, 165, 25);
        panel.add(optionThreeText);

        optionFour = new JLabel("Option 4:");
        optionFour.setBounds(20, 170, 80, 25);
        panel.add(optionFour);

        optionFourText = new JTextField(20);
        optionFourText.setBounds(210, 170, 165, 25);
        panel.add(optionFourText);

        correctAnsChoice = new JLabel("Enter correct answer choice:");
        correctAnsChoice.setBounds(20, 200, 250, 25);
        panel.add(correctAnsChoice);

        correctAnsChoiceText = new JTextField(20);
        correctAnsChoiceText.setBounds(210, 200, 165, 25);
        panel.add(correctAnsChoiceText);

        //save the questions
        saveQuestion = new JButton("Save Question");
        saveQuestion.setBounds(40, 230, 190, 25);
        saveQuestion.addActionListener(new Main());
        panel.add(saveQuestion);

        //adds the questions
        addQuestion = new JButton("Add Question");
        addQuestion.setBounds(40, 250, 190, 25);
        addQuestion.addActionListener(new Main());
        panel.add(addQuestion);

        panel.setLayout(null);
        frame.setVisible(true);
    }

    public static void editQuiz() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        lsmTool = new JLabel("Edit a Quiz");
        lsmTool.setBounds(160, 20, 500, 25);
        panel.add(lsmTool);

        courseToEditLabel = new JLabel("Which course do you want to edit quiz from?");
        courseToEditLabel.setBounds(20, 50, 280, 25);
        panel.add(courseToEditLabel);

 
        //DROP DOWN feature

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

        createAccountButton = new JButton("Login");
        createAccountButton.setBounds(30, 150, 80, 25);
        createAccountButton.addActionListener(new Main());
        panel.add(createAccountButton);

        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accountCreatedStudent();
            }
        });

        frame.setVisible(true);
    }

    public static void accountCreatedStudent() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        welcomeLabel = new JLabel("Account successfully created! Please log back in.");
        welcomeLabel.setBounds(80, 20, 200, 25);
        panel.add(welcomeLabel);

        loginButton = new JButton("Log In");
        loginButton.setBounds(30, 150, 80, 25);
        loginButton.addActionListener(new Main());
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentLogIn();
            }
        });

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
        loginButton.addActionListener(new Main());
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentMenu();
            }
        });

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
        takeQuiz.addActionListener(new Main());
        panel.add(takeQuiz);

        viewGradedQuiz = new JButton("View Graded Quiz");
        viewGradedQuiz.setBounds(80, 80, 250, 25);
        viewGradedQuiz.addActionListener(new Main());
        panel.add(viewGradedQuiz);

        editAccount = new JButton("Edit Account");
        editAccount.setBounds(80, 110, 250, 25);
        editAccount.addActionListener(new Main());
        panel.add(editAccount);

        editAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editAccount();
            }
        });

        logout = new JButton("Logout");
        logout.setBounds(80, 140, 250, 25);
        logout.addActionListener(new Main());
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
        loginButton.addActionListener(new Main());
        panel.add(loginButton);


        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

    //example for plugging in invalid inputs

    /*
    @Override
    public boolean verify(JComponent input) {
        try {
            int value = Double.parseDouble();
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
     */
