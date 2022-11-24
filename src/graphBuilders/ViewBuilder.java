package graphBuilders;

import java.util.Map;
import java.util.List;

public interface ViewBuilder {

	public void reset();
	
	/**
	 * A Method for generating a Line Chart
	 * 
	 * @param data the data to be used for the chart
	 * @param labels the labels to assign the chart values
	 * @param axis the label for the chart axis
	 */
	public void createLine(List<Map<Integer, Float>> data, List<String[]> labels, String axis);
	
	/**
	 * A Method for generating a Time Chart
	 * 
	 * @param data the data to be used for the chart
	 * @param labels the labels to assign the chart values
	 * @param axis the label for the chart axis
	 */
	public void createTime(List<Map<Integer, Float>> data, List<String[]> labels, String axis);
	
	/**
	 * A Method for generating a Bar Chart
	 * 
	 * @param data the data to be used for the chart
	 * @param labels the labels to assign the chart values
	 * @param axis the label for the chart axis
	 */
	public void createBar(List<Map<Integer, Float>> data, List<String[]> labels, String axis);
	
	/**
	 * A Method for generating a Pie Chart
	 * 
	 * @param data the data to be used for the chart
	 * @param labels the labels to assign the chart values
	 * @param axis the label for the chart axis
	 */
	public void createPie(List<Map<Integer, Float>> data, List<String[]> labels, String axis);
	
	/**
	 * A Method for generating a Scatter Chart
	 * 
	 * @param data the data to be used for the chart
	 * @param labels the labels to assign the chart values
	 * @param axis the label for the chart axis
	 */
	public void createScatter(List<Map<Integer, Float>> data, List<String[]> labels, String axis);
	
	/**
	 * A Method for generating a Report
	 * 
	 * @param data the data to be used for the chart
	 * @param labels the labels to assign the chart values
	 * @param axis the label for the chart axis
	 */
	public void createReport(List<Map<Integer, Float>> data, List<String[]> labels, String axis);
	
	/**
	 * Getter method for the View object
	 * @return the current View
	 */
	public View getView();
	
}
