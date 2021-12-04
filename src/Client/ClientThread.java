package Client;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.ConnectException;
import java.util.concurrent.atomic.AtomicLong;


public class ClientThread extends Thread {
	// every clientThread is passed which command to send to the server
	int menuSelection;
	Object threadParams;
	// every clientThread is passed the hostname of the server to connect to
	String hostName = "localhost";
	Socket socket = null; 
	
	// totalTime is used to keep the sum of response times for all threads. after all threads
	// have completed it is divided by the total number of threads to get an 
	// average response time
	AtomicLong totalTime;

	// runningThreads is the total number of running threads. it is set to numThreads (the number
	// of threads that are started) before any threads are started by the Client class. Every time
	// a ClientThread finishes it will decrement runningThreads by one, so runningThreads == 0 when
	// all threads have finished
	AtomicLong runningThreads;

	// each class is passed false for printOutput if the number of threads started is > 1. When running more
	// than one client thread the clientThreads should not print output, input order to not clutter the screen
	boolean printOutput;


	ClientThread(int menuSelection, Object threadParameters) {
		this.menuSelection = menuSelection;
		this.threadParams = threadParameters;
	}

	public void run() {
		PrintWriter out = null;
		BufferedReader input = null;
		try {
			//creates a new Socket object and names it socket.
			//Establishes the socket connection between the client & server
			//name of the machine & the port number to which we want to connect
			socket = new Socket(hostName, 5000);
			//opens a PrintWriter on the socket input autoflush mode
			out = new PrintWriter(socket.getOutputStream(), true);

			//opens a BufferedReader on the socket
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));


			// send the command to the server
			sendCommandToServer(menuSelection, threadParams, out);

			//if (printOutput) System.out.println("Sent output");

			// read the output from the server
			String outputString;
			while (((outputString = input.readLine()) != null) && (!outputString.equals("END_MESSAGE"))) {
				//if (printOutput) System.out.println(outputString);
				if (outputString.contains("true")) {
					//TODO message box that says login successful.
					JOptionPane.showMessageDialog(null, "Login Successful.", "Login", JOptionPane.INFORMATION_MESSAGE);

				} else {
					//TODO message box incorrect username/password
					JOptionPane.showMessageDialog(null, "Login Failed.", "Login", JOptionPane.WARNING_MESSAGE);

				}
			}

		}
		catch (UnknownHostException e) {
			System.err.println("Unknown host: " + hostName);
			System.exit(1);
		}
		catch (ConnectException e) {
			System.err.println("Connection refused by host: " + hostName);
			System.exit(1);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		// finally, close the socket and decrement runningThreads
		finally {
			if (printOutput) System.out.println("closing");
			try {
				socket.close();
				//runningThreads.decrementAndGet();
				System.out.flush();
			}
			catch (IOException e ) {
				System.out.println("Couldn't close socket");
			}
		}

	}


	public void sendCommandToServer(int menuSelection, Object threadParameters, PrintWriter out) {
		//0) login teacher
		switch (menuSelection) {
			case 0: { //this formats the request sent to the server in the observable order: "command: #", new line, "username: " newline "password: "
				LoginTeacherParams loginTeacherParameters = LoginTeacherParams.class.cast(threadParameters);
				loginTeacherParameters.formatLoginTeacherRequest(out);
			}
				break;
			case 1: {
				CreateTeacherParams createTeacherParameters = CreateTeacherParams.class.cast(threadParameters);
				createTeacherParameters.formatCreateTeacherRequest(out);
				break;
			}
			case 2: {
				LoginStudentParams loginStudentParameters = LoginStudentParams.class.cast(threadParameters);
				loginStudentParameters.formatLoginStudentRequest(out);
			}
				break;
			case 3: {
				CreateStudentParams createStudentParameters = CreateStudentParams.class.cast(threadParameters);
				createStudentParameters.formatCreateStudentRequest(out);
			}
				break;
			default:
				break;
		}
	}




}
