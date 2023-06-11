package org.tasks;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class HelloWorldTest {
	@Test
	public void testHelloWorld() throws Exception {
		assertEquals("hello world!", HelloWorld.greet());
	}
}
