package userInputObervers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mainGUI.MainUI;

public class CountryValidator implements Validator {

	public void update() {
			
		MainUI gui = MainUI.getInstance();
		ParametersSelector params = gui.getParams();

		Boolean valid = true;
		try {
			valid = csvValidator(valid, params.getCountry().value);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// checking if country is valid or not
		if (!valid) {
			params.setCountryValid(false);
			JFrame frame = new JFrame("Invalid Selection");
			JOptionPane.showMessageDialog(frame,
					"Data fetching is not permitted for " + params.getCountry().value + ". Please select another country.",
					"Invalid Selection", JOptionPane.ERROR_MESSAGE);
		} else {
			params.setCountryValid(true);
		}

	}

	private boolean csvValidator(boolean valid, String country) throws FileNotFoundException {
		String filePath = "src/database/InvalidCountries.csv";
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
