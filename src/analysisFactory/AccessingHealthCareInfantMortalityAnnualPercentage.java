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

public class AccessingHealthCareInfantMortalityAnnualPercentage extends Analysis {
	
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
	public AccessingHealthCareInfantMortalityAnnualPercentage(String country, int startYear, int endYear) {
		this.strategy = new AnnualPercentageChange();
		this.worldBankCodes = Arrays.asList(ACCESSING_HEALTH_CARE, INFANT_MORTALITY);
		this.country = country;
		this.startYear = startYear -1;
		this.endYear = endYear;
	}
	
	/**
	 * Method to fetch and process the necessary data for the current analysis send
	 * the results to the Director
	 */
	public void executeAnalysis() {	
		String[] healthCode = this.getWorldBankCodes().get(0);
		String[] mortalityCode = this.getWorldBankCodes().get(1);
		
		JsonArray[] healthData = {fetcher.fetchData(this, healthCode)};
		JsonArray[] mortalityData = {fetcher.fetchData(this, mortalityCode)};
		
		Map<Integer, Float> healthValues = this.strategy.execute(healthData);
		Map<Integer, Float> mortalityValues = this.strategy.execute(mortalityData);
		List<Map<Integer, Float>> data = Arrays.asList(healthValues, mortalityValues);
	
		if (healthValues.isEmpty() && mortalityValues.isEmpty()) {
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