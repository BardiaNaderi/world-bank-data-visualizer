package analysisFactory;

public class AnalysisFactory {
		
	/**
	 * The factory method used to generate one of the Analysis subclasses depending on the
	 * parameters chosen by the user. 
	 * 
	 * @param analysis a numeric value that corresponds to one of the 8 Analysis types
	 * @param country the selected country to fetch data for
	 * @param startYear the desired year to start the analysis 
	 * @param endYear the desired year to end the analysis
	 * @return a new instance of an Analysis subclass
	 */
	public static Analysis createAnalysis(int analysis, String country, int startYear, int endYear) {
		switch(analysis) {
		case 1:
			return new CO2EmissionaEnergyUsePollutionAnnualPercentage(country, startYear, endYear);
		case 2:
			return new PollutionForestAreaAnnualPercentage(country, startYear, endYear);
		case 3:
			return new CO2EmissionsGDPRatio(country, startYear, endYear);
		case 4:
			return new ForestAreaAverage(country, startYear, endYear);
		case 5:
			return new EducationExpenditureAverage(country, startYear, endYear);
		case 6:
			return new HealthExpenditureHospitalBedsRatio(country, startYear, endYear);
		case 7:
			return new AccessingHealthCareInfantMortalityAnnualPercentage(country, startYear, endYear);
		case 8:
			return new EducationExpenditureHealthExpenditureAnnualPercentage(country, startYear, endYear);
		default:
			throw new IllegalArgumentException("Unknown Analysis code " + analysis);
		}
	}
}
