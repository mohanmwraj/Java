package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
    Collect results into a set
 */
public class problem16 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 4, 5);

        //Approach 1:
        Set<Integer> set = nums.stream()
                .collect(Collectors.toSet());
        System.out.println(set);

        //Approach 2: use toCollection() to choose a set implementation and preserve insertion order.
        Set<Integer> set1 = nums.stream()
                .collect(
                        Collectors.toCollection(LinkedHashSet::new)
                );
        System.out.println(set1);
    }
}
