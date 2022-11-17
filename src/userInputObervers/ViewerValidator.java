package userInputObervers;

import java.awt.BorderLayout;

import mainGUI.MainUI;

public class ViewerValidator implements Validator {
	
    public void update(int analysis, String country, int startYear, int endYear, String viewer) {
    	MainUI gui = MainUI.getInstance();
    	
    	if (viewer != null) {
        	switch (viewer) {
//        	case "Line Chart":
//        		gui.getWest().add(AnalysisParameters.getParams().getView().getLine());
//        		break;
//        	case "Time Chart":
//        		gui.getWest().add(AnalysisParameters.getParams().getView().getTime());
//        		break;
//        	case "Bar Chart":
//        		gui.getWest().add(AnalysisParameters.getParams().getView().getBar());
//        		break;
//        	case "Pie Chart":
//        		gui.getWest().add(AnalysisParameters.getParams().getView().getPie());
//        		break;
        	case "Scatter Chart":
        		gui.getWest().add(AnalysisParameters.getParams().getView().getScatter());
        		break;
//        	case "Report":
//        		gui.getWest().add(AnalysisParameters.getParams().getView().getReport());
//        		break;
        	}
    	}

		//getContentPane().add(gui.getWest(), BorderLayout.WEST);
		gui.setVisible(true);
    }
    

}
