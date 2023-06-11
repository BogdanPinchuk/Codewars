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
}
