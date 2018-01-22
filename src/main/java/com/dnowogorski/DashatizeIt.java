package com.dnowogorski;

/**
 * https://www.codewars.com/kata/dashatize-it/
 */
public class DashatizeIt {

    public static String dashatize(int num) {
        return removeDashFromBeginning(
                removeDashFromEnd(
                        replaceDoubleDash(
                                addDashBeforeAndAfterOdd(Integer.toString(num)))
                )
        );
    }

    private static String addDashBeforeAndAfterOdd(String input) {
        return input.replaceAll("([13579])", "-$1-");
    }

    private static String replaceDoubleDash(String input) {
        return input.replaceAll("--", "-");
    }

    private static String removeDashFromBeginning(String input) {
        return input.replaceAll("^-", "");
    }

    private static String removeDashFromEnd(String input) {
        return input.replaceAll("-$", "");
    }
}
