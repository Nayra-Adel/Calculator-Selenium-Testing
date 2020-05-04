package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

import org.testng.annotations.Test;

public class DivisionTestCases extends BaseTest{

	@Test // Check the division of two integer numbers (Valid).
	public void testDivPositiveValidNumbers() {
		assertEquals(MAX_VALUE, calculator.div(MAX_VALUE, ONE));
	}

	@Test // Check the division of two negative numbers (Valid).
	public void testDivNegativeValidNumbers() {
		assertEquals(-MIN_VALUE, calculator.div(MIN_VALUE, -ONE));
	}

	@Test // Check the division of Zero Boundary.
	public void testDivZeroBoundaryValid() {
		assertEquals(-ONE, calculator.div(ONE, -ONE));
	}

	@Test // Check the division by Zero.
	public void testDivByZeroInValid() {
		assertThrows(IllegalArgumentException.class, () -> calculator.div(ONE, ZERO));
	}

	@Test // Check the division of Zero by any number.
	public void testDivZerobyAnyNumValid() {
		assertEquals(ZERO, calculator.div(ZERO, MAX_VALUE));
	}

	@Test // Check the division of Integer Boundary (max integer number / min integer number).
	public void testDivIntegerBoundaryValid() {
		assertEquals(ZERO, calculator.div(MAX_VALUE, MIN_VALUE));
	}
}
