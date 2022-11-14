package userInputObervers;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CountryValidator implements Validator {

    public void update(int analysis, String country, int startYear, int endYear, String viewer) {
		
		//TODO: this is temporary for testing, need to implement a way to swap all country strings for codes, probably as part of the CSV check
		switch(country) {
			case "Brazil":
				country = "BRA";
				break;
			case "Canada":
				country = "CAN";
				break;
			case "China":
				country = "CHN";
				break;
			case "France":
				country = "FRA";
				break;
			case "USA":
				country = "USA";
				break;
			default:
				country = "CAN";
		}
    	
        // TODO: this is temporary for testing, need to actually validate countries using the CSV file
    	if (country == "USA") {
    		JFrame frame = new JFrame("Invalid Selection");
    		JOptionPane.showMessageDialog(frame, "Data fetching is not permitted for " + country + ". Please select another country.",
    	               "Invalid Selection", JOptionPane.ERROR_MESSAGE);   		
    	} 
    	
    	else {
    		AnalysisParameters.getParams().setCountry(country);
    	}
 
    }   
    
}
