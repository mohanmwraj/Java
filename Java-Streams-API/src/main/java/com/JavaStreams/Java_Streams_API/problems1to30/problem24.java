package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.*;
import java.util.stream.Collectors;

/*
    Convert list of list into a single list
 */
public class problem24 {
    public static void main(String[] args) {

        List<List<Integer>> lol = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        );

        //Approach 1: Flat map
        List<Integer> flattenedList = lol.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(flattenedList);

        //Approach 2: Flatten + Collect
        Set<Integer> flattenDistinct = lol.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(flattenDistinct);
    }
}
