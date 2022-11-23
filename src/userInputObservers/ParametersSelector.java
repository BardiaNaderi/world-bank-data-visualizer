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
    	this.country.value = "Canada";
    	this.startYear.value = "2010";
    	this.endYear.value = "2016";
    	this.viewer.value = null;
    	
    	this.analysis.valid = true;
    	this.country.valid = true;
    	this.startYear.valid = true;
    	this.endYear.valid = true;
    	this.viewer.valid = true;
    	
    	subs = new ArrayList<Validator>();
    }
    
    @Override
    public void subscribe(Validator sub){
        subs.add(sub);
    }

    @Override
    public void unsubscribe(Validator sub){
        subs.remove(sub);
    }

    @Override
    public void notifySubs(){
        for(Validator sub: subs){
            sub.update();
        }
    }
    
    
    //-------------------------
    // Select from drop downs
    //-------------------------
    
    public void selectAnalysis(String analysis) {
        this.setAnalysisValue(analysis);
        notifySubs();
    }
    
    public void selectCountry(String country) {
        this.setCountryValue(country);
        notifySubs();
    }
    
    public void selectStartYear(String startYear) {
        this.setStartYearValue(startYear);
        notifySubs();
    }
    
    public void selectEndYear(String endYear) {
        this.setEndYearValue(endYear);
        notifySubs();
    }

    public void addViewer(String viewer) {
    	this.setViewerValue(viewer);
    	modifyDisplay(viewer, true);
    	notifySubs();
    }
    
    public void removeViewer(String viewer) {
    	this.setViewerValue(viewer);
    	modifyDisplay(viewer, false);
    	notifySubs();
    }
       
    private void modifyDisplay(String viewer, Boolean value) {
    	
    	if (MainUI.getInstance().getView() != null) {	
    		List<Chart> charts = MainUI.getInstance().getView().getCharts();
			for (Chart chart: charts) {
				if (chart.getName() == viewer)
					chart.setDisplay(value);
			}	
    	}
    }
    
    
    //-------------------------
    // Setters
    //-------------------------

    public void setAnalysisValue(String analysis){
        this.analysis.value = analysis;
    }
    
    public void setCountryValue(String country){
        this.country.value = country;
    }
    
    public void setStartYearValue(String startYear){
        this.startYear.value = startYear;
    }
    
    public void setEndYearValue(String endYear){
        this.endYear.value = endYear;
    }

    public void setViewerValue(String viewer){
        this.viewer.value = viewer;
    }
    
    public void setAnalysisValid(Boolean valid) {
    	this.analysis.valid = valid;
    }
    
    public void setCountryValid(Boolean valid) {
    	this.country.valid = valid;
    }
    
    public void setStartYearValid(Boolean valid) {
    	this.startYear.valid = valid;
    }
    
    public void setEndYearValid(Boolean valid) {
    	this.endYear.valid = valid;
    }
    
    public void setViewerValid(Boolean valid) {
    	this.viewer.valid = valid;
    }
    
    
    //-------------------------
    // Getters
    //-------------------------
    
    public Parameter getAnalysis() {
    	return this.analysis;
    }
    
    public Parameter getCountry() {
    	return this.country;
    }
    
    public Parameter getStartYear() {
    	return this.startYear;
    }
    
    public Parameter getEndYear() {
    	return this.endYear;
    }
    
    public Parameter getViewer() {
    	return this.viewer;
    }
    
    
    //-------------------------
    // Recalculate
    //-------------------------
    
    // This method triggers the AnalysisFactory to run a new analysis with the selected parameters
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
