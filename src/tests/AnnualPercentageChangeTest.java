package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.google.gson.JsonArray;

import analysisGenerator.AccessingHealthCareInfantMortalityAnnualPercentage;
import analysisGenerator.CO2EmissionsEnergyUsePollutionAnnualPercentage;
import analysisGenerator.EducationExpenditureHealthExpenditureAnnualPercentage;
import analysisGenerator.PollutionForestAreaAnnualPercentage;
import calculations.AnnualPercentageChange;
import dataManagement.DataFetcher;

public class AnnualPercentageChangeTest {
	
	/**
	 * Test to ensure that the correct Map values are returned after the AnnualPercentageChange
	 * calculations are performed on the CO2EmissionsEnergyUsePollutionAnnualPercentage analysis
	 * 
	 * @results the Map returned from the analysis matches the manually calculated values
	 */
	@Test
	public void testCorrectValuesAreReturnedForCO2EmissionsEnergyUsePollutionAnnualPercentage() {
		AnnualPercentageChange strategy = new AnnualPercentageChange();
		CO2EmissionsEnergyUsePollutionAnnualPercentage analysis = 
				new CO2EmissionsEnergyUsePollutionAnnualPercentage("CAN", 2011, 2011);
		
		String[] co2Code = {"EN.ATM.CO2E.PC"};	
		JsonArray[] co2Data = {DataFetcher.getFetcher().fetchData(analysis, co2Code)};	
		
		String[] energyCode = {"EG.USE.PCAP.KG.OE"};	
		JsonArray[] energyData = {DataFetcher.getFetcher().fetchData(analysis, energyCode)};
		
		
		String[] pollutionCode = {"EN.ATM.PM25.MC.M3"};	
		JsonArray[] pollutionData = {DataFetcher.getFetcher().fetchData(analysis, pollutionCode)};
		
		Map<Integer, Float> co2Actual = strategy.execute(co2Data);
		Map<Integer, Float> co2Expected = new HashMap<Integer, Float>();;
		co2Expected.put(2011, (float) 0.012905347);
		
		Map<Integer, Float> energyActual = strategy.execute(energyData);
		Map<Integer, Float> energyExpected = new HashMap<Integer, Float>();;
		energyExpected.put(2011, (float) 0.01579164);
		
		
		Map<Integer, Float> pollutionActual = strategy.execute(pollutionData);
		Map<Integer, Float> pollutionExpected = new HashMap<Integer, Float>();;
		pollutionExpected.put(2011, (float) 0.02862482);
		
		
		assertEquals(co2Expected, co2Actual);
		assertEquals(energyExpected, energyActual);
		assertEquals(pollutionExpected, pollutionActual);
	}
	
	/**
	 * Test to ensure that the correct Map values are returned after the AnnualPercentageChange
	 * calculations are performed on the PollutionForestAreaAnnualPercentage analysis
	 * 
	 * @results the Map returned from the analysis matches the manually calculated values
	 */
	@Test
	public void testCorrectValuesAreReturnedForPollutionForestAreaAnnualPercentage() {
		AnnualPercentageChange strategy = new AnnualPercentageChange();
		PollutionForestAreaAnnualPercentage analysis = 
				new PollutionForestAreaAnnualPercentage("CAN", 2011, 2011);
		
		String[] pollutionCode = {"EN.ATM.PM25.MC.M3"};	
		JsonArray[] pollutionData = {DataFetcher.getFetcher().fetchData(analysis, pollutionCode)};	
		
		String[] forestCode = {"AG.LND.FRST.ZS"};	
		JsonArray[] forestData = {DataFetcher.getFetcher().fetchData(analysis, forestCode)};
		
		Map<Integer, Float> pollutionActual = strategy.execute(pollutionData);
		Map<Integer, Float> pollutionExpected = new HashMap<Integer, Float>();;
		pollutionExpected.put(2011, (float) 0.02862482);
		
		Map<Integer, Float> forestActual = strategy.execute(forestData);
		Map<Integer, Float> forestExpected = new HashMap<Integer, Float>();;
		forestExpected.put(2011, (float)  -1.18952434E-4);
		
		assertEquals(pollutionExpected, pollutionActual);
		assertEquals(forestExpected, forestActual);
	}
	
	/**
	 * Test to ensure that the correct Map values are returned after the AnnualPercentageChange
	 * calculations are performed on the AccessingHealthCareInfantMortalityAnnualPercentage analysis
	 * 
	 * @results the Map returned from the analysis matches the manually calculated values
	 */
	@Test
	public void testCorrectValuesAreReturnedForAccessingHealthCareInfantMortalityAnnualPercentage() {
		AnnualPercentageChange strategy = new AnnualPercentageChange();
		AccessingHealthCareInfantMortalityAnnualPercentage analysis = 
				new AccessingHealthCareInfantMortalityAnnualPercentage("CAN", 2011, 2011);
		
		String[] healthCode = {"SH.ACS.MONY.Q1.ZS"};	
		JsonArray[] healthData = {DataFetcher.getFetcher().fetchData(analysis, healthCode)};	
		
		String[] mortalityCode = {"SP.DYN.IMRT.IN"};	
		JsonArray[] mortalityData = {DataFetcher.getFetcher().fetchData(analysis, mortalityCode)};
		
		Map<Integer, Float> healthActual = strategy.execute(healthData);
		Map<Integer, Float> healthExpected = new HashMap<Integer, Float>();;
		
		Map<Integer, Float> mortalityActual = strategy.execute(mortalityData);
		Map<Integer, Float> mortalityExpected = new HashMap<Integer, Float>();;
		mortalityExpected.put(2011, (float) -0.01999998);
		
		assertEquals(healthExpected, healthActual);
		assertEquals(mortalityExpected, mortalityActual);
	}
	
	/**
	 * Test to ensure that the correct Map values are returned after the AnnualPercentageChange
	 * calculations are performed on the EducationExpenditureHealthExpenditureAnnualPercentage analysis
	 * 
	 * @results the Map returned from the analysis matches the manually calculated values
	 */
	@Test
	public void testCorrectValuesAreReturnedForEducationExpenditureHealthExpenditureAnnualPercentage() {
		AnnualPercentageChange strategy = new AnnualPercentageChange();
		EducationExpenditureHealthExpenditureAnnualPercentage analysis = 
				new EducationExpenditureHealthExpenditureAnnualPercentage("CAN", 2010, 2010);
		
		String[] healthCode = {"SH.XPD.CHEX.GD.ZS"};	
		JsonArray[] healthData = {DataFetcher.getFetcher().fetchData(analysis, healthCode)};	
		
		String[] educationCode = {"SE.XPD.TOTL.GD.ZS"};	
		JsonArray[] educationData = {DataFetcher.getFetcher().fetchData(analysis, educationCode)};
		
		Map<Integer, Float> healthActual = strategy.execute(healthData);
		Map<Integer, Float> healthExpected = new HashMap<Integer, Float>();;
		healthExpected.put(2010, (float) -0.0019884743);
		
		Map<Integer, Float> educationActual = strategy.execute(educationData);
		Map<Integer, Float> educationExpected = new HashMap<Integer, Float>();;
		educationExpected.put(2010, (float) 0.10655541);
		
		assertEquals(healthExpected, healthActual);
		assertEquals(educationExpected, educationActual);
	}

}
