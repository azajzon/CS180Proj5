package Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicLong;

public class gui {
    private static String hostName;

    // create a variable to initialize new threads with
    private static Thread thrd = null;

    // the threads are kept track of with a linked list
    private static LinkedList<Thread> list = new LinkedList<Thread>();

    // AtomicLong is a class that is synchronized, and can be used across
    // multiple threads. Here it is used for benchmarking, to store the sum
    // of the command completion times for all threads
    private static AtomicLong totalTime = new AtomicLong(0);

    // this AtomicLong is used to keep track of the current # of running threads
    private static AtomicLong runningThreads = new AtomicLong(0);
    private static boolean printOutput = true;



    public static void main(String[] args) {
        int numProcesses = 1;


        JFrame frame = new JFrame("Server.Teacher or Server.Student?");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JButton button = new JButton("Login as Server.Teacher");
        frame.getContentPane().add(button);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thrd = new Thread(new ClientThread(0, totalTime, printOutput, runningThreads));
                thrd.start(); // start the thread
                list.add(thrd);
            }
        });
    }
}
