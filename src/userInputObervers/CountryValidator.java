package userInputObervers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CountryValidator implements Validator {

	public void update(int analysis, String country, int startYear, int endYear, String viewer) {

		// TODO: this is temporary for testing, need to implement a way to swap all
		// country strings for codes, probably as part of the CSV check
		switch (country) {
			case "Brazil":
				country = "BRA";
				break;
			case "Canada":
				country = "CAN";
				break;
			case "China":
				country = "CHN";
				break;
			case "France":
				country = "FRA";
				break;
			case "USA":
				country = "USA";
				break;
			default:
				country = "CAN";
		}

		Boolean valid = true;
		try {
			valid = csvValidator(valid, country);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// checking if country is valid or not
		if (!valid) {
			JFrame frame = new JFrame("Invalid Selection");
			JOptionPane.showMessageDialog(frame,
					"Data fetching is not permitted for " + country + ". Please select another country.",
					"Invalid Selection", JOptionPane.ERROR_MESSAGE);
		} else {
			AnalysisParameters.getParams().setCountry(country);
		}

	}

	private boolean csvValidator(boolean valid, String country) throws FileNotFoundException {
		String filePath = "src/userInputObervers/countries.csv";
		Scanner x = new Scanner(new File(filePath));
		while (x.hasNextLine()) {
			String invalidCountry = x.nextLine();

			if (invalidCountry.equals(country)) {
				valid = false;
			}
		}
		x.close();
		return valid;
	}
}
