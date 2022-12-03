package userLogin;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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

	@Test
	void testAcceptedLogin() throws FileNotFoundException {
        boolean expected = RegistrationLogin.verify(emailFinal, correctPasswordFinal, correctFilePath);
        boolean actual = false;
        assertEquals(expected, actual);
	}

	@Test
	void testRejectedLogin() throws FileNotFoundException {
        boolean expected = RegistrationLogin.verify(emailFinal, wrongPasswordFinal, correctFilePath);
        boolean actual = true;
        assertEquals(expected, actual);
	}

	@Test
	void testIncorrectFilePath() throws FileNotFoundException {
        assertThrows(FileNotFoundException.class,
                ()->{                    
                    RegistrationLogin.verify(emailFinal, correctPasswordFinal, wrongFilePath);
                });
	}
}