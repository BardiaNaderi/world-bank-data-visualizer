package viewBuilders;

import java.util.List;
import java.util.Map;

public class OneSeriesViewBuilder implements ViewBuilder {
	
	private View view;
	//Map<Integer, Float> data;

	public OneSeriesViewBuilder() {		
		this.reset();
	};
	
	public void reset() {
		this.view = new View();
		//this.data = null;
	}
	
	public void createLine(Map<Integer, Float> data) {
		//TODO add logic for creating a one series line chart
		//this.view.setLine(new Chart());
	}
	
	public void createTime(Map<Integer, Float> data) {
		// TODO add logic for creating a one series time chart
		//this.view.setTime(new Chart());
	}
	
	public void createBar(Map<Integer, Float> data) {
		// TODO add logic for creating a one series bar graph
		//this.view.setBar(new Chart());
	}
	
	public void createPie(Map<Integer, Float> data) {
		// TODO add logic for creating a one series pie chart
		//this.view.setPie(new Chart());
	}
	
	public void createScatter(List<Map<Integer, Float>> data, List<String[]> labels, String axis) {
		// TODO add logic for creating a one series scatter plot
		//this.view.setScatter(new Chart());
	}
	
	public void createReport(Map<Integer, Float> data) {
		// TODO add logic for creating a one series report
		//this.view.setReport(new Chart());
	}
	
	public View getView() {
		return this.view;	
	}

}
