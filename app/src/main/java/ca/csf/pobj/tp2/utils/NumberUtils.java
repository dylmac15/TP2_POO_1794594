package ca.csf.pobj.tp2.utils;

/**
  Created by Benjamin Lemelin
 */
public class NumberUtils {

    private NumberUtils() {
        //Private so it's a static class
    }

    public static String toString(int value) {
        return String.valueOf(value);
    }

    public static int toInt(CharSequence value) {
        return Integer.parseInt(value.toString());
    }

}
