package analysisFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.google.gson.JsonArray;

import analysisStrategies.AnnualPercentageChange;
import viewBuilders.Director;
import viewBuilders.TwoSeriesViewBuilder;
import viewBuilders.ViewBuilder;

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
	 * Method to fetch and process the necessary data for the current analysis and print
	 * the results to the console
	 */
	public void executeAnalysis() {	
		String[] pollutionCode = this.getWorldBankCodes().get(0);
		String[] forestCode = this.getWorldBankCodes().get(1);
		
		JsonArray[] pollutionData = {fetcher.fetchData(this, pollutionCode)};
		JsonArray[] forestData = {fetcher.fetchData(this, forestCode)};
		
		/*
		 *  It is assumed that the data being fetched will need to be returned in some manner in order
		 *  to be displayed to the user. For now the data is being returned as a HashMap and printed
		 *  to the console, but the following lines are subject to change depending on the requirements 
		 *  of Deliverables 2 and 3.
		*/
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
