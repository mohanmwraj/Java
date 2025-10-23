package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Convert a list of strings to uppercase
 */
public class problem02 {
    public static void approach(){
        List<String> name = Arrays.asList("java", "stream", "api");

        //Approach 1
        List<String> upper = name.stream()
                .map(String::toUpperCase)
                .toList();

        //Approach 2
        List<String> upper2 = name.stream()
                .collect(Collectors.mapping(String::toUpperCase,
                        Collectors.toList()));
        // Collectors.mapping() performs the transform in the collector.


    }
}
