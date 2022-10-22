package analysisFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

abstract public class DataFetcher {
	
	public  JsonArray fetchData(Analysis analysis, String[] worldBankCode) {
			
		String country = analysis.getCountry();
		String[] code = worldBankCode;
		int startYear = analysis.getStartYear();
		int endYear = analysis.getEndYear();
		
		JsonArray json = getJSON(country, code, startYear, endYear);
		return json;	
	}
	
	private JsonArray getJSON(String country, String[] code, int startYear, int endYear) {
		JsonArray jsonArray = null;
		String urlString = String.format(
				"http://api.worldbank.org/v2/country/%s/indicator/%s?date=%s:%s&format=json", country, code[0], startYear, endYear);
		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int responsecode = conn.getResponseCode();
			if (responsecode == 200) {
				String inline = "";
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					inline += sc.nextLine();
				}
				sc.close();
				jsonArray = new JsonParser().parse(inline).getAsJsonArray();		
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return jsonArray;
	}
}
	