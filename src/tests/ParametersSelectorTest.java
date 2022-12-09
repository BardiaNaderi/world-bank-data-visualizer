package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import userInput.ParametersSelector;

public class ParametersSelectorTest {
	
	/**
	 * Use Case 2: Test 03
	 * 
	 * The recalculate method will proceed with the default country if a user
	 * presses the button without selecting a country from the drop down menu
	 * 
	 * @result the country saved to the ParametersSelecter will match the default
	 * county and the recalculate method will return true
	 */
	@Test
	void testRecalculateWillProceedWithDefaultCountryIfNoCountrySelected() {
		ParametersSelector params = new ParametersSelector();

		String expectedCountry = "Afghanistan";
		String actualCountry = params.getCountry().value;
		assertEquals(expectedCountry, actualCountry);	
		
		boolean expected = true;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 2: Test 04
	 * 
	 * The recalculate method will proceed if the selected country's valid parameter 
	 * has been set to true
	 * 
	 * @results the recalculate method will return true when the country is valid
	 */
	@Test
	void testRecalculateWillProceedIfCountryIsValid() {
		ParametersSelector params = new ParametersSelector();
		params.setCountryValid(true);
		
		boolean expected = true;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 2: Test 05
	 * 
	 * The recalculate method will not proceed if the selected country's valid parameter 
	 * has been set to false
	 * 
	 * @results the recalculate method will return false when the country is invalid
	 */
	@Test
	void testRecalculateWillNotProceedIfCountryIsInvaild() {
		ParametersSelector params = new ParametersSelector();
		params.setCountryValid(false);
		
		boolean expected = false;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 3: Test 10
	 * 
	 * Checking if the default value for analysis is used when no analysis is selected and the recalculate method proceeds
	 * 
	 * @result the recalculate method will return true when the default analysis value is used
	 */
	@Test
	void testRecalculateWillProceedWithDefaultAnalysisIfNoAnalysisSelected() {
		ParametersSelector params = new ParametersSelector();

		String expectedAnalysis = "0";
		String actualAnalysis = params.getAnalysis().value;
		assertEquals(expectedAnalysis, actualAnalysis);	
		
		boolean expected = true;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 3: Test 11
	 * 
	 * Checking if the value selected for analysis is valid and the recalculate method proceeds
	 * 
	 * @result the recalculate method will return true when the analysis value selected is valid
	 */
	@Test
	void testRecalculateWillProceedIfAnalysisIsValid() {
		ParametersSelector params = new ParametersSelector();
		params.setAnalysisValid(true);
		
		boolean expected = true;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 3: Test 12
	 * 
	 * Checking if the value selected for analysis is not valid and the recalculate method does not proceed
	 * 
	 * @result the recalculate method will return false when the analysis value selected is invalid
	 */
	@Test
	void testRecalculateWillNotProceedIfAnalysisIsInvaild() {
		ParametersSelector params = new ParametersSelector();
		params.setAnalysisValid(false);
		
		boolean expected = false;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 4: Test 04
	 * 
	 * Checking if the default value for start year is used when no start year is selected and the recalculate method proceeds
	 * 
	 * @result the recalculate method will return true when the default start year value is used
	 */
	@Test
	void testRecalculateWillProceedWithDefaultStartYearIfNoStartYearSelected() {
		ParametersSelector params = new ParametersSelector();

		String expectedStartYear = "2021";
		String actualStartYear = params.getStartYear().value;
		assertEquals(expectedStartYear, actualStartYear);	
		
		boolean expected = true;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 4: Test 05
	 * 
	 * Checking if the default value for end year is used when no end year is selected and the recalculate method proceeds
	 * 
	 * @result the recalculate method will return true when the default end year value is used
	 */
	@Test
	void testRecalculateWillProceedWithDefaultEndYearIfNoEndYearSelected() {
		ParametersSelector params = new ParametersSelector();

		String expectedEndYear = "2021";
		String actualEndYear = params.getEndYear().value;
		assertEquals(expectedEndYear, actualEndYear);	
		
		boolean expected = true;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 4: Test 06
	 * 
	 * Checking if the value selected for start year is valid and the recalculate method proceeds
	 * 
	 * @result the recalculate method will return true when the start year value selected is valid
	 */
	@Test
	void testRecalculateWillProceedIfStartYearIsValid() {
		ParametersSelector params = new ParametersSelector();
		params.setStartYearValid(true);
		
		boolean expected = true;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 4: Test 07
	 * 
	 * Checking if the value selected for start year is invalid and the recalculate method does not proceed
	 * 
	 * @result the recalculate method will return false when the start year value selected is invalid
	 */
	@Test
	void testRecalculateWillNotProceedIfStartYearIsInvalid() {
		ParametersSelector params = new ParametersSelector();
		params.setStartYearValid(false);
		
		boolean expected = false;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
}
