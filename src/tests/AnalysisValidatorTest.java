package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainApplication.MainUI;
import userInput.ParametersSelector;

class AnalysisValidatorTest {

	@Test
	void analysisSetToTrueWhenValidAnalysisSelected() {
		ParametersSelector params = MainUI.getInstance().getParams();
		params.selectAnalysis("0");
		
        boolean expected = params.getAnalysis().valid;
        boolean actual = true;
        assertEquals(expected, actual);		
	}
}
