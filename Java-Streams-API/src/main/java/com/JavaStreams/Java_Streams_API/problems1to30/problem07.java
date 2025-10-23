package com.JavaStreams.Java_Streams_API.problems1to30;
import java.util.*;
import java.util.stream.Collectors;

/*
    Remove duplicate elements from a list
 */
public class problem07 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3,3, 3, 4);

        //Approach 1
        List<Integer> distinct = nums.stream()
                .distinct()
                .toList();
        System.out.println(distinct);

        //Approach 2
        List<Integer> distinct1 = new ArrayList<>(new LinkedHashSet<>(nums));
        System.out.println(distinct1);

        //Approach 3
        Set<Integer> distinct2 = nums.stream()
                .collect(Collectors.toSet());
        System.out.println(distinct2);
    }
}
