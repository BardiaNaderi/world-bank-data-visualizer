package DataFetchers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import AnalysisStrategies.Analysis;

abstract public class DataFetcher {
	
	final static protected String[] CO2_CODE = {"EN.ATM.CO2E.PC", "CO2 emissions"};
	final static protected String[] ENERGY_CODE = {"EG.USE.PCAP.KG.OE", "Energy Use"};
	final static protected String[] POLLUTION_CODE = {"EN.ATM.PM25.MC.M3", "Air Pollution"};
	final static protected String[] GDP_CODE = {"NY.GDP.PCAP.CD", "GDP per Capita"};
	final static protected String[] FOREST_CODE = {"AG.LND.FRST.ZS", "Forest Area"};
	final static protected String[] EDUCATION_CODE = {"SE.XPD.TOTL.GD.ZS", "Government Expenditure on Education"};
	final static protected String[] HEALTH_CODE = {"SH.XPD.CHEX.PC.CD","Current Heatlth Expenditure"};
	final static protected String[] HOSPITAL_CODE = {"SH.MED.BEDS.ZS", "Hospital Beds"};
	
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

	
	// For illustration purposes only, will be removed in future deliverables
	public static void main(String[] args) {

		System.out.println("ANALYSIS 1:\n");
		CO2EnergyPollution cep = new CO2EnergyPollution("CAN", 2011, 2014);
		cep.executeAnalysis();	

		System.out.println("\nANALYSIS 2:\n");
		PollutionForest pf = new PollutionForest("CAN", 2011, 2014);
		pf.executeAnalysis();		
		
		System.out.println("\nANALYSIS 3:\n");
		CO2GDP cg = new CO2GDP("CAN", 2011, 2014);
		cg.executeAnalysis();	
		
		System.out.println("\nANALYSIS 4:\n");
		Forest f = new Forest("CAN", 2011, 2014);
		f.executeAnalysis();
		
		System.out.println("\nANALYSIS 5:\n");
		Education e = new Education("CAN", 2011, 2014);
		e.executeAnalysis();
		
		System.out.println("\nANALYSIS 6:\n");
		HealthHospital hh = new HealthHospital("CAN", 2011, 2014);
		hh.executeAnalysis();
		
	}
}
	