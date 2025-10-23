package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Find all even numbers from a list
 */
public class problem1 {
    public static void approach(){

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        //Approach 1
        List<Integer> even = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        // Approach 2
        List<Integer> even1 = list.stream()
                .collect(Collectors.filtering(n -> n % 2 ==0,
                        Collectors.toList()));

        /*
            Collectors.filtering() pushes the predicate into the downstream collector.
            Introduced in Java 9+.
         */


    }
}
