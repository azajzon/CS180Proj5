## CS 180 Project 5 - Option 2

### Instructions on How to Compile and Run this Project:

<p> 1. Upload all classes on a Java IDE </p>
<p> 2. Run Server.java. </p>
<p> 3. After it says, 'listening to port' on the terminal run Gui.java and follow the program. </p>


### List Of Who Submitted Which Parts:
<p> - Aarohi: Submitted Vocareum Workspace   </p>
<p> - Aditi: Sumbitted Report on Brightspace  </p>
<p> - Aarohi: Sumbitted Presentation on Brightspace  </p>

### Description of Classes

#### 1) Answer.java

##### Description: 
<p> The Answer class is where we implement Serializable and gets the question title and the answer chosen. We create an object of the Answer class in the LearningSystemManager class which stores the the title of the question and the answer the student user chooses. The testing done for this class is that we tested that when a student goes in a course and selects a quiz he/she is able to select which answer he/she thinks is right. </p>


##### Fields: 

| Modifier and Type  | Field | Description |
| ------------- | ------------- | ------------- |
| private String | questionTitle | An array list containing all the quiz submissions | 
| private String | answerChosen | An array list containing all the quiz submissions | 


##### Constructors: 
 
| Constructor | Description |
| ------------- | ------------- |
| public Answer(String questionTitle, String answerChosen) | Constructs a newly allocated Asnwer object with the field value specified by the input parameter |
 

##### Methods: 

| Method  | Signature | Parameters | Description |
| ------------- | ------------- | ------------- | ------------- |
| getQuestionTitle()  | public String  | None | Returns the question title |
| getAnswerChosen()  | public String  | None | Returns the answer chosen |
| setAnswerChosen() | public void | String answerChosen | None | Sets the answer chosen instance variable to the value given as a parameter |
 

#### 2) Course.java

##### Description: 
<p> The Course class is where we implement Serializable and  has an array list of quizzes where you can get a quiz, add a quiz, or delete a quiz. There is also methods which add a quiz, delete a quiz and get a quiz. We also create an object of the Course class in the LearningSystemManager class which stores the name of the course and the quizzes for that course in it. The testing done for this class is that we tested that when a student goes in a course he/she is able to view the quizzes inside the specifci course and the name of the course is given as well. </p>


##### Fields: 

| Modifier and Type  | Field | Description |
| ------------- | ------------- | ------------- |
| private ArrayList <Quiz>  | quizzes | The list of quizzes for a course | 
| private String  | name  |  The name of the course |


##### Constructors: 

| Constructor | Description |
| ------------- | ------------- |
| public Course (String name) | Constructs a newly allocated Course object with the field value specified by the input parameter |
 

##### Methods: 

| Method  | Signature | Parameters | Description |
| ------------- | ------------- | ------------- | ------------- |
| getName()  | public String  | String courseName | Returns the name of the course |
| getQuizzes()  | Public ArrayList<Quiz>   | String studentUsername | Returns the list of quizzes |
| getQuiz() | public Quiz | String quizName | None | Returns a quiz beased on the name of the quiz |
| addQuiz() | public void | Quiz q | None | Adds a quiz |
| deeteQuiz() | public void | Quiz q | None | Deletes a quiz |

#### 3) Question.java

##### Description: 
<p> The Question class is where we implement Serializable and get the title of the question, the choices, answer, and the point value for a question. We also create an object of the Question class in the LearningSystemManager class which stores the question and its attributes such as the title of the question, the choices, and the answer. The testing done for this class is that we tested that when a teacher enters a question, they are able to type in the question title, the choices they want for each question, and the correct answer. </p>


##### Fields: 

| Modifier and Type  | Field | Description |
| ------------- | ------------- | ------------- |
| private String | questionTitle | The title of the question | 
| private String  | answer  |  The answer the user chooses |
| private ArrayList<String> | choices  |  The arraylist of choices for a question |
| private double  | pointValue  |  The point value for a question |

##### Constructors: 

| Constructor | Description |
| ------------- | ------------- |
| public Question(String questionTitle) | Constructs a newly allocated Question object with the field values specified by the input parameters |
 
##### Methods: 

