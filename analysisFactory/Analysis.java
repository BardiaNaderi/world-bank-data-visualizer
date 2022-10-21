package analysisFactory;

import java.util.List;

import analysisStrategies.AnalysisStrategy;

abstract public class Analysis extends DataFetcher {
	
	final static protected String[] POPULATION = {"SP.POP.TOTL", "Total Population"};
	final static protected String[] CO2_EMISSIONS = {"EN.ATM.CO2E.PC", "CO2 emissions (metric tons per capita)"};
	final static protected String[] AIR_POLLUTION = {"EN.ATM.PM25.MC.M3", "PM2.5 air pollution, mean annual exposure (micrograms per cubic meter)"};
	final static protected String[] FOREST_AREA = {"AG.LND.FRST.ZS", "Forest area (% of land area)"};
	final static protected String[] ENERGY_USE = {"EG.USE.PCAP.KG.OE", "Energy use (kg of oil equivalent per capita)"};
	final static protected String[] GDP_PER_CAPITA = {"NY.GDP.PCAP.CD", "GDP per capita (current US$)"};
	
	final static protected String[] HOSPITAL_BEDS = {"SH.MED.BEDS.ZS", "Hospital beds (per 1,000 people)"};
	final static protected String[] EDUCATION_EXPENDITURE = {"SE.XPD.TOTL.GD.ZS", "Government expenditure on education, total (% of GDP)"};
	final static protected String[] MATERNAL_MORTALITY = {"SH.STA.MMRT", "Maternal mortality ratio (modeled estimate, per 100,000 live births)"};
	final static protected String[] HEALTH_EXPENDITURE_PER_CAPITA = {"SH.XPD.CHEX.PC.CD","Current health expenditure per capita (current US$)"};
	final static protected String[] HEALTH_EXPENDITURE = {"SH.XPD.CHEX.GD.ZS","Current health expenditure (% of GDP)"};
	final static protected String[] INFANT_MORTALITY = {"SP.DYN.IMRT.IN", "Mortality rate, infant (per 1,000 live births)"};
	final static protected String[] ACCESSING_HEALTH_CARE = {"SH.ACS.MONY.Q1.ZS", "Problems in accessing health care (% of women): Q1 (lowest)"};
	
	protected AnalysisStrategy strategy;
	protected List<String[]> worldBankCodes;
	protected String country;
	protected int startYear;
	protected int endYear;
	
	public AnalysisStrategy getAnalysisStrategy() {
		return this.strategy;
	}
	
	public List<String[]> getWorldBankCodes() {
		return this.worldBankCodes;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public int getStartYear() {
		return this.startYear;
	}
	
	public int getEndYear() {
		return this.endYear;
	}
	
	abstract public void executeAnalysis();
	
}
