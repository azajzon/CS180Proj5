

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/**
 * Project 4 - Server.java
 * <p>
 * The Server.java includes main(), and is the class that listens for incoming connections and starts ServerThreads to
 * handle those connections.
 *
 * @author Aarohi Panzade, Abel Zazjon, Aditi Barla, and Yaseen Shady 039
 *
 * @version 12/12/21
 */

public class Server {

    /**
     * @param args
     */
    static CopyOnWriteArrayList<Student> students; //these are thread safe arraylists
    static CopyOnWriteArrayList<Teacher> teachers;//these are thread safe arraylists
    static CopyOnWriteArrayList<Course> courses;//these are thread safe arraylists
    static CopyOnWriteArrayList<Quiz> quizzes;//these are thread safe arraylists
    static CopyOnWriteArrayList<QuizSubmission> quizSubmissions;//these are thread safe arraylists
    // sets the loggedInTeacher Server.Teacher object and loggedInStudent Server.Student object to null
    static CopyOnWriteArrayList<Teacher> loggedInTeachers;
    static CopyOnWriteArrayList<Student> loggedInStudents;

    private static Function<Object, Object>[] commandList;

    static {
        commandList = new Function[]{
                Server::loginTeacher,
                Server::createTeacher,
                Server::loginStudent,
                Server::createStudent,
                Server::createQuiz,
                Server::editStudentAccount,
                Server::getListOfQuizNames,
                Server::getQuiz,
                Server::submitQuiz,
                Server::getSubmissions,
                Server::editTeacherAccount,
                Server::updateQuiz,
                Server::deleteTeacherAccount,
                Server::deleteStudentAccount,
                Server::getStudents,
                Server::deleteQuiz
        };
    }

    public static Function<Object, Object>[] getCommandList() {
        return commandList;
    }

