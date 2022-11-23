package viewBuilders;

import java.util.List;
import java.util.Map;

public class Director {
	
	final static private String RATIO = "Ratio";
	final static private String PERCENT = "Annual Percentage Change";
	final static private String AVERAGE = "Average";
			
	/* 
	 * Each of the following methods will omit whichever chart views are not
	 * available for the current analysis. The constructRatioView has all of the
	 * charts shown for illustrative purposes, but the exact views for each of the
	 * methods will be modified in future deliverables 
	 */
	public void constructRatioView(ViewBuilder builder, List<Map<Integer, Float>> data, List<String[]> labels) {
		builder.reset();
		builder.createLine(data, labels, RATIO);
		builder.createTime(data, labels, RATIO);
		builder.createBar(data, labels, RATIO);
		builder.createScatter(data, labels, RATIO);
		builder.createReport(data, labels, RATIO);	
	}
	
	public void constructAnnualPercentageView(ViewBuilder builder, List<Map<Integer, Float>> data, List<String[]> labels) {
		builder.reset();
		builder.createLine(data, labels, PERCENT);
		builder.createTime(data, labels, PERCENT);
		builder.createBar(data, labels, PERCENT);
		builder.createScatter(data, labels, PERCENT);
		builder.createReport(data, labels, PERCENT);

	}
	
	public void constructAverageView(ViewBuilder builder, List<Map<Integer, Float>> data, List<String[]> labels) {
		builder.reset();
		builder.createPie(data, labels, AVERAGE);
		builder.createReport(data, labels, AVERAGE);
	}

}
