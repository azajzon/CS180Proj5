## CS 180 Project 5 - Option 2

### Instructions on How to Compile and Run this Project:

<p> 1. Run the LearningSystemManager.java file on a Java IDE </p>
<p> 2. Upload all the other class in the scr folder onto the IDE. In total, there should be 9 classes including the LearningSystemManager.java file. </p>
<p> 3. Do not upload any of the test files to your IDE. For example, do not upload the "UserTest.java" file because it is a testing file. </p>


### List Of Who Submitted Which Parts:
<p> - Aarohi: Submitted Vocareum Workspace   </p>
<p> - Aarohi: Sumbitted Report on Brightspace  </p>

### Description of Classes

#### 1) LearningSystemManager.java //me

##### Description: 
<p> The LearningSystemManager class is where we use scanners to read in user input and take in user inpu into the calculations of our menu driven program. Based on the user, we call several methods from this class and create an account for an user which gets stored even when the program ends and based on the user type (teacher or student), there is a different responsibilities menu shown and from there they can choose any option they want to perform it. This class utilizes all the objects from the classes mentioned below. The testing done for this class is that we tested by logging in as a student and a teacher and testing all the possible pathways that could have been taken from each menu option. </p>

##### Fields:

| Modifier and Type  | Field | Description |
| ------------- | ------------- | ---------- |
| static ArrayList<Student>  | students | The array list of students | 
| static ArrayList<Teacher>  | teachers  | The array list of teachers |
| static ArrayList<Course>  | courses  | The array list of courses |
| private static Scanner  | scan | The scanner |

##### Constructors: 
 
 <p> None </p>

##### Methods: 

| Method  | Signature | Parameters | Description |
| ------------- | ------------- | ------------- | ------------- |
| main() | public static void | String[] args throws IOException | The main method |
| createTeacherAccount() | public static void | None | Contains information for the create Teacher account |
| LoginTeacher() | public static Teacher | None | Teacher's username and password information |
| getTeacher() | private static Teacher | String teacherUsername | Checks to see if inputted teacher username is equal to stored username |
| teacherMenu() | public static void | None | Application pathway for teacher that includes the course creations and quiz adaptations |
| viewStudentQuizSubmissions() | public static void | None | Allows teacher to view taken student's quizzes and grade students quizzes |
| editQuiz() | public static void | None | Allows teacher to edit a quiz they created |
| deleteQuiz() | public static void | None | Deletes a created quiz made by the teacher |
| createQuiz() | public static Quiz | String cname | Allows teacher to create a quiz for students |
| createStudentAccount() | public static void | None | Contains information for the create Student account |
| LoginStudent() | public static Student | None | Checks to see if inputted student username and password is equal to stored username and password |
| studentMenu() | public static Student | None | Application pathway for student that includes student taking course |
| viewSubmission() | private static void | Course selectedCourse | Allows the student to view their graded quizzes based on the course they selected |
| takeQuiz() | private static void  | Course selectedCourse | Allows the student to take a quiz based on the course they selected |
| getCourse() | public static Course | String courseName | Returns the course based on the name of the course |
| getStudentByUsername() | public static Student | String studentUsername | Returns the specific student based on the studen't username |
| findQuiz() | public static Quiz | String courseName, String quizName | Finds the quiz based on the name of the course and the quiz for a specific cour |
| saveArrayToFile() | public static void | String fileName, int arrayType | Saves the arrays of teachers, students and courses to a file |
| loadArrayFromFile() | public static void | String filename, int arrayType | Loads the saved data from the file that we stroed the data in |
| saveProgramState() | public static void | throws IOException | Saves the data even when we end the program |
| loadProgramState() | public static void | throws IOException | Loads the data that was saved when a previous program was ended |
| editTeacherAccount() | public static void | None | Allows the teacher to edit their account |
| editStudentAccount() | public static void | None | Allows the student to edit their account|
| mainMenu() | public static void | throws IOException | The main menu that is displayed at the beginning ad calls some of the above methods|

#### 2) Answer.java

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
 

#### 3) Course.java

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

#### 4) Question.java

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
 
 
#### 5) Quiz.java

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

#### 6) QuizSubmission.java

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
 

#### 7) Student.java

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

#### 8) Teacher.java

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

#### 9) User.java
 
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


#### 10) CommandExecutor.java
 
##### Description: 
<p> The Command Executor class </p>

##### Fields: 
| Modifier and Type  | Field | Description |
| ------------- | ------------- | ------------- |
| |  |  | 
|   |  |  | 


##### Constructors: 

 <p> None </p>
 
##### Methods: 

| Method  | Signature | Parameters  | Description |
| ------------- | ------------- | ------------- | ------------- |
| run()  | public static String  | String commandString, BufferedReader input | Description |


 #### 11) Server.java
 
##### Description: 
<p> The Server class </p>

##### Fields: 
| Modifier and Type  | Field | Description |
| ------------- | ------------- | ------------- |
| public static CopyOnWriteArrayList<Student> | teachers |  | 
| public static CopyOnWriteArrayList<Teacher> | courses |  | 
| public static CopyOnWriteArrayList<Course> | students |  | 
| public static CopyOnWriteArrayList<Teacher> | loggedInTeachers |  | 
| public static CopyOnWriteArrayList<Student> | loggedInStudents |  | 
 
##### Constructors: 

 <p> None </p>
 
##### Methods: 

| Method  | Signature | Parameters  | Description |
| ------------- | ------------- | ------------- | ------------- |
| main()  | public static void  | String [] args | Description |
| LoginTeacher()  | public static String  | String username, String password | Description |
| getTeacherByUsername()  | public static Teacher | String username | Description |
| CreateTeacher()  | public static String  | String teacherName, String teacherUsername, String teacherPassword | Description |
| LoginStudent()  | public static String  | tring username, String password | Description |
| getStudentByUsername()  | public static Student | String username | Description |
| CreateStudent()  | public static String  | String studentName, String studentUsername, String studentPassword | Description |
 
 
 
 
