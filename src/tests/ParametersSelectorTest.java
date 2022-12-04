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

}
