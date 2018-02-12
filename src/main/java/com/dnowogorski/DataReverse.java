package com.dnowogorski;

public class DataReverse {
    public static int[] dataReverse(int[] data) {
        int result[] = new int[data.length];
        for (int i = data.length - 8, j = 0; i >= 0; i -= 8, j += 8) {
            System.arraycopy(data, j, result, i, 8);
        }
        return result;
    }
}
