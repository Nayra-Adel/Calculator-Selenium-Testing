package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

import org.testng.annotations.Test;

public class SubtractionTestCases extends BaseTest {

	@Test // Check the subtraction of two integer numbers.
	public void testSubPositiveValidNumbers() {
		assertEquals(ONE, calculator.sub(2, ONE));
	}

	@Test // Check the subtraction of two negative numbers.
	public void testSubNegativeValidNumbers() {
		assertEquals(-ONE, calculator.sub(-2, -ONE));
	}

	@Test // Check the subtraction of Zero Boundary.
	public void testSubZeroBoundaryValid() {
		assertEquals(2, calculator.sub(ONE, -ONE));
	}

	@Test // Check the subtraction of MAX Integer value with -ve one (out of range).
	public void testSubMaxIntegerOutOfBoundaryInvalid() {
		assertThrows(ArithmeticException.class, () -> calculator.sub(MAX_VALUE, -ONE));
	}

	@Test // Check the subtraction of MIN Integer value with +ve one (out of range).
	public void testSubMinIntegerOutOfBoundaryInvalid() {
		assertThrows(ArithmeticException.class, () -> calculator.sub(MIN_VALUE, ONE));
	}
}
