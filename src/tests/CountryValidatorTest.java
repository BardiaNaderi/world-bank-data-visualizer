package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import mainApplication.MainUI;
import userInput.ParametersSelector;

public class CountryValidatorTest {	
	
	@Test
	void countrySetToTrueWhenValidCountrySelected() {
		ParametersSelector params = MainUI.getInstance().getParams();
		params.selectCountry("Canada");
		
        boolean expected = params.getCountry().valid;
        boolean actual = true;
        assertEquals(expected, actual);		
	}
	
	@Test
	void countrySetToFalseWhenInvalidCountrySelected() {
		ParametersSelector params = MainUI.getInstance().getParams();
		params.selectCountry("United Arab Emirates");
		
        boolean expected = params.getCountry().valid;
        boolean actual = false;
        assertEquals(expected, actual);		
	}
	
}
