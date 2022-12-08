package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.google.gson.JsonArray;

import analysisGenerator.EducationExpenditureAverage;
import analysisGenerator.ForestAreaAverage;
import calculations.Average;
import dataManagement.DataFetcher;
import mainApplication.MainUI;

public class AverageTest {
	
	/**
	 * Use Case 7: Test 05
	 * 
	 * Test to ensure that the correct Map values are returned after the Average
	 * calculations are performed on the EducationExpenditureAverage analysis
	 * 
	 * @results the Map returned from the analysis matches the manually calculated values
	 */
	@Test
	public void testCorrectValuesAreReturnedForEducationExpenditureAverage() {
		MainUI.getInstance().getParams().selectStartYear("2010");
		MainUI.getInstance().getParams().selectEndYear("2010");
		
		Average strategy = new Average();
		EducationExpenditureAverage analysis = 
				new EducationExpenditureAverage("CAN", 2010, 2010);

		String[] code = {"SE.XPD.TOTL.GD.ZS"};	
		JsonArray[] data = {DataFetcher.getFetcher().fetchData(analysis, code)};
		
		Map<Integer, Float> actual = strategy.execute(data);
		Map<Integer, Float> expected = new HashMap<Integer, Float>();;
		expected.put(2010, (float) 5.35637);

		assertEquals(expected, actual);
	}
	
	/**
	 * Use Case 7: Test 06
	 * 
	 * Test to ensure that the correct Map values are returned after the Average
	 * calculations are performed on the ForestAreaAverage analysis
	 * 
	 * @results the Map returned from the analysis matches the manually calculated values
	 */
	@Test
	public void testCorrectValuesAreReturnedForForestAreaAverage() {
		MainUI.getInstance().getParams().selectStartYear("2010");
		MainUI.getInstance().getParams().selectEndYear("2010");
		
		Average strategy = new Average();
		ForestAreaAverage analysis = 
				new ForestAreaAverage("CAN", 2010, 2010);

		String[] code = {"AG.LND.FRST.ZS"};	
		JsonArray[] data = {DataFetcher.getFetcher().fetchData(analysis, code)};
		
		Map<Integer, Float> actual = strategy.execute(data);
		Map<Integer, Float> expected = new HashMap<Integer, Float>();;
		expected.put(2010, (float) 38.73947);

		assertEquals(expected, actual);
	}
}
