package org.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperTest {
    @Test
    public void testSomething() {
        assertEquals("HELLO",Upper.MakeUpperCase("hello"));
    }
}
