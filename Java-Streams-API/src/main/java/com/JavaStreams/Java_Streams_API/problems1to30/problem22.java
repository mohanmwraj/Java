package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
    Convert a primitive array to a stream and process it
 */
public class problem22 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        //Approach 1: Arrays.stream()
        int sum = Arrays.stream(arr)
                .filter(n -> n%2 == 0)
                .sum();
        System.out.println(sum);

        //Approach 2: IntStream
        long count = IntStream.of(arr)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println(count);

    }
}
