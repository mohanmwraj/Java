package com.JavaStreams.Java_Streams_API.AdvancedOperations;

import com.JavaStreams.Java_Streams_API.Utils.Employee;
import com.JavaStreams.Java_Streams_API.Utils.Input;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdvancedOperations {
    public void practice(){

        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(6, 7, 8),
                Arrays.asList(9, 10, 11, 12, 13)
        );

        //Flatten Nested List
        List<Integer> flattenList = nestedList.stream()
                .flatMap(List::stream)
                .toList();

        //Remove Duplicates
        List<Integer> uniqueList = Input.getNumbers().stream()
                .distinct()
                .toList();

        //Skip first 5 Elements
        List<Integer> skippedList = Input.getNumbers()
                .stream()
                .skip(5)
                .toList();

        // Limit to first 10 elements
        List<Integer> limitedList = Input.getNumbers()
                .stream()
                .limit(10)
                .toList();

        // Peek into Stream for debugging
        System.out.println(Input.getNumbers().stream().peek(System.out::println));

        //Parallel stream sum
        int sum = Input.getNumbers()
                .parallelStream()
                .reduce(0, Integer::sum);

        //Generate Infinite Stream of Numbers
        List<Integer> infiniteStream = Stream.iterate(1, n -> n + 1).toList();

        // USe Custom Collector
        Set<Employee> treeSet = Input.getEmployees().stream()
                .collect(
                        Collectors.toCollection(
                                () -> new TreeSet<>(Comparator.comparing(Employee::getAge)
                                )));

        //Concatenate Strings using joining

        String concateString = Input.getStrings().stream()
                .collect(Collectors.joining(", "));

        //Find frequency of words
        Map<String, Long> freqMap = Input.getStrings()
                .stream()
                .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                ));
    }
}
