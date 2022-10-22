import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RegistrationLogin implements State {

    /**
     * doAction method where we grab the user input and verify their information to
     * check if they are currently a user
     */
    @Override
    public void doAction() {
        // setting file path to the csv file
        String filePath = "users.csv";

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter username");
            String user = input.nextLine();

            System.out.println("Please enter email");
            String email = input.nextLine();

            System.out.println("Please enter password");
            String pass = input.nextLine();

            // generating id number
            int id = 0;
            try {
                id = idCount(filePath);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // creating user object
            User account = new User(user, id, email, pass);

            // checking if user already has an account
            try {
                if (!verify(account.getEmail().trim(), account.getPassword().trim(), filePath)) {
                    System.out.println("You are logged in");
                } else {
                    System.out.println("Login failed. Incorrect email or password.");
                }
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
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
