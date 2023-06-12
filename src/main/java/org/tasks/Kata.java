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
			return new Object[] {};
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

}
