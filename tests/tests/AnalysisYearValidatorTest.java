package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainApplication.MainUI;
import userInput.ParametersSelector;

class AnalysisYearValidatorTest {

	/**
	 * Use Case 4: Test 01
	 * 
	 * When the selected years fall into an invalid year range for the selected analysis according to our analysisYear.csv
	 * 
	 * @result the boolean value from the getAnalysis method on the parameters showing its validity
	 */
	@Test
	void testAnalysisSetToFalseWhenInvalidYearsSelected() {
		ParametersSelector params = MainUI.getInstance().getParams();
		params.selectStartYear("2000");
		params.selectEndYear("2005");
		params.selectAnalysis("0");
		
        boolean expected = params.getAnalysis().valid;
        boolean actual = false;
        assertEquals(expected, actual);		
	}
	
	/**
	 * Use Case 4: Test 02
	 * 
	 * When the selected years don't fall into an invalid range for the selected analysis according to our analysisYear.csv
	 * 
	 * @result the boolean value from the getAnalysis method on the parameters showing its validity
	 */
	@Test
	void testAnalysisSetToTrueWhenValidYearsSelected() {
		ParametersSelector params = MainUI.getInstance().getParams();
		params.selectStartYear("2005");
		params.selectEndYear("2006");
		params.selectAnalysis("0");
		
        boolean expected = params.getAnalysis().valid;
        boolean actual = true;
        assertEquals(expected, actual);		
	}
	
	/**
	 * Use Case 4: Test 03
	 * 
	 * When the selected start year is greater than the selected end year
	 * 
	 * @result the boolean value from the getAnalysis method on the parameters showing its validity
	 */
	@Test
	void testStartYearSetToFalseWhenStartYearIsGreaterThanEndYear() {
		ParametersSelector params = MainUI.getInstance().getParams();
		params.selectStartYear("2006");
		params.selectEndYear("2005");
		params.selectAnalysis("0");
		
        boolean expected = params.getStartYear().valid;
        boolean actual = false;
        assertEquals(expected, actual);		
	}

}
