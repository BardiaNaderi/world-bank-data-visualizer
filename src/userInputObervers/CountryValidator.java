package userInputObervers;

public class CountryValidator implements Validator {

    public void update(int analysis, String country, int startYear, int endYear, String viewer) {
        // TODO: implement validation logic
    	validateCountry(country);
    	
    	// If country is valid:
    	AnalysisParameters.getParams().setCountry(country);
    	
    	// If country is invalid:
    	// Trigger an error message
    }
    
    private void validateCountry(String country) {
    	// TODO: implement helper method
    }
   
}
