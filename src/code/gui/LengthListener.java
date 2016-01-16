package code.gui;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import code.converter.Length;

public class LengthListener extends ConverterListener {

	public LengthListener(
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
		
		Length length;
		
		switch (getInputUnit()) {
			case "km":
				length = Length.fromKilometers(getInputValue());
				break;
			case "mm":
				length = Length.fromMillimeters(getInputValue());
				break;
			case "cm":
				length = Length.fromCentimeters(getInputValue());
				break;
			case "in":
				length = Length.fromInches(getInputValue());
				break;
			case "ft":
				length = Length.fromFeet(getInputValue());
				break;
			case "yd":
				length = Length.fromYards(getInputValue());
				break;
			case "m":
			default:
				length = Length.fromMeters(getInputValue());
				break;
		}
		
		switch (getOutputUnit()) {
			case "km":
				getOutputLabel().setText(String.valueOf(length.toKilometers()));
				break;
			case "mm":
				getOutputLabel().setText(String.valueOf(length.toMillimeters()));
				break;
			case "cm":
				getOutputLabel().setText(String.valueOf(length.toCentimeters()));
				break;
			case "in":
				getOutputLabel().setText(String.valueOf(length.toInches()));
				break;
			case "ft":
				getOutputLabel().setText(String.valueOf(length.toFeet()));
				break;
			case "yd":
				getOutputLabel().setText(String.valueOf(length.toYards()));
				break;
			case "m":
				getOutputLabel().setText(String.valueOf(length.toMeters()));
				break;
		}
	}

}
