package code.converter;

public abstract class Converter {

	private double _value;
	
	public Converter(double value) {
		_value = value;
	}
	
	public double getValue() {
		return _value;
	}

}
