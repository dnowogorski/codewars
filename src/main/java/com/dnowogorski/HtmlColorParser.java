package com.dnowogorski;

import java.util.Map;

import static java.lang.Integer.parseInt;

/**
 * https://www.codewars.com/kata/parse-html-slash-css-colors
 */
public class HtmlColorParser {
    private final Map<String, String> presetColors;

    public HtmlColorParser(Map<String, String> presetColors) {
        this.presetColors = presetColors;
    }

    public RGB parse(String color) {
        if (color.startsWith("#")) {
            return parseHex(color.substring(1));
        }
        return parseHex(presetColors.get(color.toLowerCase()).substring(1));
    }

    private RGB parseHex(String color) {
        return color.length() == 6 ? parse6DigitHex(color) : parse3DigitHex(color);
    }

    private RGB parse6DigitHex(String color) {
        return new RGB(fromHex(color.substring(0, 2)),
                fromHex(color.substring(2, 4)),
                fromHex(color.substring(4, 6)));
    }

    private RGB parse3DigitHex(String color) {
        return new RGB(fromHex(doubleString(color.substring(0, 1))),
                fromHex(doubleString(color.substring(1, 2))),
                fromHex(doubleString(color.substring(2, 3))));
    }

    private String doubleString(String value) {
        return String.format("%s%s", value, value);
    }

    private int fromHex(String hex) {
        return parseInt(hex, 16);
    }
}
