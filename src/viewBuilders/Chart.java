package viewBuilders;

import javax.swing.JScrollPane;

import org.jfree.chart.ChartPanel;

public class Chart {
	
	private String name;
	private ChartPanel chart;
	private JScrollPane report;
	private Boolean display;
	
	public Chart(String name, ChartPanel chart, JScrollPane report, Boolean display) {
		this.name = name;
		this.chart = chart;
		this.report = report;
		this.display = display;
	}
	
	/**
	 * Getter method for the name attribute
	 * @return the name of the Chart
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter method for the chart 
	 * @return the ChartPanel object saved to the Chart
	 */
	public ChartPanel getChart() {
		return this.chart;
	}

	/**
	 * Getter method for the report 
	 * @return the JScrollPane object saved to the Chart
	 */
	public JScrollPane getReport() {
		return this.report;
	}

	/**
	 * Getter method for the display attribute
	 * @return whether or not the current Chart is chosen by the user to be displayed
	 */
	public Boolean getDisplay() {
		return this.display;
	}

	/**
	 * Setter method for the name attribute
	 * @param name the value to be set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Setter method for the chart attribute
	 * @param name the value to be set
	 */
	public void setChart(ChartPanel chart) {
		this.chart = chart;
	}
	
	/**
	 * Setter method for the report attribute
	 * @param name the value to be set
	 */
	public void setReport(JScrollPane report) {
		this.report = report;
	}
	
	/**
	 * Setter method for the display attribute
	 * @param name the value to be set
	 */
	public void setDisplay(Boolean display) {
		this.display = display;
	}

}
