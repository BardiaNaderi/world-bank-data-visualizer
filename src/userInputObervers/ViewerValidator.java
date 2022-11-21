package userInputObervers;

import mainGUI.MainUI;

public class ViewerValidator implements Validator {
	
    public void update() {
    	
    	MainUI gui = MainUI.getInstance();
    	ParametersSelector params = gui.getParams();
    	
    	if (params.getViewer().value != null) {
    		params.setViewerValid(true);
        	switch (params.getViewer().value) {
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
        		gui.getWest().add(gui.getView().getScatter());
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
