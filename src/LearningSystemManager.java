import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    public static JFrame frame;
    public static JPanel panel;
    public static JLabel lsmToolLabel;


    //TEACHER VARIABLES
    public static JButton createTeacherButton;
    public static JButton createStudentButton;
    public static JButton loginTeacherButton;
    public static JButton loginStudentButton;
    public static JButton saveButton;
    public static JLabel createTeacherLabel;
    public static JLabel teacherNameLabel;
    public static JTextField teacherNameText;
    public static JLabel teacherUsernameLabel;
    public static JTextField teacherUsernameText;
    public static JLabel teacherPasswordLabel;
    public static JTextField teacherPasswordText;
    public static JButton createTeacherAccountButton;
    public static JButton createTeacherAccountBackButton;
    public static JLabel teacherAccountCreatedLabel;
    public static JButton teacherLogInButton;
    public static JLabel welcomeTeachersLabel;
    public static JLabel teacherLogInUsernameLabel;
    public static JLabel teacherLogInPasswordLabel;
    public static JTextField teacherLogInUsernameText;
    public static JTextField teacherLogInPasswordText;
    public static JButton teacherLogInBackButton;
    public static JLabel addCourseLabel;
    public static JButton yesCourseButton;
    public static JButton noCourseButton;
    public static JLabel enterCourseNameLabel;
    public static JTextField enterCourseNameText;
    public static JButton createCourseButton;
    public static JButton addCourseBackButton;
    public static JButton createQuizButton;
    public static JButton editQuizButton;
    
    public static JButton deleteQuizButton;
    public static JButton viewStudentQuizSubmissionsButton;
    public static JButton editTeacherAccountButton;
    public static JButton teacherQuizMenuBackButton;
    public static JLabel nameOfQuizLabel;
    public static JTextField nameOfQuizText;
    public static JLabel formatOfQuizLabel;
    public static JButton formatOfQuiz1Button;
    public static JButton formatOfQuiz2Button;
    public static JButton createQuizBackButton;
    public static JLabel questionOneMCLabel;
    public static JTextField questionOneMCText;
    public static JLabel optionOneMCLabel;
    public static JTextField optionOneMCText;
    public static JLabel optionTwoMCLabel;
    public static JTextField optionTwoMCText;
    public static JLabel optionThreeMCLabel;
    public static JTextField optionThreeMCText;
    public static JLabel optionFourMCLabel;
    public static JTextField optionFourMCText;
    public static JLabel correctAnsChoiceMCLabel;
    public static JTextField correctAnsChoiceMCText;
    public static JLabel pointValueMCLabel;
    public static JTextField pointValueMCText;
    public static JButton addQuestionMCButton;
    public static JButton multipleChoiceQuizBackButton;
    public static JLabel questionOneTFLabel;
    public static JTextField questionOneTFText;
    public static JLabel optionOneTFLabel;
    public static JLabel optionTwoTFLabel;
    public static JLabel correctAnsChoiceTFLabelChoice;
    public static JTextField correctAnsChoiceTFText;
    public static JLabel pointValueTFLabel;
    public static JTextField pointValueTFText;
    public static JButton addQuestionTFButton;
    public static JLabel addAnotherQuestionLabel;
    public static JButton yesAnotherQuestionButton;
    public static JButton noAnotherQuestionButton;
    public static JLabel editTeachAccountLabel;
    public static JLabel editedTeachNameLabel;
    public static JTextField editedTeachNameText;
    public static JLabel editedTeachUsernameLabel;
    public static JTextField editedTeachUsernameText;
    public static JLabel editedTeachPasswordLabel;
    public static JTextField editedTeachPasswordText;
    public static JButton updateTeachAccountButton;
    public static JButton editTeachAccountBackButton;

    //STUDENT VARIABLES
    public static JLabel createStudentLabel;
    public static JLabel studentNameLabel;
    public static JTextField studentNameText;
    public static JLabel studentUsernameLabel;
    public static JTextField studentUsernameText;
    public static JLabel studentPasswordLabel;
    public static JTextField studentPasswordText;
    public static JButton createStudentAccountButton;
    public static JButton createStudentAccountBackButton;
    public static JLabel studentAccountCreatedLabel;
    public static JButton studentLogInButton;
    public static JLabel welcomeStudentsLabel;
    public static JLabel studentLogInUsernameLabel;
    public static JTextField studentLogInUsernameText;
    public static JLabel studentLogInPasswordLabel;
    public static JTextField studentLogInPasswordText;
    public static JButton studentLogInBackButton;
    public static JButton takeQuizButton;
    public static JButton viewGradedQuizButton;
    public static JButton editStudentAccountButton;
    public static JButton studentLogOutButton;
    public static JLabel editStuAccountLabel;
    public static JLabel editedStuNameLabel;
    public static JTextField editedStuNameText;
    public static JLabel editedStuUsernameLabel;
    public static JTextField editedStuUsernameText;
    public static JLabel editedStuPasswordLabel;
    public static JTextField editedStuPasswordText;
    public static JButton updateStuAccountButton;
    public static JButton editStuAccountBackButton;
    public static JLabel viewGradedQuiz;


    public static void main(String[] args) {

        mainMenu();
        //createTeacher();
        //accountCreatedTeacher();
        //teacherLogIn();
        //teacherMenu();
        //addCourse();
        //teacherQuizMenu();
        //editStudentAccount();
        //createQuiz();
        //editQuiz();
        //multipleChoiceQuiz();
        //trueOrFalseQuiz();
        //editTeacherAccount();
        //createStudent();
        //accountCreatedStudent();
        //studentLogIn();
        //studentMenu();
        //takeQuiz();
        //viewGradedQuiz();
        //editStudentAccount();

    }

    public static void mainMenu() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        lsmToolLabel = new JLabel("Welcome to Learning System Management Tool!");
        lsmToolLabel.setBounds(50, 20, 500, 25);
        panel.add(lsmToolLabel);

        createTeacherButton = new JButton("Create Teacher");
        createTeacherButton.setBounds(120, 50, 150, 25);
        createTeacherButton.addActionListener(new Main());
        panel.add(createTeacherButton);

        createTeacherButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createTeacher();
            }
        });

        createStudentButton = new JButton("Create Student");
        createStudentButton.setBounds(120, 80, 150, 25);
        createStudentButton.addActionListener(new Main());
        panel.add(createStudentButton);


        createStudentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createStudent();
            }
        });

        loginTeacherButton = new JButton("Login Teacher");
        loginTeacherButton.setBounds(120, 110, 150, 25);
        loginTeacherButton.addActionListener(new Main());
        panel.add(loginTeacherButton);

        loginTeacherButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherLogIn();
            }
        });

        loginStudentButton = new JButton("Login Student");
        loginStudentButton.setBounds(120, 140, 150, 25);
        loginStudentButton.addActionListener(new Main());
        panel.add(loginStudentButton);

        loginStudentButton.addActionListener(new ActionListener() {
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

        createTeacherLabel = new JLabel("Create a teacher account");
        createTeacherLabel.setBounds(120, 20, 200, 25);
        panel.add(createTeacherLabel);

        teacherNameLabel = new JLabel("First & Last Name:");
        teacherNameLabel.setBounds(20, 50, 150, 25);
        panel.add(teacherNameLabel);

        teacherNameText = new JTextField(20);
        teacherNameText.setBounds(150, 50, 165, 25);
        panel.add(teacherNameText);

        teacherUsernameLabel = new JLabel("Username:");
        teacherUsernameLabel.setBounds(20, 80, 80, 25);
        panel.add(teacherUsernameLabel);

        teacherUsernameText = new JTextField(20);
        teacherUsernameText.setBounds(150, 80, 165, 25);
        panel.add(teacherUsernameText);

        teacherPasswordLabel = new JLabel("Password:");
        teacherPasswordLabel.setBounds(20, 110, 80, 25);
        panel.add(teacherPasswordLabel);

        teacherPasswordText = new JTextField(20);
        teacherPasswordText.setBounds(150, 110, 165, 25);
        panel.add(teacherPasswordText);

        createTeacherAccountButton = new JButton("Create Account");
        createTeacherAccountButton.setBounds(160, 150, 150, 25);
        createTeacherAccountButton.addActionListener(new Main());
        panel.add(createTeacherAccountButton);

        createTeacherAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accountCreatedTeacher();
            }
        });

        createTeacherAccountBackButton = new JButton("Back");
        createTeacherAccountBackButton.setBounds(30, 150, 110, 25);
        createTeacherAccountBackButton.addActionListener(new Main());
        panel.add(createTeacherAccountBackButton);

        createTeacherAccountBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenu();
            }
        });

        frame.setVisible(true);

    }

