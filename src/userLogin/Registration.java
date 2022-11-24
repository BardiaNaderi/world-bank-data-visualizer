package userLogin;

import java.io.*;

import java.awt.event.*;
import javax.swing.*;

public class Registration {

    private static JButton loginButton;
    private static JButton signupButton;

    /**
     * Application method where we collect user login, verify or allow for sign up
     * This method may be modified/removed during deliverables 2 and 3
     * 
     * @param args, the command line inputs
     * @throws IOException when a file cannot be read or found
     */
    public static void executeLogin() throws IOException {
        RegistrationContext context = new RegistrationContext();
        State login = new RegistrationLogin();
        State signup = new RegistrationSignup();

        // creating the frame and panel using java swing
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        // setting the size of the frame and centering it in the users screen
        frame.setSize(200, 100);
        frame.setLocationRelativeTo(null);
        frame.add(panel);

        // creating login and sign up buttons, depending on which one is clicked the
        // correct window will be displayed
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                context.setState(login);
                context.doAction();
            }
        });
        panel.add(loginButton);

        signupButton = new JButton("Signup");
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                context.setState(signup);
                context.doAction();
            }
        });
        panel.add(signupButton);

        frame.setVisible(true);
    }
}