package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
    Sort a list in descending order
 */
public class problem09 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 1, 4, 2, 4, 3);

        //Approach 1
        List<Integer> desc = nums.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(desc);

        //Approach 2
        List<Integer> desc1 = nums.stream()
                .sorted((a, b) -> Integer.compare(b, a))
                .toList();
        System.out.println(desc1);


    }
}
