package userLogin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import mainApplication.MainUI;

public class RegistrationSignup implements State {

    private static JLabel username;
    private static JTextField usernameInput;
    private static JLabel email;
    private static JTextField emailInput;
    private static JLabel password;
    private static JPasswordField passwordInput;
    private static JLabel empty;
    private static JButton button;

    /**
     * doAction method to grab user input and sign them up and add their information
     * to the database
     */
    @Override
    public void doAction() {

        // creating the frame and panel using java swing
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        // setting the size of the frame and centering it in the users screen
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        panel.setLayout(new GridLayout(0, 2));

        // creating the labels and text fields for the user to input the values
        username = new JLabel("Username", SwingConstants.CENTER);
        panel.add(username);

        usernameInput = new JTextField(20);
        panel.add(usernameInput);

        email = new JLabel("Email", SwingConstants.CENTER);
        panel.add(email);

        emailInput = new JTextField(20);
        panel.add(emailInput);

        password = new JLabel("Password", SwingConstants.CENTER);
        panel.add(password);

        passwordInput = new JPasswordField(20);
        passwordInput.setEchoChar('*');
        panel.add(passwordInput);

        // empty label to push button into next grid box
        empty = new JLabel("");
        panel.add(empty);

        // creating sign up button, when clicked the user will be signed up and added to the csv file
        button = new JButton("Sign Up");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usernameFinal = usernameInput.getText();
                String emailFinal = emailInput.getText();
                String passwordFinal = String.valueOf(passwordInput.getPassword());
                // setting the file path to the csv file
                String filePath = "src/dataManagement/users.csv";

                // generating id number
                int id = 0;
                try {
                    id = idCount(filePath);
                } catch (FileNotFoundException x) {
                    x.printStackTrace();
                }

                // creating user object
                User account = new User(usernameFinal, id, emailFinal, passwordFinal);

                // sign up the user
                try {
                    writeToDB(account, filePath);
                } catch (IOException x) {
                    x.printStackTrace();
                }
                frame.dispose();
                MainUI.applicationGui();
            }
        });
        panel.add(button);

        frame.setVisible(true);
    }

    /**
     * idCount method where generate the id value for the user by counting the
     * number of lines in the CSV file
     * 
     * @param filePath, the string of the file path
     * @return id, id value as an integer to be used for creating the user
     * @throws FileNotFoundException, if the scanner runs into issues finding the
     *                                file with the given file path
     */
    public static int idCount(String filePath) throws FileNotFoundException {
        // scan the file and initialize the id value
        Scanner data = new Scanner(new File(filePath));
        int id = 0;

        // while loop through the text file and increase id counter after each line
        while (data.hasNextLine()) {
            data.nextLine();
            id++;
        }
        return id;
    }

    /**
     * writeToDB method where we take the user's inputted value, and add them to our
     * database (CSV file)
     * 
     * @param account,  User type where we can access the newly created user's
     *                  object values
     * @param filePath, the string of the file path
     * @throws IOException, if the file path does not lead to a writeable file
     */
    public static void writeToDB(User account, String filePath) throws IOException {
        File file = new File(filePath);

        // using StringBuilder to create the line that will be added to the CSV file
        // piece by piece
        try (FileWriter fw = new FileWriter(file, true)) {
            StringBuilder sb = new StringBuilder();
            sb.append(account.getName());
            sb.append(", ");
            sb.append(account.getId());
            sb.append(", ");
            sb.append(account.getEmail());
            sb.append(", ");
            sb.append(account.getPassword());
            sb.append('\n');
            fw.write(sb.toString());
        }
    }
}
