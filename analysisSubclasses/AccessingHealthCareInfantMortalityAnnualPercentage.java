package analysisSubclasses;

import java.util.Arrays;
import java.util.Map;

import com.google.gson.JsonArray;

import analysisFactory.Analysis;
import analysisStrategies.AnnualPercentageChange;

public class AccessingHealthCareInfantMortalityAnnualPercentage extends Analysis {
			
	public AccessingHealthCareInfantMortalityAnnualPercentage(String country, int startYear, int endYear) {
		this.strategy = new AnnualPercentageChange();
		this.worldBankCodes = Arrays.asList(ACCESSING_HEALTH_CARE, INFANT_MORTALITY);
		this.country = country;
		this.startYear = startYear -1;
		this.endYear = endYear;
	}
	
	public void executeAnalysis() {	
		String[] healthCode = this.getWorldBankCodes().get(0);
		String[] mortalityCode = this.getWorldBankCodes().get(1);
		
		JsonArray[] healthData = {fetchData(this, healthCode)};
		JsonArray[] mortalityData = {fetchData(this, mortalityCode)};
		
		Map<Integer, Float> healthValues = this.strategy.execute(healthData);
		Map<Integer, Float> mortalityValues = this.strategy.execute(mortalityData);
		
		for (Map.Entry<Integer, Float> entry: healthValues.entrySet()) {
			System.out.println("The annual percent change of " + healthCode[1] + " for " + country + " from " +  
					(entry.getKey() - 1) + " to " +  entry.getKey() + " is " +  entry.getValue());
		}
		for (Map.Entry<Integer, Float> entry: mortalityValues.entrySet()) {
			System.out.println("The annual percent change of " + mortalityCode[1] + " for " + country + " from " +  
					(entry.getKey() - 1) + " to " +  entry.getKey() + " is " +  entry.getValue());
		}
	}
}