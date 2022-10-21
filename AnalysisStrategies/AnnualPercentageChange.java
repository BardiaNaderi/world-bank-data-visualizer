package analysisStrategies;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonArray;

public class AnnualPercentageChange implements AnalysisStrategy {
	
	public Map<Integer, Float> execute(JsonArray[] data) {
		
		Map<Integer, Float> values = new HashMap<Integer, Float>();
		JsonArray firstData = data[0];
		
		float pastYear = 0;
		float currentYear = 0;
		float percentChange = 0;
		int sizeOfResults = firstData.get(1).getAsJsonArray().size();
		int year;

		// Fetching data from one year before the start year
		if (firstData.get(1).getAsJsonArray().get(sizeOfResults - 1).getAsJsonObject().get("value").isJsonNull())
			pastYear = 0;
		else
			pastYear = firstData.get(1).getAsJsonArray().get(sizeOfResults - 1).getAsJsonObject().get("value").getAsFloat();
		
		// Fetching data for the years in the given range
		for (int i = sizeOfResults - 2; i >= 0; i--) {
			year = firstData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
			
			if (firstData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
				currentYear = 0;
			else
				currentYear = firstData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsFloat(); 
						
			percentChange = (currentYear - pastYear) / pastYear;
			pastYear = currentYear;
			values.put(year, percentChange);				
		}	
		
		return values;
	}
	
}
