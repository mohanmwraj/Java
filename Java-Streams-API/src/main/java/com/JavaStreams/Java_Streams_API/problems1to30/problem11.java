package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.Arrays;
import java.util.List;

/*
    Check if any element in the list matches a condition
 */
public class problem11 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 3, 5, 8);

        //Approach 1 : anyMatch short circuits on first match
        boolean hasEven = nums.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(hasEven);

        //Approach 2
        boolean hasEven1 = nums.stream()
                .filter(n -> n % 2 == 0)
                .findFirst()
                .isPresent();
        System.out.println(hasEven1);

    }
}
