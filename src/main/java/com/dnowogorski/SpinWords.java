package com.dnowogorski;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    private static final String DELIMITER = " ";

    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(DELIMITER))
                .map(this::reverse)
                .collect(Collectors.joining(DELIMITER));
    }

    private String reverse(String word) {
        if (word.length() >= 5)
            return new StringBuilder(word).reverse().toString();
        return word;
    }
}
