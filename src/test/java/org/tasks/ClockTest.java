package org.tasks;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

public class ClockTest {
	@Test
	public void test1(){
		assertEquals(61000, Clock.Past(0,1,1));
	}
}
