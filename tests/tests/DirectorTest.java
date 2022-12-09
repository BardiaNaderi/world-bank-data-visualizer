package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import graphBuilders.Director;
import graphBuilders.OneSeriesViewBuilder;
import graphBuilders.View;
import mainApplication.MainUI;

public class DirectorTest {
	
	static Director director = new Director();
	static OneSeriesViewBuilder builder = new OneSeriesViewBuilder();
	static List<Map<Integer, Float>> data;
	static List<String[]> labels;
	
	@BeforeEach
	public void setUp(){
		MainUI.getInstance().setView(new View());
		MainUI.getInstance().getParams().setEndYearValue("2013");
		
		Map<Integer, Float> values = new HashMap<Integer, Float>();;
		values.put(2011, (float) 1);
		values.put(2012, (float) 2);
		values.put(2013, (float) 3);
		data = Arrays.asList(values);
		
		String[] label1 = {"data1", "label1"};
		String[] label2 = {"data2", "label2"};
		labels = Arrays.asList(label1, label2);
	}
	
	/**
	 * Use Case 8: Test 01
	 * 
	 * Test that all of the expected charts are generated when the 
	 * constructRatioView method is called, and that any other charts
	 * remain null
	 * 
	 * @result constructRatioView should only create a Line, Time, Bar,
	 * Scatter, and Report Chart
	 */
	@Test
	void testConstructRatioViewCreatesProperCharts() {
		assertNull(MainUI.getInstance().getView().getLine().getChart());
		assertNull(MainUI.getInstance().getView().getTime().getChart());
		assertNull(MainUI.getInstance().getView().getBar().getChart());
		assertNull(MainUI.getInstance().getView().getScatter().getChart());
		assertNull(MainUI.getInstance().getView().getPie().getChart());
		assertNull(MainUI.getInstance().getView().getReport().getReport());
		
		director.constructRatioView(builder, data, labels);
		
		assertNotNull(MainUI.getInstance().getView().getLine().getChart());
		assertNotNull(MainUI.getInstance().getView().getTime().getChart());
		assertNotNull(MainUI.getInstance().getView().getBar().getChart());
		assertNotNull(MainUI.getInstance().getView().getScatter().getChart());
		assertNotNull(MainUI.getInstance().getView().getReport().getReport());
		
		assertNull(MainUI.getInstance().getView().getPie().getChart());
	}
	
	/**
	 * Use Case 8: Test 02
	 * 
	 * Test that all of the expected charts are generated when the 
	 * constructAnnualPercentageChangeView method is called, and that
	 * any other charts remain null
	 * 
	 * @result constructRatioView should only create a Line, Time, Bar,
	 * Scatter, and Report Chart
	 */
	@Test
	void testConstructAnnualPercentageViewCreatesProperCharts() {
		assertNull(MainUI.getInstance().getView().getLine().getChart());
		assertNull(MainUI.getInstance().getView().getTime().getChart());
		assertNull(MainUI.getInstance().getView().getBar().getChart());
		assertNull(MainUI.getInstance().getView().getScatter().getChart());
		assertNull(MainUI.getInstance().getView().getPie().getChart());
		assertNull(MainUI.getInstance().getView().getReport().getReport());
		
		director.constructAnnualPercentageView(builder, data, labels);
		
		assertNotNull(MainUI.getInstance().getView().getLine().getChart());
		assertNotNull(MainUI.getInstance().getView().getTime().getChart());
		assertNotNull(MainUI.getInstance().getView().getBar().getChart());
		assertNotNull(MainUI.getInstance().getView().getScatter().getChart());
		assertNotNull(MainUI.getInstance().getView().getReport().getReport());
		
		assertNull(MainUI.getInstance().getView().getPie().getChart());
	}
	
	/**
	 * Use Case 8: Test 03
	 * 
	 * Test that all of the expected charts are generated when the 
	 * constructAverageView method is called, and that any other charts
	 * remain null
	 * 
	 * @result constructRatioView should only create a Pie Chart and
	 * a Report
	 */
	@Test
	void testConstructAverageViewCreatesProperCharts() {
		assertNull(MainUI.getInstance().getView().getLine().getChart());
		assertNull(MainUI.getInstance().getView().getTime().getChart());
		assertNull(MainUI.getInstance().getView().getBar().getChart());
		assertNull(MainUI.getInstance().getView().getScatter().getChart());
		assertNull(MainUI.getInstance().getView().getPie().getChart());
		assertNull(MainUI.getInstance().getView().getReport().getReport());
		
		director.constructAverageView(builder, data, labels);
		
		assertNotNull(MainUI.getInstance().getView().getPie().getChart());
		assertNotNull(MainUI.getInstance().getView().getReport().getReport());
		
		assertNull(MainUI.getInstance().getView().getLine().getChart());
		assertNull(MainUI.getInstance().getView().getTime().getChart());
		assertNull(MainUI.getInstance().getView().getBar().getChart());
		assertNull(MainUI.getInstance().getView().getScatter().getChart());		
	}
	
}