// Sample invalid input check
    /*
    public static boolean checkSpaceForTeacherName(JTextField teacherNameText) {
        try {
            int name = Integer.parseInt(teacherNameText.getText());
            return true;
        } catch (NumberFormatException e) {
            JLabel invalidName = new JLabel("Enter a space for first name and last name");
            return false;
        }
    }

     */

    public static void accountCreatedTeacher() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        teacherAccountCreatedLabel = new JLabel("Account successfully created!");
        teacherAccountCreatedLabel.setBounds(110, 20, 200, 25);
        panel.add(teacherAccountCreatedLabel);

        teacherLogInButton = new JButton("Log In");
        teacherLogInButton.setBounds(150, 70, 90, 25);
        teacherLogInButton.addActionListener(new Main());
        panel.add(teacherLogInButton);

        teacherLogInButton.addActionListener(new ActionListener() {
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

        welcomeTeachersLabel = new JLabel("Welcome teachers!");
        welcomeTeachersLabel.setBounds(140, 20, 150, 25);
        panel.add(welcomeTeachersLabel);

        teacherLogInUsernameLabel = new JLabel("Username:");
        teacherLogInUsernameLabel.setBounds(20, 50, 80, 25);
        panel.add(teacherLogInUsernameLabel);

        teacherLogInPasswordLabel = new JLabel("Password:");
        teacherLogInPasswordLabel.setBounds(20, 80, 80, 25);
        panel.add(teacherLogInPasswordLabel);

        teacherLogInUsernameText = new JTextField(20);
        teacherLogInUsernameText.setBounds(100, 50, 165, 25);
        panel.add(teacherLogInUsernameText);

        teacherLogInPasswordText = new JTextField(20);
        teacherLogInPasswordText.setBounds(100, 80, 165, 25);
        panel.add(teacherLogInPasswordText);

        teacherLogInButton = new JButton("Login");
        teacherLogInButton.setBounds(150, 120, 80, 25);
        teacherLogInButton.addActionListener(new Main());
        panel.add(teacherLogInButton);

        teacherLogInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherMenu();
            }
        });

        teacherLogInBackButton = new JButton("Back");
        teacherLogInBackButton.setBounds(30, 120, 110, 25);
        teacherLogInBackButton.addActionListener(new Main());
        panel.add(teacherLogInBackButton);

        teacherLogInBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenu();
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

        addCourseLabel = new JLabel("Do you want to add a course?");
        addCourseLabel.setBounds(80, 20, 200, 25);
        panel.add(addCourseLabel);

        yesCourseButton = new JButton("Yes");
        yesCourseButton.setBounds(120, 50, 80, 25);
        yesCourseButton.addActionListener(new Main());
        panel.add(yesCourseButton);

        yesCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCourse();
            }
        });

        noCourseButton = new JButton("No");
        noCourseButton.setBounds(120, 80, 80, 25);
        noCourseButton.addActionListener(new Main());
        panel.add(noCourseButton);

        //if teacher doesn't want to create a course
        noCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenu();
            }
        });


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

        enterCourseNameLabel = new JLabel("Enter Course Name:");
        enterCourseNameLabel.setBounds(130, 20, 200, 25);
        panel.add(enterCourseNameLabel);

        enterCourseNameText = new JTextField(50);
        enterCourseNameText.setBounds(120, 50, 165, 25);
        panel.add(enterCourseNameText);

        createCourseButton = new JButton("Create Course");
        createCourseButton.setBounds(180, 80, 140, 25);
        createCourseButton.addActionListener(new Main());
        panel.add(createCourseButton);

        createCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherQuizMenu();
            }
        });

        addCourseBackButton = new JButton("Back");
        addCourseBackButton.setBounds(60, 80, 80, 25);
        addCourseBackButton.addActionListener(new Main());
        panel.add(addCourseBackButton);

        addCourseBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherMenu();
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

        lsmToolLabel = new JLabel("Learning System Management Tool");
        lsmToolLabel.setBounds(90, 20, 500, 25);
        panel.add(lsmToolLabel);

        createQuizButton = new JButton("Create a Quiz");
        createQuizButton.setBounds(80, 50, 250, 25);
        createQuizButton.addActionListener(new Main());
        panel.add(createQuizButton);

        createQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createQuiz();
            }
        });

        editQuizButton = new JButton("Edit Quiz");
        editQuizButton.setBounds(80, 80, 250, 25);
        editQuizButton.addActionListener(new Main());
        panel.add(editQuizButton);

        editQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editQuiz();
            }
        });

        deleteQuizButton = new JButton("Delete Quiz");
        deleteQuizButton.setBounds(80, 110, 250, 25);
        deleteQuizButton.addActionListener(new Main());
        panel.add(deleteQuizButton);

        viewStudentQuizSubmissionsButton = new JButton("View Student Quiz Submissions");
        viewStudentQuizSubmissionsButton.setBounds(80, 140, 250, 25);
        viewStudentQuizSubmissionsButton.addActionListener(new Main());
        panel.add(viewStudentQuizSubmissionsButton);

        editTeacherAccountButton = new JButton("Edit Account");
        editTeacherAccountButton.setBounds(80, 170, 250, 25);
        editTeacherAccountButton.addActionListener(new Main());
        panel.add(editTeacherAccountButton);

        editTeacherAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editTeacherAccount();
            }
        });


        teacherQuizMenuBackButton = new JButton("Back");
        teacherQuizMenuBackButton.setBounds(30, 200, 110, 25);
        teacherQuizMenuBackButton.addActionListener(new Main());
        panel.add(teacherQuizMenuBackButton);

        teacherQuizMenuBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCourse();
            }
        });

        panel.setLayout(null);
        frame.setVisible(true);
    }

    public static void createQuiz() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        lsmToolLabel = new JLabel("Create a Quiz");
        lsmToolLabel.setBounds(130, 20, 500, 25);
        panel.add(lsmToolLabel);

        nameOfQuizLabel = new JLabel("Name of Quiz:");
        nameOfQuizLabel.setBounds(20, 50, 150, 25);
        panel.add(nameOfQuizLabel);

        nameOfQuizText = new JTextField(20);
        nameOfQuizText.setBounds(120, 50, 125, 25);
        panel.add(nameOfQuizText);

        formatOfQuizLabel = new JLabel("Format of Quiz:");
        formatOfQuizLabel.setBounds(20, 90, 150, 25);
        panel.add(formatOfQuizLabel);

        formatOfQuiz1Button = new JButton("Multiple-Choice");
        formatOfQuiz1Button.setBounds(80, 130, 190, 25);
        formatOfQuiz1Button.addActionListener(new Main());
        panel.add(formatOfQuiz1Button);

        formatOfQuiz1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                multipleChoiceQuiz();
            }
        });

        formatOfQuiz2Button = new JButton("True/False");
        formatOfQuiz2Button.setBounds(80, 160, 190, 25);
        formatOfQuiz2Button.addActionListener(new Main());
        panel.add(formatOfQuiz2Button);

        formatOfQuiz2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trueOrFalseQuiz();
            }
        });

        createQuizBackButton = new JButton("Back");
        createQuizBackButton.setBounds(30, 190, 110, 25);
        createQuizBackButton.addActionListener(new Main());
        panel.add(createQuizBackButton);

        createQuizBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherQuizMenu();
            }
        });

        panel.setLayout(null);
        frame.setVisible(true);
    }

    public static void multipleChoiceQuiz() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        lsmToolLabel = new JLabel("Name of Quiz: "); // + show name of quiz);
        lsmToolLabel.setBounds(130, 20, 500, 25);
        panel.add(lsmToolLabel);

        questionOneMCLabel = new JLabel("Type in Question 1:");
        questionOneMCLabel.setBounds(20, 50, 130, 25);
        panel.add(questionOneMCLabel);

        questionOneMCText = new JTextField(20);
        questionOneMCText.setBounds(210, 50, 165, 25);
        panel.add(questionOneMCText);

        optionOneMCLabel = new JLabel("Option 1:");
        optionOneMCLabel.setBounds(20, 80, 80, 25);
        panel.add(optionOneMCLabel);

        optionOneMCText = new JTextField(20);
        optionOneMCText.setBounds(210, 80, 165, 25);
        panel.add(optionOneMCText);

        optionTwoMCLabel = new JLabel("Option 2:");
        optionTwoMCLabel.setBounds(20, 110, 80, 25);
        panel.add(optionTwoMCLabel);

        optionTwoMCText = new JTextField(20);
        optionTwoMCText.setBounds(210, 110, 165, 25);
        panel.add(optionTwoMCText);

        optionThreeMCLabel = new JLabel("Option 3:");
        optionThreeMCLabel.setBounds(20, 140, 80, 25);
        panel.add(optionThreeMCLabel);

        optionThreeMCText = new JTextField(20);
        optionThreeMCText.setBounds(210, 140, 165, 25);
        panel.add(optionThreeMCText);

        optionFourMCLabel = new JLabel("Option 4:");
        optionFourMCLabel.setBounds(20, 170, 80, 25);
        panel.add(optionFourMCLabel);

        optionFourMCText = new JTextField(20);
        optionFourMCText.setBounds(210, 170, 165, 25);
        panel.add(optionFourMCText);

        correctAnsChoiceMCLabel = new JLabel("Enter correct answer choice:");
        correctAnsChoiceMCLabel.setBounds(20, 200, 250, 25);
        panel.add(correctAnsChoiceMCLabel);

        correctAnsChoiceMCText = new JTextField(20);
        correctAnsChoiceMCText.setBounds(210, 200, 165, 25);
        panel.add(correctAnsChoiceMCText);

        pointValueMCLabel = new JLabel("Enter the point value:");
        pointValueMCLabel.setBounds(20, 230, 250, 25);
        panel.add(pointValueMCLabel);

        pointValueMCText = new JTextField(20);
        pointValueMCText.setBounds(210, 230, 165, 25);
        panel.add(pointValueMCText);

        //adds the questions
        addQuestionMCButton = new JButton("Add Question");
        addQuestionMCButton.setBounds(210, 260, 150, 25);
        addQuestionMCButton.addActionListener(new Main());
        panel.add(addQuestionMCButton);

        // once the add question button is clicked, we need to add the question to the list of questions for that specific quiz
        // calls the method that displays the screen and asks if the user wants to add another question or not

        addQuestionMCButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addAnotherQuestion();
            }
        });

        multipleChoiceQuizBackButton = new JButton("Back");
        multipleChoiceQuizBackButton.setBounds(30, 290, 110, 25);
        multipleChoiceQuizBackButton.addActionListener(new Main());
        panel.add(multipleChoiceQuizBackButton);

        multipleChoiceQuizBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createQuiz();
            }
        });

        panel.setLayout(null);
        frame.setVisible(true);
    }

    public static void trueOrFalseQuiz() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        lsmToolLabel = new JLabel("Name of Quiz: "); // + show name of quiz);
        lsmToolLabel.setBounds(130, 20, 500, 25);
        panel.add(lsmToolLabel);

        questionOneTFLabel = new JLabel("Type in Question 1:");
        questionOneTFLabel.setBounds(20, 50, 130, 25);
        panel.add(questionOneTFLabel);

        questionOneTFText = new JTextField(20);
        questionOneTFText.setBounds(210, 50, 165, 25);
        panel.add(questionOneTFText);

        optionOneTFLabel = new JLabel("1) True");
        optionOneTFLabel.setBounds(20, 80, 80, 25);
        panel.add(optionOneTFLabel);

        optionTwoTFLabel = new JLabel("2) False");
        optionTwoTFLabel.setBounds(20, 110, 80, 25);
        panel.add(optionTwoTFLabel);

        correctAnsChoiceTFLabelChoice = new JLabel("Enter correct answer choice (True or False):");
        correctAnsChoiceTFLabelChoice.setBounds(20, 140, 320, 25);
        panel.add(correctAnsChoiceTFLabelChoice);

        correctAnsChoiceTFText = new JTextField(20);
        correctAnsChoiceTFText.setBounds(300, 140, 90, 25);
        panel.add(correctAnsChoiceTFText);

        pointValueTFLabel = new JLabel("Enter the point value:");
        pointValueTFLabel.setBounds(20, 170, 250, 25);
        panel.add(pointValueTFLabel);

        pointValueTFText = new JTextField(20);
        pointValueTFText.setBounds(300, 170, 90, 25);
        panel.add(pointValueTFText);

        //adds the questions
        addQuestionTFButton = new JButton("Add Question");
        addQuestionTFButton.setBounds(120, 210, 150, 25);
        addQuestionTFButton.addActionListener(new Main());
        panel.add(addQuestionTFButton);

        // once the add question button is clicked, we need to add the question to the list of questions for that specific quiz
        // calls the method that displays the screen and asks if the user wants to add another question or not

        addQuestionTFButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addAnotherQuestion();
            }
        });

        panel.setLayout(null);
        frame.setVisible(true);

    }

    public static void addAnotherQuestion() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        addAnotherQuestionLabel = new JLabel("Do you want to add another question?");
        addAnotherQuestionLabel.setBounds(70, 20, 280, 25);
        panel.add(addAnotherQuestionLabel);

        yesAnotherQuestionButton = new JButton("Yes");
        yesAnotherQuestionButton.setBounds(110, 50, 80, 25);
        yesAnotherQuestionButton.addActionListener(new Main());
        panel.add(yesAnotherQuestionButton);

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
        noAnotherQuestionButton = new JButton("No");
        noAnotherQuestionButton.setBounds(200, 50, 80, 25);
        noAnotherQuestionButton.addActionListener(new Main());
        panel.add(noAnotherQuestionButton);

        // save the quiz if the user doesn't want to add another question
        /*
        noAnotherQuestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        */

        panel.setLayout(null);
        frame.setVisible(true);

    }

    public static void editQuiz() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        lsmToolLabel = new JLabel("Edit a Quiz");
        lsmToolLabel.setBounds(160, 20, 500, 25);
        panel.add(lsmToolLabel);

        String[] quizOptionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};

        JComboBox<String> jComboBox = new JComboBox<>(quizOptionsToChoose);
        jComboBox.setBounds(100, 70, 180, 20);

        panel.add(jComboBox);

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

        panel.setLayout(null);
        frame.setVisible(true);

    }

    public static void editTeacherAccount() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        editTeachAccountLabel = new JLabel("Edit Student Account");
        editTeachAccountLabel.setBounds(80, 20, 200, 25);
        panel.add(editTeachAccountLabel);

        editedTeachNameLabel = new JLabel("First & Last Name:");
        editedTeachNameLabel.setBounds(20, 50, 150, 25);
        panel.add(editedTeachNameLabel);

        editedTeachNameText = new JTextField(20);
        editedTeachNameText.setBounds(150, 50, 165, 25);
        panel.add(editedTeachNameText);

        editedTeachUsernameLabel = new JLabel("Username:");
        editedTeachUsernameLabel.setBounds(20, 80, 80, 25);
        panel.add(editedTeachUsernameLabel);

        editedTeachUsernameText = new JTextField(20);
        editedTeachUsernameText.setBounds(150, 80, 165, 25);
        panel.add(editedTeachUsernameText);

        editedTeachPasswordLabel = new JLabel("Password:");
        editedTeachPasswordLabel.setBounds(20, 110, 80, 25);
        panel.add(editedTeachPasswordLabel);

        editedTeachPasswordText = new JTextField(20);
        editedTeachPasswordText.setBounds(150, 110, 165, 25);
        panel.add(editedTeachPasswordText);

        updateTeachAccountButton = new JButton("Save and Update Account");
        updateTeachAccountButton.setBounds(30, 150, 200, 25);
        updateTeachAccountButton.addActionListener(new Main());
        panel.add(updateTeachAccountButton);

        //TODO what should happen when the student save and updates their information (call the specific method that saves the updated data)
        /*
        updateTeachAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        */

        editTeachAccountBackButton = new JButton("Back");
        editTeachAccountBackButton.setBounds(30, 180, 110, 25);
        editTeachAccountBackButton.addActionListener(new Main());
        panel.add(editTeachAccountBackButton);

        editTeachAccountBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentMenu();
            }
        });


        frame.setVisible(true);

    }
    //Teacher Pathway ends

    //Student pathway starts
    public static void createStudent() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        createStudentLabel = new JLabel("Create a student account");
        createStudentLabel.setBounds(80, 20, 200, 25);
        panel.add(createStudentLabel);

        studentNameLabel = new JLabel("First & Last Name:");
        studentNameLabel.setBounds(20, 50, 150, 25);
        panel.add(studentNameLabel);

        studentNameText = new JTextField(20);
        studentNameText.setBounds(150, 50, 165, 25);
        panel.add(studentNameText);

        studentUsernameLabel = new JLabel("Username:");
        studentUsernameLabel.setBounds(20, 80, 80, 25);
        panel.add(studentUsernameLabel);

        studentUsernameText = new JTextField(20);
        studentUsernameText.setBounds(150, 80, 165, 25);
        panel.add(studentUsernameText);

        studentPasswordLabel = new JLabel("Password:");
        studentPasswordLabel.setBounds(20, 110, 80, 25);
        panel.add(studentPasswordLabel);

        studentPasswordText = new JTextField(20);
        studentPasswordText.setBounds(150, 110, 165, 25);
        panel.add(studentPasswordText);

        createStudentAccountButton = new JButton("Create");
        createStudentAccountButton.setBounds(170, 150, 90, 25);
        createStudentAccountButton.addActionListener(new Main());
        panel.add(createStudentAccountButton);

        createStudentAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accountCreatedStudent();
            }
        });

        createStudentAccountBackButton = new JButton("Back");
        createStudentAccountBackButton.setBounds(70, 150, 90, 25);
        createStudentAccountBackButton.addActionListener(new Main());
        panel.add(createStudentAccountBackButton);

        createStudentAccountBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenu();
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

        studentAccountCreatedLabel = new JLabel("Account successfully created!");
        studentAccountCreatedLabel.setBounds(80, 20, 200, 25);
        panel.add(studentAccountCreatedLabel);

        studentLogInButton = new JButton("Log In");
        studentLogInButton.setBounds(130, 60, 80, 25);
        studentLogInButton.addActionListener(new Main());
        panel.add(studentLogInButton);

        studentLogInButton.addActionListener(new ActionListener() {
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

        welcomeStudentsLabel = new JLabel("Welcome students!");
        welcomeStudentsLabel.setBounds(80, 20, 150, 25);
        panel.add(welcomeStudentsLabel);

        studentLogInUsernameLabel = new JLabel("Username:");
        studentLogInUsernameLabel.setBounds(20, 50, 80, 25);
        panel.add(studentLogInUsernameLabel);

        studentLogInPasswordLabel = new JLabel("Password:");
        studentLogInPasswordLabel.setBounds(20, 80, 80, 25);
        panel.add(studentLogInPasswordLabel);

        studentLogInUsernameText = new JTextField(20);
        studentLogInUsernameText.setBounds(100, 50, 165, 25);
        panel.add(studentLogInUsernameText);

        studentLogInPasswordText = new JTextField(20);
        studentLogInPasswordText.setBounds(100, 80, 165, 25);
        panel.add(studentLogInPasswordText);

        studentLogInButton = new JButton("Login");
        studentLogInButton.setBounds(130, 120, 80, 25);
        studentLogInButton.addActionListener(new Main());
        panel.add(studentLogInButton);

        studentLogInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentMenu();
            }
        });

        studentLogInBackButton = new JButton("Back");
        studentLogInBackButton.setBounds(30, 120, 80, 25);
        studentLogInBackButton.addActionListener(new Main());
        panel.add(studentLogInBackButton);

        studentLogInBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenu();
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

        lsmToolLabel = new JLabel("Learning System Management Tool");
        lsmToolLabel.setBounds(90, 20, 500, 25);
        panel.add(lsmToolLabel);

        takeQuizButton = new JButton("Take a Quiz");
        takeQuizButton.setBounds(80, 50, 250, 25);
        takeQuizButton.addActionListener(new Main());
        panel.add(takeQuizButton);

        takeQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                takeQuiz();
            }
        });

        viewGradedQuizButton = new JButton("View Graded Quiz");
        viewGradedQuizButton.setBounds(80, 80, 250, 25);
        viewGradedQuizButton.addActionListener(new Main());
        panel.add(viewGradedQuizButton);

        viewGradedQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewGradedQuiz();
            }
        });

        editStudentAccountButton = new JButton("Edit Account");
        editStudentAccountButton.setBounds(80, 110, 250, 25);
        editStudentAccountButton.addActionListener(new Main());
        panel.add(editStudentAccountButton);

        editStudentAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editStudentAccount();
            }
        });

        studentLogOutButton = new JButton("Logout");
        studentLogOutButton.setBounds(80, 140, 250, 25);
        studentLogOutButton.addActionListener(new Main());
        panel.add(studentLogOutButton);

        //TODO what should happen when the student log outs
        /*
        studentLogOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        */

        panel.setLayout(null);
        frame.setVisible(true);
    }

    public static void takeQuiz() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        lsmToolLabel = new JLabel("Take a Quiz");
        lsmToolLabel.setBounds(160, 20, 500, 25);
        panel.add(lsmToolLabel);

        String[] quizTakeOptionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};

        JComboBox<String> jComboBox = new JComboBox<>(quizTakeOptionsToChoose);
        jComboBox.setBounds(120, 50, 140, 20);
        panel.add(jComboBox);
        // dropdown feature to show list of courses so student can choose which course they want to take a quiz from
        /*
        String[] optionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
        String getCourse = (String) JOptionPane.showInputDialog(
                null,
                "Which course would you like to take or view a quiz from?",
                "Choose Course",
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsToChoose,
                optionsToChoose[0]);
        */

        panel.setLayout(null);
        frame.setVisible(true);

    }

    public static void viewGradedQuiz() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        viewGradedQuiz = new JLabel("View a Graded Quiz");
        viewGradedQuiz.setBounds(160, 20, 500, 25);
        panel.add(viewGradedQuiz);

        String[] quizTakeOptionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};

        JComboBox<String> jComboBox = new JComboBox<>(quizTakeOptionsToChoose);
        jComboBox.setBounds(120, 50, 140, 20);
        panel.add(jComboBox);

    }

    public static void editStudentAccount() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        editStuAccountLabel = new JLabel("Edit Student Account");
        editStuAccountLabel.setBounds(80, 20, 200, 25);
        panel.add(editStuAccountLabel);

        editedStuNameLabel = new JLabel("First & Last Name:");
        editedStuNameLabel.setBounds(20, 50, 150, 25);
        panel.add(editedStuNameLabel);

        editedStuNameText = new JTextField(20);
        editedStuNameText.setBounds(150, 50, 165, 25);
        panel.add(editedStuNameText);

        editedStuUsernameLabel = new JLabel("Username:");
        editedStuUsernameLabel.setBounds(20, 80, 80, 25);
        panel.add(editedStuUsernameLabel);

        editedStuUsernameText = new JTextField(20);
        editedStuUsernameText.setBounds(150, 80, 165, 25);
        panel.add(editedStuUsernameText);

        editedStuPasswordLabel = new JLabel("Password:");
        editedStuPasswordLabel.setBounds(20, 110, 80, 25);
        panel.add(editedStuPasswordLabel);

        editedStuPasswordText = new JTextField(20);
        editedStuPasswordText.setBounds(150, 110, 165, 25);
        panel.add(editedStuPasswordText);

        updateStuAccountButton = new JButton("Save and Update Account");
        updateStuAccountButton.setBounds(30, 150, 200, 25);
        updateStuAccountButton.addActionListener(new Main());
        panel.add(updateStuAccountButton);

        //TODO what should happen when the student save and updates their information (call the specific method that saves the updated data
        /*
        updateStuAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
          */

        editStuAccountBackButton = new JButton("Back");
        editStuAccountBackButton.setBounds(30, 180, 110, 25);
        editStuAccountBackButton.addActionListener(new Main());
        panel.add(editStuAccountBackButton);

        editStuAccountBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentMenu();
            }
        });

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
