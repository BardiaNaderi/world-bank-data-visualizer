package mainGUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.opencsv.exceptions.CsvException;

import userInputObservers.AnalysisYearValidator;
import userInputObservers.CountryValidator;
import userInputObservers.ParametersSelector;
import userInputObservers.ViewerValidator;
import viewBuilders.View;

public class MainUI extends JFrame {

	private static final long serialVersionUID = 1L;

	private static MainUI instance;
	
	private JPanel north;
	private JPanel east;
	private JPanel south;
	private JPanel west;
	
	private ParametersSelector params;
	private CountryValidator countryVal;
	private AnalysisYearValidator analysisYearVal;
	private ViewerValidator viewVal;
	
	private View view;
	private Map<String, String> countries;
	
	public static MainUI getInstance() {
		if (instance == null)
			instance = new MainUI();

		return instance;
	}
		
	public JPanel getNort() {
		return this.north;
	
	}
	public JPanel getEast() {
		return this.east;
	
	}
	public JPanel getSouth() {
		return this.south;
	}
	
	public JPanel getWest() {
		return this.west;
	}
	
	public ParametersSelector getParams() {
		return this.params;
	}
	
	public View getView() {
		return this.view;
	}
	
	public Map<String, String> getCountryList() {
		return this.countries;
	}
	
	public void setView(View view) {
		this.view = view;
	}

	private MainUI() {
		
		super("Country Statistics");
		
		setUpParameters();
		renderCountrySelection();
		renderYearsSelection();
		renderViewersSelection();
		renderAnalysisSelection();	
		
		getContentPane().add(north, BorderLayout.NORTH);
		getContentPane().add(east, BorderLayout.EAST);
		getContentPane().add(south, BorderLayout.SOUTH);
		getContentPane().add(this.getWest(), BorderLayout.WEST);
	}
	
	private void setUpParameters() {
		this.north = new JPanel();
		this.east = new JPanel();
		this.south = new JPanel();
		this.west = new JPanel();
		
		this.view = null;
		
		this.params = new ParametersSelector();
		this.countryVal = new CountryValidator();
		this.analysisYearVal = new AnalysisYearValidator();
		this.viewVal = new ViewerValidator();
		
		this.params.subscribe(countryVal);
		this.params.subscribe(analysisYearVal);
		this.params.subscribe(viewVal);
	}
		
	private void renderCountrySelection() {
		try {
			countries = CSVToList.makeList("src/database/countries.csv");
		} catch (IOException | CsvException e1) {
			e1.printStackTrace();
		}

		JLabel chooseCountryLabel = new JLabel("Choose a country: ");
		
		Vector<String> countriesNames = new Vector<String>();
		for (Map.Entry<String, String> entry: countries.entrySet()) {
			countriesNames.add(entry.getKey());
		}
		countriesNames.sort(null);
		
		JComboBox<String> countriesList = new JComboBox<String>(countriesNames);
		countriesList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String country = countriesList.getSelectedItem().toString();
                params.selectCountry(country);
            }
        });
		
		north.add(chooseCountryLabel);
		north.add(countriesList);
	}

	private void renderYearsSelection() {
		JLabel from = new JLabel("From");
		JLabel to = new JLabel("To");
		Vector<String> years = new Vector<String>();
		for (int i = 2021; i >= 1972; i--) {
			years.add("" + i);
		}
		JComboBox<String> fromList = new JComboBox<String>(years);
		fromList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int startYear = Integer.parseInt(fromList.getSelectedItem().toString());
                params.selectStartYear(Integer.toString(startYear));
            }
        });
	
		JComboBox<String> toList = new JComboBox<String>(years);
		toList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int endYear = Integer.parseInt(toList.getSelectedItem().toString());
                params.selectEndYear(Integer.toString(endYear));
            }
        });	
		
		north.add(from);
		north.add(fromList);
		north.add(to);
		north.add(toList);
	}

	private void renderViewersSelection() {
		this.getWest().setLayout(new GridLayout(2, 0));
		
		JLabel viewsLabel = new JLabel("Available Views: ");

		Vector<String> viewsNames = new Vector<String>();
		viewsNames.add("Line Chart");
		viewsNames.add("Time Chart");
		viewsNames.add("Bar Chart");
		viewsNames.add("Scatter Chart");
		viewsNames.add("Pie Chart");
		viewsNames.add("Report");
		JComboBox<String> viewsList = new JComboBox<String>(viewsNames);
		JButton addView = new JButton("+");
		addView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	params.addViewer(viewsList.getSelectedItem().toString());
            }
        });

		JButton removeView = new JButton("-");
		removeView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                params.removeViewer(viewsList.getSelectedItem().toString());
            }
        });
		
		south.add(viewsLabel);
		south.add(viewsList);
		south.add(addView);
		south.add(removeView);
	}

	private void renderAnalysisSelection() {
		JButton recalculate = new JButton("Recalculate");
		recalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               params.recalculate();
            }
        });
		
		JLabel methodLabel = new JLabel("        Choose analysis method: ");
		Vector<String> methodsNames = new Vector<String>();
		try {
			analysisDropDownFiller(methodsNames);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		JComboBox<String> methodsList = new JComboBox<String>(methodsNames);
		methodsList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int analysis = methodsList.getSelectedIndex();
                params.selectAnalysis(Integer.toString(analysis));
            }
        });

		south.add(methodLabel);
		south.add(methodsList);
		south.add(recalculate);
	}

	private void analysisDropDownFiller(Vector<String> methodNames) throws FileNotFoundException {
		String filePath = "src/database/analysisYear.csv";
		Scanner x = new Scanner(new File(filePath));
		String analysisTitle = "";
		while (x.hasNextLine()) {
			String analysisValues = x.nextLine();
			String[] userDataValues = analysisValues.split(",");
            analysisTitle = userDataValues[0].trim();

			methodNames.add(analysisTitle);
		}
		x.close();
	}
	
	/**
	 * ApplicationGui is a method that gets and instance of the Main application UI and sets the frame and other attributes.
	 */
	public static void applicationGui(){
		JFrame frame = MainUI.getInstance();
		frame.setSize(1250, 800);
		frame.pack();
		frame.setMinimumSize(new Dimension(1250, 800));
		frame.setVisible(true);
	}
}