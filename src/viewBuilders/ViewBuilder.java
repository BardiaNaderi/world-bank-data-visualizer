package viewBuilders;

import java.util.Map;
import java.util.List;

public interface ViewBuilder {

	public void reset();
	public void createLine(List<Map<Integer, Float>> data, List<String[]> labels, String axis);
	public void createTime(List<Map<Integer, Float>> data, List<String[]> labels, String axis);
	public void createBar(List<Map<Integer, Float>> data, List<String[]> labels, String axis);
	public void createPie(List<Map<Integer, Float>> data, List<String[]> labels, String axis);
	public void createScatter(List<Map<Integer, Float>> data, List<String[]> labels, String axis);
	public void createReport(List<Map<Integer, Float>> data, List<String[]> labels, String axis);
	public View getView();
	
}
