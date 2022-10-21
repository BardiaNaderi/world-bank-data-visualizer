package analysisStrategies;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonArray;

public class Average implements AnalysisStrategy {

	public Map<Integer, Float> execute(JsonArray[] data) {
		
		Map<Integer, Float> values = new HashMap<Integer, Float>();
		JsonArray firstData = data[0];
		
		float currentYear = 0;
		float cummulative = 0;
		int sizeOfResults = firstData.get(1).getAsJsonArray().size();
		float average;
		
		for (int i = sizeOfResults - 1; i >= 0; i--) {
			if (firstData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
				currentYear = 0;
			else
				currentYear = firstData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsFloat();

			cummulative = cummulative + currentYear;				
		}	
		
		average = cummulative / sizeOfResults;
		values.put(1, average);		
		return values;
	}
	
}
