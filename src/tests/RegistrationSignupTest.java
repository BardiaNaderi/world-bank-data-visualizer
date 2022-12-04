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