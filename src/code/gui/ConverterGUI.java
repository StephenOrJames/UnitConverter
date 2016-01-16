package code.gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class ConverterGUI implements Runnable {
	
	JFrame _frame;

	public ConverterGUI() {
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
		}
		
		_frame = new JFrame("Unit Converter");
	}
	
	@Override
	public void run() {
		_frame.getContentPane().setLayout(new BorderLayout());
		loadFrame();
		_frame.pack();
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_frame.setLocationRelativeTo(null);
		_frame.setVisible(true);
	}
	
	public void loadFrame() {
		JTabbedPane tabbedPane = new JTabbedPane();
		
		tabbedPane.add("Length", getConverterPanel("Length"));
		tabbedPane.add("Mass", getConverterPanel("Mass"));
		tabbedPane.add("Temperature", getConverterPanel("Temperature"));
		
		_frame.add(tabbedPane);
	}
	
	public JPanel getConverterPanel(String unit) {
		GridBagConstraints gbc = new GridBagConstraints();
		JPanel panel = new JPanel(new GridBagLayout());
		
		String[] units;
		switch (unit) {
			case "Length":
				String[] lengthUnits = {"m", "km", "mm", "cm", "in", "ft", "yd"};
				units = lengthUnits;
				break;
			case "Mass":
				String[] massUnits = {"kg", "g", "mg", "t", "lb", "u", "oz"};
				units = massUnits;
				break;
			case "Temperature":
				String[] temperatureUnits = {"\u00b0C", "\u00b0F", "K"};
				units = temperatureUnits;
				break;
			default:
				units = new String[0];
				break;
		}
		
		JTextField inputTextField = new JTextField(14);
		inputTextField.setHorizontalAlignment(JTextField.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(inputTextField, gbc);
		
		JComboBox<String> inputUnitComboBox = new JComboBox<>(units);
		gbc.gridx = 1;
		gbc.gridy = 0;
		panel.add(inputUnitComboBox, gbc);
		
		JLabel outputLabel = new JLabel();
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(outputLabel, gbc);
		
		JComboBox<String> outputUnitComboBox = new JComboBox<>(units);
		gbc.gridx = 1;
		gbc.gridy = 1;
		panel.add(outputUnitComboBox, gbc);
		
		ActionListener listener;
		switch (unit) {
			case "Length":
				listener = new LengthListener(
						inputTextField, inputUnitComboBox, outputUnitComboBox, outputLabel
				);
				break;
			case "Mass":
				listener = new MassListener(
						inputTextField, inputUnitComboBox, outputUnitComboBox, outputLabel
				);
				break;
			case "Temperature":
				listener = new TemperatureListener(
						inputTextField, inputUnitComboBox, outputUnitComboBox, outputLabel
				);
				break;
			default:
				listener = new ActionListener() {
					@Override public void actionPerformed(ActionEvent e) {}
				};
				break;
		}
		
		inputTextField.addActionListener(listener);
		inputUnitComboBox.addActionListener(listener);
		outputUnitComboBox.addActionListener(listener);
		
		return panel;
	}

}
