package analysisSubclasses;

import java.util.Arrays;
import java.util.Map;

import com.google.gson.JsonArray;

import analysisFactory.Analysis;
import analysisStrategies.AnnualPercentageChange;

public class EducationExpenditureHealthExpenditureAnnualPercentage extends Analysis {
			
	public EducationExpenditureHealthExpenditureAnnualPercentage(String country, int startYear, int endYear) {
		this.strategy = new AnnualPercentageChange();
		this.worldBankCodes = Arrays.asList(EDUCATION_EXPENDITURE, HEALTH_EXPENDITURE);
		this.country = country;
		this.startYear = startYear -1;
		this.endYear = endYear;
	}
	
	public void executeAnalysis() {	
		String[] educationCode = this.getWorldBankCodes().get(0);
		String[] healthCode = this.getWorldBankCodes().get(1);
		
		JsonArray[] educationData = {fetchData(this, educationCode)};
		JsonArray[] healthData = {fetchData(this, healthCode)};
		
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

