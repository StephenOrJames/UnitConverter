package code;

import javax.swing.SwingUtilities;

import code.gui.ConverterGUI;

public class Driver {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new ConverterGUI());

	}

}
