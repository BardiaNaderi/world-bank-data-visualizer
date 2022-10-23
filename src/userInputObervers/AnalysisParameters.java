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
    	this.analysis = 1;
    	this.country = "CAN";
    	this.startYear = 2011;
    	this.endYear = 2014;
    }
    
    public static AnalysisParameters getParams() {
		if (params == null) {
			params = new AnalysisParameters();
		}
		return params;
	}
    
    public void setCountry(String county) {
    	this.country = county;
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
    
    // This method triggers the AnalysisFactory to run a new analysis with the selected parameters
    public void recalculate() {
    	Analysis newAnalysis = AnalysisFactory.createAnalysis(analysis, country, startYear, endYear);
		newAnalysis.executeAnalysis();
    }

}
