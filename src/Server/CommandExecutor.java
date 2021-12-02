package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
	 * @param commandString		A string containing a single digit, 1-6;
	 * @return			A string containing the results of the shell command.
	 */


	static String run(String commandString, BufferedReader input) {
		String result = "";
		try {
			if(!(commandString.startsWith("command:")))
				return "Invalid command";
			String commandStr = commandString.substring(8);
			int menuSelection = Integer.parseInt(commandStr);
			switch (menuSelection) {
				case 0:
					//login teacher, read username and password
					String inString = input.readLine();
					if(!(inString.startsWith("username:")))
						return "Invalid request no username";
					String username = inString.substring(9);
					inString = input.readLine();
					if(!(inString.startsWith("password:")))
						return "Invalid request no password";
					String password = inString.substring(9);
					result = Server.LoginTeacher(username, password);
					break;
				case 1:
					inString = input.readLine();
					if(!(inString.startsWith("name:")))
						return "Invalid request no username";
					String teacherName = inString.substring(5);
					inString = input.readLine();
					if(!(inString.startsWith("username:")))
						return "Invalid request no username";
					String teacherUsername = inString.substring(9);
					inString = input.readLine();
					if(!(inString.startsWith("password:")))
						return "Invalid request no password";
					String teacherPassword = inString.substring(9);
					result = Server.CreateTeacher(teacherName, teacherUsername, teacherPassword);
					break;
			}

			result = result.concat("\n");
			// add "END_MESSAGE" to the result string. When the client sees END_MESSAGE it
			// will know that the server is done sending
			result = result.concat("END_MESSAGE");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			result = "Invalid command number";
		}
		return result;
	}

}
