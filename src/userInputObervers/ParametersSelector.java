package userInputObervers;

import java.util.ArrayList;
import java.util.List;

public class ParametersSelector implements Selector{
	
    private int analysis;
	private String country;
    private int startYear;
    private int endYear;
    private String viewer;
    private List<Validator> subs;
    
    public ParametersSelector() {
    	this.analysis = 0;
    	this.country = "BRA";
    	this.startYear = 2021;
    	this.endYear = 2021;
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
            sub.update(analysis, country, startYear, endYear, viewer);
        }
    }

    public void selectAnalysis(int analysis){
        this.analysis = analysis;
        notifySubs();
    }
    
    public void selectCountry(String country){
        this.country = country;
        notifySubs();
    }
    
    public void selectStartYear(int startYear){
        this.startYear = startYear;
        notifySubs();
    }
    
    public void selectEndYear(int endYear){
        this.endYear = endYear;
        notifySubs();
    }
    
    public void addViewer(String viewer){
        this.viewer = viewer;
        notifySubs();
    }
    
    public void removeViewer(String viewer){
        // logic to remove viewer from display
    }
}
