package viewBuilders;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import mainGUI.MainUI;

public class ThreeSeriesViewBuilder implements ViewBuilder {
	
	private View view;
	String graphTitle = "";

	public ThreeSeriesViewBuilder() {		
		this.reset();
	};
	
	/**
	 * Method to clear the current view from the builder
	 */
	public void reset() {
		this.view = new View();
	}
	
	
	/**
	 * Method to generate a Three Series List Chart based on the provided attributes
	 * This method will process three sets of data for the chart
	 * 
	 * @param data the data to be used for the chart
	 * @param labels the labels to assign the chart values
	 * @param axis the label for the chart axis
	 */
	public void createLine(List<Map<Integer, Float>> data, List<String[]> labels, String axis) {
		XYSeries series1 = new XYSeries(labels.get(0)[1]);
		for (Map.Entry<Integer, Float> entry: data.get(0).entrySet()) {
			series1.add(entry.getKey(), entry.getValue());
		}

		XYSeries series2 = new XYSeries(labels.get(1)[1]);
		for (Map.Entry<Integer, Float> entry: data.get(1).entrySet()) {
			series2.add(entry.getKey(), entry.getValue());
		}

		XYSeries series3 = new XYSeries(labels.get(2)[1]);
		for (Map.Entry<Integer, Float> entry: data.get(2).entrySet()) {
			series3.add(entry.getKey(), entry.getValue());
		}

		XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(series1);
		dataset.addSeries(series2);
		dataset.addSeries(series3);

		try {
			graphTitle = analysisTitleGetter(MainUI.getInstance().getParams().getAnalysis().value);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JFreeChart chart = ChartFactory.createXYLineChart(graphTitle, "Year", axis, dataset,
				PlotOrientation.VERTICAL, true, true, false);

		XYPlot plot = chart.getXYPlot();

		XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
		renderer.setSeriesPaint(0, Color.RED);
		renderer.setSeriesStroke(0, new BasicStroke(2.0f));

		plot.setRenderer(renderer);
		plot.setBackgroundPaint(Color.white);

		plot.setRangeGridlinesVisible(true);
		plot.setRangeGridlinePaint(Color.BLACK);

		plot.setDomainGridlinesVisible(true);
		plot.setDomainGridlinePaint(Color.BLACK);

		chart.getLegend().setFrame(BlockBorder.NONE);

		chart.setTitle(
				new TextTitle(graphTitle, 
						new Font("Serif", java.awt.Font.BOLD, 18)));

		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		
		this.view.getLine().setChart(chartPanel);
		MainUI.getInstance().setView(getView());
	}
	
	/**
	 * Method to generate a Three Series Time Chart based on the provided attributes
	 * This method will process three sets of data for the chart
	 * 
	 * @param data the data to be used for the chart
	 * @param labels the labels to assign the chart values
	 * @param axis the label for the chart axis
	 */
	public void createTime(List<Map<Integer, Float>> data, List<String[]> labels, String axis) {
		TimeSeries series1 = new TimeSeries(labels.get(0)[1]);
		TimeSeries series2 = new TimeSeries(labels.get(1)[1]);
		TimeSeries series3 = new TimeSeries(labels.get(2)[1]);
		
		for (Map.Entry<Integer, Float> entry: data.get(0).entrySet()) {
			series1.add(new Year(entry.getKey()), entry.getValue());
		}

		for (Map.Entry<Integer, Float> entry: data.get(1).entrySet()) {
			series2.add(new Year(entry.getKey()), entry.getValue());
		}
		
		for (Map.Entry<Integer, Float> entry: data.get(2).entrySet()) {
			series3.add(new Year(entry.getKey()), entry.getValue());
		}
		
		TimeSeriesCollection dataset1 = new TimeSeriesCollection();
		TimeSeriesCollection dataset2 = new TimeSeriesCollection();
		TimeSeriesCollection dataset3 = new TimeSeriesCollection();
				
		dataset1.addSeries(series1);
		dataset2.addSeries(series2);
		dataset3.addSeries(series3);

		XYPlot plot = new XYPlot();
		XYSplineRenderer splinerenderer1 = new XYSplineRenderer();
		XYSplineRenderer splinerenderer2 = new XYSplineRenderer();
		XYSplineRenderer splinerenderer3 = new XYSplineRenderer();

		DateAxis domainAxis = new DateAxis("Year");
		plot.setDomainAxis(domainAxis);
		plot.setRangeAxis(new NumberAxis(axis));
		
		plot.setDataset(0, dataset1);
		plot.setRenderer(0, splinerenderer1);

		plot.setDataset(1, dataset2);
		plot.setRenderer(1, splinerenderer2);
		
		plot.setDataset(2, dataset3);
		plot.setRenderer(2, splinerenderer3);

		plot.mapDatasetToRangeAxis(0, 0);

		try {
			graphTitle = analysisTitleGetter(MainUI.getInstance().getParams().getAnalysis().value);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JFreeChart chart = new JFreeChart(graphTitle,
				new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		
		this.view.getTime().setChart(chartPanel);
		MainUI.getInstance().setView(getView());
	}
	
	/**
	 * Method to generate a Three Series Bar Chart based on the provided attributes
	 * This method will process three sets of data for the chart
	 * 
	 * @param data the data to be used for the chart
	 * @param labels the labels to assign the chart values
	 * @param axis the label for the chart axis
	 */
	public void createBar(List<Map<Integer, Float>> data, List<String[]> labels, String axis) {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for (Map.Entry<Integer, Float> entry: data.get(0).entrySet()) {
			dataset.setValue(entry.getValue(), labels.get(0)[1], entry.getKey());
		}

		for (Map.Entry<Integer, Float> entry: data.get(1).entrySet()) {
			dataset.setValue(entry.getValue(), labels.get(1)[1], entry.getKey());
		}
		
		for (Map.Entry<Integer, Float> entry: data.get(2).entrySet()) {
			dataset.setValue(entry.getValue(), labels.get(2)[1], entry.getKey());
		}
		
		try {
			graphTitle = analysisTitleGetter(MainUI.getInstance().getParams().getAnalysis().value);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JFreeChart barChart = ChartFactory.createBarChart(graphTitle, "Year",
				axis, dataset, PlotOrientation.VERTICAL, true, true, false);
	 
		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		
		this.view.getBar().setChart(chartPanel);
		MainUI.getInstance().setView(getView());
	}
	
	/**
	 * Method to generate a Three Series Pie Chart based on the provided attributes
	 * This method will process three sets of data for the chart
	 * 
	 * @param data the data to be used for the chart
	 * @param labels the labels to assign the chart values
	 * @param axis the label for the chart axis
	 */
	public void createPie(List<Map<Integer, Float>> data, List<String[]> labels, String axis) {		
		int end = Integer.parseInt(MainUI.getInstance().getParams().getEndYear().value);
		
		try {
			graphTitle = analysisTitleGetter(MainUI.getInstance().getParams().getAnalysis().value);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		String title = "Average " + graphTitle;
		
		String key1 = labels.get(0)[1];
		float value1 = data.get(0).get(end);	

		String key2 = labels.get(1)[1];
		float value2 = data.get(1).get(end);	
		
		String key3 = labels.get(2)[1];
		float value3 = data.get(2).get(end);
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		dataset.addValue(value1, "Average " + graphTitle, key1);
		dataset.addValue(100-value1, "Remaining", key1);
		dataset.addValue(value2, "Average " + graphTitle, key2);
		dataset.addValue(100-value2, "Remaining", key2);
		dataset.addValue(value3, "Average " + graphTitle, key3);
		dataset.addValue(100-value3, "Remaining", key3);
		
		JFreeChart pieChart = ChartFactory.createMultiplePieChart(title, dataset,
				TableOrder.BY_COLUMN, true, true, false);

		ChartPanel chartPanel = new ChartPanel(pieChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		
		this.view.getPie().setChart(chartPanel);
		MainUI.getInstance().setView(getView());
	}
	
	/**
	 * Method to generate a Three Series Scatter Chart based on the provided attributes
	 * This method will process three sets of data for the chart
	 * 
	 * @param data the data to be used for the chart
	 * @param labels the labels to assign the chart values
	 * @param axis the label for the chart axis
	 */
	public void createScatter(List<Map<Integer, Float>> data, List<String[]> labels, String axis) {
		TimeSeries series1 = new TimeSeries(labels.get(0)[1]);
		TimeSeries series2 = new TimeSeries(labels.get(1)[1]);
		TimeSeries series3 = new TimeSeries(labels.get(2)[1]);
		
		for (Map.Entry<Integer, Float> entry: data.get(0).entrySet()) {
			series1.add(new Year(entry.getKey()), entry.getValue());
		}
		
		for (Map.Entry<Integer, Float> entry: data.get(1).entrySet()) {
			series2.add(new Year(entry.getKey()), entry.getValue());
		}
		
		for (Map.Entry<Integer, Float> entry: data.get(2).entrySet()) {
			series3.add(new Year(entry.getKey()), entry.getValue());
		}
		
		TimeSeriesCollection dataset = new TimeSeriesCollection();
		dataset.addSeries(series1);
		dataset.addSeries(series2);
		dataset.addSeries(series3);

		XYPlot plot = new XYPlot();
		XYItemRenderer itemrenderer1 = new XYLineAndShapeRenderer(false, true);

		plot.setDataset(0, dataset);
		plot.setRenderer(0, itemrenderer1);
		DateAxis domainAxis = new DateAxis("Year");
		plot.setDomainAxis(domainAxis);
		plot.setRangeAxis(new NumberAxis(axis));

		plot.mapDatasetToRangeAxis(0, 0);
		plot.mapDatasetToRangeAxis(1, 1);

		try {
			graphTitle = analysisTitleGetter(MainUI.getInstance().getParams().getAnalysis().value);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JFreeChart scatterChart = new JFreeChart(graphTitle,
				new Font("Serif", java.awt.Font.BOLD, 18), plot, true);

		ChartPanel chartPanel = new ChartPanel(scatterChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		
		this.view.getScatter().setChart(chartPanel);
		MainUI.getInstance().setView(getView());
	}
	
	/**
	 * Method to generate a Three Series Report based on the provided attributes
	 * This method will process three sets of data for the chart
	 * 
	 * @param data the data to be used for the chart
	 * @param labels the labels to assign the chart values
	 * @param axis the label for the chart axis
	 */
	public void createReport(List<Map<Integer, Float>> data, List<String[]> labels, String axis) {
		JTextArea report = new JTextArea();
		report.setEditable(false);
		report.setPreferredSize(new Dimension(400, 250));
		report.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		report.setBackground(Color.white);
		
		String reportMessage;
		
		Map<Integer, Float> map1 = data.get(0);
		Map<Integer, Float> map2 = data.get(1);
		Map<Integer, Float> map3 = data.get(2);
				
		String label1 = labels.get(0)[1];
		String label2 = labels.get(1)[1];
		String label3 = labels.get(2)[1];
		
		int start = Integer.parseInt(MainUI.getInstance().getParams().getStartYear().value);
		int end = Integer.parseInt(MainUI.getInstance().getParams().getEndYear().value);

		try {
			graphTitle = analysisTitleGetter(MainUI.getInstance().getParams().getAnalysis().value);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		reportMessage = graphTitle + "\n" + "==============================\n"; 
		for (int i = start; i <= end; i++) {
				reportMessage += "\nYear " + i + ":\n"
					 	+ label1 + " => " + map1.getOrDefault(i, (float) 0) + "\n"
						+ label2 + " => " + map2.getOrDefault(i, (float) 0) + "\n"
						+ label3 + " => " + map3.getOrDefault(i, (float) 0) + "\n";
		}

		report.setText(reportMessage);
		JScrollPane outputScrollPane = new JScrollPane(report);
		
		this.view.getReport().setReport(outputScrollPane);
		MainUI.getInstance().setView(getView());
	}
	
	/**
	 * Getter method for the View object
	 * @return the current View
	 */
	public View getView() {
		return this.view;	
	}

	/**
	 * analysisTitleGetter is a method that takes in the analysisId and returns the title associated with that analysis.
	 * @param analysisId the id to be processed
	 * @return analysisTitle, String the name that corresponds with the provided id
	 * @throws IOException
	 */
	private String analysisTitleGetter(String analysisId) throws IOException {
		String filePath = "src/database/analysisYear.csv";
		String analysisTitle = "";

		String analysisLine = Files.readAllLines(Paths.get(filePath)).get(Integer.parseInt(analysisId));

		String[] analysisLineSplit = analysisLine.split(",");
		analysisTitle = analysisLineSplit[0].trim();
		return analysisTitle;
	}
}
