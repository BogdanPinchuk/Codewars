package org.tasks;

import java.util.Arrays;

public class Maps {
	public static int[] map(int[] arr) {
		return Arrays.stream(arr)
				.boxed()
				.mapToInt(i -> i * 2)
				.toArray();

		// 1 realization
//		return Arrays.stream(arr)
//				.map(i -> i * 2)
//				.toArray();
		// 2 realization
//		return IntStream.of(arr)
//				.map(i -> i * 2)
//				.toArray();
	}
}
