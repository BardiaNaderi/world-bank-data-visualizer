package analysisSubclasses;

import java.util.Arrays;
import java.util.Map;

import com.google.gson.JsonArray;

import analysisFactory.Analysis;
import analysisStrategies.Ratio;

public class CO2EmissionsGDPRatio extends Analysis {
	
	public CO2EmissionsGDPRatio(String country, int startYear, int endYear) {
		this.strategy = new Ratio();
		this.worldBankCodes = Arrays.asList(CO2_EMISSIONS, GDP_PER_CAPITA);
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	
	public void executeAnalysis() {	
		String[] co2Code = this.getWorldBankCodes().get(0);
		String[] gdpCode = this.getWorldBankCodes().get(1);
	
		JsonArray[] data = {fetchData(this, co2Code), fetchData(this, gdpCode)};
		Map<Integer, Float> values = this.strategy.execute(data);
		
		for (Map.Entry<Integer, Float> entry: values.entrySet()) {
			System.out.println("The ratio of " + co2Code[1] + " to " + gdpCode[1] + " for " + country + " in " + entry.getKey() + " is " + entry.getValue());
		}
	}
}
