package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import graphBuilders.ThreeSeriesViewBuilder;
import graphBuilders.View;
import mainApplication.MainUI;

public class ThreeSeriesViewBuilderTest {
	
	static ThreeSeriesViewBuilder builder = new ThreeSeriesViewBuilder();
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
		
		Map<Integer, Float> values3 = new HashMap<Integer, Float>();;
		values3.put(2011, (float) 4);
		values3.put(2012, (float) 5);
		values3.put(2013, (float) 6);
		
		data = Arrays.asList(values1, values2, values3);
		
		String[] label1 = {"data1", "label1"};
		String[] label2 = {"data2", "label2"};
		String[] label3 = {"data3", "label3"};
		labels = Arrays.asList(label1, label2, label3);
		
		axis = "axis";
	}

	/**
	 * Use Case 8: Test 16
	 * 
	 * Check the View of the MainUI after using the ThreeSeriesViewBuilder to 
	 * generate a Line Chart to make sure there is a new Line Chart saved to the View
	 * 
	 * @result The line attribute of the View object is not null after the
	 * builder method is called
	 */
	@Test
	void testThreeSeriesBuilderCreatesALineChart() {		
		assertNull(MainUI.getInstance().getView().getLine().getChart());	
		builder.createLine(data, labels, axis);
		assertNotNull(MainUI.getInstance().getView().getLine().getChart());
	}
	
	/**
	 * Use Case 8: Test 17
	 * 
	 * Check the View of the MainUI after using the ThreeSeriesViewBuilder to 
	 * generate a Time Chart to make sure there is a new Time Chart saved to the View
	 * 
	 * @result The time attribute of the View object is not null after the
	 * builder method is called
	 */
	@Test
	void testThreeSeriesBuilderCreatesATimeChart() {		
		assertNull(MainUI.getInstance().getView().getTime().getChart());	
		builder.createTime(data, labels, axis);
		assertNotNull(MainUI.getInstance().getView().getTime().getChart());	
	}
	
	/**
	 * Use Case 8: Test 18
	 * 
	 * Check the View of the MainUI after using the ThreeSeriesViewBuilder to 
	 * generate a bar Chart to make sure there is a new Bar Chart saved to the View
	 * 
	 * @result The bar attribute of the View object is not null after the
	 * builder method is called
	 */
	@Test
	void testThreeSeriesBuilderCreatesABarChart() {	
		assertNull(MainUI.getInstance().getView().getBar().getChart());	
		builder.createBar(data, labels, axis);
		assertNotNull(MainUI.getInstance().getView().getBar().getChart());	
	}
	
	/**
	 * Use Case 8: Test 19
	 * 
	 * Check the View of the MainUI after using the ThreeSeriesViewBuilder to 
	 * generate a Pie Chart to make sure there is a new Pie Chart saved to the View
	 * 
	 * @result The pie attribute of the View object is not null after the
	 * builder method is called
	 */
	@Test
	void testThreeSeriesBuilderCreatesAPieChart() {	
		assertNull(MainUI.getInstance().getView().getPie().getChart());	
		MainUI.getInstance().getParams().setEndYearValue("2013");
		builder.createPie(data, labels, axis);
		assertNotNull(MainUI.getInstance().getView().getPie().getChart());	
	}
	
	/**
	 * Use Case 8: Test 20
	 * 
	 * Check the View of the MainUI after using the ThreeSeriesViewBuilder to 
	 * generate a Scatter Chart to make sure there is a new Scatter Chart saved to the View
	 * 
	 * @result The scatter attribute of the View object is not null after the
	 * builder method is called
	 */
	@Test
	void testThreeSeriesBuilderCreatesAScatterChart() {	
		assertNull(MainUI.getInstance().getView().getScatter().getChart());	
		builder.createScatter(data, labels, axis);
		assertNotNull(MainUI.getInstance().getView().getScatter().getChart());	
	}
	
	/**
	 * Use Case 8: Test 21
	 * 
	 * Check the View of the MainUI after using the ThreeSeriesViewBuilder to 
	 * generate a Report to make sure there is a new Report saved to the View
	 * 
	 * @result The report attribute of the View object is not null after the
	 * builder method is called
	 */
	@Test
	void testThreeSeriesBuilderCreatesAReport() {		
		assertNull(MainUI.getInstance().getView().getReport().getReport());	
		builder.createReport(data, labels, axis);
		assertNotNull(MainUI.getInstance().getView().getReport().getReport());	
	}
	
}