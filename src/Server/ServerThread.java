package Server;

import java.io.*;
import java.net.Socket;
import Server.*;

/**
 * Project 4 - ServerThread.java
 * <p>
 * The ServerThread.java listens for the client to tell it what command to run, then runs that command and sends the
 * output of that command to the client.
 *
 * @author Aarohi Panzade, Abel Zazjon, Aditi Barla, and Yaseen Shady 039
 *
 * @version 12/12/21
 */

public class ServerThread extends Thread {

    //initialzes variables
    Socket socket;
    ObjectOutputStream output = null;
    ObjectInputStream input = null;

    // constructor that constructs a newly allocated ServerThread object with the field values specified by the input parameters.
    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    // Reads the command line from the client using Bufferedreader and then closes the client
    public void run() {
        System.out.print("Accepted connection. ");

        try {
            output = new ObjectOutputStream(socket.getOutputStream());

            //opens a BufferedReader on the socket
            input = new ObjectInputStream(socket.getInputStream());
            System.out.print("Reader and writer created. ");

            // read the command from the client
            int command = input.readInt();
            System.out.println("Read command " + command);


            Object outObject = Server.getCommandList()[command].apply(input.readObject());
            System.out.println("Server sending result to client");
            // send the result of the command to the client
            output.writeObject(outObject);

            output.close();
            input.close();
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


