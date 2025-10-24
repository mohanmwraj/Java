package problems31to50;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
    Find the longest string in a list
 */
public class problem33 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList(
                "Hello",
                "world",
                "Good Morning"
        );

        //Approach 1: max with comparator
        Optional<String> longest = strings.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(longest.get());

        //Approach 2: reduce pairwise
        Optional<String> longest1 = strings.stream()
                .reduce((a, b) -> a.length() >= b.length() ? a : b);
        System.out.println(longest1.get());
    }
}