| Method  | Signature | Parameters | Description |
| ------------- | ------------- | ------------- | ------------- |
| getQuestionTitle()  | public String  | None | Returns the title of the question |
| setQuestionTitle()  | public void  | String questionTitle | Sets the question title instance variable to the value given as a parameter |
| getAnswer()  | public String  | None | Returns the answer |
| setAnswer()  | public void  | String answer | Sets the answer instance variable to the value given as a parameter |
| getChoices()  | public ArrayList<String>  | String answerChosen | Returns the array list of choices |
| addChoice()  | public void  | String choice | Adds a choice to the array list of choices |
| setChoices()  | public void  | String[] choices | Sets the choices array list instance variable to the value given as a parameter |
| getPointValue()  | public double  | None | Returns the point value for a question |
| setPointValue()  | public void  | double pointValue | Sets the pointValue instance variable to the value given as a parameter |
 
 
#### 4) Quiz.java

##### Description: 
 
<p> The Quiz class is where we implement Serializable and gets the array list of questions with the name of the quiz, the score and the number of questions and also implements other calculation methods. We also calculate the total score of all the questions in a quiz using the Question object. We also create an object of the Quiz class in the LearningSystemManager class which stores the quiz containing its name and the questions within it. The testing done for this class is that we tested that when a teacher creates a quiz, a quiz is created with their choice of question titles and their choice of the quiz name. </p>


##### Fields: 
| Modifier and Type  | Field | Description |
| ------------- | ------------- | ------------- |
| private ArrayList<Question> | questions | The title of a question | 
| private String | quizName | The name of the quiz | 
| private double | score | The score of a quiz |
| private int | numQuestions | The number of questions in a quiz|
 

##### Constructors: 
 | Constructor  | Description |
| ------------- | ------------- |
| public Quiz(ArrayList<Question> questions, String quizName) | Constructs a newly allocated Quiz object with the field values specified by the input parameters |

##### Methods: 

| Method  | Signature | Parameters | Description |
| ------------- | ------------- | ------------- | ------------- |
| getQuestions()  | public ArrayList<Question> | None | Returns the array list of questions |
| getQuizName()  | public String | None | Returns the name of the quiz |
| setQuizName()  | public void  | String quizName | Sets the quiz name instance variable to the value given as a parameter |
| getScore()  | public double | None | Returns the score of a quiz |
| setScore()  | public void  | double score | Sets the score instance variable to the value given as a parameter |
| getNumQuestions()  | public int  | None | Returns the number of questions of a quiz |
| setNumQuestions()  | public void  | int numQuestions | Sets the numQuestions instance variable to the value given as a parameter |
| calculateTotalScore()  | public double  | double pointValue| Calculates the total score of a quiz |
| addQuestion()  | public void  | Question q | Adds a question to the array list of questions |
| deleteQuestion()  | public void  | Question q | Deletes a question from the array list of questions |

#### 5) QuizSubmission.java

##### Description: 
<p> The QuizSubmission class is where we implement Serializable and get the array list of answers, quiz name, course name and finds the answer based on the question. It also returns the timestamp to find when the user takes a quiz and it also finds and returns the answer within a quiz. We also create 2 objects of the QuizSubmission class in the LearningSystemManager class, one which is an array list that stores all the subitted quizzes and one which stores which quiz is currently selected. The testing done for this class is that we tested that when a student submits a quiz it gets stored in an array and their answers are stored in a txt file and the quiz is returned to the user. </p>


##### Fields: 
| Modifier and Type  | Field | Description |
| ------------- | ------------- | ------------- |
| private Quiz | quiz | The quiz | 
| private long   | timeStamp  | The time stamp of a quiz |
| private ArrayList<Answer> | answers | The answers of a quiz |
| private int | numQuestions | The number of questions in a quiz |


##### Constructors: 
| Constructor  | Description |
| ------------- | ------------- |
| public QuizSubmission(Quiz quiz, ArrayList<Answer> answers) | Constructs a newly allocated QuizSubmission object with the field values specified by the input parameters |

##### Methods: 

| Method  | Signature | Parameters  | Description |
| ------------- | ------------- | ------------- | ------------- |
| getAnswers()  | public ArrayList<Answer> | None | Returns the array list of answers |
| getQuiz() | public Quiz | None | Returns the quiz |
 

#### 6) Student.java

##### Description: 
<p> The Student class is where we implement Serializable and contains the login information that belong to student user. This includes their name, username, and password. A super is used to access the teacher and call functions in the Student constructor. It also includes the quiz submissions by the students. Also, it has methods that allows the student user to take a quiz, and calculates their score of the quiz. We also create 2 objects of the Student class in the LearningSystemManager class, one which stores the information the student user types in and one which stores which student is using the application. The testing done for this class is that we tested that when a student user creates an account, their information gets stored once we ends the program through our implementation of serialization. </p>


