package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import graphBuilders.TwoSeriesViewBuilder;
import graphBuilders.View;
import mainApplication.MainUI;

public class TwoSeriesViewBuilderTest {
	
	static TwoSeriesViewBuilder builder = new TwoSeriesViewBuilder();
	static List<Map<Integer, Float>> data;
	static List<String[]> labels;
	static String axis;
	
	@BeforeAll
	public static void setUp(){
		MainUI.getInstance().setView(new View());
		
		Map<Integer, Float> values1 = new HashMap<Integer, Float>();;
		values1.put(2011, (float) 1);
		values1.put(2012, (float) 2);
		values1.put(2013, (float) 3);
		
		Map<Integer, Float> values2 = new HashMap<Integer, Float>();;
		values2.put(2011, (float) 4);
		values2.put(2012, (float) 5);
		values2.put(2013, (float) 6);
		
		data = Arrays.asList(values1, values2);
		
		String[] label1 = {"data1", "label1"};
		String[] label2 = {"data2", "label2"};
		labels = Arrays.asList(label1, label2);
		
		axis = "axis";
	}

	/**
	 * Check the View of the MainUI after using the TwoSeriesViewBuilder to 
	 * generate a Line Chart to make sure there is a new Line Chart saved to the View
	 * 
	 * @result The line attribute of the View object is not null after the
	 * builder method is called
	 */
	@Test
	void testTwoSeriesBuilderCreatesALineChart() {		
		assertNull(MainUI.getInstance().getView().getLine().getChart());
		builder.createLine(data, labels, axis);
		assertNotNull(MainUI.getInstance().getView().getLine().getChart());	
	}
	
	/**
	 * Check the View of the MainUI after using the TwoSeriesViewBuilder to 
	 * generate a Time Chart to make sure there is a new Time Chart saved to the View
	 * 
	 * @result The time attribute of the View object is not null after the
	 * builder method is called
	 */
	@Test
	void testTwoSeriesBuilderCreatesATimeChart() {	
		assertNull(MainUI.getInstance().getView().getTime().getChart());
		builder.createTime(data, labels, axis);
		assertNotNull(MainUI.getInstance().getView().getTime().getChart());		
	}
	
	/**
	 * Check the View of the MainUI after using the TwoSeriesViewBuilder to 
	 * generate a bar Chart to make sure there is a new Bar Chart saved to the View
	 * 
	 * @result The bar attribute of the View object is not null after the
	 * builder method is called
	 */
	@Test
	void testTwoSeriesBuilderCreatesABarChart() {
		assertNull(MainUI.getInstance().getView().getBar().getChart());
		builder.createBar(data, labels, axis);
		assertNotNull(MainUI.getInstance().getView().getBar().getChart());
	}
	
	/**
	 * Check the View of the MainUI after using the TwoSeriesViewBuilder to 
	 * generate a Pie Chart to make sure there is a new Pie Chart saved to the View
	 * 
	 * @result The pie attribute of the View object is not null after the
	 * builder method is called
	 */
	@Test
	void testTwoSeriesBuilderCreatesAPieChart() {	
		assertNull(MainUI.getInstance().getView().getPie().getChart());
		MainUI.getInstance().getParams().setEndYearValue("2013");
		builder.createPie(data, labels, axis);
		assertNotNull(MainUI.getInstance().getView().getPie().getChart());	
	}
	
	/**
	 * Check the View of the MainUI after using the TwoSeriesViewBuilder to 
	 * generate a Scatter Chart to make sure there is a new Scatter Chart saved to the View
	 * 
	 * @result The scatter attribute of the View object is not null after the
	 * builder method is called
	 */
	@Test
	void testTwoSeriesBuilderCreatesAScatterChart() {		
		assertNull(MainUI.getInstance().getView().getScatter().getChart());
		builder.createScatter(data, labels, axis);
		assertNotNull(MainUI.getInstance().getView().getScatter().getChart());	
	}
	
	/**
	 * Check the View of the MainUI after using the TwoSeriesViewBuilder to 
	 * generate a Report to make sure there is a new Report saved to the View
	 * 
	 * @result The report attribute of the View object is not null after the
	 * builder method is called
	 */
	@Test
	void testTwoSeriesBuilderCreatesAReport() {
		assertNull(MainUI.getInstance().getView().getReport().getReport());
		builder.createReport(data, labels, axis);
		assertNotNull(MainUI.getInstance().getView().getReport().getReport());
	}
	
}
