package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

import org.testng.annotations.Test;

public class AdditionTestCases extends BaseTest{

	@Test // Check the addition of two integer numbers.
	public void testAddPositiveValidNumbers() {
		assertEquals(3, calculator.add(ONE, 2));
	}

	@Test // Check the addition of two negative numbers.
	public void testAddNegativeValidNumbers() {
		assertEquals(-3, calculator.add(-ONE, -2));
	}

	@Test // Check the addition of Zero Boundary.
	public void testAddZeroBoundaryValid() {
		assertEquals(ZERO, calculator.add(-ONE, ONE));
	}

	@Test // Check the addition of two integer numbers (out of Boundary).
	public void testAddPositiveOutOfBoundaryInvalid() {
		assertThrows(ArithmeticException.class, () -> calculator.add(MAX_VALUE, ONE));
	}

	// OR Simply write that to check the message also
	// Check the addition of two integer numbers (out of range).
	/*
	   @Test(expectedExceptions = ArithmeticException.class, expectedExceptionsMessageRegExp = "OVERFLOW IN ADDITION!") 
	   public void testAddPositiveOutOfBoundaryInvalid() { 
	   		calculator.add(MAX_VALUE, ONE); 
	   }
	 */

	@Test // Check the addition of two negative numbers (out of range).
	public void testAddNegativeOutOfBoundaryInvalid() {
		assertThrows(ArithmeticException.class, () -> calculator.add(MIN_VALUE, -ONE));
	}

	@Test // Check the addition of Integer Boundary (max integer number + min integer
			// number).
	public void testAddIntegerBoundaryValid() {
		assertEquals(-ONE, calculator.add(MAX_VALUE, MIN_VALUE));
	}
}
