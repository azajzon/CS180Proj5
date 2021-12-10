package Client;

import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

// class that sends requests to the server and receives responses
public class ClientClass {

    private static String hostName = "localhost";
    private static Socket socket = null;
    private static ObjectOutputStream out = null;
    private static ObjectInputStream input = null;


    public static Object serverCall(int command, Object objToSend) {
        Object retVal = null;
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
            out.writeInt(command);
            out.writeObject(objToSend);

            // read the output from the server
            Object in = input.readObject();
            if (in instanceof Exception) throw (Exception) in;
            else if (!switch (command) {
                case 0, 1, 2, 3, 4, 5, 8 -> {
                    if (!(in instanceof Boolean)) yield false;
                    retVal = in;
                    yield true;
                }
                case 6 -> {
                    if (!(in instanceof ArrayList)) yield false;
                    retVal = in;
                    yield true;
                }
                case 7 -> {
                    if (!(in instanceof Server.Quiz)) yield false;
                    retVal = in;
                    yield true;
                }
                case 9 -> {
                    if (!(in instanceof ArrayList)) yield false;
                    retVal = in;
                    yield true;
                }
                default -> false;
            }) throw new IOException("Invalid response");
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + hostName);
            System.exit(1);
        } catch (ConnectException e) {
            System.err.println("Connection refused by host: " + hostName);
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // finally, close the socket and decrement runningThreads
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Project 5", JOptionPane.WARNING_MESSAGE);
        } finally {
            //if (printOutput) System.out.println("closing");
            try {
                socket.close();
                System.out.flush();

                out.close();
                out = null;

                input.close();
                input = null;
            } catch (IOException e) {
                System.out.println("Couldn't close socket");
            }
        }
        return retVal;
    }


}