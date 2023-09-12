package org.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    public void Test1() {
        Sum s = new Sum();
        assertEquals(2, s.GetSum(2, 2));
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
        assertEquals(-3, s.GetSum(-1, -2));
        assertEquals(0, s.GetSum(-1, 1));
    }
}
