package userInputObervers;

public class AnalysisYearValidator implements Validator {
	
	public void update(int analysis, String country, int startYear, int endYear, String viewer) {
        // TODO: implement validation logic
    	validateStartYear(startYear, analysis);
    	validateEndYear(endYear, analysis);
		
    	// If parameters are valid:
    	AnalysisParameters.getParams().setAnalysis(analysis);
    	AnalysisParameters.getParams().setStartYear(startYear);
    	AnalysisParameters.getParams().setEndYear(endYear);
    	
    	// If any parameter is invalid:
    	// Trigger an error message
    }
    
    private void validateStartYear(int startYear, int analysis) {
    	// TODO: implement helper method
    }
    
    private void validateEndYear(int endYear, int analysis) {
    	// TODO: implement helper method
    }
    
}

