package org.tasks;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class KataTest {

	@Test
	public void testSomething() {
		assertEquals("Hello, Ryan how are you doing today?", Kata.greet("Ryan"));
	}

	@Test
	public void sampleTests() {
		assertEquals("dlrow", Kata.solution("world"));
	}

	@Test
	public void tests() {
		assertEquals(true, Kata.betterThanAverage(new int[] {2, 3}, 5));
		assertEquals(true, Kata.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
		assertEquals(true,
				Kata.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
		assertEquals(false, Kata.betterThanAverage(new int[] {100, 90}, 11));
	}

	@Test
	void basicTest() {
		assertArrayEquals(new Object[] {"Hello", "Hello Again"},
				Kata.removeEveryOther(new Object[] {"Hello", "Goodbye", "Hello Again"}));
		assertArrayEquals(new Object[] {new Object[] {1, 2}},
				Kata.removeEveryOther(new Object[] {new Object[] {1, 2}}));
		assertArrayEquals(new Object[] {1, 3, 5, 7, 9},
				Kata.removeEveryOther(new Object[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
		assertArrayEquals(new Object[] {"Goodbye"},
				Kata.removeEveryOther(new Object[] {"Goodbye"}));
		assertArrayEquals(new Object[] {}, Kata.removeEveryOther(new Object[] {}));
	}

	@Test
	public void basicTests() {
		assertEquals("Hello boss", Kata.greet("Daniel", "Daniel"),
				"For inputs \"Daniel\" and \"Daniel\"");
		assertEquals("Hello guest", Kata.greet("Greg", "Daniel"),
				"For inputs \"Greg\" and \"Daniel\"");
	}

	@Test
	public void testSomething2() {
		assertTrue(Kata.zeroFuel(50, 25, 2));
		assertFalse(Kata.zeroFuel(100, 50, 1));
	}

}
