package com.dnowogorski;

public class Kata {
    public static char findMissingLetter(char[] array) {
        int it = array[0];
        for (char c : array) {
            if (c == it) it++;
            else return (char) it;
        }
        return ' ';
    }
}