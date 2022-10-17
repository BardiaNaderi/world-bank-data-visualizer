package DataFetchers;

import com.google.gson.JsonArray;

import AnalysisStrategies.AnnualPercentageChange;

public class PollutionForest extends DataFetcher {
	
	public PollutionForest(String country, int startYear, int endYear) {
		this.analysis = new AnnualPercentageChange();
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	
	public void executeAnalysis() {
		
		String[] pollutionType = {POLLUTION_CODE[1]};
		String[] forestType = {FOREST_CODE[1]};
		
		JsonArray[] pollutionJson = {this.fetchData(country, POLLUTION_CODE[0], startYear-1, endYear)};
		JsonArray[] forestJson = {this.fetchData(country, FOREST_CODE[0], startYear-1, endYear)};
					
		this.analysis.processJSON(pollutionJson, pollutionType, country);
		System.out.println("---------------------");
		this.analysis.processJSON(forestJson, forestType, country);
		
	}
}
