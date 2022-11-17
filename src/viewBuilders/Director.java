package viewBuilders;

import java.util.List;
import java.util.Map;

import javax.swing.JPanel;

public class Director {
			
	/* 
	 * Each of the following methods will omit whichever chart views are not
	 * available for the current analysis. The constructRatioView has all of the
	 * charts shown for illustrative purposes, but the exact views for each of the
	 * methods will be modified in future deliverables 
	 */
	public void constructRatioView(ViewBuilder builder, List<Map<Integer, Float>> data, List<String[]> labels) {
		builder.reset();
		//builder.createLine(data);
		//builder.createTime(data);
		//builder.createBar(data);
		//builder.createPie(data);
		//builder.createScatter(data);
		//builder.createReport(data);		
	}
	
	public void constructAnnualPercentageView(ViewBuilder builder, List<Map<Integer, Float>> data, List<String[]> labels) {
		builder.createScatter(data, labels, "Annual Percentage Change");
	}
	
	public void concstructAverageView(ViewBuilder builder, JPanel data) {
		// TODO: build appropriate charts
	}

}
