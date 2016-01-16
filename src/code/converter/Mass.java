package code.converter;

public class Mass extends Converter {

	public Mass(double value) {
		super(value);
	}
	
	public static Mass fromKilograms(double value) {
		return new Mass(value);
	}
	
	public static Mass fromGrams(double value) {
		return Mass.fromKilograms(value / 1000);
	}
	
	public static Mass fromMilligrams(double value) {
		return Mass.fromGrams(value / 1000);
	}
	
	public static Mass fromTonnes(double value) {
		return Mass.fromKilograms(value * 1000);
	}
	
	public static Mass fromPounds(double value) {
		return new Mass(value * 0.45359237);
	}
	
	public static Mass fromAtomicMassUnits(double value) {
		return new Mass(value * 1.660539040E-27);
	}
	
	// International avoirdupois ounce
	public static Mass fromOunces(double value) {
		return Mass.fromGrams(value * 28.349523125);
	}
	
	public double toKilograms() {
		return getValue();
	}
	
	public double toGrams() {
		return getValue() * 1000;
	}
	
	public double toMilligrams() {
		return toGrams() * 1000;
	}
	
	public double toTonnes() {
		return toKilograms() / 1000;
	}
	
	public double toPounds() {
		return getValue() / 0.45359237;
	}
	
	public double toAtomicMassUnits() {
		return getValue() / 1.660539040E-27;
	}

	// International avoirdupois ounce
	public double toOunces() {
		return toGrams() / 28.349523125;
	}

}
