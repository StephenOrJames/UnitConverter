package code.converter;

public class Length extends AConverter {

	public Length(double value) {
		super(value);
	}
	
	public static Length fromMeters(double value) {
		return new Length(value);
	}
	
	public static Length fromKilometers(double value) {
		return Length.fromMeters(value * 1000);
	}
	
	public static Length fromMillimeters(double value) {
		return Length.fromMeters(value / 1000);
	}
	
	public static Length fromCentimeters(double value) {
		return Length.fromMeters(value * 100);
	}
	
	public static Length fromInches(double value) {
		return new Length(value * 0.0254);
	}
	
	public static Length fromFeet(double value) {
		return Length.fromInches(value * 12);
	}
	
	public static Length fromYards(double value) {
		return Length.fromFeet(value * 3);
	}
	
	public double toMeters() {
		return getValue();
	}
	
	public double toKilometers() {
		return getValue() / 1000;
	}
	
	public double toMillimeters() {
		return getValue() * 1000;
	}
	
	public double toCentimeters() {
		return getValue() * 100;
	}
	
	public double toInches() {
		return getValue() / 0.0254;
	}
	
	public double toFeet() {
		return toInches() / 12;
	}
	
	public double toYards() {
		return toFeet() / 3;
	}

}
