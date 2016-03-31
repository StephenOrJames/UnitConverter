package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.converter.Mass;

public class MassTests {

	private final double _errorMargin = 0.0001;  // other margins are also used
	
	@Test
	public void testKilogramsToTonnes() {
		double input = 6128.2;
		double expected = 6.1282;
		double actual = Mass.fromKilograms(input).toTonnes();
		assertEquals(expected, actual, _errorMargin);
	}

	@Test
	public void testKilogramsToAtomicMassUnits() {
		double input = 592;
		double expected = 3.565104898E+29;
		double actual = Mass.fromKilograms(input).toAtomicMassUnits();
		assertEquals(expected, actual, 1.0E+24);
	}

	@Test
	public void testGramsToPounds() {
		double input = 8529665;
		double expected = 18804.69242;
		double actual = Mass.fromGrams(input).toPounds();
		assertEquals(expected, actual, _errorMargin);
	}

	@Test
	public void testGramsToOunces() {
		double input = 4156;
		double expected = 146.5986;
		double actual = Mass.fromGrams(input).toOunces();
		assertEquals(expected, actual, _errorMargin);
	}

	@Test
	public void testMilligramsToMilligrams() {
		double input = 2.005E+23;
		double expected = 2.005E+23;
		double actual = Mass.fromMilligrams(input).toMilligrams();
		assertEquals(expected, actual, _errorMargin);
	}

	@Test
	public void testMilligramsToPounds() {
		double input = 7900;
		double expected = 0.01741652;
		double actual = Mass.fromMilligrams(input).toPounds();
		assertEquals(expected, actual, _errorMargin);
	}

	@Test
	public void testTonnesToAtomicMassUnits() {
		double input = 100;
		double expected = 6.022136652E+31;
		double actual = Mass.fromTonnes(input).toAtomicMassUnits();
		assertEquals(expected, actual, 1.0E+26);
	}

	@Test
	public void testTonnesToOunces() {
		double input = 273;
		double expected = 9.63E+6;
		double actual = Mass.fromTonnes(input).toOunces();
		assertEquals(expected, actual, 1000);
	}

	@Test
	public void testPoundsToGrams() {
		double input = 893;
		double expected = 405058;
		double actual = Mass.fromPounds(input).toGrams();
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void testPoundsToTonnes() {
		double input = 63.1;
		double expected = 0.02862168;
		double actual = Mass.fromPounds(input).toTonnes();
		assertEquals(expected, actual, _errorMargin);
	}

	@Test
	public void testAtomicMassUnitsToGrams() {
		double input = 1.3884E+21;
		double expected = 0.002305494;
		double actual = Mass.fromAtomicMassUnits(input).toGrams();
		assertEquals(expected, actual, _errorMargin);
	}

	@Test
	public void testAtomicMassUnitsToKilograms() {
		double input = 9.87654E-32;
		double expected = 1.640039171E-58;
		double actual = Mass.fromAtomicMassUnits(input).toKilograms();
		assertEquals(expected, actual, _errorMargin);
	}

	@Test
	public void testOuncesToMilligrams() {
		double input = 0.005;
		double expected = 141.74762;
		double actual = Mass.fromOunces(input).toMilligrams();
		assertEquals(expected, actual, _errorMargin);
	}

	@Test
	public void testOuncesToKilograms() {
		double input = 50.05;
		double expected = 1.4188936;
		double actual = Mass.fromOunces(input).toKilograms();
		assertEquals(expected, actual, _errorMargin);
	}

}
