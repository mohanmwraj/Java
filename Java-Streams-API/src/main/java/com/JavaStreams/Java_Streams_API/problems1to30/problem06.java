package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
    Count the number of strings starting with a specific letter
 */
public class problem06 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Apple", "Banana", "Apricot", "Cherry"
        );

        //Approach 1
        long count = words.stream()
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println(count);
        //Approach 2
        long count1 = words.stream()
                .collect(Collectors.filtering(s -> s.startsWith("A"),
                        Collectors.counting()));
        System.out.println(count1);
    }
}
