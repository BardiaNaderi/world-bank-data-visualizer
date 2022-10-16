package httpTest;

import com.google.gson.JsonArray;

public interface Analysis {
	
	public void processJSON(JsonArray jsonArray, String analysisType, String country);	

}
