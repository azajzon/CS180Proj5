import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    //ALL FRAMES
    public static JFrame maineMenuFrame;
    public static JFrame createTeacherFrame;
    public static JFrame accountCreatedTeacherFrame;
    public static JFrame teacherLogInFrame;
    public static JFrame teacherMenuFrame;
    public static JFrame addCourseFrame;
    public static JFrame teacherQuizMenuFrame;
    public static JFrame createQuizFrame;
    public static JFrame multipleChoiceQuizFrame;
    public static JFrame trueOrFalseQuizFrame;
    public static JFrame addAnotherQuestionFrame;
    public static JFrame editQuizFrame;
    public static JFrame editTeacherAccountFrame;
    public static JFrame createStudentFrame;
    public static JFrame accountCreatedStudentFrame;
    public static JFrame studentLogInFrame;
    public static JFrame studentMenuFrame;
    public static JFrame takeQuizFrame;
    public static JFrame viewGradedQuizFrame;
    public static JFrame editStudentAccountFrame;

    //ALL PANELS
    public static JPanel maineMenuPanel;
    public static JPanel createTeacherPanel;
    public static JPanel accountCreatedTeacherPanel;
    public static JPanel teacherLogInPanel;
    public static JPanel teacherMenuPanel;
    public static JPanel addCoursePanel;
    public static JPanel teacherQuizMenuPanel;
    public static JPanel createQuizPanel;
    public static JPanel multipleChoiceQuizPanel;
    public static JPanel trueOrFalseQuizPanel;
    public static JPanel addAnotherQuestionPanel;
    public static JPanel editQuizPanel;
    public static JPanel editTeacherAccountPanel;
    public static JPanel createStudentPanel;
    public static JPanel accountCreatedStudentPanel;
    public static JPanel studentLogInPanel;
    public static JPanel studentMenuPanel;
    public static JPanel takeQuizPanel;
    public static JPanel viewGradedQuizPanel;
    public static JPanel editStudentAccountPanel;




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
        maineMenuFrame = new JFrame();
        maineMenuPanel = new JPanel();
        maineMenuFrame.setSize(400, 300);
        maineMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        maineMenuFrame.add(maineMenuPanel);

        lsmToolLabel = new JLabel("Welcome to Learning System Management Tool!");
        lsmToolLabel.setBounds(50, 20, 500, 25);
        maineMenuPanel.add(lsmToolLabel);

        createTeacherButton = new JButton("Create Teacher");
        createTeacherButton.setBounds(120, 50, 150, 25);
        createTeacherButton.addActionListener(new Main());
        maineMenuPanel.add(createTeacherButton);

        createTeacherButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                maineMenuFrame.setVisible(false);
                maineMenuFrame.dispose();
                createTeacher();
            }
        });

        createStudentButton = new JButton("Create Student");
        createStudentButton.setBounds(120, 80, 150, 25);
        createStudentButton.addActionListener(new Main());
        maineMenuPanel.add(createStudentButton);


        createStudentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                maineMenuFrame.setVisible(false);
                maineMenuFrame.dispose();
                createStudent();
            }
        });

        loginTeacherButton = new JButton("Login Teacher");
        loginTeacherButton.setBounds(120, 110, 150, 25);
        loginTeacherButton.addActionListener(new Main());
        maineMenuPanel.add(loginTeacherButton);

        loginTeacherButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                maineMenuFrame.setVisible(false);
                maineMenuFrame.dispose();
                teacherLogIn();
            }
        });

        loginStudentButton = new JButton("Login Student");
        loginStudentButton.setBounds(120, 140, 150, 25);
        loginStudentButton.addActionListener(new Main());
        maineMenuPanel.add(loginStudentButton);

        loginStudentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                maineMenuFrame.setVisible(false);
                maineMenuFrame.dispose();
                studentLogIn();
            }
        });

        saveButton = new JButton("Save and Exit");
        saveButton.setBounds(120, 170, 150, 25);
        saveButton.addActionListener(new Main());
        maineMenuPanel.add(saveButton);

        /*saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call the save data methods
            }
        });*/

        maineMenuPanel.setLayout(null);

        maineMenuFrame.setVisible(true);

    }



    public static void createTeacher() {
        createTeacherFrame = new JFrame();
        createTeacherPanel = new JPanel();
        createTeacherFrame.setSize(400, 300);
        createTeacherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createTeacherFrame.add(createTeacherPanel);

        createTeacherPanel.setLayout(null);

        createTeacherLabel = new JLabel("Create a teacher account");
        createTeacherLabel.setBounds(120, 20, 200, 25);
        createTeacherPanel.add(createTeacherLabel);

        teacherNameLabel = new JLabel("First & Last Name:");
        teacherNameLabel.setBounds(20, 50, 150, 25);
        createTeacherPanel.add(teacherNameLabel);

        teacherNameText = new JTextField(20);
        teacherNameText.setBounds(150, 50, 165, 25);
        createTeacherPanel.add(teacherNameText);

        teacherUsernameLabel = new JLabel("Username:");
        teacherUsernameLabel.setBounds(20, 80, 80, 25);
        createTeacherPanel.add(teacherUsernameLabel);

        teacherUsernameText = new JTextField(20);
        teacherUsernameText.setBounds(150, 80, 165, 25);
        createTeacherPanel.add(teacherUsernameText);

        teacherPasswordLabel = new JLabel("Password:");
        teacherPasswordLabel.setBounds(20, 110, 80, 25);
        createTeacherPanel.add(teacherPasswordLabel);

        teacherPasswordText = new JTextField(20);
        teacherPasswordText.setBounds(150, 110, 165, 25);
        createTeacherPanel.add(teacherPasswordText);

        createTeacherAccountButton = new JButton("Create Account");
        createTeacherAccountButton.setBounds(160, 150, 150, 25);
        createTeacherAccountButton.addActionListener(new Main());
        createTeacherPanel.add(createTeacherAccountButton);
        JLabel invalidName = new JLabel();
        createTeacherAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String returnValue = checkSpaceForTeacherName(teacherNameText);
                if(returnValue.equals("Success")) {
                    createTeacherFrame.setVisible(false);
                    createTeacherFrame.dispose();
                    accountCreatedTeacher();
                }
                else {
                    invalidName.setText(returnValue);
                    invalidName.setBounds(30, 180, 250, 20);
                    createTeacherPanel.add(invalidName);
                    createTeacherPanel.repaint();
                }
            }
        });

        createTeacherAccountBackButton = new JButton("Back");
        createTeacherAccountBackButton.setBounds(30, 150, 110, 25);
        createTeacherAccountBackButton.addActionListener(new Main());
        createTeacherPanel.add(createTeacherAccountBackButton);

        createTeacherAccountBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenu();
            }
        });

        createTeacherFrame.setVisible(true);

    }

