package ca.csf.pobj.tp2.utils;

/**
  Created by Benjamin Lemelin
 */
public class NumberUtils {

    private NumberUtils() {
        //Private so it's a static class
    }

    public static int toInt(CharSequence value) {
        return Integer.parseInt(value.toString());
    }

    public static boolean isPositive(int number) {
        if (number > -1) {
            return true;
        }
        return false;
    }

}
