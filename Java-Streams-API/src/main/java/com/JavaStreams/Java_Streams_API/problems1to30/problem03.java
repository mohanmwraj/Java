package com.JavaStreams.Java_Streams_API.problems1to30;

import java.util.Arrays;
import java.util.List;
/*
    Find the sum of all numbers in a list
 */
public class problem03 {
    public void approach(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum); //Approach 1
        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum(); //Approach 2

        // map to int creates int stream enabling sum().
    }
}
