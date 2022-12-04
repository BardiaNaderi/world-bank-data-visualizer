package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import userInput.ParametersSelector;

public class ParametersSelectorTest {
	
	@Test
	void recalculateWillProceedIfCountryIsValid() {
		ParametersSelector params = new ParametersSelector();
		params.setCountryValid(true);
		
		boolean expected = true;
		boolean actual = params.recalculate();
		
		assertEquals(expected, actual);	
	}
	
	@Test
	void recalculateWillNotProceedIfCountryIsInvaild() {
		ParametersSelector params = new ParametersSelector();
		params.setCountryValid(false);
		
		boolean expected = false;
		boolean actual = params.recalculate();
		
		assertEquals(expected, actual);	
	}

}
