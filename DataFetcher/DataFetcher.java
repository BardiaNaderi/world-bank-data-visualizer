package httpTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

abstract public class DataFetcher {
	
	final static protected String CO2_CODE = "EN.ATM.CO2E.PC";
	final static protected String ENERGY_CODE = "EG.USE.PCAP.KG.OE";
	final static protected String POLLUTION_CODE = "EN.ATM.PM25.MC.M3";
	
	protected Analysis analysis;
	protected String country;
	protected int startYear;
	protected int endYear;
	
	public JsonArray fetchData(String country, String code, int startYear, int endYear) {
		JsonArray jsonArray = null;
		String urlString = String.format(
				"http://api.worldbank.org/v2/country/%s/indicator/%s?date=%s:%s&format=json", country, code, startYear, endYear);
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
	