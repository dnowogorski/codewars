package com.dnowogorski;

/**
 * https://www.codewars.com/kata/dashatize-it/
 */
public class DashatizeIt {
    private static final char DASH = '-';

    public static String dashatize(int num) {
        StringBuilder result = new StringBuilder();
        String stringValue = String.valueOf(num);
        char previousChar = DASH;
        for (int i = 0; i < stringValue.length() - 1; i++) {
            if (Character.isDigit(stringValue.charAt(i))) {
                int numericValue = Character.getNumericValue(stringValue.charAt(i));
                if ((numericValue & 1) != 0) {
                    if (previousChar != DASH) {
                        result.append(DASH);
                    }
                    result.append(numericValue);
                    result.append(DASH);
                    previousChar = DASH;
                } else {
                    result.append(numericValue);
                    previousChar = stringValue.charAt(i);
                }
            }
        }

        char last = stringValue.charAt(stringValue.length() - 1);
        if (Character.getNumericValue(last) % 2 != 0 && previousChar != DASH) {
            result.append("-");
        }
        result.append(last);
        return result.toString();
    }
}
