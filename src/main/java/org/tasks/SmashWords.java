package org.tasks;

public class SmashWords {
    public static String smash(String... words) {
        return String.join(" ", words);

        // 1 realization
        // return Stream.of(words).collect(Collectors.joining(" "));
        // 2 realization
        // return Arrays.stream(words).collect(Collectors.joining(" "));
    }
}
