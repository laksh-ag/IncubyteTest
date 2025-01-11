package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StringCalculatorTest {
    @Test
    public void testEmptyString() {
        assertEquals(0, Main.add(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals(1, Main.add("1"));
    }

    @Test
    public void testTwoNumbers() {
        assertEquals(6, Main.add("1,5"));
    }
}
