package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;

/* 
 * Class containing methods for taking the command string (a string with a digit 1-6)
 * received from the server and converting that into its respective Linux shell command, 
 * then executing it and returning the results.
 */
public class CommandExecutor {

	/**
	 * Runs the shell command after first using parseCommand() to determine which
	 * command to run.
	 * 
	 * @param commandString        A string containing a single digit, 1-6;
	 * @param input
	 * @return			A string containing the results of the shell command.
	 */


	static String run(String commandString, ObjectInputStream input) throws ClassNotFoundException{
		String result = "";
		try {
			if(!(commandString.startsWith("command:")))
				return "Invalid command";
			String commandStr = commandString.substring(8);
			int menuSelection = Integer.parseInt(commandStr);
			switch (menuSelection) {
				case 0:
					//login teacher, read username and password
					String inString = (String) input.readObject();
					if(!(inString.startsWith("username:")))
						throw new Exception("Invalid request no username");
					String username = inString.substring(9);
					inString = (String) input.readObject();
					if(!(inString.startsWith("password:")))
						throw new Exception("Invalid request no username");
					String password = inString.substring(9);
					result = Server.LoginTeacher(username, password);
					break;
				case 1:
					inString = (String) input.readObject();
					if(!(inString.startsWith("name:")))
						throw new Exception("Invalid request no username");
					String teacherName = inString.substring(5);
					inString = (String) input.readObject();
					if(!(inString.startsWith("username:")))
						throw new Exception("Invalid request no username");
					String teacherUsername = inString.substring(9);
					inString = (String) input.readObject();
					if(!(inString.startsWith("password:")))
						throw new Exception("Invalid request no username");
					String teacherPassword = inString.substring(9);
					result = Server.CreateTeacher(teacherName, teacherUsername, teacherPassword);
					break;
				case 2:
					inString = (String) input.readObject();
					if(!(inString.startsWith("username:")))
						throw new Exception("Invalid request no username");
					username = inString.substring(9);
					inString = (String) input.readObject();
					if(!(inString.startsWith("password:")))
						throw new Exception("Invalid request no username");
					password = inString.substring(9);
					result = Server.LoginStudent(username, password);
					break;
				case 3:
					inString = (String) input.readObject();
					if(!(inString.startsWith("name:")))
						throw new Exception("Invalid request no username");
					String studentName = inString.substring(5);
					inString = (String) input.readObject();
					if(!(inString.startsWith("username:")))
						throw new Exception("Invalid request no username");
					String studentUsername = inString.substring(9);
					inString = (String) input.readObject();
					if(!(inString.startsWith("password:")))
						throw new Exception("Invalid request no username");
					String studentPassword = inString.substring(9);
					result = Server.createStudent(studentName, studentUsername, studentPassword);
					break;
				case 4:
					inString = (String) input.readObject();
					if(!(inString.startsWith("name:")))
						throw new Exception("Invalid request no username");
					String courseName = inString.substring(5);
					result = Server.createCourse(courseName);
					break;
			}

			result = result.concat("\n");
			// add "END_MESSAGE" to the result string. When the client sees END_MESSAGE it
			// will know that the server is done sending

		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			result = "Invalid command number";
		} catch (Exception e) {
			result = e.getMessage();
		}
		result = result.concat("END_MESSAGE");
		return result;
	}

}
