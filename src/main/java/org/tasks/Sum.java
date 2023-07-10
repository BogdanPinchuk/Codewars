package org.tasks;

public class Sum {
    public int GetSum(int a, int b) {
        return (a + b) * (Math.max(a, b) - Math.min(a, b) + 1) / 2;

        // 1 realization
//        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}
