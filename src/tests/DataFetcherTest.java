package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.google.gson.JsonArray;

import analysisGenerator.ForestAreaAverage;
import dataManagement.DataFetcher;

public class DataFetcherTest {

	/**
	 * Tests if the DataFetcher returns the correct value for the specified parameters
	 * 
	 * @result returns true if the results match what is expected after manually fetching
	 * the data from the World Bank's API
	 */
	@Test
	void testDataFetcherReturnsCorrectData() {		
		ForestAreaAverage analysis = new ForestAreaAverage("CAN", 2010, 2010);
		String[] code = {"AG.LND.FRST.ZS"};
		
		JsonArray data = DataFetcher.getFetcher().fetchData(analysis, code);
		String string = data.toString();
		
		boolean expected = true;
		boolean actual = string.contains("38.7394705758349");
		assertEquals(expected, actual);	
	}
	
}
