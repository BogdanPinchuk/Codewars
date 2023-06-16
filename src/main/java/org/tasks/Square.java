package org.tasks;

public class Square {
    public static boolean isSquare(int n) {
//        if (n < 0) {
//            return false;
//        } else if (n == 0) {
//            return true;
//        }
//
//        int root = (int) Math.ceil(Math.sqrt(n));
//
//        return n % root == 0;

        // 1 realization
        // Math.sqrt(n) % 1 == 0;
        // 2 realization
        return Math.ceil(Math.sqrt(n)) == Math.floor(Math.sqrt(n));
    }
}
