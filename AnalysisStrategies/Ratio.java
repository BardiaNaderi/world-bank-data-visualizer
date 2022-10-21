package analysisStrategies;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.JsonArray;

import analysisFactory.DataFetcher;

public class Ratio extends DataFetcher implements AnalysisStrategy {
	
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
				firstValue = 0;
			else
				firstValue = firstData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsFloat();  
			
			if (secondData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
				secondValue  = 0;
			else
				secondValue  = secondData.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsFloat(); 
			
			ratio = firstValue / secondValue;
			values.put(year, ratio);				
		}	
		
		return values;
	}
}
