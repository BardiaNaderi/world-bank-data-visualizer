package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import analysisGenerator.AccessingHealthCareInfantMortalityAnnualPercentage;
import analysisGenerator.Analysis;
import analysisGenerator.AnalysisFactory;
import analysisGenerator.CO2EmissionsEnergyUsePollutionAnnualPercentage;
import analysisGenerator.CO2EmissionsGDPRatio;
import analysisGenerator.EducationExpenditureAverage;
import analysisGenerator.EducationExpenditureHealthExpenditureAnnualPercentage;
import analysisGenerator.ForestAreaAverage;
import analysisGenerator.HealthExpenditureHospitalBedsRatio;
import analysisGenerator.PollutionForestAreaAnnualPercentage;
import mainApplication.MainUI;
import userInput.ParametersSelector;

public class AnalysisFactoryTest {
	
	ParametersSelector params = MainUI.getInstance().getParams();
	String country = params.getCountry().value;
	int startYear = Integer.parseInt(params.getStartYear().value);
	int endYear = Integer.parseInt(params.getEndYear().value);
	
	/**
	 * Use Case 3: Test 01
	 * 
	 * Them Analysis Factory returns an instance of the CO2EmissionsEnergyUsePollutionAnnualPercentage
	 * class when the first option is selected from the drop down menu
	 * 
	 * @result the correct class is returned for an analysis code of 0
	 */
	@Test
	void testFactoryReturnsCorrectAnalysisForFirstSelection() {
		params.selectAnalysis("0");	
		int analysis = Integer.parseInt(params.getAnalysis().value);

		Class<CO2EmissionsEnergyUsePollutionAnnualPercentage> expected = CO2EmissionsEnergyUsePollutionAnnualPercentage.class;
		Class<? extends Analysis> actual = AnalysisFactory.createAnalysis(analysis, country, startYear, endYear).getClass();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 3: Test 02
	 * 
	 * Them Analysis Factory returns an instance of the PollutionForestAreaAnnualPercentage
	 * class when the second option is selected from the drop down menu
	 * 
	 * @result the correct class is returned for an analysis code of 1
	 */
	@Test
	void testFactoryReturnsCorrectAnalysisForSecondSelection() {
		params.selectAnalysis("1");
		int analysis = Integer.parseInt(params.getAnalysis().value);

		Class<PollutionForestAreaAnnualPercentage> expected = PollutionForestAreaAnnualPercentage.class;
		Class<? extends Analysis> actual = AnalysisFactory.createAnalysis(analysis, country, startYear, endYear).getClass();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 3: Test 03
	 * 
	 * Them Analysis Factory returns an instance of the CO2EmissionsGDPRatio
	 * class when the third option is selected from the drop down menu
	 * 
	 * @result the correct class is returned for an analysis code of 2
	 */
	@Test
	void testFactoryReturnsCorrectAnalysisForThirdSelection() {
		params.selectAnalysis("2");
		int analysis = Integer.parseInt(params.getAnalysis().value);

		Class<CO2EmissionsGDPRatio> expected = CO2EmissionsGDPRatio.class;
		Class<? extends Analysis> actual = AnalysisFactory.createAnalysis(analysis, country, startYear, endYear).getClass();
		assertEquals(expected, actual);	
	}

	/**
	 * Use Case 3: Test 04
	 * 
	 * Them Analysis Factory returns an instance of the ForestAreaAverage
	 * class when the fourth option is selected from the drop down menu
	 * 
	 * @result the correct class is returned for an analysis code of 3
	 */
	@Test
	void testFactoryReturnsCorrectAnalysisForFourthSelection() {
		params.selectAnalysis("3");
		int analysis = Integer.parseInt(params.getAnalysis().value);

		Class<ForestAreaAverage> expected = ForestAreaAverage.class;
		Class<? extends Analysis> actual = AnalysisFactory.createAnalysis(analysis, country, startYear, endYear).getClass();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 3: Test 05
	 * 
	 * Them Analysis Factory returns an instance of the EducationExpenditureAverage
	 * class when the fifth option is selected from the drop down menu
	 * 
	 * @result the correct class is returned for an analysis code of 4
	 */
	@Test
	void testFactoryReturnsCorrectAnalysisFoFifthSelection() {
		params.selectAnalysis("4");
		int analysis = Integer.parseInt(params.getAnalysis().value);

		Class<EducationExpenditureAverage> expected = EducationExpenditureAverage.class;
		Class<? extends Analysis> actual = AnalysisFactory.createAnalysis(analysis, country, startYear, endYear).getClass();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 3: Test 06
	 * 
	 * Them Analysis Factory returns an instance of the HealthExpenditureHospitalBedsRatio
	 * class when the sixth option is selected from the drop down menu
	 * 
	 * @result the correct class is returned for an analysis code of 5
	 */
	@Test
	void testFactoryReturnsCorrectAnalysisForSixthSelection() {
		params.selectAnalysis("5");
		int analysis = Integer.parseInt(params.getAnalysis().value);

		Class<HealthExpenditureHospitalBedsRatio> expected = HealthExpenditureHospitalBedsRatio.class;
		Class<? extends Analysis> actual = AnalysisFactory.createAnalysis(analysis, country, startYear, endYear).getClass();
		assertEquals(expected, actual);	
	}

	/**
	 * Use Case 3: Test 07
	 * 
	 * Them Analysis Factory returns an instance of the AccessingHealthCareInfantMortalityAnnualPercentage
	 * class when the seventh option is selected from the drop down menu
	 * 
	 * @result the correct class is returned for an analysis code of 6
	 */
	@Test
	void testFactoryReturnsCorrectAnalysisForSeventhSelection() {
		params.selectAnalysis("6");
		int analysis = Integer.parseInt(params.getAnalysis().value);

		Class<AccessingHealthCareInfantMortalityAnnualPercentage> expected = AccessingHealthCareInfantMortalityAnnualPercentage.class;
		Class<? extends Analysis> actual = AnalysisFactory.createAnalysis(analysis, country, startYear, endYear).getClass();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 3: Test 08
	 * 
	 * Them Analysis Factory returns an instance of the EducationExpenditureHealthExpenditureAnnualPercentage
	 * class when the eighth option is selected from the drop down menu
	 * 
	 * @result the correct class is returned for an analysis code of 7
	 */
	@Test
	void testFactoryReturnsCorrectAnalysisForEighthSelection() {
		params.selectAnalysis("7");
		int analysis = Integer.parseInt(params.getAnalysis().value);

		Class<EducationExpenditureHealthExpenditureAnnualPercentage> expected = EducationExpenditureHealthExpenditureAnnualPercentage.class;
		Class<? extends Analysis> actual = AnalysisFactory.createAnalysis(analysis, country, startYear, endYear).getClass();
		assertEquals(expected, actual);	
	}
	
	/**
	 * Use Case 3: Test 09
	 * 
	 * Them Analysis Factory throws an IndexOutOfBoundsException if an invalid analysis code is provided
	 * 
	 * @result IndexOutOfBoundsException is thrown when the analysis code is not between 0-7
	 */
	@Test
	void testIncorrectAnalysisCode() throws IndexOutOfBoundsException {		
        assertThrows(IndexOutOfBoundsException.class, () -> {   
        	params.selectAnalysis("8");
    		int analysis = Integer.parseInt(params.getAnalysis().value);
    		AnalysisFactory.createAnalysis(analysis, country, startYear, endYear).getClass();
    	});
	}

}