// Sample invalid input check

    public static String checkSpaceForTeacherName(JTextField teacherNameText) {
        try {
            if(teacherNameText.getText().contains(" ") )
                return "Success";
            else
                return "Enter a space for first and last name";
        } catch (NumberFormatException e) {
            return "Something went wrong Please re-enter all fields!!";
        }
    }


    public static void accountCreatedTeacher() {
        accountCreatedTeacherFrame = new JFrame();
        createTeacherPanel = new JPanel();
        accountCreatedTeacherFrame.setSize(400, 300);
        accountCreatedTeacherFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        accountCreatedTeacherFrame.add(createTeacherPanel);
        createTeacherPanel.setLayout(null);

        teacherAccountCreatedLabel = new JLabel("Account successfully created!");
        teacherAccountCreatedLabel.setBounds(110, 20, 200, 25);
        createTeacherPanel.add(teacherAccountCreatedLabel);

        teacherLogInButton = new JButton("Log In");
        teacherLogInButton.setBounds(150, 70, 90, 25);
        teacherLogInButton.addActionListener(new Main());
        createTeacherPanel.add(teacherLogInButton);

        teacherLogInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherLogIn();
            }
        });

        createTeacherPanel.setLayout(null);

        accountCreatedTeacherFrame.setVisible(true);

    }

    public static void teacherLogIn() {
        teacherLogInFrame = new JFrame();
        teacherLogInPanel = new JPanel();
        teacherLogInFrame.setSize(400, 300);
        teacherLogInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teacherLogInFrame.add(teacherLogInPanel);

        teacherLogInPanel.setLayout(null);

        welcomeTeachersLabel = new JLabel("Welcome teachers!");
        welcomeTeachersLabel.setBounds(140, 20, 150, 25);
        teacherLogInPanel.add(welcomeTeachersLabel);

        teacherLogInUsernameLabel = new JLabel("Username:");
        teacherLogInUsernameLabel.setBounds(20, 50, 80, 25);
        teacherLogInPanel.add(teacherLogInUsernameLabel);

        teacherLogInPasswordLabel = new JLabel("Password:");
        teacherLogInPasswordLabel.setBounds(20, 80, 80, 25);
        teacherLogInPanel.add(teacherLogInPasswordLabel);

        teacherLogInUsernameText = new JTextField(20);
        teacherLogInUsernameText.setBounds(100, 50, 165, 25);
        teacherLogInPanel.add(teacherLogInUsernameText);

        teacherLogInPasswordText = new JTextField(20);
        teacherLogInPasswordText.setBounds(100, 80, 165, 25);
        teacherLogInPanel.add(teacherLogInPasswordText);

        teacherLogInButton = new JButton("Login");
        teacherLogInButton.setBounds(150, 120, 80, 25);
        teacherLogInButton.addActionListener(new Main());
        teacherLogInPanel.add(teacherLogInButton);

        teacherLogInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherLogInFrame.setVisible(false);
                teacherLogInFrame.dispose();
                teacherMenu();
            }
        });

        teacherLogInBackButton = new JButton("Back");
        teacherLogInBackButton.setBounds(30, 120, 110, 25);
        teacherLogInBackButton.addActionListener(new Main());
        teacherLogInPanel.add(teacherLogInBackButton);

        teacherLogInBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenu();
            }
        });

        teacherLogInFrame.setVisible(true);
    }

    public static void teacherMenu() {
        teacherMenuFrame = new JFrame();
        teacherMenuPanel = new JPanel();
        teacherMenuFrame.setSize(400, 300);
        teacherMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teacherMenuFrame.add(teacherMenuPanel);

        addCourseLabel = new JLabel("Do you want to add a course?");
        addCourseLabel.setBounds(80, 20, 200, 25);
        teacherMenuPanel.add(addCourseLabel);

        yesCourseButton = new JButton("Yes");
        yesCourseButton.setBounds(120, 50, 80, 25);
        yesCourseButton.addActionListener(new Main());
        teacherMenuPanel.add(yesCourseButton);

        yesCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherMenuFrame.setVisible(false);
                teacherMenuFrame.dispose();
                addCourse();
            }
        });

        noCourseButton = new JButton("No");
        noCourseButton.setBounds(120, 80, 80, 25);
        noCourseButton.addActionListener(new Main());
        teacherMenuPanel.add(noCourseButton);

        //if teacher doesn't want to create a course
        noCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainMenu();
            }
        });


        teacherMenuPanel.setLayout(null);
        teacherMenuFrame.setVisible(true);

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
        createCourseButton.addActionListener(new Main());
        addCoursePanel.add(createCourseButton);

        createCourseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCourseFrame.setVisible(false);
                addCourseFrame.dispose();
                teacherQuizMenu();
            }
        });

        addCourseBackButton = new JButton("Back");
        addCourseBackButton.setBounds(60, 80, 80, 25);
        addCourseBackButton.addActionListener(new Main());
        addCoursePanel.add(addCourseBackButton);

        addCourseBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCourseFrame.setVisible(false);
                addCourseFrame.dispose();
                teacherMenu();
            }
        });

        addCoursePanel.setLayout(null);
        addCourseFrame.setVisible(true);
    }

    public static void teacherQuizMenu() {
        teacherQuizMenuFrame = new JFrame();
        teacherQuizMenuPanel = new JPanel();
        teacherQuizMenuFrame.setSize(400, 300);
        teacherQuizMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teacherQuizMenuFrame.add(teacherQuizMenuPanel);

        lsmToolLabel = new JLabel("Learning System Management Tool");
        lsmToolLabel.setBounds(90, 20, 500, 25);
        teacherQuizMenuPanel.add(lsmToolLabel);

        createQuizButton = new JButton("Create a Quiz");
        createQuizButton.setBounds(80, 50, 250, 25);
        createQuizButton.addActionListener(new Main());
        teacherQuizMenuPanel.add(createQuizButton);

        createQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherQuizMenuFrame.setVisible(false);
                teacherQuizMenuFrame.dispose();
                createQuiz();
            }
        });

        editQuizButton = new JButton("Edit Quiz");
        editQuizButton.setBounds(80, 80, 250, 25);
        editQuizButton.addActionListener(new Main());
        teacherQuizMenuPanel.add(editQuizButton);

        editQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherQuizMenuFrame.setVisible(false);
                teacherQuizMenuFrame.dispose();
                editQuiz();
            }
        });

        deleteQuizButton = new JButton("Delete Quiz");
        deleteQuizButton.setBounds(80, 110, 250, 25);
        deleteQuizButton.addActionListener(new Main());
        teacherQuizMenuPanel.add(deleteQuizButton);

        viewStudentQuizSubmissionsButton = new JButton("View Student Quiz Submissions");
        viewStudentQuizSubmissionsButton.setBounds(80, 140, 250, 25);
        viewStudentQuizSubmissionsButton.addActionListener(new Main());
        teacherQuizMenuPanel.add(viewStudentQuizSubmissionsButton);

        editTeacherAccountButton = new JButton("Edit Account");
        editTeacherAccountButton.setBounds(80, 170, 250, 25);
        editTeacherAccountButton.addActionListener(new Main());
        teacherQuizMenuPanel.add(editTeacherAccountButton);

        editTeacherAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherQuizMenuFrame.setVisible(false);
                teacherQuizMenuFrame.dispose();
                editTeacherAccount();
            }
        });


        teacherQuizMenuBackButton = new JButton("Back");
        teacherQuizMenuBackButton.setBounds(30, 200, 110, 25);
        teacherQuizMenuBackButton.addActionListener(new Main());
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
        createQuizFrame = new JFrame();
        createQuizPanel = new JPanel();
        createQuizFrame.setSize(400, 300);
        createQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createQuizFrame.add(createQuizPanel);

        lsmToolLabel = new JLabel("Create a Quiz");
        lsmToolLabel.setBounds(130, 20, 500, 25);
        createQuizPanel.add(lsmToolLabel);

        nameOfQuizLabel = new JLabel("Name of Quiz:");
        nameOfQuizLabel.setBounds(20, 50, 150, 25);
        createQuizPanel.add(nameOfQuizLabel);

        nameOfQuizText = new JTextField(20);
        nameOfQuizText.setBounds(120, 50, 125, 25);
        createQuizPanel.add(nameOfQuizText);

        formatOfQuizLabel = new JLabel("Format of Quiz:");
        formatOfQuizLabel.setBounds(20, 90, 150, 25);
        createQuizPanel.add(formatOfQuizLabel);

        formatOfQuiz1Button = new JButton("Multiple-Choice");
        formatOfQuiz1Button.setBounds(80, 130, 190, 25);
        formatOfQuiz1Button.addActionListener(new Main());
        createQuizPanel.add(formatOfQuiz1Button);

        formatOfQuiz1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createQuizFrame.setVisible(false);
                createQuizFrame.dispose();
                multipleChoiceQuiz();
            }
        });

        formatOfQuiz2Button = new JButton("True/False");
        formatOfQuiz2Button.setBounds(80, 160, 190, 25);
        formatOfQuiz2Button.addActionListener(new Main());
        createQuizPanel.add(formatOfQuiz2Button);

        formatOfQuiz2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createQuizFrame.setVisible(false);
                createQuizFrame.dispose();
                trueOrFalseQuiz();
            }
        });

        createQuizBackButton = new JButton("Back");
        createQuizBackButton.setBounds(30, 190, 110, 25);
        createQuizBackButton.addActionListener(new Main());
        createQuizPanel.add(createQuizBackButton);

        createQuizBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createQuizFrame.setVisible(false);
                createQuizFrame.dispose();
                teacherQuizMenu();
            }
        });

        createQuizPanel.setLayout(null);
        createQuizFrame.setVisible(true);
    }

    public static void multipleChoiceQuiz() {
        multipleChoiceQuizFrame = new JFrame();
        multipleChoiceQuizPanel = new JPanel();
        multipleChoiceQuizFrame.setSize(400, 320);
        multipleChoiceQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        multipleChoiceQuizFrame.add(multipleChoiceQuizPanel);

        lsmToolLabel = new JLabel("Name of Quiz: "); // + show name of quiz);
        lsmToolLabel.setBounds(130, 20, 500, 25);
        multipleChoiceQuizPanel.add(lsmToolLabel);

        questionOneMCLabel = new JLabel("Type in Question 1:");
        questionOneMCLabel.setBounds(20, 50, 130, 25);
        multipleChoiceQuizPanel.add(questionOneMCLabel);

        questionOneMCText = new JTextField(20);
        questionOneMCText.setBounds(210, 50, 165, 25);
        multipleChoiceQuizPanel.add(questionOneMCText);

        optionOneMCLabel = new JLabel("Option 1:");
        optionOneMCLabel.setBounds(20, 80, 80, 25);
        multipleChoiceQuizPanel.add(optionOneMCLabel);

        optionOneMCText = new JTextField(20);
        optionOneMCText.setBounds(210, 80, 165, 25);
        multipleChoiceQuizPanel.add(optionOneMCText);

        optionTwoMCLabel = new JLabel("Option 2:");
        optionTwoMCLabel.setBounds(20, 110, 80, 25);
        multipleChoiceQuizPanel.add(optionTwoMCLabel);

        optionTwoMCText = new JTextField(20);
        optionTwoMCText.setBounds(210, 110, 165, 25);
        multipleChoiceQuizPanel.add(optionTwoMCText);

        optionThreeMCLabel = new JLabel("Option 3:");
        optionThreeMCLabel.setBounds(20, 140, 80, 25);
        multipleChoiceQuizPanel.add(optionThreeMCLabel);

        optionThreeMCText = new JTextField(20);
        optionThreeMCText.setBounds(210, 140, 165, 25);
        multipleChoiceQuizPanel.add(optionThreeMCText);

        optionFourMCLabel = new JLabel("Option 4:");
        optionFourMCLabel.setBounds(20, 170, 80, 25);
        multipleChoiceQuizPanel.add(optionFourMCLabel);

        optionFourMCText = new JTextField(20);
        optionFourMCText.setBounds(210, 170, 165, 25);
        multipleChoiceQuizPanel.add(optionFourMCText);

        correctAnsChoiceMCLabel = new JLabel("Enter correct answer choice:");
        correctAnsChoiceMCLabel.setBounds(20, 200, 250, 25);
        multipleChoiceQuizPanel.add(correctAnsChoiceMCLabel);

        correctAnsChoiceMCText = new JTextField(20);
        correctAnsChoiceMCText.setBounds(210, 200, 165, 25);
        multipleChoiceQuizPanel.add(correctAnsChoiceMCText);

        pointValueMCLabel = new JLabel("Enter the point value:");
        pointValueMCLabel.setBounds(20, 230, 250, 25);
        multipleChoiceQuizPanel.add(pointValueMCLabel);

        pointValueMCText = new JTextField(20);
        pointValueMCText.setBounds(210, 230, 165, 25);
        multipleChoiceQuizPanel.add(pointValueMCText);

        //adds the questions
        addQuestionMCButton = new JButton("Add Question");
        addQuestionMCButton.setBounds(210, 260, 150, 25);
        addQuestionMCButton.addActionListener(new Main());
        multipleChoiceQuizPanel.add(addQuestionMCButton);

        // once the add question button is clicked, we need to add the question to the list of questions for that specific quiz
        // calls the method that displays the screen and asks if the user wants to add another question or not

        addQuestionMCButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                multipleChoiceQuizFrame.setVisible(false);
                multipleChoiceQuizFrame.dispose();
                addAnotherQuestion();
            }
        });

        multipleChoiceQuizBackButton = new JButton("Back");
        multipleChoiceQuizBackButton.setBounds(30, 290, 110, 25);
        multipleChoiceQuizBackButton.addActionListener(new Main());
        multipleChoiceQuizPanel.add(multipleChoiceQuizBackButton);

        multipleChoiceQuizBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                multipleChoiceQuizFrame.setVisible(false);
                multipleChoiceQuizFrame.dispose();
                createQuiz();
            }
        });

        multipleChoiceQuizPanel.setLayout(null);
        multipleChoiceQuizFrame.setVisible(true);
    }

    public static void trueOrFalseQuiz() {
        trueOrFalseQuizFrame = new JFrame();
        trueOrFalseQuizPanel = new JPanel();
        trueOrFalseQuizFrame.setSize(400, 320);
        trueOrFalseQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        trueOrFalseQuizFrame.add(trueOrFalseQuizPanel);

        lsmToolLabel = new JLabel("Name of Quiz: "); // + show name of quiz);
        lsmToolLabel.setBounds(130, 20, 500, 25);
        trueOrFalseQuizPanel.add(lsmToolLabel);

        questionOneTFLabel = new JLabel("Type in Question 1:");
        questionOneTFLabel.setBounds(20, 50, 130, 25);
        trueOrFalseQuizPanel.add(questionOneTFLabel);

        questionOneTFText = new JTextField(20);
        questionOneTFText.setBounds(210, 50, 165, 25);
        trueOrFalseQuizPanel.add(questionOneTFText);

        optionOneTFLabel = new JLabel("1) True");
        optionOneTFLabel.setBounds(20, 80, 80, 25);
        trueOrFalseQuizPanel.add(optionOneTFLabel);

        optionTwoTFLabel = new JLabel("2) False");
        optionTwoTFLabel.setBounds(20, 110, 80, 25);
        trueOrFalseQuizPanel.add(optionTwoTFLabel);

        correctAnsChoiceTFLabelChoice = new JLabel("Enter correct answer choice (True or False):");
        correctAnsChoiceTFLabelChoice.setBounds(20, 140, 320, 25);
        trueOrFalseQuizPanel.add(correctAnsChoiceTFLabelChoice);

        correctAnsChoiceTFText = new JTextField(20);
        correctAnsChoiceTFText.setBounds(300, 140, 90, 25);
        trueOrFalseQuizPanel.add(correctAnsChoiceTFText);

        pointValueTFLabel = new JLabel("Enter the point value:");
        pointValueTFLabel.setBounds(20, 170, 250, 25);
        trueOrFalseQuizPanel.add(pointValueTFLabel);

        pointValueTFText = new JTextField(20);
        pointValueTFText.setBounds(300, 170, 90, 25);
        trueOrFalseQuizPanel.add(pointValueTFText);

        //adds the questions
        addQuestionTFButton = new JButton("Add Question");
        addQuestionTFButton.setBounds(120, 210, 150, 25);
        addQuestionTFButton.addActionListener(new Main());
        trueOrFalseQuizPanel.add(addQuestionTFButton);

        // once the add question button is clicked, we need to add the question to the list of questions for that specific quiz
        // calls the method that displays the screen and asks if the user wants to add another question or not

        addQuestionTFButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trueOrFalseQuizFrame.setVisible(false);
                trueOrFalseQuizFrame.dispose();
                addAnotherQuestion();
            }
        });

        trueOrFalseQuizPanel.setLayout(null);
        trueOrFalseQuizFrame.setVisible(true);

    }

    public static void addAnotherQuestion() {
        addAnotherQuestionFrame = new JFrame();
        addAnotherQuestionPanel = new JPanel();
        addAnotherQuestionFrame.setSize(400, 300);
        addAnotherQuestionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addAnotherQuestionFrame.add(addAnotherQuestionPanel);

        addAnotherQuestionLabel = new JLabel("Do you want to add another question?");
        addAnotherQuestionLabel.setBounds(70, 20, 280, 25);
        addAnotherQuestionPanel.add(addAnotherQuestionLabel);

        yesAnotherQuestionButton = new JButton("Yes");
        yesAnotherQuestionButton.setBounds(110, 50, 80, 25);
        yesAnotherQuestionButton.addActionListener(new Main());
        addAnotherQuestionPanel.add(yesAnotherQuestionButton);

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
        addAnotherQuestionPanel.add(noAnotherQuestionButton);

        // save the quiz if the user doesn't want to add another question
        /*
        noAnotherQuestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        */

        addAnotherQuestionPanel.setLayout(null);
        addAnotherQuestionFrame.setVisible(true);

    }

    public static void editQuiz() {
        editQuizFrame = new JFrame();
        editQuizPanel = new JPanel();
        editQuizFrame.setSize(400, 300);
        editQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editQuizFrame.add(editQuizPanel);

        lsmToolLabel = new JLabel("Edit a Quiz");
        lsmToolLabel.setBounds(160, 20, 500, 25);
        editQuizPanel.add(lsmToolLabel);

        String[] quizOptionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};

        JComboBox<String> jComboBox = new JComboBox<>(quizOptionsToChoose);
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
        editTeacherAccountFrame = new JFrame();
        editTeacherAccountPanel = new JPanel();
        editTeacherAccountFrame.setSize(400, 300);
        editTeacherAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editTeacherAccountFrame.add(editTeacherAccountPanel);

        editTeacherAccountPanel.setLayout(null);

        editTeachAccountLabel = new JLabel("Edit Student Account");
        editTeachAccountLabel.setBounds(80, 20, 200, 25);
        editTeacherAccountPanel.add(editTeachAccountLabel);

        editedTeachNameLabel = new JLabel("First & Last Name:");
        editedTeachNameLabel.setBounds(20, 50, 150, 25);
        editTeacherAccountPanel.add(editedTeachNameLabel);

        editedTeachNameText = new JTextField(20);
        editedTeachNameText.setBounds(150, 50, 165, 25);
        editTeacherAccountPanel.add(editedTeachNameText);

        editedTeachUsernameLabel = new JLabel("Username:");
        editedTeachUsernameLabel.setBounds(20, 80, 80, 25);
        editTeacherAccountPanel.add(editedTeachUsernameLabel);

        editedTeachUsernameText = new JTextField(20);
        editedTeachUsernameText.setBounds(150, 80, 165, 25);
        editTeacherAccountPanel.add(editedTeachUsernameText);

        editedTeachPasswordLabel = new JLabel("Password:");
        editedTeachPasswordLabel.setBounds(20, 110, 80, 25);
        editTeacherAccountPanel.add(editedTeachPasswordLabel);

        editedTeachPasswordText = new JTextField(20);
        editedTeachPasswordText.setBounds(150, 110, 165, 25);
        editTeacherAccountPanel.add(editedTeachPasswordText);

        updateTeachAccountButton = new JButton("Save and Update Account");
        updateTeachAccountButton.setBounds(30, 150, 200, 25);
        updateTeachAccountButton.addActionListener(new Main());
        editTeacherAccountPanel.add(updateTeachAccountButton);

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
    //Teacher Pathway ends

    //Student pathway starts
    public static void createStudent() {
        createStudentFrame = new JFrame();
        createStudentPanel = new JPanel();
        createStudentFrame.setSize(400, 300);
        createStudentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createStudentFrame.add(createStudentPanel);

        createStudentPanel.setLayout(null);

        createStudentLabel = new JLabel("Create a student account");
        createStudentLabel.setBounds(80, 20, 200, 25);
        createStudentPanel.add(createStudentLabel);

        studentNameLabel = new JLabel("First & Last Name:");
        studentNameLabel.setBounds(20, 50, 150, 25);
        createStudentPanel.add(studentNameLabel);

        studentNameText = new JTextField(20);
        studentNameText.setBounds(150, 50, 165, 25);
        createStudentPanel.add(studentNameText);

        studentUsernameLabel = new JLabel("Username:");
        studentUsernameLabel.setBounds(20, 80, 80, 25);
        createStudentPanel.add(studentUsernameLabel);

        studentUsernameText = new JTextField(20);
        studentUsernameText.setBounds(150, 80, 165, 25);
        createStudentPanel.add(studentUsernameText);

        studentPasswordLabel = new JLabel("Password:");
        studentPasswordLabel.setBounds(20, 110, 80, 25);
        createStudentPanel.add(studentPasswordLabel);

        studentPasswordText = new JTextField(20);
        studentPasswordText.setBounds(150, 110, 165, 25);
        createStudentPanel.add(studentPasswordText);

        createStudentAccountButton = new JButton("Create");
        createStudentAccountButton.setBounds(170, 150, 90, 25);
        createStudentAccountButton.addActionListener(new Main());
        createStudentPanel.add(createStudentAccountButton);

        createStudentAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createStudentFrame.setVisible(false);
                createStudentFrame.dispose();
                accountCreatedStudent();
            }
        });

        createStudentAccountBackButton = new JButton("Back");
        createStudentAccountBackButton.setBounds(70, 150, 90, 25);
        createStudentAccountBackButton.addActionListener(new Main());
        createStudentPanel.add(createStudentAccountBackButton);

        createStudentAccountBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createStudentFrame.setVisible(false);
                createStudentFrame.dispose();
                mainMenu();
            }
        });


        createStudentFrame.setVisible(true);
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
        studentLogInButton.addActionListener(new Main());
        accountCreatedStudentPanel.add(studentLogInButton);

        studentLogInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                accountCreatedStudentFrame.setVisible(false);
                accountCreatedStudentFrame.dispose();
                studentLogIn();
            }
        });

        accountCreatedStudentFrame.setVisible(true);

    }

    public static void studentLogIn() {
        studentLogInFrame = new JFrame();
        studentLogInPanel = new JPanel();
        studentLogInFrame.setSize(400, 300);
        studentLogInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentLogInFrame.add(studentLogInPanel);

        studentLogInPanel.setLayout(null);

        welcomeStudentsLabel = new JLabel("Welcome students!");
        welcomeStudentsLabel.setBounds(80, 20, 150, 25);
        studentLogInPanel.add(welcomeStudentsLabel);

        studentLogInUsernameLabel = new JLabel("Username:");
        studentLogInUsernameLabel.setBounds(20, 50, 80, 25);
        studentLogInPanel.add(studentLogInUsernameLabel);

        studentLogInPasswordLabel = new JLabel("Password:");
        studentLogInPasswordLabel.setBounds(20, 80, 80, 25);
        studentLogInPanel.add(studentLogInPasswordLabel);

        studentLogInUsernameText = new JTextField(20);
        studentLogInUsernameText.setBounds(100, 50, 165, 25);
        studentLogInPanel.add(studentLogInUsernameText);

        studentLogInPasswordText = new JTextField(20);
        studentLogInPasswordText.setBounds(100, 80, 165, 25);
        studentLogInPanel.add(studentLogInPasswordText);

        studentLogInButton = new JButton("Login");
        studentLogInButton.setBounds(130, 120, 80, 25);
        studentLogInButton.addActionListener(new Main());
        studentLogInPanel.add(studentLogInButton);

        studentLogInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentLogInFrame.setVisible(false);
                studentLogInFrame.dispose();
                studentMenu();
            }
        });

        studentLogInBackButton = new JButton("Back");
        studentLogInBackButton.setBounds(30, 120, 80, 25);
        studentLogInBackButton.addActionListener(new Main());
        studentLogInPanel.add(studentLogInBackButton);

        studentLogInBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentLogInFrame.setVisible(false);
                studentLogInFrame.dispose();
                mainMenu();
            }
        });

        studentLogInFrame.setVisible(true);
    }

    public static void studentMenu() {
        studentMenuFrame = new JFrame();
        studentMenuPanel = new JPanel();
        studentMenuFrame.setSize(400, 300);
        studentMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentMenuFrame.add(studentMenuPanel);

        lsmToolLabel = new JLabel("Learning System Management Tool");
        lsmToolLabel.setBounds(90, 20, 500, 25);
        studentMenuPanel.add(lsmToolLabel);

        takeQuizButton = new JButton("Take a Quiz");
        takeQuizButton.setBounds(80, 50, 250, 25);
        takeQuizButton.addActionListener(new Main());
        studentMenuPanel.add(takeQuizButton);

        takeQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentMenuFrame.setVisible(false);
                studentMenuFrame.dispose();
                takeQuiz();
            }
        });

        viewGradedQuizButton = new JButton("View Graded Quiz");
        viewGradedQuizButton.setBounds(80, 80, 250, 25);
        viewGradedQuizButton.addActionListener(new Main());
        studentMenuPanel.add(viewGradedQuizButton);

        viewGradedQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentMenuFrame.setVisible(false);
                studentMenuFrame.dispose();
                viewGradedQuiz();
            }
        });

        editStudentAccountButton = new JButton("Edit Account");
        editStudentAccountButton.setBounds(80, 110, 250, 25);
        editStudentAccountButton.addActionListener(new Main());
        studentMenuPanel.add(editStudentAccountButton);

        editStudentAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentMenuFrame.setVisible(false);
                studentMenuFrame.dispose();
                editStudentAccount();
            }
        });

        studentLogOutButton = new JButton("Logout");
        studentLogOutButton.setBounds(80, 140, 250, 25);
        studentLogOutButton.addActionListener(new Main());
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

    public static void takeQuiz() {
        takeQuizFrame = new JFrame();
        takeQuizPanel = new JPanel();
        takeQuizFrame.setSize(400, 300);
        takeQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        takeQuizFrame.add(takeQuizPanel);

        lsmToolLabel = new JLabel("Take a Quiz");
        lsmToolLabel.setBounds(160, 20, 500, 25);
        takeQuizPanel.add(lsmToolLabel);

        String[] quizTakeOptionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};

        JComboBox<String> jComboBox = new JComboBox<>(quizTakeOptionsToChoose);
        jComboBox.setBounds(120, 50, 140, 20);
        takeQuizPanel.add(jComboBox);
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

        takeQuizPanel.setLayout(null);
        takeQuizFrame.setVisible(true);

    }

    public static void viewGradedQuiz() {
        viewGradedQuizFrame = new JFrame();
        viewGradedQuizPanel = new JPanel();
        viewGradedQuizFrame.setSize(400, 300);
        viewGradedQuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewGradedQuizFrame.add(viewGradedQuizPanel);

        viewGradedQuiz = new JLabel("View a Graded Quiz");
        viewGradedQuiz.setBounds(160, 20, 500, 25);
        viewGradedQuizPanel.add(viewGradedQuiz);

        String[] quizTakeOptionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};

        JComboBox<String> jComboBox = new JComboBox<>(quizTakeOptionsToChoose);
        jComboBox.setBounds(120, 50, 140, 20);
        viewGradedQuizPanel.add(jComboBox);

    }

    public static void editStudentAccount() {
        editStudentAccountFrame = new JFrame();
        editStudentAccountPanel = new JPanel();
        editStudentAccountFrame.setSize(400, 300);
        editStudentAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editStudentAccountFrame.add(editStudentAccountPanel);

        editStudentAccountPanel.setLayout(null);

        editStuAccountLabel = new JLabel("Edit Student Account");
        editStuAccountLabel.setBounds(80, 20, 200, 25);
        editStudentAccountPanel.add(editStuAccountLabel);

        editedStuNameLabel = new JLabel("First & Last Name:");
        editedStuNameLabel.setBounds(20, 50, 150, 25);
        editStudentAccountPanel.add(editedStuNameLabel);

        editedStuNameText = new JTextField(20);
        editedStuNameText.setBounds(150, 50, 165, 25);
        editStudentAccountPanel.add(editedStuNameText);

        editedStuUsernameLabel = new JLabel("Username:");
        editedStuUsernameLabel.setBounds(20, 80, 80, 25);
        editStudentAccountPanel.add(editedStuUsernameLabel);

        editedStuUsernameText = new JTextField(20);
        editedStuUsernameText.setBounds(150, 80, 165, 25);
        editStudentAccountPanel.add(editedStuUsernameText);

        editedStuPasswordLabel = new JLabel("Password:");
        editedStuPasswordLabel.setBounds(20, 110, 80, 25);
        editStudentAccountPanel.add(editedStuPasswordLabel);

        editedStuPasswordText = new JTextField(20);
        editedStuPasswordText.setBounds(150, 110, 165, 25);
        editStudentAccountPanel.add(editedStuPasswordText);

        updateStuAccountButton = new JButton("Save and Update Account");
        updateStuAccountButton.setBounds(30, 150, 200, 25);
        updateStuAccountButton.addActionListener(new Main());
        editStudentAccountPanel.add(updateStuAccountButton);

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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

