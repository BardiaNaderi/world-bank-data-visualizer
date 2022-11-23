package database;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import analysisFactory.Analysis;

public class DataFetcher {
	
	private static DataFetcher fetcher = null;
	private String worldBankURL;
	
	/**
	 * Private constructor class for the Singleton DataFetcher. Instantiates the fetcher with the
	 * string of the World Bank's URL address.  
	 */
	private DataFetcher() {
		worldBankURL = "http://api.worldbank.org/v2/country/%s/indicator/%s?date=%s:%s&format=json";
	}
	
	/**
	 * Getter method for the single instance of the DataFetcher class. If an instance has not
	 * been created yet, a new on in instantiated. The instance is then returned.
	 * 
	 * @return the single instance of the DataFetcher class
	 */
	public static DataFetcher getFetcher() {
		if (fetcher == null) {
			fetcher = new DataFetcher();
		}
		return fetcher;
	}
	
	/**
	 * This method is used by the Analysis subclasses to fetch data from the World Bank's API
	 * 
	 * @param analysis the current Analysis that is performing the fetching
	 * @param worldBankCode the desired World Bank indicator code to communicate with the API
	 * @return a JSON array containing all of the information fetched from the World Bank's API
	 */
	public  JsonArray fetchData(Analysis analysis, String[] worldBankCode) {
			
		String country = analysis.getCountry();
		String[] code = worldBankCode;
		int startYear = analysis.getStartYear();
		int endYear = analysis.getEndYear();
		
		JsonArray json = getJSON(country, code, startYear, endYear);
		return json;	
	}
	
	/**
	 * A helped method used to make the actual REST call to the World Bank's API
	 * 
	 * @param country the country to fetch the data for
	 * @param code the World Bank indicator code for the desired category 
	 * @param startYear the year to start the data fetching on
	 * @param endYear the year to end the data fetching on
	 * @return a JSON array containing all of the information fetched from the World Bank's API
	 */
	private JsonArray getJSON(String country, String[] code, int startYear, int endYear) {
		JsonArray jsonArray = null;
		String urlString = String.format(worldBankURL, country, code[0], startYear, endYear);
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
	