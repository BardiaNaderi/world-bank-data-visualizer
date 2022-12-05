package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

import mainApplication.MainUI;
import userInput.ParametersSelector;
import userLogin.RegistrationLogin;

class AnalysisValidatorTest {

	@Test
	void analysisSetToTrueWhenValidAnalysisSelected() {
		ParametersSelector params = MainUI.getInstance().getParams();
		params.selectAnalysis("0");
		
        boolean expected = params.getAnalysis().valid;
        boolean actual = true;
        assertEquals(expected, actual);		
	}
	
	@Test
	void analysisThrowsExceptionWhenInvalidAnalysisSelected() {
		ParametersSelector params = MainUI.getInstance().getParams();
			
        assertThrows(IndexOutOfBoundsException.class,
                ()->{                    
            		params.selectAnalysis("-1");
                });
	}
}
