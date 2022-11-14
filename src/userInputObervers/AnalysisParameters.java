package userInputObervers;

import analysisFactory.Analysis;
import analysisFactory.AnalysisFactory;

public class AnalysisParameters {
	
	private static AnalysisParameters params = null;
	
	private int analysis;
    private String country;
    private int startYear;
    private int endYear;
    
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
    
    public String getCountry(String country) {
    	return this.country;
    }
    
    public int getStartYear(int startYear) {
    	return this.startYear;
    }
    
    public int getEndYear(int endYear) {
    	return this.endYear;
    }
    
    public int getAnalysis(int analysis) {
    	return this.analysis;
    }
    
    // This method triggers the AnalysisFactory to run a new analysis with the selected parameters
    public void recalculate() {
    	Analysis newAnalysis = AnalysisFactory.createAnalysis(analysis, country, startYear, endYear);
		newAnalysis.executeAnalysis();
    }

}
