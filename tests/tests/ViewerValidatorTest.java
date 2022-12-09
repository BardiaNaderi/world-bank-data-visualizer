package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import graphBuilders.View;
import mainApplication.MainUI;
import userInput.ParametersSelector;

class ViewerValidatorTest {

	/**
	 * Use Case 5: Test 01
	 * 
	 * Checking if pie chart exists and can be displayed for the selected analysis that is valid and works for pie charts
     * 
	 * @result the pie chart exists - returns not null - and the pie chart can be displayed
	 */
	@Test
	void testPieChartExistsForValidAnalysis() {
		ParametersSelector params = new ParametersSelector();
		params.selectCountry("Canada");
		params.selectStartYear("2011");
		params.selectEndYear("2014");
		params.selectAnalysis("3");
		params.recalculate();
		params.addViewer("Pie Chart");
		
		View view = MainUI.getInstance().getView();
		
		assertNotNull(view.getPie().getChart());

		assertTrue(view.getPie().getDisplay());		
	}

	/**
	 * Use Case 5: Test 02
	 * 
	 * Checking if pie chart does not exist and can be displayed for the selected analysis that is valid but does not work for pie charts
     * 
	 * @result the pie chart does not exist - returns null - and the pie chart can be displayed
	 */
	@Test
	void testPieChartDoesNotExistForInvalidAnalysis() {
		ParametersSelector params = new ParametersSelector();
		params.selectCountry("Canada");
		params.selectStartYear("2011");
		params.selectEndYear("2014");
		params.selectAnalysis("0");
		params.recalculate();
		params.addViewer("Pie Chart");

		View view = MainUI.getInstance().getView();
		
		assertNull(view.getPie().getChart());
		
		assertTrue(view.getPie().getDisplay());		
	}
	
	/**
	 * Use Case 5: Test 03
	 * 
	 * Checking if bar chart exists and can be displayed for the selected analysis that is valid
     * 
	 * @result the bar chart exists - returns not null - and the bar chart can be displayed
	 */
	@Test
	void testBarChartExistsForValidAnalysis() {
		ParametersSelector params = new ParametersSelector();
		params.selectCountry("Canada");
		params.selectStartYear("2011");
		params.selectEndYear("2014");
		params.selectAnalysis("0");
		params.recalculate();
		params.addViewer("Bar Chart");
		
		View view = MainUI.getInstance().getView();
		
		assertNotNull(view.getBar().getChart());
		
		assertTrue(view.getBar().getDisplay());		
	}
	
	/**
	 * Use Case 5: Test 04
	 * 
	 * Checking if line chart exists and can be displayed for the selected analysis that is valid
     * 
	 * @result the line chart exists - returns not null - and the line chart can be displayed
	 */
	@Test
	void testLineChartExistsForValidAnalysis() {
		ParametersSelector params = new ParametersSelector();
		params.selectCountry("Canada");
		params.selectStartYear("2011");
		params.selectEndYear("2014");
		params.selectAnalysis("0");
		params.recalculate();
		params.addViewer("Line Chart");
		
		View view = MainUI.getInstance().getView();
		
		assertNotNull(view.getLine().getChart());		
		
		assertTrue(view.getLine().getDisplay());		
	}
	
	/**
	 * Use Case 5: Test 05
	 * 
	 * Checking if scatter chart exists and can be displayed for the selected analysis that is valid
     * 
	 * @result the scatter chart exists - returns not null - and the scatter chart can be displayed
	 */
	@Test
	void testScatterChartExistsForValidAnalysis() {
		ParametersSelector params = new ParametersSelector();
		params.selectCountry("Canada");
		params.selectStartYear("2011");
		params.selectEndYear("2014");
		params.selectAnalysis("0");
		params.recalculate();
		params.addViewer("Scatter Chart");
		
		View view = MainUI.getInstance().getView();
		
		assertNotNull(view.getScatter().getChart());	
		
		assertTrue(view.getScatter().getDisplay());		
	}
	
	/**
	 * Use Case 5: Test 06
	 * 
	 * Checking if time chart exists and can be displayed for the selected analysis that is valid
     * 
	 * @result the time chart exists - returns not null - and the time chart can be displayed
	 */
	@Test
	void testTimeChartExistsForValidAnalysis() {
		ParametersSelector params = new ParametersSelector();
		params.selectCountry("Canada");
		params.selectStartYear("2011");
		params.selectEndYear("2014");
		params.selectAnalysis("0");
		params.recalculate();
		params.addViewer("Time Chart");
		
		View view = MainUI.getInstance().getView();
		
		assertNotNull(view.getTime().getChart());	
		
		assertTrue(view.getTime().getDisplay());		
	}
	
