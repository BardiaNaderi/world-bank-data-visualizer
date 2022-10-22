package analysisSubclasses;

import java.util.Arrays;
import java.util.Map;

import com.google.gson.JsonArray;

import analysisFactory.Analysis;
import analysisStrategies.Average;

public class EducationExpenditureAverage extends Analysis {
	
	public EducationExpenditureAverage(String country, int startYear, int endYear) {
		this.strategy = new Average();
		this.worldBankCodes = Arrays.asList(EDUCATION_EXPENDITURE, EDUCATION_EXPENDITURE);
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	
	public void executeAnalysis() {	
		String[] educationCode = this.getWorldBankCodes().get(0);
		JsonArray[] educationData = {fetchData(this, educationCode)};
		Map<Integer, Float> educationValues = this.strategy.execute(educationData);
				
		System.out.println("The average " + educationCode[1] + " for " + this.getCountry() + " from " 
				+ this.getStartYear() + " to " + this.getEndYear() + " is " + educationValues.get(1));
	}
}