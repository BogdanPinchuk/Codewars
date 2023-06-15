package org.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
	@Test
	public void basicTests() {
		assertArrayEquals(new String[] {"Robin", "Singh"}, Solution.stringToArray("Robin Singh"));
		assertArrayEquals(new String[] {"I", "love", "arrays", "they", "are", "my", "favorite"},
				Solution.stringToArray("I love arrays they are my favorite"));
	}

	@Test
	public void FixedTests() {
		assertEquals(18, Solution.century(1705));
		assertEquals(19, Solution.century(1900));
		assertEquals(17, Solution.century(1601));
		assertEquals(20, Solution.century(2000));
		assertEquals(1,  Solution.century(89));
	}
}
