package userInputObervers;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AnalysisYearValidator implements Validator {
	
	public void update(int analysis, String country, int startYear, int endYear, String viewer) {
		
    	if (startYear > endYear) {
    		JFrame frame = new JFrame("Invalid Selection");
    		JOptionPane.showMessageDialog(frame, "Start year cannot be greater than end year. Please choose another option.",
    	               "Invalid Selection", JOptionPane.ERROR_MESSAGE);
    	}
    	
    	// TODO: this is temporary for testing, need to validate years again analysis in the CSV file
    	else if (analysis == 0 && (startYear == 2020 || endYear == 2020)) {
    		JFrame frame = new JFrame("Invalid Selection");
    		JOptionPane.showMessageDialog(frame, "Analysis is not available for the selected years. Please choose another option.",
    	               "Invalid Selection", JOptionPane.ERROR_MESSAGE);
    	}
    	
    	else {
        	AnalysisParameters.getParams().setAnalysis(analysis);
        	AnalysisParameters.getParams().setStartYear(startYear);
        	AnalysisParameters.getParams().setEndYear(endYear);
    	}
    	
    }
    
}

