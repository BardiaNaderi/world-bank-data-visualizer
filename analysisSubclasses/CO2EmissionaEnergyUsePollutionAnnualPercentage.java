package analysisSubclasses;

import java.util.Arrays;
import java.util.Map;

import com.google.gson.JsonArray;

import analysisFactory.Analysis;
import analysisStrategies.AnnualPercentageChange;

public class CO2EmissionaEnergyUsePollutionAnnualPercentage extends Analysis {
			
	public CO2EmissionaEnergyUsePollutionAnnualPercentage(String country, int startYear, int endYear) {
		this.strategy = new AnnualPercentageChange();
		this.worldBankCodes = Arrays.asList(CO2_EMISSIONS, ENERGY_USE, AIR_POLLUTION);
		this.country = country;
		this.startYear = startYear -1;
		this.endYear = endYear;
	}
	
	public void executeAnalysis() {	
		String[] co2Code = this.getWorldBankCodes().get(0);
		String[] energyCode = this.getWorldBankCodes().get(1);
		String[] pollutionCode = this.getWorldBankCodes().get(2);
		
		JsonArray[] co2Data = {fetchData(this, co2Code)};
		JsonArray[] energyData = {fetchData(this, energyCode)};
		JsonArray[] pollutionData = {fetchData(this, pollutionCode)};
		
		Map<Integer, Float> co2Values = this.strategy.execute(co2Data);
		Map<Integer, Float> energyValues = this.strategy.execute(energyData);
		Map<Integer, Float> pollutionValues = this.strategy.execute(pollutionData);
		
		for (Map.Entry<Integer, Float> entry: co2Values.entrySet()) {
			System.out.println("The annual percent change of " + co2Code[1] + " for " + country + " from " +  
					(entry.getKey() - 1) + " to " +  entry.getKey() + " is " +  entry.getValue());
		}
		for (Map.Entry<Integer, Float> entry: energyValues.entrySet()) {
			System.out.println("The annual percent change of " + energyCode[1] + " for " + country + " from " +  
					(entry.getKey() - 1) + " to " +  entry.getKey() + " is " +  entry.getValue());
		}
		for (Map.Entry<Integer, Float> entry: pollutionValues.entrySet()) {
			System.out.println("The annual percent change of " + pollutionCode[1] + " for " + country + " from " +  
					(entry.getKey() - 1) + " to " +  entry.getKey() + " is " +  entry.getValue());
		}
	}
}
