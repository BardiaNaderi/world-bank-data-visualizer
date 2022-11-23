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
		Registration.executeLogin();
	}
}
