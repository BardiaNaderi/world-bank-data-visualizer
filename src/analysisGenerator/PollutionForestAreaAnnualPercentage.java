package analysisGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.google.gson.JsonArray;

import calculations.AnnualPercentageChange;
import graphBuilders.Director;
import graphBuilders.TwoSeriesViewBuilder;
import graphBuilders.ViewBuilder;

public class PollutionForestAreaAnnualPercentage extends Analysis {
	
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
	public PollutionForestAreaAnnualPercentage(String country, int startYear, int endYear) {
		this.strategy = new AnnualPercentageChange();
		this.worldBankCodes = Arrays.asList(AIR_POLLUTION, FOREST_AREA);
		this.country = country;
		this.startYear = startYear -1;
		this.endYear = endYear;
	}
	
	/**
	 * Method to fetch and process the necessary data for the current analysis send
	 * the results to the Director
	 */
	public void executeAnalysis() {	
		String[] pollutionCode = this.getWorldBankCodes().get(0);
		String[] forestCode = this.getWorldBankCodes().get(1);
		
		JsonArray[] pollutionData = {fetcher.fetchData(this, pollutionCode)};
		JsonArray[] forestData = {fetcher.fetchData(this, forestCode)};

		Map<Integer, Float> pollutionValues = this.strategy.execute(pollutionData);
		Map<Integer, Float> forestValues = this.strategy.execute(forestData);
		List<Map<Integer, Float>> data = Arrays.asList(pollutionValues, forestValues);

		if (pollutionValues.isEmpty() && forestValues.isEmpty()) {
			JFrame frame = new JFrame("Invalid Selection");
    		JOptionPane.showMessageDialog(frame, "No data is available for the selected analysis..",
    	               "No Data", JOptionPane.ERROR_MESSAGE);
		}
			
		else {
			Director director = new Director();
			ViewBuilder builder = new TwoSeriesViewBuilder();
			director.constructAnnualPercentageView(builder, data, this.getWorldBankCodes());
		}
	}
}
