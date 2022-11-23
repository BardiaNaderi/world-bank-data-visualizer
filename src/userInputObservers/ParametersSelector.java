package userInputObservers;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import analysisFactory.Analysis;
import analysisFactory.AnalysisFactory;
import mainGUI.MainUI;
import viewBuilders.Chart;

public class ParametersSelector implements Selector {
	
	public class Parameter {
		public String value;
		public Boolean valid;
	}
	
	private Parameter analysis = new Parameter();
	private Parameter country = new Parameter();
	private Parameter startYear = new Parameter();
	private Parameter endYear = new Parameter();
	private Parameter viewer = new Parameter();
    
    private List<Validator> subs;
    
    public ParametersSelector() {    	
    	this.analysis.value = "0";
    	this.country.value = "Afghanistan";
    	this.startYear.value = "2021";
    	this.endYear.value = "2021";
    	this.viewer.value = null;
    	
    	this.analysis.valid = true;
    	this.country.valid = true;
    	this.startYear.valid = true;
    	this.endYear.valid = true;
    	this.viewer.valid = true;
    	
    	subs = new ArrayList<Validator>();
    }
    
    /**
     * Method to add a subscriber to the selector
     */
    @Override
    public void subscribe(Validator sub){
        subs.add(sub);
    }


    /**
     * Method to remove a subscriber to the selector
     */
    @Override
    public void unsubscribe(Validator sub){
        subs.remove(sub);
    }


    /**
     * Method to notify all subscribers that there has
     * been a change and trigger all of their update commands.
     */
    @Override
    public void notifySubs(){
        for(Validator sub: subs){
            sub.update();
        }
    }
    
    /**
     * This method sets the analysis attribute to the provided
     * value and then notifies the subscribers that there has 
     * been a change.
     * 
     * @param analysis the new value to be set
     */
    public void selectAnalysis(String analysis) {
        this.setAnalysisValue(analysis);
        notifySubs();
    }
    
    
    /**
     * This method sets the analysis country to the provided
     * value and then notifies the subscribers that there has 
     * been a change.
     * 
     * @param country the new value to be set
     */
    public void selectCountry(String country) {
        this.setCountryValue(country);
        notifySubs();
    }
    
    
    /**
     * This method sets the startYear attribute to the provided
     * value and then notifies the subscribers that there has 
     * been a change.
     * 
     * @param startYear the new value to be set
     */
    public void selectStartYear(String startYear) {
        this.setStartYearValue(startYear);
        notifySubs();
    }
    
    
    /**
     * This method sets the endYear attribute to the provided
     * value and then notifies the subscribers that there has 
     * been a change.
     * 
     * @param endYear the new value to be set
     */
    public void selectEndYear(String endYear) {
        this.setEndYearValue(endYear);
        notifySubs();
    }

    
    /**
     * This method sets the viewer attribute to the provided
     * value, sets the viewers boolean value to true, and then 
     * notifies the subscribers that there has been a change.
     * 
     * When the Boolean value is true, it means the user wishes
     * to see this viewer on the GUI
     * 
     * @param viewer the new value to be set
     */
    public void addViewer(String viewer) {
    	this.setViewerValue(viewer);
    	modifyDisplay(viewer, true);
    	notifySubs();
    }
    
    /**
     * This method sets the viewer attribute to the provided
     * value, sets the viewers boolean value to false, and then 
     * notifies the subscribers that there has been a change.
     * 
     * When the Boolean value is false, it means the user wishes
     * to remove this viewer from the GUI
     * 
     * @param viewer the new value to be set
     */
    public void removeViewer(String viewer) {
    	this.setViewerValue(viewer);
    	modifyDisplay(viewer, false);
    	notifySubs();
    }
       
