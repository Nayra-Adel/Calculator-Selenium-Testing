package calculator;

public class Calculator implements ICalculator {

	public int add(int x, int y) {

		long sum = (long) x + (long) y;

		if (sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE)
			throw new ArithmeticException("OVERFLOW IN ADDITION!");

		return (int) sum;
	}

	public int sub(int x, int y) {

		long subtract = (long) x - (long) y;

		if (subtract < Integer.MIN_VALUE || subtract > Integer.MAX_VALUE)
			throw new ArithmeticException("OVERFLOW IN SUBTRACTION!");

		return (int) subtract;
	}

	public int mul(int x, int y) {

		long multiplication = (long) x * (long) y;

		if (multiplication < Integer.MIN_VALUE || multiplication > Integer.MAX_VALUE)
			throw new ArithmeticException("OVERFLOW IN MULTIPLICATION!");

		return (int) multiplication;
	}

	public int div(int x, int y) {

		if (y == 0)
			throw new IllegalArgumentException("Can't divide by zero!");

		return x / y;
	}
}
