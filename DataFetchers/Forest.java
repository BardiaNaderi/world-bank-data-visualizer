package DataFetchers;

import com.google.gson.JsonArray;

import AnalysisStrategies.Average;

public class Forest extends DataFetcher {
	
	public Forest(String country, int startYear, int endYear) {
		this.analysis = new Average();
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	
	public void executeAnalysis() {
		
		String[] forestType = {FOREST_CODE[1]};	
		JsonArray[] forestJson = {this.fetchData(country, FOREST_CODE[0], startYear, endYear)};
					
		this.analysis.processJSON(forestJson, forestType, country);
		
	}
}
