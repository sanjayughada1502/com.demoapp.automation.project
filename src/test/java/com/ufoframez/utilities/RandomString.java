package com.ufoframez.utilities;

import java.util.Random;

import org.testng.annotations.DataProvider;

public class RandomString {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final Random RANDOM = new Random();

    // Generate random string with custom length
    public static String generateRandomString(int length) {
        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(CHARACTERS.length());
            result.append(CHARACTERS.charAt(index));
        }
        result.append("_Random");	
        return result.toString();
    }

    // Generate random string between min and max length (e.g., 4 to 8)
    public static String generateRandomString(int minLength, int maxLength) {
        int length = RANDOM.nextInt((maxLength - minLength) + 1) + minLength;
        return generateRandomString(length);
    }
    
    
    
    @DataProvider(name = "randomStringData")
    public Object[][] getRandomData() {
        return new Object[][] {
            { RandomString.generateRandomString(4, 8) }
        };
    }
}
