package code.gui;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import code.converter.Temperature;

public class TemperatureListener extends ConverterListener {

	public TemperatureListener(
			JTextField inputField,
			JComboBox<String> inputUnitComboBox,
			JComboBox<String> outputUnitComboBox,
			JLabel outputLabel
			) {
		super(inputField, inputUnitComboBox, outputUnitComboBox, outputLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (getInputValue() == null) {
			return;
		}
		
		Temperature temperature;
		
		switch (getInputUnit()) {
			case "\u00b0C":
				temperature = Temperature.fromCelcius(getInputValue());
				break;
			case "\u00b0F":
				temperature = Temperature.fromFarenheit(getInputValue());
				break;
			case "K":
			default:
				temperature = Temperature.fromKelvin(getInputValue());
				break;
		}
		
		switch (getOutputUnit()) {
			case "\u00b0C":
				getOutputLabel().setText(String.valueOf(temperature.toCelcius()));
				break;
			case "\u00b0F":
				getOutputLabel().setText(String.valueOf(temperature.toFarenheit()));
				break;
			case "K":
				getOutputLabel().setText(String.valueOf(temperature.toKelvin()));
				break;
		}
	}

}
