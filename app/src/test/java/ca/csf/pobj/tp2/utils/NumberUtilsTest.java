package ca.csf.pobj.tp2.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberUtilsTest {

    @Test
    public void canConvertIntToString() {
        assertEquals("1", NumberUtils.toString(1));
        assertEquals("50000", NumberUtils.toString(50000));
    }

    @Test
    public void canConvertNegativeIntToString() {
        assertEquals("-1", NumberUtils.toString(-1));
        assertEquals("-5000", NumberUtils.toString(-5000));
    }

    @Test
    public void canConvertStringToFloat() {
        assertEquals(1, NumberUtils.toInt("1"));
        assertEquals(5000, NumberUtils.toInt("5000"));
    }

    @Test
    public void canConvertStringToFloatWhenNegative() {
        assertEquals(-1, NumberUtils.toInt("-1"));
        assertEquals(-5000, NumberUtils.toInt("-5000"));
    }
}