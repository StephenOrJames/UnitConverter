package code.converter;

public abstract class AConverter {

	private double _value;
	
	public AConverter(double value) {
		_value = value;
	}
	
	public double getValue() {
		return _value;
	}

}
