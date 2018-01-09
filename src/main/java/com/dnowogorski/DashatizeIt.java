package com.dnowogorski;

/**
 * https://www.codewars.com/kata/dashatize-it/
 */
public class DashatizeIt {

    public static String dashatize(int num) {
        StringBuilder result = new StringBuilder();
        String stringValue = String.valueOf(num);
        result.append(stringValue.charAt(0));
        final boolean[] wasPreviousOdd = {false};
        stringValue.chars().skip(1).limit(stringValue.length() - 2L).forEach(n -> {
            if (n % 2 != 0) {
                if (!wasPreviousOdd[0]) {
                    result.append("-");
                }
                result.append((char) n);
                result.append("-");
                wasPreviousOdd[0] = true;
            } else {
                result.append((char) n);
                wasPreviousOdd[0] = false;
            }
        });
        result.append(stringValue.charAt(stringValue.length() - 1));
        return result.toString();
    }
}
