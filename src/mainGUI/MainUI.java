package mainGUI;

import java.awt.BorderLayout;
import java.awt.Color;
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

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;

import com.opencsv.exceptions.CsvException;

import userInputObervers.AnalysisYearValidator;
import userInputObervers.CountryValidator;
import userInputObervers.ParametersSelector;
import userInputObervers.ViewerValidator;
import viewBuilders.View;

public class MainUI extends JFrame {

	private static final long serialVersionUID = 1L;

	private static MainUI instance;
	
	private ParametersSelector params;
	private CountryValidator countryVal;
	private AnalysisYearValidator analysisYearVal;
	private ViewerValidator viewVal;
	
	private View view;
	private JPanel west;
	
	private Map<String, String> countries;
	
	public static MainUI getInstance() {
		if (instance == null)
			instance = new MainUI();

		return instance;
	}
	
	public ParametersSelector getParams() {
		return this.params;
	}
	
	public View getView() {
		return this.view;
	}
	
	public JPanel getWest() {
		return this.west;
	}
	
	public Map<String, String> getCountryList() {
		return this.countries;
	}
	
	public void setView(View view) {
		this.view = view;
	}

	private MainUI() {
		
		// Set window title
		super("Country Statistics");
		
		// Set up the attributes
		this.params = new ParametersSelector();
		this.countryVal = new CountryValidator();
		this.analysisYearVal = new AnalysisYearValidator();
		this.viewVal = new ViewerValidator();
		
		this.view = null;
		this.west = new JPanel();
		
		// Set up the Observer listeners
		this.params.subscribe(countryVal);
		this.params.subscribe(analysisYearVal);
		this.params.subscribe(viewVal);
		
		
		// ------------------------------
		// COUNTRY SELECTION
		// ------------------------------
		
		try {
			countries = CSVToList.makeList("src/database/countries.csv");
		} catch (IOException | CsvException e1) {
			e1.printStackTrace();
		}

		// Set top bar
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

		// ------------------------------
		// YEARS SELECTION
		// ------------------------------

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

		JPanel north = new JPanel();
		north.add(chooseCountryLabel);
		north.add(countriesList);
		north.add(from);
		north.add(fromList);
		north.add(to);
		north.add(toList);
		
		// ------------------------------
		// RECALCULATE BUTTON
		// ------------------------------

		// Set bottom bar
		JButton recalculate = new JButton("Recalculate");
		recalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               params.recalculate();
            }
        });
		
		// ------------------------------
		// VIEWS SELECTION
		// ------------------------------

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



		// ------------------------------
		// ANALYSIS SELECTION
		// ------------------------------
		
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

		JPanel south = new JPanel();
		south.add(viewsLabel);
		south.add(viewsList);
		south.add(addView);
		south.add(removeView);

		south.add(methodLabel);
		south.add(methodsList);
		south.add(recalculate);

		JPanel east = new JPanel();


		getContentPane().add(north, BorderLayout.NORTH);
		getContentPane().add(east, BorderLayout.EAST);
		getContentPane().add(south, BorderLayout.SOUTH);
		getContentPane().add(this.getWest(), BorderLayout.WEST);
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
	

	private void createPie(JPanel west) {
		// Different way to create pie chart
		/*
		 * var dataset = new DefaultPieDataset(); dataset.setValue("Unemployed", 3.837);
		 * dataset.setValue("Employed", 96.163);
		 * 
		 * JFreeChart pieChart = ChartFactory.createPieChart("Women's Unemployment",
		 * dataset, true, true, false);
		 */

		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(3.946, "Unemployed", "Men");
		dataset.addValue(96.054, "Employed", "Men");
		dataset.addValue(3.837, "Unemployed", "Women");
		dataset.addValue(96.163, "Employed", "Women");

		JFreeChart pieChart = ChartFactory.createMultiplePieChart("Unemployment: Men vs Women", dataset,
				TableOrder.BY_COLUMN, true, true, false);

		ChartPanel chartPanel = new ChartPanel(pieChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		chartPanel.setBackground(Color.white);
		west.add(chartPanel);
	}


		

//	public static void main(String[] args) throws IOException {
//		
//		//TODO: execute login module first before displaying GUI
//
//		JFrame frame = MainUI.getInstance();
//		frame.setSize(900, 600);
//		frame.pack();
//		frame.setVisible(true);
//	}
}