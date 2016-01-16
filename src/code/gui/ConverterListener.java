package code.gui;

import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class ConverterListener implements ActionListener {

	private JTextField _inputField;
	private JComboBox<String> _inputUnitComboBox;
	private JComboBox<String> _outputUnitComboBox;
	private JLabel _outputLabel;

	public ConverterListener(
			JTextField inputField,
			JComboBox<String> inputUnitComboBox,
			JComboBox<String> outputUnitComboBox,
			JLabel outputLabel
			) {
		_inputField = inputField;
		_inputUnitComboBox = inputUnitComboBox;
		_outputUnitComboBox = outputUnitComboBox;
		_outputLabel = outputLabel;
	}
	
	public Double getInputValue() {
		try {
			return Double.parseDouble(_inputField.getText());
		} catch (NumberFormatException e) {
			return null;
		}
	}
	
	public String getInputUnit() {
		return (String) _inputUnitComboBox.getSelectedItem();
	}
	
	public String getOutputUnit() {
		return (String) _outputUnitComboBox.getSelectedItem();
	}
	
	public JLabel getOutputLabel() {
		return _outputLabel;
	}

}
