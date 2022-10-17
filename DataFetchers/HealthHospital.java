package DataFetchers;

import com.google.gson.JsonArray;

import AnalysisStrategies.Ratio;

public class HealthHospital extends DataFetcher {
	
	public HealthHospital(String country, int startYear, int endYear) {
		this.analysis = new Ratio();
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}

	public void executeAnalysis() {
		
		String[] analysisTypes = {HEALTH_CODE[1], HOSPITAL_CODE[1]};		
		JsonArray[] analysisJson = new JsonArray[2];
		analysisJson[0] = this.fetchData(country, HEALTH_CODE[0], startYear, endYear);	
		analysisJson[1] = this.fetchData(country, HOSPITAL_CODE[0], startYear, endYear);
			
		this.analysis.processJSON(analysisJson, analysisTypes, country);

	}

}
