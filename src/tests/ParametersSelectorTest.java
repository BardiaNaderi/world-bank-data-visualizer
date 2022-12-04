package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import userInput.ParametersSelector;

public class ParametersSelectorTest {
	
	@Test
	void recalculateWillProceedWithDefaultCountryIfNoCountrySelected() {
		ParametersSelector params = new ParametersSelector();

		String expectedCountry = "Afghanistan";
		String actualCountry = params.getCountry().value;
		assertEquals(expectedCountry, actualCountry);	
		
		boolean expected = true;
		boolean actual = params.recalculate();
		assertEquals(expected, actual);	
	}
	
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


}
