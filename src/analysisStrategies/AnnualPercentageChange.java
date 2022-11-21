package analysisStrategies;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonArray;

public class AnnualPercentageChange implements AnalysisStrategy {
	
	/**
	 * This method takes in an array of JSON arrays and iterates through the data in order
	 * to extract the percentage change of a particular value over a specific set of years.
	 * 
	 * @param data a JSON array containing data fetched from the World Bank's API
	 * @return a HashMap containing all of the year and percentChange values for the current analysis
	 */
	public Map<Integer, Float> execute(JsonArray[] data) {
		
		Map<Integer, Float> values = new HashMap<Integer, Float>();
		JsonArray firstData = data[0];
		
		float pastYear = 0;
		float currentYear = 0;
		float percentChange = 0;
		int sizeOfResults = firstData.get(1).getAsJsonArray().size();
		int year;

		// Fetching data from one year before the start year
		if (!firstData.get(1).getAsJsonArray().get(sizeOfResults - 1).getAsJsonObject().get("value").isJsonNull())
			pastYear = firstData.get(1).getAsJsonArray().get(sizeOfResults - 1).getAsJsonObject().get("value").getAsFloat();
		
		// Fetching data for the years in the given range
		for (int i = sizeOfResults - 2; i >= 0; i--) {
			year = firstData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
			
			if (firstData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
				continue;
			else
				currentYear = firstData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsFloat(); 
						
			if (pastYear != 0)
				percentChange = (currentYear - pastYear) / pastYear;
				pastYear = currentYear;
				values.put(year, percentChange);			
				
		}	
		
		return values;
	}
	
}
