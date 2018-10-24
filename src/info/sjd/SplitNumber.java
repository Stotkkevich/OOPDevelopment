package info.sjd;

import java.util.Arrays;
import java.util.logging.Logger;

public class SplitNumber {

	private static Logger logger = Logger.getLogger(SplitNumber.class.getName());

	public static void main(String[] args) {

		int a = 12345;
		String b = String.valueOf(a);

		final int[] ints = Arrays.stream(b.split("")).mapToInt(c -> Integer.parseInt(c)).toArray();

		logger.info("Dividing number " + a + " on symbols, we get " + Arrays.toString(ints));
	}
}