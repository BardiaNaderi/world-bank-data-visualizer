package analysisFactory;

import analysisSubclasses.AccessingHealthCareInfantMortalityAnnualPercentage;
import analysisSubclasses.CO2EmissionaEnergyUsePollutionAnnualPercentage;
import analysisSubclasses.CO2EmissionsGDPRatio;
import analysisSubclasses.EducationExpenditureAverage;
import analysisSubclasses.EducationExpenditureHealthExpenditureAnnualPercentage;
import analysisSubclasses.ForestAreaAverage;
import analysisSubclasses.HealthExpenditureHospitalBedsRatio;
import analysisSubclasses.PollutionForestAreaAnnualPercentage;

public class AnalysisFactory {
		
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
