package userInputObervers;

import analysisFactory.Analysis;
import analysisFactory.AnalysisFactory;
import mainGUI.MainUI;
import viewBuilders.View;

public class AnalysisParameters {
	
	private static AnalysisParameters params = null;
	
	private int analysis;
    private String country;
    private int startYear;
    private int endYear;
    private View view;
    
    private AnalysisParameters() {
    	this.analysis = 0;
    	this.country = "BRA";
    	this.startYear = 2021;
    	this.endYear = 2021;
    }
    
    public static AnalysisParameters getParams() {
		if (params == null) {
			params = new AnalysisParameters();
		}
		return params;
	}
    
    public void setCountry(String country) {
    	this.country = country;
    }
    
    public void setStartYear(int startYear) {
    	this.startYear = startYear;
    }
    
    public void setEndYear(int endYear) {
    	this.endYear = endYear;
    }
    
    public void setAnalysis(int analysis) {
    	this.analysis = analysis;
    }
    
    public void setView (View view) {
    	this.view = view;
    }
    
    public String getCountry() {
    	return this.country;
    }
    
    public int getStartYear() {
    	return this.startYear;
    }
    
    public int getEndYear() {
    	return this.endYear;
    }
    
    public int getAnalysis() {
    	return this.analysis;
    }
    
    public View getView() {
    	return this.view;
    }
    
    // This method triggers the AnalysisFactory to run a new analysis with the selected parameters
    public void recalculate() {
    	MainUI gui = MainUI.getInstance();
    	gui.getWest().removeAll();
    	gui.setVisible(true);
    	
    	Analysis newAnalysis = AnalysisFactory.createAnalysis(analysis, country, startYear, endYear);
		newAnalysis.executeAnalysis();
    }

}
