package analysisSubclasses;

import java.util.Arrays;
import java.util.Map;

import com.google.gson.JsonArray;

import analysisFactory.Analysis;
import analysisStrategies.Average;

public class ForestAreaAverage extends Analysis {
	
	public ForestAreaAverage(String country, int startYear, int endYear) {
		this.strategy = new Average();
		this.worldBankCodes = Arrays.asList(FOREST_AREA, FOREST_AREA);
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	
	public void executeAnalysis() {	
		String[] forestCode = this.getWorldBankCodes().get(0);
		JsonArray[] forestData = {fetchData(this, forestCode)};
		Map<Integer, Float> forestValues = this.strategy.execute(forestData);
				
		System.out.println("The average " + forestCode[1] + " for " + this.getCountry() + " from " 
				+ this.getStartYear() + " to " + this.getEndYear() + " is " + forestValues.get(1));
	}
}
