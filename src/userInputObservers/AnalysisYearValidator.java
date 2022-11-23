package userInputObservers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mainGUI.MainUI;

public class AnalysisYearValidator implements Validator {
	
	private int invalid;
	
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
	 * @param valid
	 * @param analysisId
	 * @param startYear
	 * @param endYear
	 * @return valid, boolean
	 * @throws IOException
	 */
	private boolean csvValidator(boolean valid, String analysisId, int startYear, int endYear) throws IOException {
		String filePath = "src/database/analysisYear.csv";
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

