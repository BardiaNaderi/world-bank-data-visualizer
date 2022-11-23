package analysisFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.google.gson.JsonArray;

import analysisStrategies.Ratio;
import viewBuilders.Director;
import viewBuilders.OneSeriesViewBuilder;
import viewBuilders.ViewBuilder;

public class CO2EmissionsGDPRatio extends Analysis {
	
	/**
	 * Constructor class which sets three parameters dynamically and two statically.
	 * The strategy and worldBankCodes parameters are determined during the creation 
	 * of an Analysis subclass based on what kind of analysis is to be performed. The
	 * country, startYear and endYear can all be dynamically changed at run time to 
	 * produce different analysis results.
	 * 
	 * @param country the country selected for the analysis
	 * @param startYear the year to start the analysis on
	 * @param endYear the year to end the analysis on
	 */
	public CO2EmissionsGDPRatio(String country, int startYear, int endYear) {
		this.strategy = new Ratio();
		this.worldBankCodes = Arrays.asList(CO2_EMISSIONS, GDP_PER_CAPITA);
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	
	/**
	 * Method to fetch and process the necessary data for the current analysis send
	 * the results to the Director
	 */
	public void executeAnalysis() {	
		String[] co2Code = this.getWorldBankCodes().get(0);
		String[] gdpCode = this.getWorldBankCodes().get(1);
		
		JsonArray[] ratio = {fetcher.fetchData(this, co2Code), fetcher.fetchData(this, gdpCode)};
		Map<Integer, Float> values = this.strategy.execute(ratio);
		List<Map<Integer, Float>> data = Arrays.asList(values);
		
		if (values.isEmpty()) {
			JFrame frame = new JFrame("Invalid Selection");
    		JOptionPane.showMessageDialog(frame, "No data is available for the selected analysis..",
    	               "No Data", JOptionPane.ERROR_MESSAGE);
		}
			
		else {
			Director director = new Director();
			ViewBuilder builder = new OneSeriesViewBuilder();
			director.constructRatioView(builder, data, this.getWorldBankCodes());
		}	
	}
}
