package viewBuilders;

import javax.swing.JPanel;

public class OneSeriesViewBuilder implements ViewBuilder {
	
	private View view;
	JPanel data;

	public OneSeriesViewBuilder(JPanel data) {		
		this.reset(data);
	};
	
	public void reset(JPanel data) {
		this.view = new View();
		this.data = data;
	}
	
	public void createLine(JPanel data) {
		//TODO add logic for creating a one series line chart
		this.view.setLine(new Chart());
	}
	
	public void createTime(JPanel data) {
		// TODO add logic for creating a one series time chart
		this.view.setTime(new Chart());
	}
	
	public void createBar(JPanel data) {
		// TODO add logic for creating a one series bar graph
		this.view.setBar(new Chart());
	}
	
	public void createPie(JPanel data) {
		// TODO add logic for creating a one series pie chart
		this.view.setPie(new Chart());
	}
	
	public void createScatter(JPanel data) {
		// TODO add logic for creating a one series scatter plot
		this.view.setScatter(new Chart());
	}
	
	public void createReport(JPanel data) {
		// TODO add logic for creating a one series report
		this.view.setReport(new Chart());
	}
	
	public View getView() {
		return this.view;	
	}

}
