package AnalysisStrategies;

import com.google.gson.JsonArray;

public interface Analysis {
	
	public void processJSON(JsonArray[] jsonArray, String[] analysisType, String country);	

}
