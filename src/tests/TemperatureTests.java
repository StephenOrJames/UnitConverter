package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.converter.Temperature;

public class TemperatureTests {

	private final double _errorMargin = 0.001;
	
	@Test
	public void testKelvinToKelvin() {
		double input = 23.45;
		double expected = 23.45;
		double actual = Temperature.fromKelvin(input).toKelvin();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testKelvinToCelcius() {
		double input = 47.9201;
		double expected = -225.2299;
		double actual = Temperature.fromKelvin(input).toCelcius();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testKelvinToFarenheit() {
		double input = 200;
		double expected = -99.67;
		double actual = Temperature.fromKelvin(input).toFarenheit();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testCelciusToKelvin() {
		double input = -102.03;
		double expected = 171.12;
		double actual = Temperature.fromCelcius(input).toKelvin();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testCelciusToCelcius() {
		double input = 137;
		double expected = 137;
		double actual = Temperature.fromCelcius(input).toCelcius();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testCelciusToFarenheit() {
		double input = 100;
		double expected = 212;
		double actual = Temperature.fromCelcius(input).toFarenheit();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testFarenheitToKelvin() {
		double input = 0;
		double expected = 255.372;
		double actual = Temperature.fromFarenheit(input).toKelvin();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testFarenheitToCelcius() {
		double input = 32;
		double expected = 0;
		double actual = Temperature.fromFarenheit(input).toCelcius();
		assertEquals(expected, actual, _errorMargin);
	}
	
	@Test
	public void testFarenheitToFarenheit() {
		double input = -5.948;
		double expected = -5.948;
		double actual = Temperature.fromFarenheit(input).toFarenheit();
		assertEquals(expected, actual, _errorMargin);
	}

}