	/**
	 * Use Case 5: Test 07
	 * 
	 * Checking if report exists and can be displayed for the selected analysis that is valid
     * 
	 * @result the report exists - returns not null - and the report can be displayed
	 */
	@Test
	void testReportExistsForValidAnalysis() {
		ParametersSelector params = new ParametersSelector();
		params.selectCountry("Canada");
		params.selectStartYear("2011");
		params.selectEndYear("2014");
		params.selectAnalysis("0");
		params.recalculate();
		params.addViewer("Report");
		
		View view = MainUI.getInstance().getView();
		
		assertNotNull(view.getReport().getReport());	
		
		assertTrue(view.getReport().getDisplay());		
	}
	
	/**
	 * Use Case 6: Test 01
	 * 
	 * Checking if pie chart is removed and is not being displayed for valid analysis
     * 
	 * @result the pie chart is removed but exists - returns not null - and the pie chart is not displayed
	 */
	@Test
	void testPieChartIsRemovedForValidAnalysis() {
		ParametersSelector params = new ParametersSelector();
		params.selectCountry("Canada");
		params.selectStartYear("2011");
		params.selectEndYear("2014");
		params.selectAnalysis("3");
		params.recalculate();
		params.addViewer("Pie Chart");
		params.removeViewer("Pie Chart");
		
		View view = MainUI.getInstance().getView();
		
		assertNotNull(view.getPie().getChart());

		assertFalse(view.getPie().getDisplay());		
	}
	
	/**
	 * Use Case 6: Test 02
	 * 
	 * Checking if bar chart is removed and is not being displayed for valid analysis
     * 
	 * @result the bar chart is removed but exists - returns not null - and the bar chart is not displayed
	 */
	@Test
	void testBarChartIsRemovedForValidAnalysis() {
		ParametersSelector params = new ParametersSelector();
		params.selectCountry("Canada");
		params.selectStartYear("2011");
		params.selectEndYear("2014");
		params.selectAnalysis("0");
		params.recalculate();
		params.addViewer("Bar Chart");
		params.removeViewer("Bar Chart");
		
		View view = MainUI.getInstance().getView();
		
		assertNotNull(view.getBar().getChart());
		
		assertFalse(view.getBar().getDisplay());		
	}
	
	/**
	 * Use Case 6: Test 03
	 * 
	 * Checking if line chart is removed and is not being displayed for valid analysis
     * 
	 * @result the line chart is removed but exists - returns not null - and the line chart is not displayed
	 */
	@Test
	void testLineChartIsRemovedForValidAnalysis() {
		ParametersSelector params = new ParametersSelector();
		params.selectCountry("Canada");
		params.selectStartYear("2011");
		params.selectEndYear("2014");
		params.selectAnalysis("0");
		params.recalculate();
		params.addViewer("Line Chart");
		params.removeViewer("Line Chart");
		
		View view = MainUI.getInstance().getView();
		
		assertNotNull(view.getLine().getChart());		
		
		assertFalse(view.getLine().getDisplay());		
	}
	
	/**
	 * Use Case 6: Test 04
	 * 
	 * Checking if scatter chart is removed and is not being displayed for valid analysis
     * 
	 * @result the scatter chart is removed but exists - returns not null - and the scatter chart is not displayed
	 */
	@Test
	void testScatterChartIsRemovedForValidAnalysis() {
		ParametersSelector params = new ParametersSelector();
		params.selectCountry("Canada");
		params.selectStartYear("2011");
		params.selectEndYear("2014");
		params.selectAnalysis("0");
		params.recalculate();
		params.addViewer("Scatter Chart");
		params.removeViewer("Scatter Chart");
		
		View view = MainUI.getInstance().getView();
		
		assertNotNull(view.getScatter().getChart());	
		
		assertFalse(view.getScatter().getDisplay());		
	}
	
	/**
	 * Use Case 6: Test 05
	 * 
	 * Checking if time chart is removed and is not being displayed for valid analysis
     * 
	 * @result the time chart is removed but exists - returns not null - and the time chart is not displayed
	 */
	@Test
	void testTimeChartIsRemovedForValidAnalysis() {
		ParametersSelector params = new ParametersSelector();
		params.selectCountry("Canada");
		params.selectStartYear("2011");
		params.selectEndYear("2014");
		params.selectAnalysis("0");
		params.recalculate();
		params.addViewer("Time Chart");
		params.removeViewer("Time Chart");
		
		View view = MainUI.getInstance().getView();
		
		assertNotNull(view.getTime().getChart());	
		
		assertFalse(view.getTime().getDisplay());		
	}
	
	/**
	 * Use Case 6: Test 06
	 * 
	 * Checking if report is removed and is not being displayed for valid analysis
     * 
	 * @result the report is removed but exists - returns not null - and the report is not displayed
	 */
	@Test
	void testReportIsRemovedForValidAnalysis() {
		ParametersSelector params = new ParametersSelector();
		params.selectCountry("Canada");
		params.selectStartYear("2011");
		params.selectEndYear("2014");
		params.selectAnalysis("0");
		params.recalculate();
		params.addViewer("Report");
		params.removeViewer("Report");
		
		View view = MainUI.getInstance().getView();
		
		assertNotNull(view.getReport().getReport());	
		
		assertFalse(view.getReport().getDisplay());		
	}
}