##### Fields: 
| Modifier and Type  | Field | Description |
| ------------- | ------------- | ------------- |
| private ArrayList<QuizSubmission> | quizSubmissions | The array list of quiz submissions |


##### Constructors: 
| Constructor  | Description |
| ------------- | ------------- |
| public Student(String name, String username, String password) | Constructs a newly allocated Student object with the field values specified by the input parameters | 


##### Methods: 

| Method  | Signature | Parameters  | Description |
| ------------- | ------------- | ------------- | ------------- |
| findQuizSubmission()  | public QuizSubmission | String courseName, String quizName |Finds the quiz submission of a student |
| takeQuiz() | public void| String courseName, String quizName, ArrayList<Answer> studentAnswerChoices | Allows the student to take a quiz |
| calculateQuizScore()  | public double | String courseName, String quizName | Calculates the score of a quiz |

#### 7) Teacher.java

##### Description: 
<p> The Teacher class is where we implement Serializable. We use the Teacher object and store it when the program ends. It contains methods which we use to get the log in information of a teahcer user such as the teacher's name, username, and password and we also extend the User class to get the basic log in information that is in the User class We also create 2 objects of the Teacher class in the LearningSystemManager class, one which stores the information the teacher user types in and one which stores which teacher is using the application. The testing done for this class is that we tested that when a teacher user creates an account, their information gets stored once we ends the program through our implementation of serialization. </p>


##### Fields: 

 <p> None </p>


##### Constructors: 
| Constructor  | Description |
| ------------- | ------------- |
| public Teacher(String teacherName, String teacherUsername, String teacherPassword) | Constructs a newly allocated Teacher object with the field values specified by the input parameters |


##### Methods: 

 <p> None </p>

#### 8) User.java
 
##### Description: 
<p> The User class is where we implement Serializable so we can use the User object and store it when the program ends. It contains methods which we use to get the name, username, and password and also have methods to set the name, username, and password which we use in the LearningSystemManager class to store it in an User object there, meaning we create an object of this class in the LearningSystemManager class so we can store the information the user types in. Overall, it contains information about that belong to a user (whether they are a teacher or a student) such as their name, username and password. The testing done for this class is that we tested that when a user creates an account it gets stored once we ends the program thorugh our implementation of serialization. </p>

##### Fields: 
| Modifier and Type  | Field | Description |
| ------------- | ------------- | ------------- |
| private String  | name | The name of the user | 
| private String  | username | The name of the username | 
| private String  | password | The name of the password | 
| private ArrayList<Course> | courses | The array list of the courses for a user | 


##### Constructors: 
| Constructor  | Description |
| ------------- | ------------- |
|  public User(String name, String username, String password) | Constructs a newly allocated User object with the field values specified by the input parameters. |


##### Methods: 

| Method  | Signature | Parameters  | Description |
| ------------- | ------------- | ------------- | ------------- |
| getPassword()  | public String  | None | Returns the password of the user |
| setPassword() | public void   | String password | Sets the password instance variable to the value given as a parameter|
| getName()  | public String  | None| Returns the name of the user |
| setName() | public void   |String name | Sets the name instance variable to the value given as a parameter |
| getUsername()  | public String  | None | Returns the username of the user |
| setUsername() | public void   | String username | Sets the username instance variable to the value given as a parameter |


#### 9) Server.java
 
##### Description: 
<p> The Server class includes the main and this is the class that listens for incoming connections and starts ServerThreads to handle those connections.</p>

##### Fields: 
| Modifier and Type  | Field | Description |
| ------------- | ------------- | ------------- |
| public static CopyOnWriteArrayList<Teacher> | teachers | The thread safe arraylist for teachers | 
| public static CopyOnWriteArrayList<Student> | students | The thread safe arraylist for students | 
| public static CopyOnWriteArrayList<Course> | course | The thread safe arraylist for courses | 
| public static CopyOnWriteArrayList<Teacher> | loggedInTeachers | The thread safe arraylist for the teachers that are logged in  | 
| public static CopyOnWriteArrayList<Student> | loggedInStudents | The thread safe arraylist for the students that are logged in | 
| private static Function<Object, Object>[] | commandList | An array of functions (command executor for Server) |
 
