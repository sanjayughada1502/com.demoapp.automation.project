package com.ufoframez.utilities;

import java.util.Random;

public class RandomNumberGenerator {

	private static final Random random = new Random();

	/**
	 * Generate random numeric string of specified length Example:
	 * generateRandomNumber(5) -> 48391 generateRandomNumber(10) -> 5839201746
	 */
	public String generateRandomNumber(int length) {

		if (length <= 0) {
			throw new IllegalArgumentException("Length must be greater than 0");
		}

		StringBuilder number = new StringBuilder();

		for (int i = 0; i < length; i++) {
			number.append(random.nextInt(10)); // 0-9
		}

		return number.toString();
	}
}
