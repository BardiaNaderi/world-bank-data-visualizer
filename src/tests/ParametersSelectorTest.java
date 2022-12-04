package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import userInput.ParametersSelector;

public class ParametersSelectorTest {
	
	/**
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
	
	@Test
	void recalculateWillProceedWithDefaultAnalysisIfNoAnalysisSelected() {
		ParametersSelector params = new ParametersSelector();

		String expectedAnalysis = "0";
		String actualAnalysis = params.getAnalysis().value;
		assertEquals(expectedAnalysis, actualAnalysis);	
		
		boolean expected = true;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	@Test
	void recalculateWillProceedIfAnalysisIsValid() {
		ParametersSelector params = new ParametersSelector();
		params.setAnalysisValid(true);
		
		boolean expected = true;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	@Test
	void recalculateWillNotProceedIfAnalysisIsInvaild() {
		ParametersSelector params = new ParametersSelector();
		params.setAnalysisValid(false);
		
		boolean expected = false;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	@Test
	void recalculateWillProceedWithDefaultStartYearIfNoStartYearSelected() {
		ParametersSelector params = new ParametersSelector();

		String expectedStartYear = "2021";
		String actualStartYear = params.getStartYear().value;
		assertEquals(expectedStartYear, actualStartYear);	
		
		boolean expected = true;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	@Test
	void recalculateWillProceedWithDefaultEndYearIfNoEndYearSelected() {
		ParametersSelector params = new ParametersSelector();

		String expectedEndYear = "2021";
		String actualEndYear = params.getEndYear().value;
		assertEquals(expectedEndYear, actualEndYear);	
		
		boolean expected = true;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	@Test
	void recalculateWillProceedIfStartYearIsValid() {
		ParametersSelector params = new ParametersSelector();
		params.setStartYearValid(true);
		
		boolean expected = true;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
	@Test
	void recalculateWillNotProceedIfStartYearIsInvaild() {
		ParametersSelector params = new ParametersSelector();
		params.setStartYearValid(false);
		
		boolean expected = false;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
}
