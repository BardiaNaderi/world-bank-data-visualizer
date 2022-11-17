package viewBuilders;

import org.jfree.chart.ChartPanel;

public class View {
	
	public ChartPanel line;
	public ChartPanel time;
	public ChartPanel bar;
	public ChartPanel pie;
	public ChartPanel scatter;
	public ChartPanel report;
	
	public View() {
		this.line = null;
		this.time = null;
		this.bar = null;
		this.pie = null;
		this.scatter = null;
		this.report = null;
	}		
	
	public ChartPanel getLine() {
		return this.line;
	}
	
	public ChartPanel getTime() {
		return this.time;
	}
	
	public ChartPanel getBar() {
		return this.bar;
	}
	
	public ChartPanel getPie() {
		return this.pie;
	}
	
	public ChartPanel getScatter() {
		return this.scatter;
	}
	
	public ChartPanel getReport() {
		return this.report;
	}
	
	public void setLine(ChartPanel line) {
		this.line = line;
	}
	
	public void setTime(ChartPanel time) {
		this.time = time;
	}
	
	public void setBar(ChartPanel bar) {
		this.bar = bar;
	}
	
	public void setPie(ChartPanel pie) {
		this.pie = pie;
	}
	
	public void setScatter(ChartPanel scatter) {
		this.scatter = scatter;
	}
	
	public void setReport(ChartPanel report) {
		this.report = report;
	}

}
