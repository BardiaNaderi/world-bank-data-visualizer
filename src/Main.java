import java.awt.Dimension;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;

import com.opencsv.exceptions.CsvException;

import analysisFactory.Analysis;
import analysisFactory.AnalysisFactory;
import login.Registration;
import mainGUI.MainUI;

public class Main {

	/**
	 * Demonstration method used to show how the currently implemented classes and methods work.
	 * The user can choose to either demonstrate the login module or how the Data Fetcher and 
	 * Analysis Strategies are currently working together. This method will is for testing
	 * purposed and will be modified/removed in future deliverables.
	 * 
	 * For option 1: The main method from the login modules's Registration class is called
	 * 
	 * For option 2: One of each of the Analysis subclasses is created by the AnalysisFactory
	 * and then the corresponding Analysis is run.
	 * 
	 * @param args the command line inputs (not used for this method)
	 * @throws IOException 
	 * @throws CsvException 
	 */
	public static void main(String[] args) throws IOException, CsvException {
		
		JFrame frame = MainUI.getInstance();
		frame.setSize(1250, 800);
		frame.pack();
		frame.setMinimumSize(new Dimension(1250, 800));
		frame.setVisible(true);
		
//        try (Scanner input = new Scanner(System.in)) {
//        	System.out.println("Which module would you like to test?");
//            System.out.println("1 - Login");
//            System.out.println("2 - Data Fetching and Analysis");
//            System.out.print("Enter a selection: ");
//            String state = input.nextLine();
//
//            if (state.equals("1")) {
//            	
//            	System.out.println("\n");
//            	Registration.executeLogin();
//            	
//            } else if (state.equals("2")) {
//            	
//        		System.out.println("\nANALYSIS 1:\n");
//        		Analysis analysis1 = AnalysisFactory.createAnalysis(1, "CAN", 2011, 2014);
//        		analysis1.executeAnalysis();
//        		
//        		System.out.println("\nANALYSIS 2:\n");
//        		Analysis analysis2 = AnalysisFactory.createAnalysis(2, "CAN", 2011, 2014);
//        		analysis2.executeAnalysis();
//        		
//        		System.out.println("\nANALYSIS 3:\n");
//        		Analysis analysis3 = AnalysisFactory.createAnalysis(3, "CAN", 2011, 2014);
//        		analysis3.executeAnalysis();
//        		
//        		System.out.println("\nANALYSIS 4:\n");
//        		Analysis analysis4 = AnalysisFactory.createAnalysis(4, "CAN", 2011, 2014);
//        		analysis4.executeAnalysis();
//        		
//        		System.out.println("\nANALYSIS 5:\n");
//        		Analysis analysis5 = AnalysisFactory.createAnalysis(5, "CAN", 2011, 2014);
//        		analysis5.executeAnalysis();
//        		
//        		System.out.println("\nANALYSIS 6:\n");
//        		Analysis analysis6 = AnalysisFactory.createAnalysis(6, "CAN", 2011, 2014);
//        		analysis6.executeAnalysis();
//        		
//        		System.out.println("\nANALYSIS 7:\n");
//        		Analysis analysis7 = AnalysisFactory.createAnalysis(7, "CAN", 2011, 2014);
//        		analysis7.executeAnalysis();
//        		
//        		System.out.println("\nANALYSIS 8:\n");
//        		Analysis analysis8 = AnalysisFactory.createAnalysis(8, "CAN", 2011, 2014);
//        		analysis8.executeAnalysis();
//
//            } else {
//         
//                System.out.println("\nInvalid Selection.");
//                
//            }
//        }
	}
}
