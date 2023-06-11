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
}
