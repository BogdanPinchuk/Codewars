package org.tasks;

public class Kata {
	public static String greet(String name) {
		return String.format("Hello, %s how are you doing today?", name);
	}

	public static String solution(String str) {
		return new StringBuilder(str)
				.reverse()
				.toString();
	}

	public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
		long sum = yourPoints;

		for (int point : classPoints){
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
}
