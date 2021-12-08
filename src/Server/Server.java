package Server;

import java.io.IOException;
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
                Server::createQuiz
        };
    }

    public static Function<Object, Object>[] getCommandList() {
        return commandList;
    }

    public static void main(String[] args) {
        teachers = new CopyOnWriteArrayList<>();
        students = new CopyOnWriteArrayList<>();
        courses = new CopyOnWriteArrayList<>();
        quizzes = new CopyOnWriteArrayList<>();
        loggedInStudents = new CopyOnWriteArrayList<>();
        loggedInTeachers = new CopyOnWriteArrayList<>();

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
        students.add(student);
        return true;
    }

    public static Object createQuiz(Object inQuiz) {
        Server.quizzes.add((Quiz) inQuiz);
        return true;
    }


}

