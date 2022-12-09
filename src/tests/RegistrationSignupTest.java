package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import userLogin.RegistrationContext;
import userLogin.RegistrationLogin;
import userLogin.RegistrationSignup;
import userLogin.State;
import userLogin.User;

class RegistrationSignupTest {
        
    String usernameFinal = "Roberto";
    String emailFinal = "roberto@gmail.com";
    String passwordFinal = "roberto1234";
    String filePath = "src/dataManagement/signUpTest.csv";
    int id = 0;
        
        @BeforeAll
        public static void setUp() {
                RegistrationContext context = new RegistrationContext();
        State signup = new RegistrationSignup();
        
        context.setState(signup);
        context.doAction();
        }

        /**
         * Use Case 1: Test 04
         * 
         * Checking if the user object is created with the correct values when all of the values are inputted
         * 
         * @result returns true when all of the values in the user object match the values inputted by the user
	 	*/
        @Test
        void testUserCreation() throws FileNotFoundException {
        User account = new User(usernameFinal, id, emailFinal, passwordFinal);
        boolean expected;
        
        if(account.getName() == "Roberto" && account.getEmail() == "roberto@gmail.com" && account.getPassword() == "roberto1234") {
                expected = true;
        }
        else {
                expected = false;
        }
        
        boolean actual = true;
        assertEquals(expected, actual);
        }

        /**
         * Use Case 1: Test 05
         * 
         * Checking if the values of the user object are written to the database and the account is created
         * 
         * @result returns false if the account is verified that it is stored in the database after being written with the correct values
	 	*/
        @Test
        void testWriteToDatabase() throws IOException {
        id = RegistrationSignup.idCount(filePath);
        User account = new User(usernameFinal, id, emailFinal, passwordFinal);
        
        RegistrationSignup.writeToDB(account, filePath);
        
        boolean expected = RegistrationLogin.verify(account.getEmail(), account.getPassword(), filePath);
        
        boolean actual = false;
        
        PrintWriter pw = new PrintWriter(filePath);
        pw.close();

        assertEquals(expected, actual);
        }
}