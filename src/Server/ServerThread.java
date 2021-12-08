package Server;

import java.io.*;
import java.net.Socket;

/*
 * Individual ServerThread listens for the client to tell it what command to run, then
 * runs that command and sends the output of that command to the client
 *
 */
public class ServerThread extends Thread {
	Socket socket = null;
	ObjectOutputStream output = null;
	ObjectInputStream input = null;
	
	public ServerThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		System.out.print("Accepted connection. ");

		try {
			output = new ObjectOutputStream(socket.getOutputStream());

			//opens a BufferedReader on the socket
			input = new ObjectInputStream(socket.getInputStream());
			System.out.print("Reader and writer created. ");

			String command;
			// read the command from the client
			while((command = (String) input.readObject()) == null);
			System.out.println("Read command " + command);

			// run the command using CommandExecutor and get its output
			String outString = CommandExecutor.run(command, input);
			System.out.println("Server sending result to client");
			// send the result of the command to the client
			output.writeObject(outString);
		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
		finally {
			// close the connection to the client
			try {
				socket.close();
			}
			catch (IOException e) {
				e.printStackTrace();	
			}			
			System.out.println("Output closed.");
		}

	}
}

