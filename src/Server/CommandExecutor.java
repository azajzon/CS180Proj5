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
		String line;
		try {
			if(!(commandString.substring(0, 8).equals("command:")))
				return "Invalid command";
			String commandStr = commandString.substring(9);
			int menuSelection = Integer.parseInt(commandStr);

			switch (menuSelection) {
				case 0:
					//login teacher, read username and password
					String inString = input.readLine();
					if(!(inString.substring(0, 9).equals("username:")))
						return "Invalid request no username";
					String username = inString.substring(9);
					inString = input.readLine();
					if(!(inString.substring(0, 9).equals("password:")))
						return "Invalid request no password";
					String password = inString.substring(9);
					result = Server.LoginTeacher(username, password);
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

	/**
	 * Converts the digit string into its respective shell command.
	 * 
	 * @param inputString		A string containing a single digit, 1-6;
	 * @return			A string containing the shell command to run		
	 */
	static String parseCommand(String inputString) {
		int inputInt = Integer.parseInt(inputString);
		String commandString = "";
		switch (inputInt) {
			// Date
			case 1:
				commandString = "date";
				break;

				// Uptime
			case 2:
				commandString = "uptime";
				break;

				// Memory use
			case 3:
				commandString = "free";
				break;

				// netstat
			case 4:
				commandString = "netstat";
				break;

				// current users
			case 5:
				commandString = "who";
				break;

				// running processes
			case 6:
				commandString = "ps -e";
				break;
		}

		return commandString;
	}
}
