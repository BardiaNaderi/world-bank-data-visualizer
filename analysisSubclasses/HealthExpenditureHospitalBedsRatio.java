package analysisSubclasses;

import java.util.Arrays;
import java.util.Map;

import com.google.gson.JsonArray;

import analysisFactory.Analysis;
import analysisStrategies.Ratio;

public class HealthExpenditureHospitalBedsRatio extends Analysis {
	
	public HealthExpenditureHospitalBedsRatio(String country, int startYear, int endYear) {
		this.strategy = new Ratio();
		this.worldBankCodes = Arrays.asList(HEALTH_EXPENDITURE, HOSPITAL_BEDS);
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	
	public void executeAnalysis() {	
		String[] healthCode = this.getWorldBankCodes().get(0);
		String[] hospitalCode = this.getWorldBankCodes().get(1);
	
		JsonArray[] data = {fetchData(this, healthCode), fetchData(this, hospitalCode)};
		Map<Integer, Float> values = this.strategy.execute(data);
		
		for (Map.Entry<Integer, Float> entry: values.entrySet()) {
			System.out.println("The ratio of " + healthCode[1] + " to " + hospitalCode[1] + " for " + country + " in " + entry.getKey() + " is " + entry.getValue());
		}
	}
}

