package userInputObervers;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mainGUI.MainUI;

public class AnalysisYearValidator implements Validator {
	
	public void update() {
		
		ParametersSelector params = MainUI.getInstance().getParams();	
		int startYear = Integer.parseInt(params.getStartYear().value);
		int endYear = Integer.parseInt(params.getEndYear().value);
		
    	if (startYear > endYear) {
    		params.setStartYearValid(false);
    		JFrame frame = new JFrame("Invalid Selection");
    		JOptionPane.showMessageDialog(frame, "Start year cannot be greater than end year. Please choose another option.",
    	               "Invalid Selection", JOptionPane.ERROR_MESSAGE);
    	}
    	
    	// TODO: this is temporary for testing, need to validate years again analysis in the CSV file
    	else if (params.getAnalysis().value == "0" && (startYear == 2020 || endYear == 2020)) {
    		params.setAnalysisValid(false);
    		JFrame frame = new JFrame("Invalid Selection");
    		JOptionPane.showMessageDialog(frame, "Analysis is not available for the selected years. Please choose another option.",
    	               "Invalid Selection", JOptionPane.ERROR_MESSAGE);
    	}
    	
    	else {
    		params.setAnalysisValid(true);
    		params.setStartYearValid(true);
    		params.setEndYearValid(true);
    	}
    	
    }
    
}

