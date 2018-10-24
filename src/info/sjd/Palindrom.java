package info.sjd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class Palindrom {

	private static Logger logger = Logger.getLogger(Palindrom.class.getName());

	public static void main(String[] args) {
		int result = getMaxPalindrom();
		
		logger.info("Max palindrom is " + result);
	}

	public static int getMaxPalindrom() {
		
		List<Integer> palindrom = new ArrayList<>();

		for (int a = 12; a < 100; a++) {
			for (int b = 24; b < 100; b++) {
				int result = a * b;

				if (resultIsPalindrom(result)) {
					palindrom.add(result);
				}
			}
		}
		return Collections.max(palindrom);
	}

	public static boolean resultIsPalindrom(int result) {
		// TODO Auto-generated method stub
		String palindrome = new StringBuilder(String.valueOf(result)).reverse().toString();
		return palindrome.equals(String.valueOf(result));
	}
}