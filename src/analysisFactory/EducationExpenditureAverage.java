package analysisFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.google.gson.JsonArray;

import analysisStrategies.Average;
import viewBuilders.Director;
import viewBuilders.OneSeriesViewBuilder;
import viewBuilders.ViewBuilder;

public class EducationExpenditureAverage extends Analysis {
	
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
	public EducationExpenditureAverage(String country, int startYear, int endYear) {
		this.strategy = new Average();
		this.worldBankCodes = Arrays.asList(EDUCATION_EXPENDITURE, EDUCATION_EXPENDITURE);
		this.country = country;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	
	/**
	 * Method to fetch and process the necessary data for the current analysis and print
	 * the results to the console
	 */
	public void executeAnalysis() {	
		String[] educationCode = this.getWorldBankCodes().get(0);
		JsonArray[] educationData = {fetcher.fetchData(this, educationCode)};
		
		Map<Integer, Float> educationValues = this.strategy.execute(educationData);
		List<Map<Integer, Float>> data = Arrays.asList(educationValues);
		
		if (educationValues.isEmpty()) {
			JFrame frame = new JFrame("Invalid Selection");
    		JOptionPane.showMessageDialog(frame, "No data is available for the selected analysis..",
    	               "No Data", JOptionPane.ERROR_MESSAGE);
		}
			
		else {
			Director director = new Director();
			ViewBuilder builder = new OneSeriesViewBuilder();
			director.constructAverageView(builder, data, this.getWorldBankCodes());
		}	
	}
}