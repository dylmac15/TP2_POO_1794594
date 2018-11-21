package ca.csf.pobj.tp2.roman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralConverterTest {
    private RomanNumeralConverter romanNumeralConverter;

    @Before
    public void Before() {
        romanNumeralConverter = new RomanNumeralConverter();
    }

    @Test
    public void canConvertToRoman() {
        assertEquals("MMMM", romanNumeralConverter.toRoman(4000));
        assertEquals("I", romanNumeralConverter.toRoman(1));
        assertEquals("MMMMCMXCIX", romanNumeralConverter.toRoman(4999));
        assertEquals("CCC", romanNumeralConverter.toRoman(300));
        assertEquals("IX", romanNumeralConverter.toRoman(9));
        assertEquals("XIV", romanNumeralConverter.toRoman(14));
        assertEquals("MMD", romanNumeralConverter.toRoman(2500));
    }

    @Test(expected = IllegalArgumentException.class)
    public void exceptionGreaterThan5000() {
         romanNumeralConverter.toRoman(6000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exceptionSmallerThan0() {
        romanNumeralConverter.toRoman(-17);
    }



}