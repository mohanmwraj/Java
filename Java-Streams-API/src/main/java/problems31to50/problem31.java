package problems31to50;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
    Group a list of strings by their length
 */
public class problem31 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "kiwi", "pear");

        //Approach 1: grouping by
        Map<Integer, List<String>> byLen = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(byLen);

        //Approach 2: with downstream to set
        Map<Integer, Set<String>> byLenSet = words.stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.toSet()));
        System.out.println(byLenSet);

        /*
            Collectors.groupingBy(classifier) buckets elements by key;
             downstream collectors let you control value type.
         */

    }
}
