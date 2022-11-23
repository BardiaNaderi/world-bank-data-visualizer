package analysisFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.google.gson.JsonArray;

import analysisStrategies.AnnualPercentageChange;
import viewBuilders.Director;
import viewBuilders.ThreeSeriesViewBuilder;
import viewBuilders.ViewBuilder;

public class CO2EmissionsEnergyUsePollutionAnnualPercentage extends Analysis {
	
	private String title = "CO2 Emissions VS Energy Use VS Air Polluion";
	
	public String getTitle() {
		return this.title;
	}
	
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
	public CO2EmissionsEnergyUsePollutionAnnualPercentage(String country, int startYear, int endYear) {
		this.strategy = new AnnualPercentageChange();
		this.worldBankCodes = Arrays.asList(CO2_EMISSIONS, ENERGY_USE, AIR_POLLUTION);
		this.country = country;
		this.startYear = startYear -1;
		this.endYear = endYear;
	}
	
	/**
	 * Method to fetch and process the necessary data for the current analysis send
	 * the results to the Director
	 */
	public void executeAnalysis() {	
		String[] co2Code = this.getWorldBankCodes().get(0);
		String[] energyCode = this.getWorldBankCodes().get(1);
		String[] pollutionCode = this.getWorldBankCodes().get(2);
		
		JsonArray[] co2Data = {fetcher.fetchData(this, co2Code)};
		JsonArray[] energyData = {fetcher.fetchData(this, energyCode)};
		JsonArray[] pollutionData = {fetcher.fetchData(this, pollutionCode)};
		
		Map<Integer, Float> co2Values = this.strategy.execute(co2Data);
		Map<Integer, Float> energyValues = this.strategy.execute(energyData);
		Map<Integer, Float> pollutionValues = this.strategy.execute(pollutionData);
		List<Map<Integer, Float>> data = Arrays.asList(co2Values, energyValues, pollutionValues);
		
		if (co2Values.isEmpty() && energyValues.isEmpty() && pollutionValues.isEmpty()) {
			JFrame frame = new JFrame("Invalid Selection");
    		JOptionPane.showMessageDialog(frame, "No data is available for the selected analysis..",
    	               "No Data", JOptionPane.ERROR_MESSAGE);
		}
			
		else {
			Director director = new Director();
			ViewBuilder builder = new ThreeSeriesViewBuilder();
			director.constructAnnualPercentageView(builder, data, this.getWorldBankCodes());
		}		
	}
}
