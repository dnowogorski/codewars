package com.dnowogorski;

import static java.util.Arrays.stream;
import static java.util.Comparator.comparingInt;

/**
 * https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
 */
public class HighestScoringWord {

    public static String high(String sentence) {
        return stream(sentence.split(" "))
                .max(comparingInt(
                        word -> word.chars().map(i -> i - 96).sum()))
                .get();
    }
}
