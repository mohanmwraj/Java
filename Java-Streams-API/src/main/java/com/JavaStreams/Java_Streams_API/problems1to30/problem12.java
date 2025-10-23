package com.JavaStreams.Java_Streams_API.problems1to30;

/*
    Check if all elements match a condition
 */

import java.util.Arrays;
import java.util.List;

public class problem12 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 6);

        //Approach1 : all match checks all with short-circuiting
        boolean allEven = nums.stream()
                .allMatch(n -> n % 2 == 0);
        System.out.println(allEven);

        //Approach 2:
        boolean allEven1 = nums.stream()
                .anyMatch(n -> n % 2 != 0);
        System.out.println(allEven1);
    }
}
