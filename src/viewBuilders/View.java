package viewBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class View {
	
	final int NUM_CHARTS = 6;
	
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
	
	public Chart getLine() {
		return this.line;
	}
	
	public Chart getTime() {
		return this.time;
	}
	
	public Chart getBar() {
		return this.bar;
	}
	
	public Chart getPie() {
		return this.pie;
	}
	
	public Chart getScatter() {
		return this.scatter;
	}
	
	public Chart getReport() {
		return this.report;
	}
	
	public List<Chart> getCharts() {
		return this.charts;
	}
	
	public void setLine(Chart line) {
		this.line = line;
	}
	
	public void setTime(Chart time) {
		this.time = time;
	}
	
	public void setBar(Chart bar) {
		this.bar = bar;
	}
	
	public void setPie(Chart pie) {
		this.pie = pie;
	}
	
	public void setScatter(Chart scatter) {
		this.scatter = scatter;
	}
	
	public void setReport(Chart report) {
		this.report = report;
	}

}
