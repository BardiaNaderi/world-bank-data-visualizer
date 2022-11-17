package viewBuilders;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import java.util.Map;

import javax.swing.BorderFactory;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;

import userInputObervers.AnalysisParameters;

public class TwoSeriesViewBuilder implements ViewBuilder {
	
	private View view;
	//Map<Integer, Float> data;

	public TwoSeriesViewBuilder() {		
		this.reset();
	};
	
	public void reset() {
		this.view = new View();
		//this.data = null;
	}
	
	public void createLine(Map<Integer, Float> data) {
		//TODO add logic for creating a one series line chart
		//this.view.setLine(new Chart());
	}
	
	public void createTime(Map<Integer, Float> data) {
		// TODO add logic for creating a one series time chart
		//this.view.setTime(new Chart());
	}
	
	public void createBar(Map<Integer, Float> data) {
		// TODO add logic for creating a one series bar graph
		//this.view.setBar(new Chart());
	}
	
	public void createPie(Map<Integer, Float> data) {
		// TODO add logic for creating a one series pie chart
		//this.view.setPie(new Chart());
	}
	
	public void createScatter(List<Map<Integer, Float>> data, List<String[]> labels, String axis) {
		TimeSeries series1 = new TimeSeries(labels.get(0)[1]);
		TimeSeries series2 = new TimeSeries(labels.get(1)[1]);
		
		for (Map.Entry<Integer, Float> entry: data.get(0).entrySet()) {
			series1.add(new Year(entry.getKey()), entry.getValue());
		}
		
		for (Map.Entry<Integer, Float> entry: data.get(1).entrySet()) {
			series2.add(new Year(entry.getKey()), entry.getValue());
		}
		
		TimeSeriesCollection dataset1 = new TimeSeriesCollection();
		dataset1.addSeries(series1);
		
		TimeSeriesCollection dataset2 = new TimeSeriesCollection();
		dataset2.addSeries(series2);
		
		
		XYPlot plot = new XYPlot();
		XYItemRenderer itemrenderer1 = new XYLineAndShapeRenderer(false, true);
		XYItemRenderer itemrenderer2 = new XYLineAndShapeRenderer(false, true);

		DateAxis domainAxis = new DateAxis("Year");
		plot.setDomainAxis(domainAxis);
		
		plot.setDataset(0, dataset1);
		plot.setRenderer(0, itemrenderer1);
		plot.setRangeAxis(0, new NumberAxis(labels.get(0)[2]));

		plot.setDataset(1, dataset2);
		plot.setRenderer(1, itemrenderer2);
		plot.setRangeAxis(1, new NumberAxis(labels.get(1)[2]));
		
		plot.mapDatasetToRangeAxis(0, 0);// 1st dataset to 1st y-axis
		plot.mapDatasetToRangeAxis(1, 1); // 2nd dataset to 2nd y-axis

		JFreeChart scatterChart = new JFreeChart("FIX CO2 ENERGY POLLUTION",
				new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

		ChartPanel chartPanel = new ChartPanel(scatterChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);

		this.view.setScatter(chartPanel);
		AnalysisParameters.getParams().setView(getView());
		System.out.println("we are here in 3 series");
	}
	
	public void createReport(Map<Integer, Float> data) {
		// TODO add logic for creating a one series report
		//this.view.setReport(new Chart());
	}
	
	public View getView() {
		return this.view;	
	}


}
