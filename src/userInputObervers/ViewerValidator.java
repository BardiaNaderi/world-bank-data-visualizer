package userInputObervers;

public class ViewerValidator implements Validator {
	
    public void update(int analysis, String country, int startYear, int endYear, String viewer) {
        // TODO: implement validation logic
    	validateViewer(viewer, analysis);
    	
    	// If view is valid for current analysis:
    	// logic to display the new view
    	
    	// If view is invalid for the current analysis:
    	// Trigger an error message
    }
    
    private void validateViewer(String viewer, int analysis) {
    	// TODO: implement helper method       
    }

}
