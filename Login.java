import java.io.*;
import java.util.*;

public class Login {

    public static void main(String[] args) throws IOException {

        // setting file path to the csv file
        String filePath = "users.csv";

        // asking the user for their name, email and password
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter username");
            String user = input.nextLine();

            System.out.println("Please enter email");
            String email = input.nextLine();

            System.out.println("Please enter password");
            String pass = input.nextLine();

            // generating id number based on the number of lines in the file
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String x;
            int id = 0;
            while ((x = bufferedReader.readLine()) != null) {
                id++;
            }

            // creating user object
            User account = new User(user, id, email, pass);

            // checking if user already has an account, if not registering them
            if (verify(account.getEmail(), account.getPassword(), filePath)) {
                System.out.println("You are logged in");
            } else {
                File file = new File(filePath);
                try (FileWriter printWriter = new FileWriter(file, true)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(account.getName());
                    stringBuilder.append(", ");
                    stringBuilder.append(account.getId());
                    stringBuilder.append(", ");
                    stringBuilder.append(account.getEmail());
                    stringBuilder.append(", ");
                    stringBuilder.append(account.getPassword());
                    stringBuilder.append('\n');
                    printWriter.write(stringBuilder.toString());
                }
                System.out.println("You are a new user, thank you for signing up.");
            }
        }
    }

    public static boolean verify(String email, String pass, String filePath) throws FileNotFoundException {
        boolean found = false;
        String tempUser = "";
        String tempPass = "";
        Scanner x = new Scanner(new File(filePath));
        x.useDelimiter("[,\n]");

        while (x.hasNext() && !found) {
            tempUser = x.next();
            tempPass = x.next();

            if (tempUser.trim().equals(email.trim()) && tempPass.trim().equals(pass.trim())) {
                found = true;
            }
        }
        x.close();
        return (found);
    }
}