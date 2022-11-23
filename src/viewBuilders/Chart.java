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
	
	public String getName() {
		return this.name;
	}
	
	public ChartPanel getChart() {
		return this.chart;
	}
	
	public JScrollPane getReport() {
		return this.report;
	}
	
	public Boolean getDisplay() {
		return this.display;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setChart(ChartPanel chart) {
		this.chart = chart;
	}
	
	public void setReport(JScrollPane report) {
		this.report = report;
	}
	
	public void setDisplay(Boolean display) {
		this.display = display;
	}

}
