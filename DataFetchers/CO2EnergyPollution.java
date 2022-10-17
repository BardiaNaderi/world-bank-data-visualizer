package DataFetchers;

import com.google.gson.JsonArray;

import AnalysisStrategies.AnnualPercentageChange;

public class CO2EnergyPollution extends DataFetcher {
		
	public CO2EnergyPollution(String country, int startYear, int endYear) {
		this.analysis = new AnnualPercentageChange();
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}

	public void executeAnalysis() {
		
		String[] co2Type = {CO2_CODE[1]};
		String[] energyType = {ENERGY_CODE[1]};
		String[] pollutionType = {POLLUTION_CODE[1]};
				
		JsonArray[] co2Json = {this.fetchData(country, CO2_CODE[0], startYear-1, endYear)};
		JsonArray[] energyJson = {this.fetchData(country, ENERGY_CODE[0], startYear-1, endYear)};
		JsonArray[] pollutionJson = {this.fetchData(country, POLLUTION_CODE[0], startYear-1, endYear)};
				
		this.analysis.processJSON(co2Json, co2Type, country);
		System.out.println("---------------------");
		this.analysis.processJSON(energyJson, energyType, country);
		System.out.println("---------------------");
		this.analysis.processJSON(pollutionJson, pollutionType, country);
		
	}
}
