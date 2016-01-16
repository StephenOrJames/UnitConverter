package code.gui;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import code.converter.Mass;

public class MassListener extends ConverterListener {

	public MassListener(
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
		
		Mass mass;
		
		switch (getInputUnit()) {
			case "g":
				mass = Mass.fromGrams(getInputValue());
				break;
			case "mg":
				mass = Mass.fromMilligrams(getInputValue());
				break;
			case "t":
				mass = Mass.fromTonnes(getInputValue());
				break;
			case "lb":
				mass = Mass.fromPounds(getInputValue());
				break;
			case "u":
				mass = Mass.fromAtomicMassUnits(getInputValue());
				break;
			case "oz":
				mass = Mass.fromOunces(getInputValue());
				break;
			case "kg":
			default:
				mass = Mass.fromKilograms(getInputValue());
				break;
		}
		
		switch (getOutputUnit()) {
			case "g":
				getOutputLabel().setText(String.valueOf(mass.toGrams()));
				break;
			case "mg":
				getOutputLabel().setText(String.valueOf(mass.toMilligrams()));
				break;
			case "t":
				getOutputLabel().setText(String.valueOf(mass.toTonnes()));
				break;
			case "lb":
				getOutputLabel().setText(String.valueOf(mass.toPounds()));
				break;
			case "u":
				getOutputLabel().setText(String.valueOf(mass.toAtomicMassUnits()));
				break;
			case "oz":
				getOutputLabel().setText(String.valueOf(mass.toOunces()));
				break;
			case "kg":
				getOutputLabel().setText(String.valueOf(mass.toKilograms()));
				break;
		}
	}

}
