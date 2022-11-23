package userInputObervers;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mainGUI.MainUI;
import viewBuilders.Chart;
import viewBuilders.View;

public class ViewerValidator implements Validator {
	
    public void update() {
    	
    	MainUI gui = MainUI.getInstance();
    	ParametersSelector params = gui.getParams();
    	View view = gui.getView();
    		
    	if (view != null) {
    		
    		List<Chart> charts = view.getCharts();
    		
			for (Chart chart: charts) {
				if (chart.getName() == params.getViewer().value && chart.getChart() == null && chart.getReport() == null) {
				JFrame frame = new JFrame("Invalid Selection");
				JOptionPane.showMessageDialog(frame,
						params.getViewer().value + " is not permitted for the selected analysis.",
						"Invalid Selection", JOptionPane.ERROR_MESSAGE);
				return;
				}
	    	}  	

	    	
	    	gui.getWest().removeAll();	
	    	gui.revalidate();
	    	
			for (Chart chart: charts) {
				if (chart.getChart() != null && chart.getDisplay() == true)
					gui.getWest().add(chart.getChart());
				if (chart.getReport() != null && chart.getDisplay() == true)
					gui.getWest().add(chart.getReport());
			}
	    	
			gui.setVisible(true);
	    	    	
    	}
    }      
}
