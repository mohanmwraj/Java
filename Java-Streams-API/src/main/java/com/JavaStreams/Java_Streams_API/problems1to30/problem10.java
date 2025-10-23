package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Find first element in a list
 */
public class problem10 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c");

        //Approach 1
        String first = list.stream().findFirst().orElse(null);
        System.out.println(first);

        //Approach 2
        String first1 = list.stream()
                .limit(1)
                .collect(
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                l -> l.isEmpty() ? null : l.get(0)
                        )
                );
        System.out.println(first1);
    }
}
