package org.tasks;

import java.util.Arrays;

public class SumArray {
    public static double sum(double[] numbers) {
        return (numbers != null) ? Arrays.stream(numbers).sum() : 0.0;

        // 1 realization
//        return Arrays.stream(numbers).reduce(Double::sum).orElse(0.0);
    }
}
