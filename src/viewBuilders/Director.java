package viewBuilders;

import javax.swing.JPanel;

public class Director {
	
	private ViewBuilder builder;
	
	public Director(ViewBuilder builder) {
		this.builder = builder;
	}
	
	public View getView() {
		return this.builder.getView();
	}
	
	/* 
	 * Each of the following methods will omit whichever chart views are not
	 * available for the current analysis. The constructRatioView has all of the
	 * charts shown for illustrative purposes, but the exact views for each of the
	 * methods will be modified in future deliverables 
	 */
	public void constructRatioView(ViewBuilder builder, JPanel data) {
		builder.reset(data);
		builder.createLine(data);
		builder.createTime(data);
		builder.createBar(data);
		builder.createPie(data);
		builder.createScatter(data);
		builder.createReport(data);		
	}
	
	public void createAnnualPercentageView(ViewBuilder builder, JPanel data) {
		// TODO: build appropriate charts
	}
	
	public void createAverageView(ViewBuilder builder, JPanel data) {
		// TODO: build appropriate charts
	}

}
