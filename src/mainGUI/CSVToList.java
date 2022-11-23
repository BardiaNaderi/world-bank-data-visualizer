package mainGUI;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CSVToList {
	
	/**
	 * A helper class used by the MainUI in order to parse through a two column CSV file and 
	 * returns the results as a Map. 
	 * 
	 * @param file the CSV file containing two columns of data
	 * @return the data from the CSV file as a Map
	 * @throws FileNotFoundException when a file cannot be found
	 * @throws IOException when a file cannot be read
	 * @throws CsvException when errors occur with the CSV file parsing
	 */
	public static Map<String, String> makeList(String file) throws FileNotFoundException, IOException, CsvException {
		
		List<String[]> list;
		Map<String, String> map = new HashMap<String, String>();
		
		try (CSVReader reader = new CSVReader(new FileReader(file))) {
			list = reader.readAll();
			list.forEach(x -> map.put(x[0], x[1]));
		}
		
		return map;		
	}
	
}
