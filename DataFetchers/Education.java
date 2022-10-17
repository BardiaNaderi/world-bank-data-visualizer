package DataFetchers;

import com.google.gson.JsonArray;

import AnalysisStrategies.Average;

public class Education extends DataFetcher {
	
	public Education(String country, int startYear, int endYear) {
		this.analysis = new Average();
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	
	public void executeAnalysis() {
		
		String[] educationType = {EDUCATION_CODE[1]};	
		JsonArray[] educationJson = {this.fetchData(country, EDUCATION_CODE[0], startYear, endYear)};
					
		this.analysis.processJSON(educationJson, educationType, country);
		
	}
}
