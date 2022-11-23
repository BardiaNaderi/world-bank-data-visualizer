package calculations;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonArray;

import mainApplication.MainUI;

public class Average implements AnalysisStrategy {

	/**
	 * This method takes in an array of JSON arrays and iterates through the data in order
	 * to extract the cumulative average of a particular value over a specific set of years.
	 * 
	 * @param data a JSON array containing data fetched from the World Bank's API
	 * @return a HashMap containing the final year and the cumulative average value
	 */
	public Map<Integer, Float> execute(JsonArray[] data) {
		
		Map<Integer, Float> values = new HashMap<Integer, Float>();
		JsonArray firstData = data[0];
		
		float currentYear = 0;
		float cummulative = 0;
		int sizeOfResults = firstData.get(1).getAsJsonArray().size();
		float average;
		int year = Integer.parseInt(MainUI.getInstance().getParams().getEndYear().value);
				
		for (int i = sizeOfResults - 1; i >= 0; i--) {
			if (firstData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
				continue;
			else
				currentYear = firstData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsFloat();

			cummulative = cummulative + currentYear;				
		}	
		
		average = cummulative / sizeOfResults;
		
		
		values.put(year, average);		
		return values;
	}
	
}
