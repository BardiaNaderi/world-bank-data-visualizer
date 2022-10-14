import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) throws FileNotFoundException{
        String filePath = "users.csv";
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter username");
            String user = input.nextLine();

            System.out.println("Please enter password");
            String pass = input.nextLine();

            if(verify(user, pass, filePath)) 
                System.out.println("You are logged in");
            else
                System.out.println("Log in failed");
        }
    }

    public static boolean verify(String user, String pass, String filePath) throws FileNotFoundException{
        boolean found = false;
        String tempUser = "";
        String tempPass = "";
        Scanner x = new Scanner(new File(filePath));
        x.useDelimiter("[,\n]");

        while(x.hasNext() && !found){
            tempUser = x.next();
            tempPass = x.next();

            if(tempUser.trim().equals(user.trim()) && tempPass.trim().equals(pass.trim())){
                found = true;
            }
        }
        x.close();
        return(found);
    }



}