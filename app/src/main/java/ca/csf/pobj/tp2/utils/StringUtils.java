package ca.csf.pobj.tp2.utils;

/**
 Created by Benjamin Lemelin
 */
public class StringUtils {

    private StringUtils() {
        //Private so it's a static class
    }

    public static boolean isBlank(CharSequence value) {
        if (value != null) {
            for (int i = 0; i < value.length(); i++) {
                if (!Character.isWhitespace(value.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

}
