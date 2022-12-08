package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import userLogin.RegistrationContext;
import userLogin.RegistrationLogin;
import userLogin.State;

class RegistrationLoginTest {

	String emailFinal = "bardia@gmail.com";
    String correctPasswordFinal = "bardia1234";
    String wrongPasswordFinal = "wrongpassword";
    String correctFilePath = "src/dataManagement/users.csv";
    String wrongFilePath = "src/dataManagement/wrongFile.csv";


	@BeforeAll
	public static void setUp(){
		RegistrationContext context = new RegistrationContext();
        State login = new RegistrationLogin();

        context.setState(login);
        context.doAction();
	}

    /**
     * Use Case 1: Test 01
     * 
	 * Checking if the user's info inputted to login is verified through the database csv files
	 * 
	 * @result the user is verified and the value returned from the method is false
	 */
	@Test
	void testAcceptedLogin() throws FileNotFoundException {
        boolean expected = RegistrationLogin.verify(emailFinal, correctPasswordFinal, correctFilePath);
        boolean actual = false;
        assertEquals(expected, actual);
	}

    /**
     * Use Case 1: Test 02
     * 
	 * Checking if the user's info inputted to login is not verified through the database csv files
	 * 
	 * @result the user is not verified and the value returned from the method is true
	 */
	@Test
	void testRejectedLogin() throws FileNotFoundException {
        boolean expected = RegistrationLogin.verify(emailFinal, wrongPasswordFinal, correctFilePath);
        boolean actual = true;
        assertEquals(expected, actual);
	}

    /**
     * Use Case 1: Test 03
     * 
	 * Checking if the value for the database csv file is incorrect
     * 
	 * @result throws a FileNotFoundException when the file path is incorrect and does not exist
	 */
	@Test
	void testIncorrectFilePath() throws FileNotFoundException {
        assertThrows(FileNotFoundException.class,
                ()->{                    
                    RegistrationLogin.verify(emailFinal, correctPasswordFinal, wrongFilePath);
                });
	}
}