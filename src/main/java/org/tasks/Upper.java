package org.tasks;

public class Upper {
    public static String MakeUpperCase(String str) {
        return str.toUpperCase();

        // 1 realization
        // Stream.of(str).map(e -> e.toUpperCase()).findFirst().get();
        // 2 realization
        // Stream.of(str)
        //      .map(string -> string.toUpperCase())
        //      .collect(Collectors.joining());
    }
}
