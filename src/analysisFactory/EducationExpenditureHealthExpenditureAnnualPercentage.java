package analysisFactory;

import java.util.Arrays;
import java.util.Map;

import com.google.gson.JsonArray;

import analysisStrategies.AnnualPercentageChange;

public class EducationExpenditureHealthExpenditureAnnualPercentage extends Analysis {
	
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
	public EducationExpenditureHealthExpenditureAnnualPercentage(String country, int startYear, int endYear) {
		this.strategy = new AnnualPercentageChange();
		this.worldBankCodes = Arrays.asList(EDUCATION_EXPENDITURE, HEALTH_EXPENDITURE);
		this.country = country;
		this.startYear = startYear -1;
		this.endYear = endYear;
	}
	
	/**
	 * Method to fetch and process the necessary data for the current analysis and print
	 * the results to the console
	 */
	public void executeAnalysis() {	
		String[] educationCode = this.getWorldBankCodes().get(0);
		String[] healthCode = this.getWorldBankCodes().get(1);
		
		JsonArray[] educationData = {fetcher.fetchData(this, educationCode)};
		JsonArray[] healthData = {fetcher.fetchData(this, healthCode)};
		
		/*
		 *  It is assumed that the data being fetched will need to be returned in some manner in order
		 *  to be displayed to the user. For now the data is being returned as a HashMap and printed
		 *  to the console, but the following lines are subject to change depending on the requirements 
		 *  of Deliverables 2 and 3.
		*/
		Map<Integer, Float> educationValues = this.strategy.execute(educationData);
		Map<Integer, Float> healthValues = this.strategy.execute(healthData);
		
		for (Map.Entry<Integer, Float> entry: educationValues.entrySet()) {
			System.out.println("The annual percent change of " + educationCode[1] + " for " + country + " from " +  
					(entry.getKey() - 1) + " to " +  entry.getKey() + " is " +  entry.getValue());
		}
		for (Map.Entry<Integer, Float> entry: healthValues.entrySet()) {
			System.out.println("The annual percent change of " + healthCode[1] + " for " + country + " from " +  
					(entry.getKey() - 1) + " to " +  entry.getKey() + " is " +  entry.getValue());
		}
	}
}

