package viewBuilders;

import org.jfree.chart.ChartPanel;

public class Chart {
	
	private String name;
	private ChartPanel chart;
	private Boolean display;
	
	public Chart(String name, ChartPanel chart, Boolean display) {
		this.name = name;
		this.chart = chart;
		this.display = display;
	}
	
	public String getName() {
		return this.name;
	}
	
	public ChartPanel getChart() {
		return this.chart;
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
	
	public void setDisplay(Boolean display) {
		this.display = display;
	}

}
