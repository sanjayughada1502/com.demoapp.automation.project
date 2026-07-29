package com.demoapp.utilities;

import java.security.SecureRandom;

public class EmailGenerator {

    private static final SecureRandom random = new SecureRandom();

    private static final String[] FIRST_NAMES = {
            "amit", "rahul", "sanjay", "rohit", "vikas",
            "neha", "pooja", "priya", "ankit", "vivek"
    };

    private static final String[] LAST_NAMES = {
            "sharma", "patil", "gupta", "mehta", "joshi",
            "kulkarni", "deshmukh", "jadhav", "nair", "pawar"
    };

    private static final String[] DOMAINS = {
            "gmail.com",
            "yahoo.com",
            "outlook.com",
            "hotmail.com",
            "testmail.com"
    };

    /**
     * Generates a random email address.
     */
    public static String generateEmail() {

        String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
        String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
        int number = random.nextInt(9000) + 1000;

        String domain = DOMAINS[random.nextInt(DOMAINS.length)];

        return firstName + "." + lastName + number + "@" + domain;
    }

    
}
