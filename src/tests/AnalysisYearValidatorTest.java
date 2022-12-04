package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainApplication.MainUI;
import userInput.ParametersSelector;

class AnalysisYearValidatorTest {

	@Test
	void analysisSetToFalseWhenInvalidAnalysisSelected() {
		ParametersSelector params = MainUI.getInstance().getParams();
		params.selectStartYear("2000");
		params.selectEndYear("2005");
		params.selectAnalysis("0");
		
        boolean expected = params.getAnalysis().valid;
        boolean actual = false;
        assertEquals(expected, actual);		
	}
	
	@Test
	void analysisSetToTrueWhenValidAnalysisSelected() {
		ParametersSelector params = MainUI.getInstance().getParams();
		params.selectStartYear("2005");
		params.selectEndYear("2006");
		params.selectAnalysis("0");
		
        boolean expected = params.getAnalysis().valid;
        boolean actual = true;
        assertEquals(expected, actual);		
	}
	
	@Test
	void analysisSetToFalseWhenStartYearIsGreaterThanEndYear() {
		ParametersSelector params = MainUI.getInstance().getParams();
		params.selectStartYear("2006");
		params.selectEndYear("2005");
		params.selectAnalysis("0");
		
        boolean expected = params.getStartYear().valid;
        boolean actual = false;
        assertEquals(expected, actual);		
	}

}
