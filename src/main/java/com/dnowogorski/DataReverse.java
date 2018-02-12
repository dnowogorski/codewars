package com.dnowogorski;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DataReverse {
    public static int[] dataReverse(int[] data) {
        List<List<Integer>> chunks = chunks(Arrays.stream(data).boxed().collect(Collectors.toList()));
        Collections.reverse(chunks);
        return Arrays.stream(chunks.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList())
                .stream()
                .toArray(Integer[]::new))
                .mapToInt(Integer::intValue).toArray();

    }

    private static List<List<Integer>> chunks(List<Integer> data) {
        return IntStream.range(0, data.size() / 8)
                .mapToObj(i -> data.subList(8 * i, Math.min(8 * i + 8, data.size())))
                .collect(Collectors.toList());
    }
}
