package org.tasks;

import java.util.HashMap;
import java.util.Map;

public class XO {
    public static boolean getXO(String str) {
        Map<Character, Integer> collector = new HashMap<>();
        char[] word = str.toLowerCase().toCharArray();

        for (char letter : word) {
            if (letter == 'x' || letter == 'o') {
                collector.compute(letter, (k, v) -> (v == null) ? 1 : ++v);
            }
        }

        return collector.getOrDefault('x', -1).equals(collector.getOrDefault('o', -1));

        // 1 realization
        // str = str.toLowerCase();
        //    return str.replace("o","").length() == str.replace("x","").length();
        // 2 realization
        // final Integer sum = str.chars()
        //                .map(ch -> {
        //                    switch (Character.toLowerCase(ch)) {
        //                        case 'x':
        //                            return 1;
        //                        case 'o':
        //                            return -1;
        //                        default:
        //                            return 0;
        //                    }
        //                })
        //                .sum();
        //        return sum.equals(0);
        // 3 realization
        // Map<String, Long> count = str.toLowerCase().codePoints().mapToObj(Character::toString)
        //                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //        return Objects.equals(count.get("o"), count.get("x"));
        // 4 realization
        // String[] test = str.toLowerCase().split("");
        //        return Arrays.stream(test).filter(symbol -> symbol.equals("x")).toArray().length == Arrays.stream(test).filter(symbol -> symbol.equals("o")).toArray().length;
    }
}
