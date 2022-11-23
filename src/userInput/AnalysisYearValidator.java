package userInput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mainApplication.MainUI;

public class AnalysisYearValidator implements Validator {
	
	private int invalid;
	
	/**
	 * This method is called by the ParametorsSelector whenever a user chooses new
	 * parameters from the drop down menus. It checks to see if the currently selected
	 * years are valid for the currently selected analysis. If they are valid, the valid 
	 * flags are turns on for the corresponding parameters. If they are invalid, an
	 * error message is thrown. 
	 */
	public void update() {
		
		ParametersSelector params = MainUI.getInstance().getParams();	
		int startYear = Integer.parseInt(params.getStartYear().value);
		int endYear = Integer.parseInt(params.getEndYear().value);
		Boolean valid = true;

		try {
			valid = csvValidator(valid, params.getAnalysis().value, startYear, endYear);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	if (startYear > endYear) {
    		params.setStartYearValid(false);
    		JFrame frame = new JFrame("Invalid Selection");
    		JOptionPane.showMessageDialog(frame, "Start year cannot be greater than end year. Please choose another option.",
    	               "Invalid Selection", JOptionPane.ERROR_MESSAGE);
    	}
    	
      	else if (!valid) {

    		params.setAnalysisValid(false);
    		JFrame frame = new JFrame("Invalid Selection");
    		JOptionPane.showMessageDialog(frame, "Selected analysis is not available for the year " + this.invalid + ". Please choose another option.",
    	               "Invalid Selection", JOptionPane.ERROR_MESSAGE);
    	}
    	
    	else {
    		params.setAnalysisValid(true);
    		params.setStartYearValid(true);
    		params.setEndYearValid(true);
    	}
    	
    }
	
	/**
	 * csvValidator is a method that takes in certain parameters and returns the validity state of the selected years on the selected analysis.
	 * 
	 * @param valid a Boolean value to hold the result of the analysis
	 * @param analysisId the id value of the currently selected analysis type
	 * @param startYear the start year of the currently selected analysis type
	 * @param endYear the end year of the currently selected analysis type
	 * @return valid returns true of the parameters are valid, and false if they are not
	 * @throws IOException
	 */
	private boolean csvValidator(boolean valid, String analysisId, int startYear, int endYear) throws IOException {
		String filePath = "src/dataManagement/analysisYear.csv";
		String invalidYears = "";
		int year = 0;

		String analysisYear = Files.readAllLines(Paths.get(filePath)).get(Integer.parseInt(analysisId));

		String[] analysisYearSplit = analysisYear.split(",");
		invalidYears = analysisYearSplit[2].trim();
		String[] invalidYear = invalidYears.split("/");

		for(String s: invalidYear){
			year = Integer.parseInt(s);
			if (year > startYear && year < endYear){
				valid = false;
				this.invalid = year;
				break;
			}
		}
		return valid;
	}
    
}

