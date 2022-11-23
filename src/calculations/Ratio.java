package calculations;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.JsonArray;

public class Ratio implements AnalysisStrategy {
	
	/**
	 * This method takes in an array of JSON arrays and iterates through two different
	 * sets of values in order to calculate the ratio between them across a specified
	 * set of years
	 * 
	 * @param data a JSON array containing data fetched from the World Bank's API
	 * @return a HashMap containing the year and ratio values for the current analysis
	 */
	public Map<Integer, Float> execute(JsonArray[] data) {
		
		Map<Integer, Float> values = new HashMap<Integer, Float>();
		JsonArray firstData = data[0];
		JsonArray secondData = data[1];
		
		float firstValue = 0;
		float secondValue = 0;
		int sizeOfResults = data[0].get(1).getAsJsonArray().size();
		int year;
		float ratio;
		
		for (int i = sizeOfResults - 1; i >= 0; i--) {
			
			year = firstData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
			
			if (firstData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
				continue;
			else
				firstValue = firstData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsFloat();  
			
			if (secondData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
				continue;
			else
				secondValue  = secondData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsFloat(); 
			
			ratio = firstValue / secondValue;
			values.put(year, ratio);				
		}	
		
		return values;
	}
}
