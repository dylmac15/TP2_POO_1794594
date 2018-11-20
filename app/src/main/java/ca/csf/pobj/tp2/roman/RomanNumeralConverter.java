package ca.csf.pobj.tp2.roman;

public class RomanNumeralConverter {
    static final int MIN_VALUE = 1;
    static final int MAX_VALUE = 4999;

    private final static String m[] = {"", "M", "MM", "MMM", "MMMM"};

    private final static String c[] = {"", "C", "CC", "CCC", "CD",
            "D", "DC", "DCC", "DCCC", "CM"};

    private final static String x[] = {"", "X", "XX", "XXX", "XL",
            "L", "LX", "LXX", "LXXX", "XC"};

    private final static String i[] = {"", "I", "II", "III", "IV",
            "V", "VI", "VII", "VIII", "IX"};

    public String toRoman(int number) {
        if (number < MIN_VALUE || number > MAX_VALUE) {
            throw new IllegalArgumentException(
                    String.format( "The number must be in the range [%d, %d]", MIN_VALUE, MAX_VALUE));
        }
        return thousands(number) + hundreds(number) + tens(number) + ones(number);
    }

    private String thousands(int number) {
        return m[number / 1000];
    }

    private String hundreds(int number) {
        return c[(number % 1000) / 100];
    }

    private String tens(int number) {
        return x[(number % 100) / 10];
    }

    private String ones(int number) {
        return i[number % 10];
    }

}
