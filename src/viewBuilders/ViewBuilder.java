package viewBuilders;

import java.util.Map;
import java.util.List;

public interface ViewBuilder {

	public void reset();
	public void createLine(Map<Integer, Float> data);
	public void createTime(Map<Integer, Float> data);
	public void createBar(Map<Integer, Float> data);
	public void createPie(Map<Integer, Float> data);
	public void createScatter(List<Map<Integer, Float>> data, List<String[]> labels, String axis);
	public void createReport(Map<Integer, Float> data);
	public View getView();
	
}
