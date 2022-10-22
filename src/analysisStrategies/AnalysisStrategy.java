package analysisStrategies;

import java.util.Map;

import com.google.gson.JsonArray;

public interface AnalysisStrategy {
	
	/**
	 * This method is intended to be used to process the data within a JSON array
	 * and extract only that which is important for the current Analysis. 
	 * 
	 * @param data a JSON array containing data fetched from the World Bank's API
	 * @return a HashMap containing only the values of interest from the JSON array
	 */
	public Map<Integer, Float> execute(JsonArray[] data);	

}
