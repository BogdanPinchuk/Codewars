package org.tasks;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class YesOrNoTest {
	@Test
	public void testBoolToWord() {
		assertEquals(YesOrNo.boolToWord(true),"Yes");
		assertEquals(YesOrNo.boolToWord(false),"No");
	}
}
