package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.Arrays;
import java.util.List;

/*
    Check if no elements match a condition
 */
public class problem13 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog");

        //Approach 1: none match is a negotiation of any match
        boolean noneLongerThan5 = words.stream()
                .noneMatch(s -> s.length() > 5);
        System.out.println(noneLongerThan5);

        // Approach 2:
        boolean noneLongerThan5_1 = words.stream()
                .allMatch(s -> s.length() <= 5);
        System.out.println(noneLongerThan5_1);
    }
}
