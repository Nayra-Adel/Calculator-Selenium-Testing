package tests;

import org.testng.annotations.BeforeTest;

import calculator.Calculator;
import calculator.ICalculator;

public class BaseTest {


	/*
	 * @By: Nayra Adel 
	 * Assumed that all input number is an integer (range) 
	 * any violation will throw an exception and I will assert it The division is also
	 * will cast to integer after division
	 */

	protected static ICalculator calculator;

	final int MAX_VALUE = Integer.MAX_VALUE;
	final int MIN_VALUE = Integer.MIN_VALUE;
	final int ONE = 1;
	final int ZERO = 0;

	@BeforeTest
	static void setup() {
		calculator = new Calculator();
	}
}
