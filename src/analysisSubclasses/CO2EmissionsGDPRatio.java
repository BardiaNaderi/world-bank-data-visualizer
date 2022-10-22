package analysisSubclasses;

import java.util.Arrays;
import java.util.Map;

import com.google.gson.JsonArray;

import analysisFactory.Analysis;
import analysisStrategies.Ratio;

public class CO2EmissionsGDPRatio extends Analysis {
	
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
	public CO2EmissionsGDPRatio(String country, int startYear, int endYear) {
		this.strategy = new Ratio();
		this.worldBankCodes = Arrays.asList(CO2_EMISSIONS, GDP_PER_CAPITA);
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	
	/**
	 * Method to fetch and process the necessary data for the current analysis and print
	 * the results to the console
	 */
	public void executeAnalysis() {	
		String[] co2Code = this.getWorldBankCodes().get(0);
		String[] gdpCode = this.getWorldBankCodes().get(1);
		
		/*
		 *  It is assumed that the data being fetched will need to be returned in some manner in order
		 *  to be displayed to the user. For now the data is being returned as a HashMap and printed
		 *  to the console, but the following lines are subject to change depending on the requirements 
		 *  of Deliverables 2 and 3.
		*/
		JsonArray[] data = {fetchData(this, co2Code), fetchData(this, gdpCode)};
		Map<Integer, Float> values = this.strategy.execute(data);
		
		for (Map.Entry<Integer, Float> entry: values.entrySet()) {
			System.out.println("The ratio of " + co2Code[1] + " to " + gdpCode[1] + " for " + country + " in " + entry.getKey() + " is " + entry.getValue());
		}
	}
}