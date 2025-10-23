package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.Arrays;
import java.util.List;

/*
    Convert a list of integers to their square values
 */
public class problem15 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //Approach 1
        List<Integer> squares = nums.stream()
                .map(n -> n * n)
                .toList();
        System.out.println(squares);

        //Approach 2: Primitive stream to array
        int[] squares1 = nums.stream()
                .mapToInt(n -> n * n)
                .toArray();
        System.out.println(Arrays.toString(squares1));
    }
}