##### Constructors: 

 <p> None </p>
 
##### Methods: 

| Method  | Signature | Parameters  | Description |
| ------------- | ------------- | ------------- | ------------- |
| getCommandList |  public static Function<Object, Object>[] | None | Returns the command list |
| main()  | public static void  | String [] args | Sets the thread safe array lists and listens for connections and starts server threads tp handle the connection and send output to the client |
| LoginTeacher()  | public static String  | String username, String password | Creates object of teacher class and reads input and checks if it is right |
| getTeacherByUsername()  | public static Teacher | String username | Gets the username input of user and returns the teacher object |
| CreateTeacher()  | public static String  | String teacherName, String teacherUsername, String teacherPassword | Creates an object array that stores the name, username and passowrd of teacher |
| LoginStudent()  | public static String  | tring username, String password | Creates object of student class and reads input and checks if it is right |
| getStudentByUsername()  | public static Student | String username | Gets the username input of user and returns the student object |
| CreateStudent()  | public static String  | Object array |  Creates an object array that stores the name, username and passowrd of student |
| createQuiz()  |  public static Object | Object inQuiz | aAdds the quiz object to the thread safe list of quizzes |
| getListOfQuizNames()  | public static Object  | Object o | Returns the list of quiz names |
| editStudentAccount()  | public static Object  | Object o | Gets the student's username and updates the 3 fields and stores it in a student object |
| updateQuiz()  | public static Object  | Object o | Updates the quiz name based on the index and the contents of the Quiz object |
| getQuiz()  | public static Object  | Object o | Returns a quiz object |
| submitQuiz()  | public static Object  | Object o | Gets the name of quiz that has to be submitted and adds it to the quiz subbmission list of the specific student's username |
| editTeacherAccount | public static Object | Object o | Gets the teacher's username and updates the 3 fields and stores it in a teacher object |
| deleteTeacherAccount | public static Object | Object o | Deletes a teacher account|
| deleteStudentAccount | public static Object | Object o | Deletes a student account|
| getSubmissions()  | public static Object  | Object o | Returns the quiz submission based on the student's username |
| saveArrayToFile()  | public static void | String filename, int arrayType| Saves the arrays of teachers, students and quizzes objects to 3 files |
| loadArrayFromFile()  | public static void | String filename, int arrayType | Loads the 3 arrays from the files once the program starts again |
| saveProgramState()  | public static void | None | Saves the data even when we end the program |
| loadProgramState()  | public static Object  | None | Loads the data that was saved when a previous program was ended |
| getStudents()  | private static Object  | Object o | Returns the students arrayd |
| deleteQuiz()  | private static Object  | Object o | Deletes a quiz from the list of quizzes |
 
#### 10) ServerThread.java
 
##### Description: 
<p> The ServerThread class listens for the client to tell it what command to run and then runs that command and sends the output of that command to the client. </p>

##### Fields: 
| Modifier and Type  | Field | Description |
| ------------- | ------------- | ------------- |
| Socket | client | The socket object | 
| ObjectOutputStream | output | The object of the ObjectOutputStream | 
| ObjectInputStream | input | The object of the ObjectInputStream | 

##### Constructors: 

| Constructor  | Description |
| ------------- | ------------- |
|  public ServerThread(Socket client) | Constructs a newly allocated ServerThread object with the field values specified by the input parameters. |

##### Methods: 

| Method  | Signature | Parameters  | Description |
| ------------- | ------------- | ------------- | ------------- |
| run()  | public void  | None | Reads the command line from the client using Bufferedreader and then closes the client |


#### 11) ClientClass.java
 
##### Description: 
<p> The ClientClass class sends requests to the server and receives responses. </p>

##### Fields: 
| Modifier and Type  | Field | Description |
| ------------- | ------------- | ------------- |
| private static String | hostName | A string that is set to local host | 
| private static Socket | socket | The socket object  | 
| private static ObjectOutputStream | out | An object of ObjectOutputStream is set to null | 
| private static ObjectInputStream | input | An object of ObjectInputStream is set to null |  


##### Constructors: 
 
 <p> None </p>
 
##### Methods: 

| Method  | Signature | Parameters  | Description |
| ------------- | ------------- | ------------- | ------------- |
| serverCall()  |   public static Object | int command, Object objToSend | Creates a new Socket object and establishes the socket connection between the client and server, writes the reuqest to the socket stream and reads the outpur from the server

 
 #### 12) GUI.java
 
