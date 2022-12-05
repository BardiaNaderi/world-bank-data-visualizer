package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import graphBuilders.View;
import mainApplication.MainUI;
import userInput.ParametersSelector;

class ViewerValidatorTest {

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
}
