package AnalysisStrategies;

import com.google.gson.JsonArray;

public class Average implements Analysis {

	public void processJSON(JsonArray[] jsonArray, String[] analysisType, String country) {
		float currentYear = 0;
		float cummulative = 0;
		int sizeOfResults = jsonArray[0].get(1).getAsJsonArray().size();
		int year;
		
		for (int i = sizeOfResults - 1; i >= 0; i--) {
			year = jsonArray[0].get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
			if (jsonArray[0].get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
				currentYear = 0;
			else
				currentYear = jsonArray[0].get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsFloat();

			System.out.println(analysisType[0] + " for " + country + " in " + year + " is " + currentYear);
			cummulative = cummulative + currentYear;
		}
		System.out.println(
				"The average " + analysisType[0] + " over the selected years is " + cummulative / sizeOfResults);
	}
	
}
