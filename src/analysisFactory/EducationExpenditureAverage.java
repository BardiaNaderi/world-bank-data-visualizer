package analysisFactory;

import java.util.Arrays;
import java.util.Map;

import com.google.gson.JsonArray;

import analysisStrategies.Average;

public class EducationExpenditureAverage extends Analysis {
	
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
	public EducationExpenditureAverage(String country, int startYear, int endYear) {
		this.strategy = new Average();
		this.worldBankCodes = Arrays.asList(EDUCATION_EXPENDITURE, EDUCATION_EXPENDITURE);
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	
	/**
	 * Method to fetch and process the necessary data for the current analysis and print
	 * the results to the console
	 */
	public void executeAnalysis() {	
		String[] educationCode = this.getWorldBankCodes().get(0);
		JsonArray[] educationData = {fetcher.fetchData(this, educationCode)};
		
		/*
		 *  It is assumed that the data being fetched will need to be returned in some manner in order
		 *  to be displayed to the user. For now the data is being returned as a HashMap and printed
		 *  to the console, but the following lines are subject to change depending on the requirements 
		 *  of Deliverables 2 and 3.
		*/
		Map<Integer, Float> educationValues = this.strategy.execute(educationData);
		System.out.println("The average " + educationCode[1] + " for " + this.getCountry() + " from " 
				+ this.getStartYear() + " to " + this.getEndYear() + " is " + educationValues.get(1));
	}
}