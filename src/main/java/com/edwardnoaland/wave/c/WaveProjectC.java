package com.edwardnoaland.wave.c;

/** Small refactoring fixture with direct and indirect callers. */
public final class WaveProjectC {
    private WaveProjectC() {}

    public static String describe(int value) {
        return "project-c:" + calculate(value);
    }

    public static int calculate(int value) {
        return scale(value) + 1;
    }

    private static int scale(int value) {
        if (value < 0) {
            return -scale(-value);
        }
        int doubledValue = value * 2;
        return doubledValue;
    }
}
