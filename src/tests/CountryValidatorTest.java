package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import mainApplication.MainUI;
import userInput.ParametersSelector;

public class CountryValidatorTest {	
	
	/**
	 * Use Case 2: Test 01
	 * 
	 * Set the country's valid parameter to true when a valid country is selected
	 * 
	 * @result the valid parameter for the country is true when the value is valid 
	 */
	@Test
	void testCountrySetToTrueWhenValidCountrySelected() {
		ParametersSelector params = MainUI.getInstance().getParams();
		params.selectCountry("Canada");
		
        boolean expected = params.getCountry().valid;
        boolean actual = true;
        assertEquals(expected, actual);		
	}
	
	/**
	 * Use Case 2: Test 02
	 * 
	 * Set the country's valid parameter to false when an invalid country is selected
	 * 
	 * @result the valid parameter for the country is false when the value is valid 
	 */
	@Test
	void testCountrySetToFalseWhenInvalidCountrySelected() {
		ParametersSelector params = MainUI.getInstance().getParams();
		params.selectCountry("United Arab Emirates");
		
        boolean expected = params.getCountry().valid;
        boolean actual = false;
        assertEquals(expected, actual);		
	}
	
}
