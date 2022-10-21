import analysisFactory.Analysis;
import analysisFactory.AnalysisFactory;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("ANALYSIS 1:\n");
		Analysis analysis1 = AnalysisFactory.createAnalysis(1, "CAN", 2011, 2014);
		analysis1.executeAnalysis();
		
		System.out.println("\nANALYSIS 2:\n");
		Analysis analysis2 = AnalysisFactory.createAnalysis(2, "CAN", 2011, 2014);
		analysis2.executeAnalysis();
		
		System.out.println("\nANALYSIS 3:\n");
		Analysis analysis3 = AnalysisFactory.createAnalysis(3, "CAN", 2011, 2014);
		analysis3.executeAnalysis();
		
		System.out.println("\nANALYSIS 4:\n");
		Analysis analysis4 = AnalysisFactory.createAnalysis(4, "CAN", 2011, 2014);
		analysis4.executeAnalysis();
		
		System.out.println("\nANALYSIS 5:\n");
		Analysis analysis5 = AnalysisFactory.createAnalysis(5, "CAN", 2011, 2014);
		analysis5.executeAnalysis();
		
		System.out.println("\nANALYSIS 6:\n");
		Analysis analysis6 = AnalysisFactory.createAnalysis(6, "CAN", 2011, 2014);
		analysis6.executeAnalysis();
		
		System.out.println("\nANALYSIS 7:\n");
		Analysis analysis7 = AnalysisFactory.createAnalysis(7, "CAN", 2011, 2014);
		analysis7.executeAnalysis();
		
		System.out.println("\nANALYSIS 8:\n");
		Analysis analysis8 = AnalysisFactory.createAnalysis(8, "CAN", 2011, 2014);
		analysis8.executeAnalysis();

	}
}
