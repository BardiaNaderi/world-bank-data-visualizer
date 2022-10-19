import java.io.*;
import java.util.*;

public class Login {

    /**
     * main method where we collect user login, verify or allow for sign up
     * 
     * @param args, the command line inputs
     * @throws IOException when a file cannot be read or found
     */
    public static void main(String[] args) throws IOException {

        // setting file path to the csv file
        String filePath = "users.csv";

        // asking the user for their username, email and password
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter username");
            String user = input.nextLine();

            System.out.println("Please enter email");
            String email = input.nextLine();

            System.out.println("Please enter password");
            String pass = input.nextLine();

            // generating id number
            int id = idCount(filePath);

            // creating user object
            User account = new User(user, id, email, pass);

            // checking if user already has an account, if not asking if they want to be registered
            if (!verify(account.getEmail().trim(), account.getPassword().trim(), filePath)) {
                System.out.println("You are logged in");
            } else {
                System.out.println("You are not already a user.");
                System.out.println("Would you like to register? Y/N");
                String register = input.nextLine();

                // if they want to be registered, sign up the user
                if (register.toLowerCase() == "yes" || register.toLowerCase() != "y") {
                    signUp(account, filePath);
                    System.out.println("You are a new user, thank you for signing up.");
                } else {
                    System.out.println("Bye.");
                }
            }
        }
    }

    /**
     * idCount method where generate the id value for the user by counting the number of lines in the CSV file
     * 
     * @param filePath, the string of the file path
     * @return id, id value as an integer to be used for creating the user
     * @throws FileNotFoundException, if the scanner runs into issues finding the file with the given file path
     */
    public static int idCount(String filePath) throws FileNotFoundException {
        // scan the file and initialize the id value
        Scanner data = new Scanner(new File(filePath));
        int id = 0;

        //while loop through the text file and increase id counter after each line
        while (data.hasNextLine()) {
            data.nextLine();
            id++;
        }
        return id;
    }

    /**
     * signUp method where we take the user's inputted value, and add them to our database (CSV file)
     * 
     * @param account, User type where we can access the newly created user's object values
     * @param filePath, the string of the file path
     * @throws IOException, if the file path does not lead to a writeable file
     */
    public static void signUp(User account, String filePath) throws IOException {
        File file = new File(filePath);

        //using StringBuilder to create the line that will be added to the CSV file piece by piece
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

    /**
     * verify method where we authenticate the user's information and see if they are already in our database, to be re-implemented using the interceptor design pattern
     * 
     * @param email, the string input of the email value
     * @param pass, the string input of the password value
     * @param filePath, the string of the file path
     * @return false, if there are no issues with the verification and the user is already in the database
     * @throws FileNotFoundException, if the file path is not found
     */
    public static boolean verify(String email, String pass, String filePath) throws FileNotFoundException {
        Scanner x = new Scanner(new File(filePath));
        String userEmail, userPass = "";

        // looping through the CSV file, splitting the line values by the commas, and checking if the 3rd and 4th value (per line) match up with the user and pass inputted
        while (x.hasNextLine()) {
            String userData = x.nextLine();
            String[] userDataValues = userData.split(",");
            userEmail = userDataValues[2].trim();
            userPass = userDataValues[3].trim();

            //if values match, there are no issues and the user is already in the database
            if (userEmail.equals(email) && userPass.equals(pass)) {
                x.close();
                return false;
            }
        }
        x.close();
        return true;
    }
}