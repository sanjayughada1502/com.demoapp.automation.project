package com.demoapp.utilities;

import java.security.SecureRandom;

public class RandomNameGenerator {

    private static final SecureRandom random = new SecureRandom();

    private static final String[] PREFIX = {
            "ABC", "STAR", "GLOBAL", "ROYAL", "MEGA",
            "PRIME", "UNITED", "NEXT", "ELITE", "SMART"
    };

    private static final String[] BUSINESS = {
            "MEDIA", "ADS", "DIGITAL", "MARKETING",
            "ENTERTAINMENT", "COMMUNICATIONS",
            "PROMOTIONS", "NETWORK", "AGENCY", "SOLUTIONS"
    };

    public static String generateAdvertiserName() {

        String prefix = PREFIX[random.nextInt(PREFIX.length)];
        String business = BUSINESS[random.nextInt(BUSINESS.length)];
        int number = random.nextInt(9000) + 1000; // 1000-9999

        return prefix + " " + business + " " + number;
    }


}
