package analysisFactory;

import java.util.Arrays;
import java.util.Map;

import com.google.gson.JsonArray;

import analysisStrategies.AnnualPercentageChange;

public class CO2EmissionaEnergyUsePollutionAnnualPercentage extends Analysis {
	
	/**
	 * Constructor class which sets three parameters dynamically and two statically.
	 * The strategy and worldBankCodes parameters are determined during the creation 
	 * of an Analysis subclass based on what kind of analysis is to be performed. The
	 * country, startYear and endYear can all be dynamically changed at run time to 
	 * produce different analysis results.
	 * 
	 * @param country the country selected for the analysis
	 * @param startYear the year to start the analysis on
	 * @param endYear the year to end the analysis on
	 */
	public CO2EmissionaEnergyUsePollutionAnnualPercentage(String country, int startYear, int endYear) {
		this.strategy = new AnnualPercentageChange();
		this.worldBankCodes = Arrays.asList(CO2_EMISSIONS, ENERGY_USE, AIR_POLLUTION);
		this.country = country;
		this.startYear = startYear -1;
		this.endYear = endYear;
	}
	
	/**
	 * Method to fetch and process the necessary data for the current analysis and print
	 * the results to the console
	 */
	public void executeAnalysis() {	
		String[] co2Code = this.getWorldBankCodes().get(0);
		String[] energyCode = this.getWorldBankCodes().get(1);
		String[] pollutionCode = this.getWorldBankCodes().get(2);
		
		JsonArray[] co2Data = {fetcher.fetchData(this, co2Code)};
		JsonArray[] energyData = {fetcher.fetchData(this, energyCode)};
		JsonArray[] pollutionData = {fetcher.fetchData(this, pollutionCode)};
		
		/*
		 *  It is assumed that the data being fetched will need to be returned in some manner in order
		 *  to be displayed to the user. For now the data is being returned as a HashMap and printed
		 *  to the console, but the following lines are subject to change depending on the requirements 
		 *  of Deliverables 2 and 3.
		*/
		Map<Integer, Float> co2Values = this.strategy.execute(co2Data);
		Map<Integer, Float> energyValues = this.strategy.execute(energyData);
		Map<Integer, Float> pollutionValues = this.strategy.execute(pollutionData);
		
		for (Map.Entry<Integer, Float> entry: co2Values.entrySet()) {
			System.out.println("The annual percent change of " + co2Code[1] + " for " + country + " from " +  
					(entry.getKey() - 1) + " to " +  entry.getKey() + " is " +  entry.getValue());
		}
		for (Map.Entry<Integer, Float> entry: energyValues.entrySet()) {
			System.out.println("The annual percent change of " + energyCode[1] + " for " + country + " from " +  
					(entry.getKey() - 1) + " to " +  entry.getKey() + " is " +  entry.getValue());
		}
		for (Map.Entry<Integer, Float> entry: pollutionValues.entrySet()) {
			System.out.println("The annual percent change of " + pollutionCode[1] + " for " + country + " from " +  
					(entry.getKey() - 1) + " to " +  entry.getKey() + " is " +  entry.getValue());
		}
	}
}
