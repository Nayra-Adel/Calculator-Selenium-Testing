package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

import org.testng.annotations.Test;

public class MultiplicationTestCases extends BaseTest{

	@Test // Check the multiplication of two integer numbers.
	public void testMulPositiveValidNumbers() {
		assertEquals(2, calculator.mul(2, ONE));
	}

	@Test // Check the multiplication of two negative numbers.
	public void testMulNegativeValidNumbers() {
		assertEquals(2, calculator.mul(-2, -ONE));
	}

	@Test // Check the multiplication of Zero Boundary.
	public void testMulZeroBoundaryValid() {
		assertEquals(-ONE, calculator.mul(ONE, -ONE));
	}

	@Test // Check the multiplication of MAX Integer value with 2 (out of range).
	public void testMulMaxIntegerOutOfBoundaryInvalid() {
		assertThrows(ArithmeticException.class, () -> calculator.mul(MAX_VALUE, 2));
	}

	@Test // Check the multiplication of MIN Integer value with 2 (out of range).
	public void testMulMinIntegerOutOfBoundaryInvalid() {
		assertThrows(ArithmeticException.class, () -> calculator.mul(MIN_VALUE, 2));
	}
}
