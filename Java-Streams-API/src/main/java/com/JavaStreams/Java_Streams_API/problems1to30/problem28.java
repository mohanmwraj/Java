package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.*;
import java.util.stream.Collectors;

/*
    Partition a list into even and odd numbers
 */
public class problem28 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 45, 32, 3, 4, 5, 6, 7, 8, 9, 10);

        //Approach 1: partitionBy
        Map<Boolean, List<Integer>> parts = nums.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(parts);

        //Approach 2: Downstream collector

        Map<Boolean, Set<Integer>> parts1 = nums.stream()
                .collect(Collectors.partitioningBy(
                        n -> n % 2 == 0,
                        Collectors.toCollection(LinkedHashSet::new)
                ));
        System.out.println(parts1);
    }
}
