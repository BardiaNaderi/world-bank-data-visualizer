package viewBuilders;

import javax.swing.JPanel;

public interface ViewBuilder {

	public void reset(JPanel data);
	public void createLine(JPanel data);
	public void createTime(JPanel data);
	public void createBar(JPanel data);
	public void createPie(JPanel data);
	public void createScatter(JPanel data);
	public void createReport(JPanel data);
	public View getView();
	
}
