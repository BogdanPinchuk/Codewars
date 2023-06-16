package org.tasks;

import java.util.Arrays;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(i -> i != null && i == true).count();

        // 1 realization
        // return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
        // 2 realization
//        (int)Arrays.stream(arrayOfSheeps)
//                .filter(Objects::nonNull)
//                .filter(Boolean::booleanValue).count();
        // 3 realization
        // Arrays.stream(arrayOfSheep)
        //                 .filter(i -> i == Boolean.TRUE)
        //                 .count();
        // 4 realization
        // return (int) Arrays.stream(arrayOfSheeps).filter(Predicate.isEqual(Boolean.TRUE)).count();
        // 5 realization
        // return (int) Stream.ofNullable(arrayOfSheeps)
        //      .flatMap(Stream::of)
        //      .filter(Predicate.isEqual(Boolean.TRUE))
        //      .count();

    }
}
