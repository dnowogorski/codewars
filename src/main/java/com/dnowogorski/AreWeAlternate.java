package com.dnowogorski;

/**
 * https://www.codewars.com/kata/are-we-alternate/
 */
public class AreWeAlternate {
    private static final String VOWELS = "aeiou";

    public static boolean isAlt(String word) {
        boolean wasPreviousVovel = isVovel(word.charAt(0));
        for (int i = 1; i < word.length(); i++) {
            boolean isCurrentVowel = isVovel(word.charAt(i));
            if (wasPreviousVovel == isCurrentVowel) return false;
            wasPreviousVovel = isCurrentVowel;
        }
        return true;
    }

    private static boolean isVovel(char c) {
        return VOWELS.contains(c + "");
    }
}