    /**
     * Helper method for the addViewer and removeViewer methods above.
     * This method fetches the appropriate Chart object from the MainUI
     * instance and sets its display attribute to the provided Boolean value.
     * 
     * @param viewer the name of the chart to be fetched
     * @param value the Boolean value the display is set to
     */
    private void modifyDisplay(String viewer, Boolean value) {
    	
    	if (MainUI.getInstance().getView() != null) {	
    		List<Chart> charts = MainUI.getInstance().getView().getCharts();
			for (Chart chart: charts) {
				if (chart.getName() == viewer)
					chart.setDisplay(value);
			}	
    	}
    	
    	else {
			JFrame frame = new JFrame("Missing Analysis");
			JOptionPane.showMessageDialog(frame,
					"Please perform an Analysis before selecting viewers.",
					"Missing Analysis", JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    /**
     * Setter method for the analysis's value attribute
     * @param analysis the new value to be set
     */
    public void setAnalysisValue(String analysis){
        this.analysis.value = analysis;
    }
    
    /**
     * Setter method for the country's value attribute
     * @param country the new value to be set
     */
    public void setCountryValue(String country){
        this.country.value = country;
    }
    
    /**
     * Setter method for the country's value attribute
     * @param country the new value to be set
     */
    public void setStartYearValue(String startYear){
        this.startYear.value = startYear;
    }
    
    /**
     * Setter method for the endYear's value attribute
     * @param endYear the new value to be set
     */
    public void setEndYearValue(String endYear){
        this.endYear.value = endYear;
    }

    /**
     * Setter method for the viewer's value attribute
     * @param viewer the new value to be set
     */
    public void setViewerValue(String viewer){
        this.viewer.value = viewer;
    }
    
    /**
     * Setter method for the analysis's valid attribute
     * @param analysis the new value to be set
     */
    public void setAnalysisValid(Boolean valid) {
    	this.analysis.valid = valid;
    }
    
    /**
     * Setter method for the country's valid attribute
     * @param country the new value to be set
     */
    public void setCountryValid(Boolean valid) {
    	this.country.valid = valid;
    }
    
    /**
     * Setter method for the startYear's valid attribute
     * @param startYear the new value to be set
     */
    public void setStartYearValid(Boolean valid) {
    	this.startYear.valid = valid;
    }
    
    /**
     * Setter method for the endYear's valid attribute
     * @param endYear the new value to be set
     */
    public void setEndYearValid(Boolean valid) {
    	this.endYear.valid = valid;
    }
    
    /**
     * Setter method for the viewer's valid attribute
     * @param viewer the new value to be set
     */
    public void setViewerValid(Boolean valid) {
    	this.viewer.valid = valid;
    }
    
    /**
     * Getter method for the analysis attribute  
     * @return the current value of analysis
     */
    public Parameter getAnalysis() {
    	return this.analysis;
    }
    
    /**
     * Getter method for the country attribute 
     * @return the current value of country
     */
    public Parameter getCountry() {
    	return this.country;
    }
    
    /**
     * Getter method for the startYear attribute 
     * @return the current value of startYear
     */
    public Parameter getStartYear() {
    	return this.startYear;
    }
    
    /**
     * Getter method for the endYear attribute 
     * @return the current value of endYear
     */
    public Parameter getEndYear() {
    	return this.endYear;
    }
    
    /**
     * Getter method for the viewer attribute 
     * @return the current value of viewer
     */
    public Parameter getViewer() {
    	return this.viewer;
    }
    
    
    /**
     * This method triggers the AnalysisFactory to run a new analysis with the currently selected parameters
     * It first checks to make sure all of the valid flags are set to true, and if they are not an error
     * message is thrown and the analysis does not proceed.
     */
    public void recalculate() {  	
    	
    	if (country.valid == true && startYear.valid == true && endYear.valid == true && analysis.valid == true) {
    		MainUI gui = MainUI.getInstance();
    		ParametersSelector params = gui.getParams();
    		
    		gui.getWest().removeAll();
    		gui.setVisible(true);
    		
    		int analysis = Integer.parseInt(this.analysis.value);
    		String country = gui.getCountryList().get(params.getCountry().value);
    		int startYear = Integer.parseInt(this.startYear.value);
    		int endYear = Integer.parseInt(this.endYear.value);
    		
    		Analysis newAnalysis = AnalysisFactory.createAnalysis(analysis, country, startYear, endYear);
    		newAnalysis.executeAnalysis();
    	}
    	
    	else {
    		JFrame frame = new JFrame("Invalid Selection");
			JOptionPane.showMessageDialog(frame,
					"Please choose valid parameters to proceed with the analysis.",
					"Invalid Selection", JOptionPane.ERROR_MESSAGE);
    	}

    }
}