##### Description: 
<p> The GUI class works with the client side of the network I/O and uses graphical user interfaces and integrates the logic with objects from other classes to create the learning system management program. </p>

##### Fields: 
| Modifier and Type  | Field | Description |
| ------------- | ------------- | ------------- |
| private static String | hostName | Creates a hostname string |
| private static LinkedList<Thread> | list | A linked list that keeps track of the threads | 
| public static JFrame | mainFrame | The frame of the main screen|
| public static JPanel | panel | The panel of the main screen |
| public static JLabel | lsmTool | The label for the title of program |
| public static JButton | createTeacherButton | The button for creating teacher account |
| public static JButton | loginTeacherAccountButton |  The button for logging in as a teacher |
| public static JButton | createTeacherAccountButton | The button that creates a teacher account |
| public static JFrame | teacherLoginFrame | The frame for teacher log in |
| public static JPanel | teacherLoginPanel | The panel for teacher log in |
| public static JLabel | teacherWelcomeLabel | The welcome label for teachers |
| public static JLabel |teacherLoginLabel | The log in label for teacher |
| public static JLabel | teacherPasswordLabel | The password label for teacher|
| public static JTextField | teacherUsernameText | The text field for teacher username |
| public static JTextField | teacherPasswordText | The text field for teacher password|
| public static JFrame | createTeacherFrame | The frame for creating teacher account |
| public static JPanel | createTeacherPanel | The panel for creating teacher account |
| public static JLabel | createTeacherWelcomeLabel | The welcome label for creating teacher account|
| public static JLabel | createTeacherNameLabel | The teach name label for creating teacher account |
| public static JTextField | createTeacherUsernameText | The text field for teacher username for creating teacher account|
| public static JTextField | createTeacherNameText | The text field for teacher name |
| public static JLabel | createTeacherUsernameLabel | The label for teacher username |
| public static JLabel | createTeacherPasswordLabel | The label for teacher password |
| public static JTextField | createTeacherPasswordText | The text field for teacher password |
| public static JFrame | editTeachAccountDoneFrame | The frame for editing teacher account done |
| public static JPanel | editTeachAccountDonePanel | The panel for editing teacher account done |
| public static JLabel | accountUpdatedLabel | The label for account updating done |
| public static JButton | editTeacAccountDoneBackButton | The back button after editing teacher account done |
| public static JButton | loginTeacherButton | The button for logging in for teacher |
| public static JButton | loginStudentButton | the button for logging in for student |
| public static JButton | createStudentButton | The button for creating student account |
| public static JButton | loginStudentAccountButton | The button for logging in as a student |
| public static JButton |createStudentAccountButton | The button that creates a student account |
| public static JFrame | accountCreatedStudentFrame | The frame that shows student account created |
| public static JPanel | accountCreatedStudentPanel | The panel that shows student account created |
| public static JLabel | studentAccountCreatedLabel | The label for student account created |
| public static JButton | studentLogInButton | The button that allows the student to log in |
| public static JFrame | studentLoginFrame | The frame for student login |
| public static JPanel | studentLoginPanel | The panel for student log in |
| public static JLabel | studentWelcomeLabel | The welcome label for students |
| public static JLabel | studentLoginLabel | The label for student log in |
| public static JLabel | studentPasswordLabel | The label for student password |
| public static JTextField | studentUsernameText | The text field for student username |
| public static JTextField | studentPasswordText | The text field for student password |
| public static JFrame | createStudentFrame | The frame for create student account |
| public static JPanel | createStudentPanel | The panel for creating student account |
| public static JLabel | createStudentWelcomeLabel | The welcome label for creating student account |
| public static JLabel | createStudentNameLabel | The label for student name |
| public static JTextField | createStudentUsernameText | The text field of student username when creating account |
| public static JTextField | createStudentNameText | The text field for name of user when creating account |
| public static JLabel | createStudentUsernameLabel | The label for student username when creating account|
| public static JLabel | createStudentPasswordLabel | The label for student password when creating account |
| public static JTextField | createStudentPasswordText | The text field for student password when creating account |
| public static JFrame | editStudentAccountDoneFrame | The frame for editing student account done |
| public static JPanel | editStudentAccountDonePanel | The panel for editing student account done |
| public static JButton | editStuAccountDoneBackButton | The back button after editing student account done |
| public static JPanel | studentMenuPanel | The panel for the student menu |
| public static JFrame | teacherCourseMenuFrame | The frame for the teacher course menu |
| public static JPanel | teacherCourseMenuPanel | The panel for the teacher course menu |
| public static JLabel | addCourseLabel | The label for adding course |
| public static JButton | yesCourseButton | The yes button for adding course |
| public static JButton | noCourseButton | The no button for not adding course |
| public static JPanel | addCoursePanel | The panel for adding a course |
| public static JFrame | addCourseFrame | The frame for adding a course |
| public static JLabel | enterCourseNameLabel | The label for the name of the course |
| public static JTextField | enterCourseNameText | The text field for the course name |
| public static JButton | createCourseButton | The button to create a course |
| public static JButton | addCourseBackButton | The back button if want to go back to menu |
| public static String | username = ""  | The username of the user |
| public static JLabel | createAccountErrorLabel | The label for an error in creating account |
| public static JLabel | logInErrorLabel | The label for an error in log in |
| static ArrayList<Question>  | questions | An array list of questions from the quizzes |
 