    //Sets the thread safe array lists and listens for connections and starts server threads tp handle the connection and send output to the client
    public static void main(String[] args) throws IOException {

        //initializes variables
        teachers = new CopyOnWriteArrayList<>();
        students = new CopyOnWriteArrayList<>();
        courses = new CopyOnWriteArrayList<>();
        quizzes = new CopyOnWriteArrayList<>();
        loggedInStudents = new CopyOnWriteArrayList<>();
        loggedInTeachers = new CopyOnWriteArrayList<>();
        quizSubmissions = new CopyOnWriteArrayList<>();
        Thread saveStateHook = new Thread(() -> {
            try {
                saveProgramState();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Runtime.getRuntime().addShutdownHook(saveStateHook);
        loadProgramState();

        AtomicInteger numThreads = new AtomicInteger(0);
        // the list of threads is kept in a linked list
        ArrayList<Thread> list = new ArrayList<Thread>();

        try {
            // listen for incoming connections on port 5000
            ServerSocket socket = new ServerSocket(5000);
            System.out.println("Server listening on port 5000");

            // loop (forever) until program is stopped
            while (true) {
                // accept a new connection
                Socket client = socket.accept();
                // start a new ServerThread to handle the connection and send
                // output to the client
                Thread thrd = new Thread(new ServerThread(client));
                list.add(thrd);
                thrd.start();
                numThreads.incrementAndGet();
                System.out.println("Thread " + numThreads.get() + " started.");

            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    //Creates object of teacher class and reads input and checks if it is right
    public static Object loginTeacher(Object array) {
        // creates an object of the Teacher class
        String[] arr = (String[]) array;
        Teacher teacher = getTeacherByUsername(arr[0]);
        // checks if object is null or not
        if (teacher == null) {
            return false;
        } else {
            // reads the password input and checks if it's right or not
            if (!teacher.getPassword().equals(arr[1])) {
                return false;
            } else {
                // returns the student object
                loggedInTeachers.add(teacher);
                return true;
            }
        }
    }

    //Gets the username input of user and returns the teacher object
    public static Teacher getTeacherByUsername(String username) {
        Iterator<Teacher> it = teachers.iterator();
        while (it.hasNext()) {
            Teacher teacher = it.next();
            if (teacher.getUsername().equals(username)) {
                return teacher;
            }
        }
        return null;
    }

    //Creates an object array that stores the name, username and passowrd of teacher
    public static Object createTeacher(Object array) {
        String[] arr = (String[]) array;
        Teacher teacher = new Teacher(arr[0], arr[1], arr[2]);
        for(Teacher t: teachers) {
            //checks if the username the user types in is equal to one that's already there
            if (teacher.getUsername().equals(t.getUsername())) {
                return false;
            }
        }
        //adds the teacher object to the list of teachers
        teachers.add(teacher);
        return true;
    }

    //Creates object of student class and reads input and checks if it is right
    public static Object loginStudent(Object array) {
        String[] arr = (String[]) array;
        // creates an object of the Student class

        Student student = getStudentByUsername(arr[0]);
        // checks if object is null or not
        if (student == null) {
            return new Exception("Invalid username.");
        } else {
            // reads the password input and checks if it's right or not
            if (!student.getPassword().equals(arr[1])) {
                return new Exception("Invalid password.");
            } else {
                // returns the student object
                loggedInStudents.add(student);
                return true;
            }
        }
    }

    //Gets the username input of user and returns the student object
    public static Student getStudentByUsername(String username) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            if (student.getUsername().equals(username)) {
                return student;
            }
        }
        return null;
    }

    //Creates an object array that stores the name, username and passowrd of student
    public static Object createStudent(Object array) {
        String[] arr = (String[]) array;
        Student student = new Student(arr[0], arr[1], arr[2]);
        for(Student s: students) {
            if (student.getUsername().equals(s.getUsername())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    //Adds the quiz object to the thread safe list of quizzes
    public static Object createQuiz(Object inQuiz) {
        Server.quizzes.add((Quiz) inQuiz);
        return true;
    }

    //Returns the list of quiz names
    public static Object getListOfQuizNames(Object o) {
        ArrayList<String> quizList = new ArrayList<>();
        // goes through the list of quizzes and adds the name of the quiz to the list and returns it
        for (Quiz q: quizzes) {
            quizList.add(q.getQuizName());
        }
        return quizList;
    }

    //Gets the student's username and updates the 3 fields and stores it in a student object
    public static Object editStudentAccount(Object o) {
        String[] infoLog = (String[]) o;
        Student student = getStudentByUsername(infoLog[0]);
        student.setName(infoLog[1]);
        student.setUsername(infoLog[2]);
        student.setPassword(infoLog[3]);
        return true;
    }

    //Updates the quiz name based on the index and the contents of the Quiz object
    public static boolean updateQuiz(Object o) {
        Quiz quiz = (Quiz) o;
        int index = 0;
        for (Quiz q : Server.quizzes) {
            if (q.getQuizName().equals(quiz.getQuizName())) {
                Server.quizzes.set(index, quiz);
                return true;
            }
            index++;
        }
        return false;
    }

    //Returns a quiz object
    public static Object getQuiz(Object o) {
        String qName = (String) o;
        for (Quiz q : quizzes) {
            if (q.getQuizName().equals(qName)) {
                //System.out.println(q.getQuizName());
                return q;
            }
        }
        return null;
    }

    //Gets the name of quiz that has to be submitted and adds it to the quiz subbmission list of the specific student's usernam
    public static Object submitQuiz(Object o) {
        String str = "---";
        QuizSubmission qs = (QuizSubmission) o;
        int sepPos = qs.getQuizName().indexOf(str);
        String username = qs.getQuizName().substring(sepPos + str.length()).trim();

        getStudentByUsername(username).addQuizSubmission(qs);
        quizSubmissions.add(qs);
        return true;
    }

    //Gets the teacher's username and updates the 3 fields and stores it in a teacher object
    public static Object editTeacherAccount(Object o) {
        String[] infoLog = (String[]) o;
        Teacher t = getTeacherByUsername(infoLog[0]);
        t.setName(infoLog[1]);
        t.setUsername(infoLog[2]);
        t.setPassword(infoLog[3]);
        return true;
    }

    //Deletes a teacher account
    public static Object deleteTeacherAccount(Object o) {
        Teacher t = getTeacherByUsername((String) o);
        teachers.remove(t);
        return true;
    }

    //Deletes a student account
    public static Object deleteStudentAccount(Object o) {
        Student s = getStudentByUsername((String) o);
        students.remove(s);
        return true;
    }

    //Returns the quiz submission based on the student's username
    public static Object getSubmissions(Object o) {
        String username = (String) o;
        return getStudentByUsername(username).getQuizSubmissions();
    }

    //Saves the arrays of teachers, students and quizzes objects to 3 files
    public static void saveArrayToFile(String filename, int arrayType) {
        try {
            //Saves an object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            switch (arrayType) {
                case 1:
                    for (Teacher teacher : teachers) {
                        //writes and saves the list of teachers in a file
                        out.writeObject(teacher);
                    }
                    break;
                case 2:
                    for (Student student : students) {
                        //writes and saves the list of students in a file
                        out.writeObject(student);
                    }
                    break;
                case 3:
                    for (Quiz quiz : quizzes) {
                        //writes and saves the list of courses in a file
                        out.writeObject(quiz);
                    }
                    break;
            } out.close();
            file.close();

            System.out.println();
        } catch (IOException ex) {
            System.out.println("");
        }

    }

    // loadArrayFromFile method loads the saved data from the file that we stored the data in
    public static void loadArrayFromFile(String filename, int arrayType) {
        try {
            //Saves an object in a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            switch(arrayType) {
                case 1:
                    while (true) {
                        try {
                            // stores the teachers data from the file in an object of the Teacher class
                            Teacher teacher = (Teacher) in.readObject();
                            teachers.add(teacher);
                            // catches any exceptions
                        } catch (EOFException e) {
                            break;
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        try {
                            // stores the students data from the file in an object of the Teacher class
                            Student student = (Student) in.readObject();
                            students.add(student);
                        } catch (EOFException e) {
                            break;
                            // catches a ClassNotFoundException if found
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        try {
                            // stores the quizzes data
                            Quiz quiz = (Quiz) in.readObject();
                            quizzes.add(quiz);
                        } catch (EOFException e) {
                            break;
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }

            in.close();
            file.close();
            // catches exceptions such as not being able to
            // find the files that stored the arrays of teachers, students, and courses
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    // saveProgramState method saves the data even when we end the program
    public static void saveProgramState() throws IOException {
        //create a txt file that contains the list of teachers, students, and courses
        // Serialization
        if (teachers.size() > 0)
            saveArrayToFile("teachers.txt", 1);
        if (students.size() > 0)
            saveArrayToFile("students.txt", 2);
        if (quizzes.size() > 0)
            saveArrayToFile("quizzes.txt", 3);

    }

    // loadProgramState method loads the data that was saved when a previous program was ended
    public static void loadProgramState() {
        // Reading the object from a file
        loadArrayFromFile("teachers.txt", 1);
        loadArrayFromFile("students.txt", 2);
        loadArrayFromFile("quizzes.txt", 3);

    }

    // returns the students array
    private static Object getStudents(Object o) {
        return students;
    }

    // deletes a quiz from the list of quizzes
    private static Object deleteQuiz(Object o) {
        String qName = (String) o;
        //goes through the quizzes array and removes the quiz the user wants
        for( Quiz q : quizzes ){
            if(q.getQuizName().equals(qName))
                quizzes.remove(q);
        }
        return true;
    }
}
