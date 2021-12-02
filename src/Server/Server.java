package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

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
	// sets the loggedInTeacher Server.Teacher object and loggedInStudent Server.Student object to null
	static CopyOnWriteArrayList<Teacher> loggedInTeachers;
	static CopyOnWriteArrayList<Student> loggedInStudents;
	public static void main(String[] args) {
		teachers = new CopyOnWriteArrayList<>();
		students = new CopyOnWriteArrayList<>();
		courses = new CopyOnWriteArrayList<>();
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
			while(true) {
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
		}
		catch (IOException ioe){
			ioe.printStackTrace();
		}
	}

	public static String LoginTeacher(String username, String password) {
		// creates an object of the Teacher class
		Teacher teacher = getTeacherByUsername(username);
		// checks if object is null or not
		if (teacher == null) {
			return "Invalid username.";
		} else {
			// reads the password input and checks if it's right or not
			if (!teacher.getPassword().equals(password)) {
				return "Incorrect password.";
			} else {
				// returns the student object
				loggedInTeachers.add(teacher);
				return "Success!";
			}
		}
	}

	public static Teacher getTeacherByUsername(String username) {
		Iterator<Teacher> it = teachers.iterator();
		while(it.hasNext()) {
			Teacher teacher = it.next();
			if (teacher.getUsername().equals(username)) {
				return teacher;
			}
		}
		return null;
	}

	public static String CreateTeacher(String teacherName, String teacherUsername, String teacherPassword) {
		Teacher teacher = new Teacher(teacherName, teacherUsername, teacherPassword);
		teachers.add(teacher);
		return "Success";
	}


}

