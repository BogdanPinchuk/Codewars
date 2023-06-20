package org.tasks;

import java.util.stream.IntStream;

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        double average = IntStream.of(s1, s2, s3).average().orElse(0);

        char result;
        if (90 <= average) result = 'A';
        else if (80 <= average) result = 'B';
        else if (70 <= average) result = 'C';
        else if (60 <= average) result = 'D';
        else result = 'F';

        return result;

        // 1 realization
        // return "FFFFFFDCBAA".charAt((s1+s2+s3)/30);
        // 2 realization
        // Arrays.stream(new int[] {s1, s2, s3})
        //                .summaryStatistics()
        //                .getAverage()
    }
}
