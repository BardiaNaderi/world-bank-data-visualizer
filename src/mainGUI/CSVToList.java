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
