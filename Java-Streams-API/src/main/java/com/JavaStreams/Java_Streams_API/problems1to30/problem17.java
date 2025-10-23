package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Join a list of strings into a single comma separate strings
 */
public class problem17 {
    public static void main(String[] args) {

        List<String> parts = Arrays.asList("A", "B", "V");

        //Approach 1:
        String csv = parts.stream()
                .collect(Collectors.joining(", "));
        System.out.println(csv);

        //Approach 2:
        String csv1 = String.join(",", parts);
        System.out.println(csv1);
    }
}
