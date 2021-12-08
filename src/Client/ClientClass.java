package Client;

import Server.Question;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

// class that sends requests to the server and receives responses
public class ClientClass {

    private static String hostName = "localhost";
    private static Socket socket = null;
    private static ObjectOutputStream out = null;
    private static ObjectInputStream input = null;



        public static boolean createQuiz(String quizName, ArrayList<Question> questions) {
            boolean retVal = false;
            try {
                //creates a new Socket object and names it socket.
                //Establishes the socket connection between the client & server
                //name of the machine & the port number to which we want to connect
                socket = new Socket(hostName, 5000);

                //opens a PrintWriter on the socket input autoflush mode
                out = new ObjectOutputStream(socket.getOutputStream());

                //opens a BufferedReader on the socket
                input = new ObjectInputStream(socket.getInputStream());

                // write request body to the socket stream
                out.writeObject("command:5");
                out.writeObject("name:" + quizName);
                out.writeObject("username:" + questions); // we will change this username later to the input from gui
                // read the output from the server
                String outputString;
                while (((outputString = (String) input.readObject()) != null) && (!outputString.equals("END_MESSAGE"))) {
                    //if (printOutput) System.out.println(outputString);
                    if (outputString.contains("true"))
                        retVal = true;
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
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                //if (printOutput) System.out.println("closing");
                try {
                    socket.close();
                    System.out.flush();

                    out.close();
                    out = null;

                    input.close();
                    input = null;
                }
                catch (IOException e ) {
                    System.out.println("Couldn't close socket");
                }
            }
            return retVal;
        }

        public static boolean serverCall(String[] commands) {
            boolean retVal = false;
            try {
                //creates a new Socket object and names it socket.
                //Establishes the socket connection between the client & server
                //name of the machine & the port number to which we want to connect
                socket = new Socket(hostName, 5000);

                //opens a PrintWriter on the socket input autoflush mode
                out = new ObjectOutputStream(socket.getOutputStream());

                //opens a BufferedReader on the socket
                input = new ObjectInputStream(socket.getInputStream());

                // write request body to the socket stream
                for(String str: commands) out.writeObject(str);


                // read the output from the server
                String outputString;
                while ((outputString = (String) input.readObject()) != null) {
                    //if (printOutput) System.out.println(outputString);
                    if (outputString.contains("true"))
                        retVal = true;
                    if (outputString.contains("END_MESSAGE"))
                        break;
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
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                //if (printOutput) System.out.println("closing");
                try {
                    socket.close();
                    System.out.flush();

                    out.close();
                    out = null;

                    input.close();
                    input = null;
                }
                catch (IOException e ) {
                    System.out.println("Couldn't close socket");
                }
            }
            return retVal;
        }
}

