package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
    Find the minimum number in a list
 */
public class problem05 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 7, 2, 9, 5);

        //Approach 1
        // IntStream.min with fallback
        int min = nums.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(Integer.MIN_VALUE);
        System.out.println(min);

        //Approach 2
        // Stream.min with comparator
        int min1 = nums.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow();
        System.out.println(min1);
    }
}
