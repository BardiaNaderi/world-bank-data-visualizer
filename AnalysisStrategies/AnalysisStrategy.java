package analysisStrategies;

import java.util.Map;

import com.google.gson.JsonArray;

public interface AnalysisStrategy {
	
	public Map<Integer, Float> execute(JsonArray[] data) ;	

}
