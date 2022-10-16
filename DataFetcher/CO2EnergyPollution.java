package httpTest;

import com.google.gson.JsonArray;

public class CO2EnergyPollution extends DataFetcher {
		
	public CO2EnergyPollution(String country, int startYear, int endYear) {
		this.analysis = new AnnualPercentageChange();
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}

	public void executeAnalysis() {
		
		JsonArray co2Json = this.fetchData(country, CO2_CODE, startYear-1, endYear);
		JsonArray energyJson = this.fetchData(country, ENERGY_CODE, startYear-1, endYear);
		JsonArray pollutionJson = this.fetchData(country, POLLUTION_CODE, startYear-1, endYear);
		
		this.analysis.processJSON(co2Json, "CO2 Emissions", country);
		System.out.println("---------------------");
		this.analysis.processJSON(energyJson, "Energy Use", country);
		System.out.println("---------------------");
		this.analysis.processJSON(pollutionJson, "Air Pollution", country);
		
	}
}
