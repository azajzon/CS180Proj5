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


        JFrame frame = new JFrame("Teacher or Student?");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JButton button = new JButton("Login as Teacher");
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
        JPanel panel = new JPanel();
        JLabel welcomeLabel;
        frame.add(panel);
        JLabel nameLabel;
        JTextField nameText;
        JLabel userLabel;
        JTextField userText;
        JLabel passwordLabel;
        JTextField passText;
        JButton loginButton;

        panel.setLayout(null);

        welcomeLabel = new JLabel("Create a teacher account");
        welcomeLabel.setBounds(80, 20, 200, 25);
        panel.add(welcomeLabel);

        nameLabel = new JLabel("First & Last Name:");
        nameLabel.setBounds(20, 50, 150, 25);
        panel.add(nameLabel);

        nameText = new JTextField(20);
        nameText.setBounds(150, 50, 165, 25);
        panel.add(nameText);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 80, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(150, 80, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 110, 80, 25);
        panel.add(passwordLabel);

        passText = new JTextField(20);
        passText.setBounds(150, 110, 165, 25);
        panel.add(passText);

        loginButton = new JButton("Login");
        loginButton.setBounds(30, 150, 80, 25);
        //loginButton.addActionListener(new Main());
        panel.add(loginButton);


        frame.setVisible(true);


    }
}
