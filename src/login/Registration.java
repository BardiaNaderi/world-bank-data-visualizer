package login;
import java.io.*;
import java.util.*;

public class Registration {
	
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

        // asking the user for their username, email and password
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("1 - Login");
            System.out.println("2 - Sign Up");
            System.out.println("-----------");
            System.out.print("Your selected option is: ");
            String state = input.nextLine();

            if (state.equals("1")) {
                context.setState(login);
                context.doAction();
            } else if (state.equals("2")) {
                context.setState(signup);
                context.doAction();
            } else {
                System.out.println("Selected option not available.");
            }
        }
    }
}