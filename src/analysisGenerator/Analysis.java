package analysisGenerator;

import java.util.List;

import calculations.AnalysisStrategy;
import dataManagement.DataFetcher;

abstract public class Analysis {
	
	// World Bank API indicator codes used for data fetching
	final static protected String[] POPULATION = {"SP.POP.TOTL", "Total Population"};
	final static protected String[] CO2_EMISSIONS = {"EN.ATM.CO2E.PC", "CO2 Emissions (metric tons per capita)"};
	final static protected String[] AIR_POLLUTION = {"EN.ATM.PM25.MC.M3", "Air Pollution (micrograms per cubic meter)"};
	final static protected String[] FOREST_AREA = {"AG.LND.FRST.ZS", "Forest Area (% of land area)"};
	final static protected String[] ENERGY_USE = {"EG.USE.PCAP.KG.OE", "Energy Use (kg of oil equivalent per capita)"};
	final static protected String[] GDP_PER_CAPITA = {"NY.GDP.PCAP.CD", "GDP per Capita (US$)"};
	final static protected String[] HOSPITAL_BEDS = {"SH.MED.BEDS.ZS", "Hospital Beds (per 1,000 people)"};
	final static protected String[] EDUCATION_EXPENDITURE = {"SE.XPD.TOTL.GD.ZS", "Government Expenditure on Education (% of GDP)"};
	final static protected String[] MATERNAL_MORTALITY = {"SH.STA.MMRT", "Maternal Mortality (per 100,000 live births)"};
	final static protected String[] HEALTH_EXPENDITURE_PER_CAPITA = {"SH.XPD.CHEX.PC.CD","Current Health Expenditure per Capita (US$)"};
	final static protected String[] HEALTH_EXPENDITURE = {"SH.XPD.CHEX.GD.ZS","Current Health Expenditure (% of GDP)"};
	final static protected String[] INFANT_MORTALITY = {"SP.DYN.IMRT.IN", "Infant Mortality Rate (per 1,000 live births)"};
	final static protected String[] ACCESSING_HEALTH_CARE = {"SH.ACS.MONY.Q1.ZS", "Problems in Accessing Health Care (% of women)"};
	
	/* 
	 * The DataFetcher is set at the top level for all subclass implementations.
	 * The remaining attributes are set when the subclasses are instantiated. 
	 */
	protected DataFetcher fetcher = DataFetcher.getFetcher(); 
	protected AnalysisStrategy strategy;
	protected List<String[]> worldBankCodes;
	protected String country;
	protected int startYear;
	protected int endYear;
	
	/**
	 * Getter method for the strategy value
	 * 
	 * @return the AnalysisStrategy used by the Analysis
	 */
	public AnalysisStrategy getAnalysisStrategy() {
		return this.strategy;
	}
	
	/**
	 * Getter method for the wordlBankCodes values
	 * 
	 * @return an List of String[] values containing the desired
	 * World Bank indicator codes for the current Analysis 
	 */
	public List<String[]> getWorldBankCodes() {
		return this.worldBankCodes;
	}
	
	
	/**
	 * Getter method for the country value
	 * 
	 * @return the country selected for the current Analysis
	 */
	public String getCountry() {
		return this.country;
	}
	
	
	/**
	 * Getter method for the startYear
	 * 
	 * @return the year to start the current Analysis on
	 */
	public int getStartYear() {
		return this.startYear;
	}
	
	/**
	 * Getter method for the endYear
	 * 
	 * @return the year to end the current Analysis on
	 */
	public int getEndYear() {
		return this.endYear;
	}
	
	/**
	 * An abstract method to be implemented by all Analysis subclasses 
	 * in order to execute the specific Analysis chosen by the user 
	 */
	abstract public void executeAnalysis();
	
}
