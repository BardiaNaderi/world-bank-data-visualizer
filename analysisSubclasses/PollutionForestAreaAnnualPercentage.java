package analysisSubclasses;

import java.util.Arrays;
import java.util.Map;

import com.google.gson.JsonArray;

import analysisFactory.Analysis;
import analysisStrategies.AnnualPercentageChange;

public class PollutionForestAreaAnnualPercentage extends Analysis {
			
	public PollutionForestAreaAnnualPercentage(String country, int startYear, int endYear) {
		this.strategy = new AnnualPercentageChange();
		this.worldBankCodes = Arrays.asList(AIR_POLLUTION, FOREST_AREA);
		this.country = country;
		this.startYear = startYear -1;
		this.endYear = endYear;
	}
	
	public void executeAnalysis() {	
		String[] pollutionCode = this.getWorldBankCodes().get(0);
		String[] forestCode = this.getWorldBankCodes().get(1);
		
		JsonArray[] pollutionData = {fetchData(this, pollutionCode)};
		JsonArray[] forestData = {fetchData(this, forestCode)};
		
		Map<Integer, Float> pollutionValues = this.strategy.execute(pollutionData);
		Map<Integer, Float> forestValues = this.strategy.execute(forestData);
		
		for (Map.Entry<Integer, Float> entry: pollutionValues.entrySet()) {
			System.out.println("The annual percent change of " + pollutionCode[1] + " for " + country + " from " +  
					(entry.getKey() - 1) + " to " +  entry.getKey() + " is " +  entry.getValue());
		}
		for (Map.Entry<Integer, Float> entry: forestValues.entrySet()) {
			System.out.println("The annual percent change of " + forestCode[1] + " for " + country + " from " +  
					(entry.getKey() - 1) + " to " +  entry.getKey() + " is " +  entry.getValue());
		}
	}
}
