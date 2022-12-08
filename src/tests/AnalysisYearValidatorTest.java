package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainApplication.MainUI;
import userInput.ParametersSelector;

class AnalysisYearValidatorTest {

	/**
	 * When the selected years fall into an invalid year range for the selected analysis according to our analysisYear.csv
	 * 
	 * @result the boolean value from the getAnalysis method on the parameters showing its validity
	 */
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
	
	/**
	 * When the selected years don't fall into an invalid range for the selected analysis according to our analysisYear.csv
	 * 
	 * @result the boolean value from the getAnalysis method on the parameters showing its validity
	 */
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
	
	/**
	 * When the selected start year is greater than the selected end year
	 * 
	 * @result the boolean value from the getAnalysis method on the parameters showing its validity
	 */
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
