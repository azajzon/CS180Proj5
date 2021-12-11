package Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/*
 * Main server class. This class includes main(), and is the class that listens
 * for incoming connections and starts ServerThreads to handle those connections
 *
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
                Server::getStudents
        };
    }


    public static Function<Object, Object>[] getCommandList() {
        return commandList;
    }

    public static void main(String[] args) throws IOException {

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

    public static Object loginTeacher(Object array) {
        // creates an object of the Teacher class
        String[] arr = (String[]) array;
        Teacher teacher = getTeacherByUsername(arr[0]);
        // checks if object is null or not
        if (teacher == null) {
            return new Exception("Invalid username.");
        } else {
            // reads the password input and checks if it's right or not
            if (!teacher.getPassword().equals(arr[1])) {
                return new Exception("Invalid password.");
            } else {
                // returns the student object
                loggedInTeachers.add(teacher);
                return true;
            }
        }
    }

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

    public static Object createTeacher(Object array) {
        String[] arr = (String[]) array;
        Teacher teacher = new Teacher(arr[0], arr[1], arr[2]);
        for(Teacher t: teachers) {
            if (teacher.getUsername().equals(t.getUsername())) {
                return false;
            }
        }
        teachers.add(teacher);
        return true;
    }

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

    public static Object createQuiz(Object inQuiz) {
        Server.quizzes.add((Quiz) inQuiz);
        return true;
    }

    public static Object getListOfQuizNames(Object o) {
        ArrayList<String> quizList = new ArrayList<>();
        for (Quiz q: quizzes) {
            quizList.add(q.getQuizName());
        }
        return quizList;
    }

    public static Object editStudentAccount(Object o) {
        String[] infoLog = (String[]) o;
        Student student = getStudentByUsername(infoLog[0]);
        student.setName(infoLog[1]);
        student.setUsername(infoLog[2]);
        student.setPassword(infoLog[3]);
        return true;
    }

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

    public static Object submitQuiz(Object o) {
        String str = "---";
        QuizSubmission qs = (QuizSubmission) o;
        int sepPos = qs.getQuizName().indexOf(str);
        String username = qs.getQuizName().substring(sepPos + str.length()).trim();

        getStudentByUsername(username).addQuizSubmission(qs);
        quizSubmissions.add(qs);
        return true;
    }

    public static Object editTeacherAccount(Object o) {
        String[] infoLog = (String[]) o;
        Teacher t = getTeacherByUsername(infoLog[0]);
        t.setName(infoLog[1]);
        t.setUsername(infoLog[2]);
        t.setPassword(infoLog[3]);
        return true;
    }

    public static Object deleteTeacherAccount(Object o) {
        Teacher t = getTeacherByUsername((String) o);
        teachers.remove(t);
        return true;
    }

    public static Object deleteStudentAccount(Object o) {
        Student s = getStudentByUsername((String) o);
        students.remove(s);
        return true;
    }

    public static Object getSubmissions(Object o) {
        String username = (String) o;
        return getStudentByUsername(username).getQuizSubmissions();
    }

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
            System.out.println("IOException is caught");
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

            System.out.print("");
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

    private static Object getStudents(Object o) {
        return students;
    }
}