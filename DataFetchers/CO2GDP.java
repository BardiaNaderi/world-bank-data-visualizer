package DataFetchers;

import com.google.gson.JsonArray;

import AnalysisStrategies.Ratio;

public class CO2GDP extends DataFetcher {
	
	public CO2GDP(String country, int startYear, int endYear) {
		this.analysis = new Ratio();
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}

	public void executeAnalysis() {
		
		String[] analysisTypes = {GDP_CODE[1], CO2_CODE[1]};		
		JsonArray[] analysisJson = new JsonArray[2];
		analysisJson[0] = this.fetchData(country, GDP_CODE[0], startYear, endYear);	
		analysisJson[1] = this.fetchData(country, CO2_CODE[0], startYear, endYear);
			
		this.analysis.processJSON(analysisJson, analysisTypes, country);

	}

}
