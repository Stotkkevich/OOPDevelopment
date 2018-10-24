package info.sjd;

import java.util.logging.Logger;

public class SumNumbers {

	private static Logger logger = Logger.getLogger(SumNumbers.class.getName());

	public static void main(String[] args) {

		int a = 12345, b = a, c = 0;

		while (b != 0) {
			c += b % 10;
			b /= 10;
		}
		logger.info("Sum of digits in number " + a + " equals " + c);
	}
}