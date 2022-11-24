package graphBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class View {
	
	private Chart line;
	private Chart time;
	private Chart bar;
	private Chart pie;
	private Chart scatter;
	private Chart report;
	
	private List<Chart> charts = new ArrayList<>();
			
	public View() {
		this.line = new Chart("Line Chart", null, null, false);
		this.time = new Chart("Time Chart", null, null, false);
		this.bar = new Chart("Bar Chart", null, null, false);
		this.pie = new Chart("Pie Chart", null, null, false);
		this.scatter = new Chart("Scatter Chart", null, null, false);
		this.report = new Chart("Report", null, null, false);
		
		charts = Arrays.asList(getLine(), getTime(), getBar(), getPie(), getScatter(), getReport());
	}		
	
	/**
	 * Getter method for the currently saved Line Chart
	 * @return the Line Chart object
	 */
	public Chart getLine() {
		return this.line;
	}
	
	/**
	 * Getter method for the currently saved Time Chart
	 * @return the Time Chart object
	 */
	public Chart getTime() {
		return this.time;
	}
	
	/**
	 * Getter method for the currently saved Bar Chart
	 * @return the Bar Chart object
	 */
	public Chart getBar() {
		return this.bar;
	}
	
	/**
	 * Getter method for the currently saved Pir Chart
	 * @return the Pir Chart object
	 */
	public Chart getPie() {
		return this.pie;
	}
	
	/**
	 * Getter method for the currently saved Scatter Chart
	 * @return the Scatter Chart object
	 */
	public Chart getScatter() {
		return this.scatter;
	}
	
	/**
	 * Getter method for the currently saved Report
	 * @return the Report object
	 */
	public Chart getReport() {
		return this.report;
	}
	
	/**
	 * Getter method for the list of Charts
	 * @return the list of Chart objects
	 */
	public List<Chart> getCharts() {
		return this.charts;
	}
	
	/**
	 * Setter method for the Line Chart
	 * @param line the new chart to be saves
	 */
	public void setLine(Chart line) {
		this.line = line;
	}
	
	/**
	 * Setter method for the Time Chart
	 * @param line the new chart to be saves
	 */
	public void setTime(Chart time) {
		this.time = time;
	}
	
	/**
	 * Setter method for the Bar Chart
	 * @param line the new chart to be saves
	 */
	public void setBar(Chart bar) {
		this.bar = bar;
	}
	
	/**
	 * Setter method for the Pie Chart
	 * @param line the new chart to be saves
	 */
	public void setPie(Chart pie) {
		this.pie = pie;
	}
	
	/**
	 * Setter method for the Scatter Chart
	 * @param line the new chart to be saves
	 */
	public void setScatter(Chart scatter) {
		this.scatter = scatter;
	}
	
	/**
	 * Setter method for the Report
	 * @param line the new chart to be saves
	 */
	public void setReport(Chart report) {
		this.report = report;
	}

}
