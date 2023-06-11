package org.tasks;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class SolutionTest {
	@Test
	public void basicTests() {
		assertArrayEquals(new String[] {"Robin", "Singh"}, Solution.stringToArray("Robin Singh"));
		assertArrayEquals(new String[] {"I", "love", "arrays", "they", "are", "my", "favorite"},
				Solution.stringToArray("I love arrays they are my favorite"));
	}
}
