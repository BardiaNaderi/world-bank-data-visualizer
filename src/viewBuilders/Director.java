package viewBuilders;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mainGUI.MainUI;

public class Director {
	
	final static private String RATIO = "Ratio";
	final static private String PERCENT = "Annual Percentage Change";
	final static private String AVERAGE = "Average";
			
	/**
	 * Method to generate a Ratio View based on the provided parameters. This method will 
	 * only generate the charts that are appropriate for the selected analysis.
	 * 
	 * @param builder the chosen ViewBuilder to create the View
	 * @param data the data provided from the Analysis subclass
	 * @param labels the labels that correspond to the current analysis type
	 */
	public void constructRatioView(ViewBuilder builder, List<Map<Integer, Float>> data, List<String[]> labels) {
		String[] ratio = {"", "Ratio of Values"};
		List<String[]> newLabel = Arrays.asList(ratio, ratio, ratio);

		builder.reset();
		builder.createLine(data, newLabel, RATIO);
		builder.createTime(data, newLabel, RATIO);
		builder.createBar(data, newLabel, RATIO);
		builder.createScatter(data, newLabel, RATIO);
		builder.createReport(data, newLabel, RATIO);	
		
		JFrame frame = new JFrame("Analysis Complete");
		JOptionPane.showMessageDialog(frame,
				"Analysis succsssfully completed. Please select viewers to display the results.");
	}
	
	/**
	 * Method to generate an Annual Percentage Change View based on the provided parameters. This method will
	 * only generate the charts that are appropriate for the selected analysis.
	 * 
	 * @param builder the chosen ViewBuilder to create the View
	 * @param data the data provided from the Analysis subclass
	 * @param labels the labels that correspond to the current analysis type
	 */
	public void constructAnnualPercentageView(ViewBuilder builder, List<Map<Integer, Float>> data, List<String[]> labels) {
		builder.reset();
		builder.createLine(data, labels, PERCENT);
		builder.createTime(data, labels, PERCENT);
		builder.createBar(data, labels, PERCENT);
		builder.createScatter(data, labels, PERCENT);
		builder.createReport(data, labels, PERCENT);
		
		JFrame frame = new JFrame("Analysis Complete");
		JOptionPane.showMessageDialog(frame,
				"Analysis succsssfully completed. Please select viewers to display the results.");
	}
	
	/**
	 * Method to generate an Average View based on the provided parameters. This method will
	 * only generate the charts that are appropriate for the selected analysis.
	 * 
	 * @param builder the chosen ViewBuilder to create the View
	 * @param data the data provided from the Analysis subclass
	 * @param labels the labels that correspond to the current analysis type
	 */
	public void constructAverageView(ViewBuilder builder, List<Map<Integer, Float>> data, List<String[]> labels) {
		MainUI.getInstance().getParams().setStartYearValue(MainUI.getInstance().getParams().getEndYear().value);
		
		builder.reset();
		builder.createPie(data, labels, AVERAGE);
		builder.createReport(data, labels, AVERAGE);
		
		JFrame frame = new JFrame("Analysis Complete");
		JOptionPane.showMessageDialog(frame,
				"Analysis succsssfully completed. Please select viewers to display the results.");
	}

}
;