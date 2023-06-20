package org.tasks;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";

        // 1 realization
        // return Integer.lowestOneBit(number) == 1 ? "Odd" : "Even";
        // 2 realization
        // return new String[] { "Even", "Odd" }[number & 1];
    }
}
