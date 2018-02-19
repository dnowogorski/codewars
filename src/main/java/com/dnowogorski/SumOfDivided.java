package com.dnowogorski;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/sum-by-factors/
 */
public class SumOfDivided {

    public static String sumOfDivided(int[] array) {
        StringBuilder result = new StringBuilder("");
        for (int prime : primeNumbers(Arrays.stream(array).max().getAsInt())) {
            int sum = Arrays.stream(array).filter(l -> l % prime == 0).sum();
            if (sum != 0) {
                result.append("(").append(prime).append(" ").append(sum).append(")");
            }
        }
        return result.toString();
    }

    private static int[] primeNumbers(int limit) {
        return IntStream.range(2, limit)
                .filter(SumOfDivided::isPrime)
                .toArray();
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
