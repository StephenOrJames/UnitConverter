package code.converter;

public class Temperature extends Converter {

	public Temperature(double value) {
		super(value);
	}
	
	public static Temperature fromKelvin(double value) {
		return new Temperature(value);
	}
	
	public static Temperature fromCelcius(double value) {
		return new Temperature(value + 273.15);
	}
	
	public static Temperature fromFarenheit(double value) {
		return Temperature.fromCelcius((value - 32) / 1.8);
	}
	
	public double toKelvin() {
		return getValue();
	}
	
	public double toCelcius() {
		return getValue() - 273.15;
	}
	
	public double toFarenheit() {
		return toCelcius() * 1.8 + 32;
	}

}
