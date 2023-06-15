package org.tasks;

import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Solution {
    public static String[] stringToArray(String s) {
        return s.split(" ");

        // 1 realization
        // s.split("\\W+");
    }

    public static int century(int number) {
        // 1 realization
        return (int) Year.of(0).until(Year.of(number), ChronoUnit.CENTURIES) +
                (number % 100 > 0 ? 1 : 0);
    }

}
