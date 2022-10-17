package AnalysisStrategies;

import com.google.gson.JsonArray;

public class Ratio implements Analysis {

	public void processJSON(JsonArray[] jsonArray, String[] analysisType, String country) {
		float valueA = 0;
		float valueB = 0;
		float ratio = 0;
		int sizeOfResults = jsonArray[0].get(1).getAsJsonArray().size();
		int year;

		for (int i = sizeOfResults - 1; i >= 0; i--) {
			year = jsonArray[0].get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
			
			// Values for first JSON array
			if (jsonArray[0].get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
				valueA = 0;
			else
				valueA = jsonArray[0].get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsFloat(); 
			
			// Values for second JSON array
			if (jsonArray[1].get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
				valueB = 0;
			else
				valueB = jsonArray[1].get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsFloat(); 
			
			ratio = valueA / valueB;
			
			System.out.println("The ratio of " + analysisType[0] + " to " + analysisType[1] + " for " + country + " in " + year + " is " + ratio);
		}
	}
	
}
