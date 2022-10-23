package viewBuilders;

public class View {
	
	public Chart line;
	public Chart time;
	public Chart bar;
	public Chart pie;
	public Chart scatter;
	public Chart report;
	
	public View() {
		this.line = null;
		this.time = null;
		this.bar = null;
		this.pie = null;
		this.scatter = null;
		this.report = null;
	}		
	
	public Chart getLine() {
		return this.line;
	}
	
	public Chart getTime() {
		return this.time;
	}
	
	public Chart getBar() {
		return this.bar;
	}
	
	public Chart getPie() {
		return this.pie;
	}
	
	public Chart getScatter() {
		return this.scatter;
	}
	
	public Chart getReport() {
		return this.report;
	}
	
	public void setLine(Chart line) {
		this.line = line;
	}
	
	public void setTime(Chart time) {
		this.time = time;
	}
	
	public void setBar(Chart bar) {
		this.bar = bar;
	}
	
	public void setPie(Chart pie) {
		this.pie = pie;
	}
	
	public void setScatter(Chart scatter) {
		this.scatter = scatter;
	}
	
	public void setReport(Chart report) {
		this.report = report;
	}

}
