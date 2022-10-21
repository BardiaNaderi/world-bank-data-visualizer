import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistrationSignup implements State {

    /**
     * doAction method to grab user input and sign them up and add their information
     * to the database
     */
    @Override
    public void doAction() {
        // setting the file path to the csv file
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

            // sign up the user
            try {
                writeToDB(account, filePath);
            } catch (IOException e) {
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
