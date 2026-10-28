package com.edwardnoaland.wave.c;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaveProjectCTest {
    @Test
    public void shouldDescribeTheCalculatedValue() {
        assertEquals("project-c:7", WaveProjectC.describe(3));
    }

    @Test
    public void shouldCalculateZero() {
        assertEquals(1, WaveProjectC.calculate(0));
    }
}
