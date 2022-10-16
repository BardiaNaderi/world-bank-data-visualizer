package httpTest;

import com.google.gson.JsonArray;

public class AnnualPercentageChange implements Analysis {
	
	public void processJSON(JsonArray jsonArray, String analysisType, String country) {
		float pastYear = 0;
		float currentYear = 0;
		float percentChange = 0;
		int sizeOfResults = jsonArray.get(1).getAsJsonArray().size();
		int year;

		// Fetching data from one year before the start year
		if (jsonArray.get(1).getAsJsonArray().get(sizeOfResults - 1).getAsJsonObject().get("value").isJsonNull())
			pastYear = 0;
		else
			pastYear = jsonArray.get(1).getAsJsonArray().get(sizeOfResults - 1).getAsJsonObject().get("value").getAsFloat();
		
		// Fetching data for the years in the given range
		for (int i = sizeOfResults - 2; i >= 0; i--) {
			year = jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
			
			if (jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull()) {
				currentYear = 0;
			} else {
				currentYear = jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsFloat(); 
			}
			
			percentChange = (currentYear - pastYear) / pastYear;
			pastYear = currentYear;
			System.out.println("The annual percent change of " + analysisType + " for " + country + " from " + (year - 1) + " to " + year + " is " + percentChange);
		}
	}
	
}
