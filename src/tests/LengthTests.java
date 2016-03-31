package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.converter.Length;

public class LengthTests {

	private final double _errorMargin = 0.01;
	
	@Test
	public void testMetersToInches() {
		double input = 468;
		double expected = 18425.2;
		double actual = Length.fromMeters(input).toInches();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testMetersToMillimeters() {
		double input = 4;
		double expected = 4000;
		double actual = Length.fromMeters(input).toMillimeters();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testKilometersToCentimeters() {
		double input = 984;
		double expected = 9.84E+7;
		double actual = Length.fromKilometers(input).toCentimeters();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testKilometersToMillimeters() {
		double input = 845;
		double expected = 8.45E+8;
		double actual = Length.fromKilometers(input).toMillimeters();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testMillimetersToYards() {
		double input = 56781;
		double expected = 62.096457;
		double actual = Length.fromMillimeters(input).toYards();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testMillimetersToCentimeters() {
		double input = 4861;
		double expected = 486.1;
		double actual = Length.fromMillimeters(input).toCentimeters();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testCentimetersToFeet() {
		double input = 97;
		double expected = 3.18241;
		double actual = Length.fromCentimeters(input).toFeet();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testCentimetersToInches() {
		double input = 16;
		double expected = 6.29921;
		double actual = Length.fromCentimeters(input).toInches();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testInchesToMeters() {
		double input = 48512;
		double expected = 1232.2048;
		double actual = Length.fromInches(input).toMeters();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testInchesToFeet() {
		double input = 312;
		double expected = 26;
		double actual = Length.fromInches(input).toFeet();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testFeetToKilometers() {
		double input = 745;
		double expected = 0.227076;
		double actual = Length.fromFeet(input).toKilometers();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testFeetToMeters() {
		double input = 0.24;
		double expected = 0.073152;
		double actual = Length.fromFeet(input).toMeters();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testYardsToYards() {
		double input = 2151;
		double expected = 2151;
		double actual = Length.fromYards(input).toYards();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testYardsToKilometers() {
		double input = 15;
		double expected = 0.013716;
		double actual = Length.fromYards(input).toKilometers();
		assertEquals(expected, actual, _errorMargin);
	}

}
