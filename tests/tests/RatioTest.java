package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.google.gson.JsonArray;

import analysisGenerator.CO2EmissionsGDPRatio;
import analysisGenerator.HealthExpenditureHospitalBedsRatio;
import calculations.Ratio;
import dataManagement.DataFetcher;

public class RatioTest {
	
	/**
	 * Use Case 7: Test 07
	 * 
	 * Test to ensure that the correct Map values are returned after the Ratio
	 * calculations are performed on the CO2EmissionsGDPRatio analysis
	 * 
	 * @results the Map returned from the analysis matches the manually calculated values
	 */
	@Test
	public void testCorrectValuesAreReturnedForCO2EmissionsGDPRatio() {
		Ratio strategy = new Ratio();
		CO2EmissionsGDPRatio analysis = 
				new CO2EmissionsGDPRatio("CAN", 2011, 2011);
		
		String[] co2Code = {"EN.ATM.CO2E.PC"};	
		String[] gdpCode = {"NY.GDP.PCAP.CD"};
		JsonArray[] data = {DataFetcher.getFetcher().fetchData(analysis, co2Code), 
				DataFetcher.getFetcher().fetchData(analysis, gdpCode)};
		
		Map<Integer, Float> actual = strategy.execute(data);
		Map<Integer, Float> expected = new HashMap<Integer, Float>();;
		expected.put(2011, (float) 3.0629666E-4);
		
		assertEquals(expected, actual);
	}
	
	/**
	 * Use Case 7: Test 08
	 * 
	 * Test to ensure that the correct Map values are returned after the Ratio
	 * calculations are performed on the CO2EmissionsGDPRatio analysis
	 * 
	 * @results the Map returned from the analysis matches the manually calculated values
	 */
	@Test
	public void testCorrectValuesAreReturnedForHealthExpenditureHospitalBedsRatio() {
		Ratio strategy = new Ratio();
		HealthExpenditureHospitalBedsRatio analysis = 
				new HealthExpenditureHospitalBedsRatio("CAN", 2011, 2011);
		
		String[] healthCode = {"SH.XPD.CHEX.GD.ZS"};	
		String[] bedsCode = {"SH.MED.BEDS.ZS"};
		JsonArray[] data = {DataFetcher.getFetcher().fetchData(analysis, healthCode), 
				DataFetcher.getFetcher().fetchData(analysis, bedsCode)};
		
		Map<Integer, Float> actual = strategy.execute(data);
		Map<Integer, Float> expected = new HashMap<Integer, Float>();;
		expected.put(2011, (float) 3.714473);
		
		assertEquals(expected, actual);
	}	

}
