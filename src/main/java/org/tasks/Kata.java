package org.tasks;

import java.util.Arrays;

public class Kata {
    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }

    public static String solution(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString();

        // 1 realization
//         StringUtils.reverse(str);
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        long sum = yourPoints;

        for (int point : classPoints) {
            sum += point;
        }

        double averagePoint = (double) sum / (classPoints.length + 1);

        return yourPoints > averagePoint;

        // 1 realization
        // Arrays.stream(classPoints).average().orElse(0) < yourPoints;
        // 2 realization
        // IntStream.of(classPoints).sum()/classPoints.length < yourPoints;
        // 3 realization
        // IntStream.of(classPoints).average().getAsDouble() < yourPoints;
    }

    public static Object[] removeEveryOther(Object[] arr) {
        if (arr == null) {
            return null;
        } else if (arr.length == 0) {
            return new Object[]{};
        }

        int size = arr.length - (arr.length / 2);
        Object[] result = new Object[size];

        for (int i = 0; i < arr.length; i += 2) {
            result[i / 2] = arr[i];
        }

        return result;

        // 1 realization
        // iterate(0, i -> i < arr.length, i -> i + 2).map(i -> arr[i]).toArray();
        // 2 realization
        // IntStream.range(0, arr.length).filter(n -> n % 2 == 0).mapToObj(i->arr[i]).toArray();
    }

    static String greet(String name, String owner) {
        name = name.toLowerCase();
        owner = owner.toLowerCase();

        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump <= mpg * fuelLeft;
    }

    public static boolean solution(String str, String ending) {
        if (str == null || ending == null ||
                ending.length() > str.length()) {
            return false;
        }

        int strLastIndex = str.length() - 1,
                endingLastIndex = ending.length() - 1;
        for (int i = 0; i <= endingLastIndex; i++) {
            if (ending.getBytes()[endingLastIndex - i] != str.getBytes()[strLastIndex - i]) {
                return false;
            }
        }

        return true;

        // 1 realization
        // str.endsWith(ending);
        // 2 realization
        // str.substring(str.length()-ending.length()).equals(ending)
    }

    public static String numberToString(int num) {
        return String.valueOf(num);

        // 1 realization
        // Integer.toString(num);
        // 2 realization
        // String.format("%d",num)
    }

    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();

        // 1 realization
//		Stream.of(s.split(" "))
//				.mapToInt(String::length)
//				.min()
//				.getAsInt();
        // 2 realization
//		Arrays.stream(s.split(" "))
//				.map(String::length)
//				.min(Comparator.naturalOrder())
//				.get();
        // 3 realization
//		List<Integer> words_len = Arrays.asList(words).stream().map(w -> w.length()).collect(Collectors.toList());
//		return Collections.min(words_len);
        // 4 realization
        // Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length)).findFirst().get().length();
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }

        int[] result = new int[2];

        for (int value : input) {
            if (value <= 0){
                result[1] += value;
            } else {
                result[0]++;
            }
        }

        return result;

        // 1 realization
        // int[] { (int)IntStream.of(input).filter(i->i>0).count(), IntStream.of(input).filter(i->i<0).sum() };
        // 2 realization
        // (int) Arrays.stream(input).filter(i -> i > 0).count(), (int) Arrays.stream(input).filter(i -> i < 0).sum()
    }

    public static double find_average(int[] array){
        return Arrays.stream(array).average().orElse(0.0);

        // 1 realization
        // IntStream.of(array).average().getAsDouble();
        // 2 realization
        // return IntStream.of(array).summaryStatistics().getAverage();
        // 3 realization
        // return (double)Arrays.stream(array).reduce((a,b) -> a + b).getAsInt() / array.length;
    }
}