##### Constructors: 
 
 <p> None </p>
 
##### Methods: 

| Method  | Signature | Parameters  | Description |
| ------------- | ------------- | ------------- | ------------- |
| main()| public static void | String[] args | Main method calls mainMenu() to begin the application flow |
| mainMenu()| public static void | None | Contains centralized location of pathways that student and teacher can access |
| createTeacher()| public static void | None | Creates a teacher account |
| teachAccountCreationFailed()| public static void | None | Checks for account duplication validation for teacher |
| accountCreatedTeacher() | public static void | None | Screen for when the user create account is validated |
| loginTeacher()| public static void | None | Login screen for teacher user to interact with |
| teacherCourseMenu()| public static void | None | Allows teacher to add a course for students |
| addCourse()| public static void | None | Allows teacher to add a new course |
| createStudent()| public static void | None | Creates a student account |
| studAccountCreationFailed()| public static void | None | Checks for account duplication validation for student | 
| accountCreatedStudent() | public static void | None | Shows the message dialog for a successful account that has been created |
| loginStudent()| public static void | None | The login screen for student user to log in |
| studentMenu()| public static void | None | Displays the screen for the student menu and checks for user input validation by getting text from all text fields |
| teacherQuizMenu()| public static void | None | Allows teacher to do various options with quiz |
| createQuiz()| public static void | None | Allows teacher user to create a quiz for students to access |
| multipleChoiceQuiz()| public static void | String quizName | Contains screen for teacher user to input and create a multiple choice question in a quiz |
| editQuiz()| public static void | ArrayList<String> quizNames | Allows teacher to edit a quiz that they have previously made |
| questionForEditQuiz()| public static void | Quiz q | Question screen that teacher can edit from |
| editTeacherAccount()| public static void | None | Allows the teacher to edit their account and the fields |
| editTeachAccountDone()| public static void | None | Screen which shows information about the teacher account being updated |
| editStudentAccount()| public static void | None |  Allows the student to edit their account and the fields |
| editStudentAccountDone()| public static void | None | Screen which shows information about the student account being updated |
| whichQuizToTake()| public static void | None | Allows student user to choose a quiz to take |
| quizStudentTakes()| public static void | JFrame parentFrame, Quiz quiz | Allows students to take the questions within the quiz and answers |
| findIndexOfQuestion()| public static int | String question, ArrayList<Question> originalQuestions| Finds the index of the question and returns the index |
| quizView()| public static JDialog | JFrame parent, ArrayList<Question> questions, int num, Quiz quiz, ArrayList<Answer> answers | Allows a student user to view the quiz while taking the quiz |
| quizSubmitted()| public static void | None | Sets the quiz to be submitted |
| viewGradedQuiz()| public static void | ArrayList<QuizSubmission> qs | Allows students to view thier graded quiz |
| showsStuGradedQuiz()| public static void | QuizSubmission qs | Shows students their graded quiz, passes through the quiz submission object |
| getQuizString()| public static String | QuizSubmission qs | Returns the string of the quiz that the teacher user has created |
| viewStudentQuizSubmissions()| public static void | None | Allows teacher user to view the student quiz submissions |
| deleteQuiz()| public static void | None | Screen that allows for a teacher to delete a quiz |
| quizDeleted()| public static void | None | Contains the updated message of whether a quiz has been deleted | 
 
 
 
