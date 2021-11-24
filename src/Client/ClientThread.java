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

	// startTime and endTime are used to keep track of the current time when the thread conects to the 
	// server and when the thread gets a response from the server. The difference between the two
	// (endTime - startTime) is the response time
	long startTime;
	long endTime;

	ClientThread(int menuSelection, AtomicLong totalTime, boolean printOutput, AtomicLong runningThreads) {
		this.menuSelection = menuSelection;
		this.totalTime = totalTime;
		this.printOutput = printOutput;
		this.runningThreads = runningThreads;
	}

	public void sendCommandToServer(int menuSelection, PrintWriter out) {
		//0) login teacher
		//1) login student
		//2) create teacher
		switch (menuSelection) {
			case 0: //this formats the request sent to the server in the observable order: "command: #", new line, "username: " newline "password: "
				out.println("command:1");
				out.println("username:" + "azajzon"); // we will change this username later to the input from gui
				out.println("password:" + "a");
				break;
			case 1:
				out.println("command:2");
				break;
			case 2:
				out.println("command:3");
				out.println("name:abel zajzon");
				out.println("username:az");
				out.println("password:a");
			default:
				break;
		}
	}

	public void readCommandResultsFromServer(int menuSelection, BufferedReader input) throws IOException {
		String outputString;
		/*while (((outputString = input.readLine()) != null) && (!outputString.equals("END_MESSAGE"))) {
			if (printOutput) System.out.println(outputString);
		}*/
	}

	public void run() {
		PrintWriter out = null;
		BufferedReader input = null;
		try {
			//creates a new Socket object and names it socket.
			//Establishes the socket connection between the client & server
			//name of the machine & the port number to which we want to connect
			socket = new Socket(hostName, 5000);
			if (printOutput) {
				//System.out.print("Establishing connection.");
			}
			//opens a PrintWriter on the socket input autoflush mode
			out = new PrintWriter(socket.getOutputStream(), true);

			//opens a BufferedReader on the socket
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//if (printOutput) System.out.println("\nRequesting output for the '" + menuSelection + "' command from " + hostName);

			// get the current time (before sending the request to the server)
			startTime = System.currentTimeMillis();

			// send the command to the server
			sendCommandToServer(0, out);

			//if (printOutput) System.out.println("Sent output");

			// read the output from the server
			String outputString;
			while (((outputString = input.readLine()) != null) && (!outputString.equals("END_MESSAGE"))) {
				//if (printOutput) System.out.println(outputString);
				if (outputString.contains("true")) {
					//TODO message box that says login successful.
					JOptionPane.showMessageDialog(null, "Login Successful.", "Login",JOptionPane.INFORMATION_MESSAGE);

				}
				else {
					//TODO message box incorrect username/password
					JOptionPane.showMessageDialog(null, "Login Failed.", "Login",JOptionPane.WARNING_MESSAGE);

				}
			}

			// get the current time (after connecting to the server)
			endTime = System.currentTimeMillis();
			// endTime - startTime = the time it took to get the response from the sever
			totalTime.addAndGet(endTime - startTime);

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
				runningThreads.decrementAndGet();
				System.out.flush();
			}
			catch (IOException e ) {
				System.out.println("Couldn't close socket");
			}
		}

	}

}
