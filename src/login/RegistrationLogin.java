package login;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import mainGUI.MainUI;

public class RegistrationLogin implements State {

    private static JLabel email;
    private static JTextField emailInput;
    private static JLabel password;
    private static JPasswordField passwordInput;
    private static JLabel empty;
    private static JButton button;

    /**
     * doAction method where we grab the user input and verify their information to
     * check if they are currently a user
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
        panel.setLayout(new GridLayout(0,2));

        // creating the labels and text fields for the user to input the values
        email = new JLabel("Email", SwingConstants.CENTER);
        panel.add(email);

        emailInput = new JTextField(20);
        panel.add(emailInput);

        password = new JLabel("Password", SwingConstants.CENTER);
        panel.add(password);

        // hidden password
        passwordInput = new JPasswordField(20);
        passwordInput.setEchoChar('*');
        panel.add(passwordInput);

        // empty label to push button into next grid box
        empty = new JLabel("");
        panel.add(empty);

        // creating login button, when clicked the user will be verified
        button = new JButton("Login");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String emailFinal = emailInput.getText();
                String passwordFinal = String.valueOf(passwordInput.getPassword());
                // setting file path to the csv file
                String filePath = "src/database/users.csv";

                // checking if user already has an account
                try {
                    if (!verify(emailFinal.trim(), passwordFinal.trim(), filePath)) {
                        frame.dispose();
                        MainUI.applicationGui();
                    } else {
                		JFrame frame = new JFrame("Invalid Credentials");
                		JOptionPane.showMessageDialog(frame, "Username or password is incorrect.",
                	               "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (FileNotFoundException x) {
                    x.printStackTrace();
                }
            }
        });
        panel.add(button);

        frame.setVisible(true);
    }

    /**
     * verify method where we authenticate the user's information and see if they
     * are already in our database, to be re-implemented using the interceptor
     * design pattern
     * 
     * @param email,    the string input of the email value
     * @param pass,     the string input of the password value
     * @param filePath, the string of the file path
     * @return false, if there are no issues with the verification and the user is
     *         already in the database
     * @throws FileNotFoundException, if the file path is not found
     */
    public static boolean verify(String email, String pass, String filePath) throws FileNotFoundException {
        Scanner x = new Scanner(new File(filePath));
        String userEmail, userPass = "";

        // looping through the CSV file, splitting the line values by the commas, and
        // checking if the 3rd and 4th value (per line) match up with the user and pass
        // inputted
        while (x.hasNextLine()) {
            String userData = x.nextLine();
            String[] userDataValues = userData.split(",");
            userEmail = userDataValues[2].trim();
            userPass = userDataValues[3].trim();

            // if values match, there are no issues and the user is already in the database
            if (userEmail.equals(email) && userPass.equals(pass)) {
                x.close();
                return false;
            }
        }
        x.close();
        return true;
    }
}
